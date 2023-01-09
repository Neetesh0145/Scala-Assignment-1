
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

object youngestInDepartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( youngestInDepartmentList : List[Employee]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Youngest In Department")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
    """),format.raw/*4.5*/("""<h1>Youngest In Each Department</h1>
    <h3>"""),_display_(/*5.10*/youngestInDepartmentList/*5.34*/.toString()),format.raw/*5.45*/("""</h3>
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(youngestInDepartmentList:List[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(youngestInDepartmentList)

  def f:((List[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (youngestInDepartmentList) => apply(youngestInDepartmentList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/youngestInDepartment.scala.html
                  HASH: 8def31db58b108e58fc7d47857cfd32c6cdbc6d5
                  MATRIX: 752->1|890->46|917->48|955->78|994->80|1025->85|1097->131|1129->155|1160->166|1196->173
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6
                  -- GENERATED --
              */
          