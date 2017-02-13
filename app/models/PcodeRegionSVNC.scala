package models

import org.joda.time.DateTime
import play.api.libs.json.{Format, Json}

// case class for the fact-table row
case class PcodeRegionSVNC(tdate: DateTime,
                           pname: String,
                           tcode: Option[String],
                           pcode: String,
                           regCode: Int,
                           regName: String,
                           price_EE: Double,
                           price_N: Double)

object PcodeRegionSVNC {
  implicit val format: Format[PcodeRegionSVNC] = Json.format[PcodeRegionSVNC]
}

