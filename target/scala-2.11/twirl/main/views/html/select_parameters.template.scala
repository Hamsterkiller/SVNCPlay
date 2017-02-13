
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
import helper._
/**/
object select_parameters extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[String],Form[PcodeRegionName],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(pcodesList: List[String])(pcodeRegNameForm: Form[PcodeRegionName]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.69*/("""

"""),_display_(/*5.2*/select(
    pcodeRegNameForm("Выберите код участника"),
    options = pcodesList map {pcode => (pcode, pcode)}
)),format.raw/*8.2*/("""
"""))}
  }

  def render(pcodesList:List[String],pcodeRegNameForm:Form[PcodeRegionName]): play.twirl.api.HtmlFormat.Appendable = apply(pcodesList)(pcodeRegNameForm)

  def f:((List[String]) => (Form[PcodeRegionName]) => play.twirl.api.HtmlFormat.Appendable) = (pcodesList) => (pcodeRegNameForm) => apply(pcodesList)(pcodeRegNameForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 13 19:22:51 MSK 2017
                  SOURCE: /home/ilya/Work/PlayProjects/SVNCPlay/app/views/select_parameters.scala.html
                  HASH: 043c5828f6bf45efeb3639ab0cb1e4f4d1d0dab1
                  MATRIX: 560->19|715->86|743->89|874->201
                  LINES: 19->3|22->3|24->5|27->8
                  -- GENERATED --
              */
          