package models

import play.api.libs.json.{Format, Json}

/**
  * Created by root on 01.02.17.
  */
// case class for the submit PCODE information
case class Pcode(pcode: String) extends Ordered[Pcode] {
  // Required as of Scala 2.11 for reasons unknown - the companion to Ordered
  // should already be in implicit scope
  import scala.math.Ordered.orderingToOrdered

  // compare method overriding
  def compare(that: Pcode): Int = (this.pcode) compare (that.pcode)
}

object Pcode {
  // formatter
  implicit val format: Format[Pcode] = Json.format[Pcode]

}
