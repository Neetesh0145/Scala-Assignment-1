
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Employee],List[Department],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/( employeeList : List[Employee], departmentList : List[Department]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("InTimeTec Organisation")/*6.32*/ {_display_(Seq[Any](format.raw/*6.34*/("""
  """),format.raw/*7.3*/("""<h1>InTimeTec Organisation</h1>

  <h2>Department</h2>
  <h3>"""),_display_(/*10.8*/departmentList/*10.22*/.toString()),format.raw/*10.33*/("""</h3>

  <h2>Employee</h2>
  <h3>"""),_display_(/*13.8*/employeeList/*13.20*/.toString()),format.raw/*13.31*/("""</h3>

<!--
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>



<table class="table">
  <thead>
  <tr>
    <th scope="col">#</th>
    <th scope="col">First</th>
    <th scope="col">Last</th>
  </tr>
  </thead>
  <tbody>
  <tr>
    <th scope="row">1</th>
    <td>Mark</td>
    <td>Otto</td>

  </tr>
  <tr>
    <th scope="row">2</th>
    <td>Jacob</td>
    <td>Thornton</td>

  </tr>
  <tr>
    <th scope="row">3</th>
    <td>Larry</td>
    <td>the Bird</td>

  </tr>
  </tbody>
</table>


</body>
</html>
-->
""")))}),format.raw/*59.2*/("""
"""))
      }
    }
  }

  def render(employeeList:List[Employee],departmentList:List[Department]): play.twirl.api.HtmlFormat.Appendable = apply(employeeList,departmentList)

  def f:((List[Employee],List[Department]) => play.twirl.api.HtmlFormat.Appendable) = (employeeList,departmentList) => apply(employeeList,departmentList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 428a04c734e0d88174bd08d4632347b779f20bbb
                  MATRIX: 754->4|915->72|942->74|980->104|1019->106|1048->109|1136->171|1159->185|1191->196|1251->230|1272->242|1304->253|1943->862
                  LINES: 21->4|26->5|27->6|27->6|27->6|28->7|31->10|31->10|31->10|34->13|34->13|34->13|80->59
                  -- GENERATED --
              */
          