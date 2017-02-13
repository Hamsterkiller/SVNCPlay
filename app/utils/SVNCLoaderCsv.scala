package utils

import models.{Pcode, Region}
import org.apache.commons.net.ntp.TimeStamp
import org.apache.spark.sql.{DataFrame, Dataset, Row, SQLContext}

import scala.collection.immutable.HashMap.HashMap1
import scala.reflect.internal.Required


object SVNCLoaderCsv extends App /*with SVNCLoader*/ {

  // getting sqlContext and reading data
  val sqlContext: SQLContext = SparkCommon.sparkSqlContext
  val SCHEMA_OPTIONS: Map[String, String] = Map("header" -> "true", "inferSchema" -> "true", "charset" -> "windows-1251")
  val path: String = "/home/ilya/Work/PlayProjects/Data/SVNC.csv"
  val df: DataFrame = sqlContext.read.format("csv").options(SCHEMA_OPTIONS).load(path)

  // df.printSchema()
  // OUTPUT:
  //  |-- YEAR: integer (nullable = true)
  //  |-- ZSP_CODE: string (nullable = true)
  //  |-- PZ: integer (nullable = true)
  //  |-- TDATE: timestamp (nullable = true)
  //  |-- TCODE: string (nullable = true)
  //  |-- PNAME: string (nullable = true)
  //  |-- PCODE: string (nullable = true)DataseDatasett
  //  |-- REGION_CODE: integer (nullable = true)
  //  |-- REGION_NAME: string (nullable = true)
  //  |-- P_VC_UNREG_AVG: string (nullable = true)
  //  |-- P_NC_UNREG_AVG: string (nullable = true)
  //  |-- PIKE_FACT: double (nullable = true)
  //  |-- VOLUME: string (nullable = true)
  //  |-- KOM_PRICE: double (nullable = true)

  // CONSTANTS
  lazy val LENGTH: Long = df.count()
  lazy val MIN_DATE: Row = df.agg("TDATE" -> "min").collect()(0)
  lazy val MAX_DATE: Row = df.agg("TDATE" -> "max").collect()(0)

  // creating refe  println(pcodesAvailable)rences for controls
  lazy val pcodeRef: Dataset[Row] = df.select("PCODE").distinct() // unique PCODEs

  // Unique PCODE-Region pairs
  lazy val pcodeRegionRef: Dataset[Row] = df.select("PCODE", "REGION_CODE", "REGION_NAME").distinct()

  // unique and actual PCODEs
  lazy val actualPcodeRef: Dataset[Row] = df.filter(df("TDATE") === MAX_DATE.get(0))
    .select("PCODE").distinct()

  // unique and actual PCODE-Region pairs
  lazy val actualPcodeRegionRef: Dataset[Row] = df.filter(df("TDATE") === MAX_DATE.get(0))
    .select("PCODE", "REGION_CODE", "REGION_NAME").distinct()

  //actualPcodeRegionRef.show()

  // get list of available pcodes
  val pcodesAvailable: Seq[Pcode] = pcodeRef.rdd
            .map(r => Pcode(r(0).asInstanceOf[String]))
            .collect()
            .toSeq

  // regions dictionary
  val regions: Seq[Region] = pcodeRegionRef
            .select("REGION_CODE", "REGION_NAME")
            .distinct()
            .collect
            .toSeq
            .map(r => (Region(r.get(r.fieldIndex("REGION_CODE")).asInstanceOf[Int],
              r.get(r.fieldIndex("REGION_NAME")).asInstanceOf[String])))


  // filtering regions by pcode value
  def filterRegions(pcode: String): Seq[Region] = { // need to create Region model
    val pcode_rows: Dataset[Row] = pcodeRegionRef.filter(pcodeRegionRef("PCODE") === pcode)
    val resultRegionCodes: Seq[Int] = pcode_rows.select("REGION_CODE", "REGION_NAME")
            .rdd
            .map(r => r(0).asInstanceOf[Int])
            .collect()
    val resultRegions: Seq[Region] = regions filter(resultRegionCodes contains _.code)
    return resultRegions
  }

  println(filterRegions("ABAKANSB"))

  // filtering pcodes by region code
  def filterPcodes(regCode: Int): Seq[Pcode] = {
    val reg_rows: Dataset[Row] = pcodeRegionRef.filter(pcodeRegionRef("PCODE") === regCode)
    val resultRegions: Seq[Pcode] = reg_rows.select("PCODE")
      .rdd
      .map(r => Pcode(r(0).asInstanceOf[String]))
      .collect()
      .toSeq
    return resultRegions
  }

//  println(pcodesAvailable)


}