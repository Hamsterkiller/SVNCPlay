
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

/*
* This is the home page layout
*/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This is the home page layout
*/
  def apply/*4.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*4.19*/("""

"""),format.raw/*6.1*/("""<h2>"""),_display_(/*6.6*/message),format.raw/*6.13*/("""</h2>

<hr>

<form action=""""),_display_(/*10.16*/routes/*10.22*/.AnalysisController.svncAnalysisShow()),format.raw/*10.60*/("""" method="get">
    <button class="navlink">Анализ фактических значений СВНЦ</button>
</form>

<form action=""""),_display_(/*14.16*/routes/*14.22*/.ForecastController.svncForecastShow()),format.raw/*14.60*/("""" method="get">
    <button class="navlink">Прогнозирование значений СВНЦ</button>
</form>

"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 13 19:22:51 MSK 2017
                  SOURCE: /home/ilya/Work/PlayProjects/SVNCPlay/app/views/index.scala.html
                  HASH: 58baf9e79a2085223bc08128541e5da68181787c
                  MATRIX: 569->38|674->55|702->57|732->62|759->69|814->97|829->103|888->141|1025->251|1040->257|1099->295
                  LINES: 23->4|26->4|28->6|28->6|28->6|32->10|32->10|32->10|36->14|36->14|36->14
                  -- GENERATED --
              */
          