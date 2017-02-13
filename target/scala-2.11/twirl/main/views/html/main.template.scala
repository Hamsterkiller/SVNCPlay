
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

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
<head>
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>

    </head>
    <body>
        """),_display_(/*11.10*/content),format.raw/*11.17*/("""
    """),format.raw/*12.5*/("""</body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 13 19:22:51 MSK 2017
                  SOURCE: /home/ilya/Work/PlayProjects/SVNCPlay/app/views/main.scala.html
                  HASH: 512c88ae272d2d6fb9ef77928f1eec9e7c8d1477
                  MATRIX: 509->1|627->31|655->33|734->86|759->91|828->133|856->140|888->145
                  LINES: 19->1|22->1|24->3|28->7|28->7|32->11|32->11|33->12
                  -- GENERATED --
              */
          