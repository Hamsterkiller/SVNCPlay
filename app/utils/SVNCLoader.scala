package utils

import org.apache.spark.sql.{DataFrame, Dataset, SQLContext}

/**
  * Trait, that represents repository interface for the SVNC data. Realized for: CSV, Oracle DB, Vertica DB
  */
trait SVNCLoader {
  val sqlContext: SQLContext
  val df: DataFrame

}
