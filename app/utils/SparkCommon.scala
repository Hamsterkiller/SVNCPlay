package utils

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.SparkSession


// Spark utility object
object SparkCommon {

  lazy val conf = {
    new SparkConf(false)
      .setMaster("local[*]")
  }

  // lazy val sparkContext = new SparkContext(conf)
  // lazy val sparkSqlContext = SQLContext.getOrCreate(sparkContext) - deprecated getOrCreate()
  // method (since spark 2.0.0)

  lazy val spark = SparkSession
    .builder()
    .appName("SVNC Analysis")
    .config(conf)
    .getOrCreate()

  lazy val sparkSqlContext = spark.sqlContext

}