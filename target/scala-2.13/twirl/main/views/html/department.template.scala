
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

object department extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Department],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( departmentList : List[Department]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Department")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<h1>Department</h1>
    <h3>"""),_display_(/*5.10*/departmentList/*5.24*/.toString()),format.raw/*5.35*/("""</h3>

""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(departmentList:List[Department]): play.twirl.api.HtmlFormat.Appendable = apply(departmentList)

  def f:((List[Department]) => play.twirl.api.HtmlFormat.Appendable) = (departmentList) => apply(departmentList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/department.scala.html
                  HASH: 633864ee1602d1f1038eae80bb6327572045ad07
                  MATRIX: 744->1|874->38|901->40|927->58|966->60|997->65|1052->94|1074->108|1105->119|1142->127
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|29->5|31->7
                  -- GENERATED --
              */
          