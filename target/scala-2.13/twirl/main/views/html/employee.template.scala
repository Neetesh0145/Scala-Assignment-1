
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

object employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( employeeList : List[Employee]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Employee")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
"""),format.raw/*4.1*/("""<h1>Employee</h1>
<h3>"""),_display_(/*5.6*/employeeList/*5.18*/.toString()),format.raw/*5.29*/("""</h3>

""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(employeeList:List[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(employeeList)

  def f:((List[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (employeeList) => apply(employeeList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/employee.scala.html
                  HASH: a5314b13bb52c47853aa36b5c603e0be3704041c
                  MATRIX: 740->1|866->34|893->36|917->52|956->54|983->55|1031->78|1051->90|1082->101|1119->109
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|29->5|31->7
                  -- GENERATED --
              */
          