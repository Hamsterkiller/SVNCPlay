package models

import play.api.libs.json.{Format, Json}

// case class for the submit PCODE-REGION_NAME information
case class PcodeRegionName (
                                  pcode: String,
                                  regName: List[String]
                                )

object PcodeRegionName {
  implicit val format: Format[PcodeRegionName] = Json.format[PcodeRegionName]
}
