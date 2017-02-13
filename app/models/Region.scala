package models

import play.api.libs.json.{Format, Json}

case class Region(code: Int, name: String) extends Ordered[Region] {
  def compare(that: Region): Int = (this.code) compare (that.code)
}

object Region {
  implicit val format: Format[Region] = Json.format[Region]
}