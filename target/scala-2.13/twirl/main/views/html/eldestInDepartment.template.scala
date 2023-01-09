
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

object eldestInDepartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( eldestInDepartmentList : List[Employee]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Eldest In Department")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
"""),format.raw/*4.1*/("""<h1>Eldest In Department</h1>
<h3>"""),_display_(/*5.6*/eldestInDepartmentList/*5.28*/.toString()),format.raw/*5.39*/("""</h3>
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(eldestInDepartmentList:List[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(eldestInDepartmentList)

  def f:((List[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (eldestInDepartmentList) => apply(eldestInDepartmentList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/eldestInDepartment.scala.html
                  HASH: a081008a7c5c1940cd14046cce1557e3cc750765
                  MATRIX: 750->1|886->44|913->46|949->74|988->76|1015->77|1075->112|1105->134|1136->145|1172->152
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6
                  -- GENERATED --
              */
          