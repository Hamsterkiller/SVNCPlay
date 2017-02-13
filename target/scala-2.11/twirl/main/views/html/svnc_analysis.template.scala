
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
object svnc_analysis extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(message: String)(select_parameters: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*7.44*/("""
"""),format.raw/*8.1*/("""<h2>"""),_display_(/*8.6*/message),format.raw/*8.13*/("""</h2>
<a href=""""),_display_(/*9.11*/routes/*9.17*/.HomeController.index()),format.raw/*9.40*/(""""> <-- Назад </a>
<hr>

<body>
 """),_display_(/*13.3*/select_parameters),format.raw/*13.20*/("""
"""),format.raw/*14.1*/("""</body>

"""))}
  }

  def render(message:String,select_parameters:Html): play.twirl.api.HtmlFormat.Appendable = apply(message)(select_parameters)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (message) => (select_parameters) => apply(message)(select_parameters)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 13 19:22:51 MSK 2017
                  SOURCE: /home/ilya/Work/PlayProjects/SVNCPlay/app/views/svnc_analysis.scala.html
                  HASH: f984fc4d09309544ec8b66bc7c4624b7ab7f35b3
                  MATRIX: 533->66|663->108|690->109|720->114|747->121|789->137|803->143|846->166|905->199|943->216|971->217
                  LINES: 19->7|22->7|23->8|23->8|23->8|24->9|24->9|24->9|28->13|28->13|29->14
                  -- GENERATED --
              */
          