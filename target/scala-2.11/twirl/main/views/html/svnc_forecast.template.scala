
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
* This is the SVNC-forecasting page layout
*/
object svnc_forecast extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This is the SVNC-forecasting page layout
*/
  def apply/*4.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*4.19*/("""

"""),format.raw/*6.1*/("""<h2>"""),_display_(/*6.6*/message),format.raw/*6.13*/("""</h2>
<a href=""""),_display_(/*7.11*/routes/*7.17*/.HomeController.index()),format.raw/*7.40*/(""""> <-- Назад </a>
<hr>
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 13 19:22:51 MSK 2017
                  SOURCE: /home/ilya/Work/PlayProjects/SVNCPlay/app/views/svnc_forecast.scala.html
                  HASH: 71c7d9d96cf7ccc6a811026a0758faef6c80a5c1
                  MATRIX: 601->50|706->67|734->69|764->74|791->81|833->97|847->103|890->126
                  LINES: 23->4|26->4|28->6|28->6|28->6|29->7|29->7|29->7
                  -- GENERATED --
              */
          