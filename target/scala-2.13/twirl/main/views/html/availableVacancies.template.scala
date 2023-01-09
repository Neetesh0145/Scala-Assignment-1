
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object availableVacancies extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( currentStrength : Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Available Vacancies Department")/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""
"""),format.raw/*4.1*/("""<h1>Available Vacancies Of Department</h1>
<h3>"""),_display_(/*5.6*/currentStrength/*5.21*/.toString()),format.raw/*5.32*/("""</h3>
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(currentStrength:Long): play.twirl.api.HtmlFormat.Appendable = apply(currentStrength)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (currentStrength) => apply(currentStrength)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/availableVacancies.scala.html
                  HASH: de1f7d8ca6a766b4827e9d8b67c3796c7d624042
                  MATRIX: 740->1|859->27|886->29|932->67|971->69|998->70|1071->118|1094->133|1125->144|1161->151
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6
                  -- GENERATED --
              */
          