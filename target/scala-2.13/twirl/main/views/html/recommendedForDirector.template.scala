
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

object recommendedForDirector extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( recommendedForDirector : List[Employee]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Employees Recommended For Directors")/*3.45*/ {_display_(Seq[Any](format.raw/*3.47*/("""
"""),format.raw/*4.1*/("""<h1>Employees Recommended For Directors</h1>
<h3>"""),_display_(/*5.6*/recommendedForDirector/*5.28*/.toString()),format.raw/*5.39*/("""</h3>

""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(recommendedForDirector:List[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(recommendedForDirector)

  def f:((List[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (recommendedForDirector) => apply(recommendedForDirector)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/recommendedForDirector.scala.html
                  HASH: db31793a3a3e0f28aef98fca6c829de5ef1251d3
                  MATRIX: 754->1|890->44|917->46|968->89|1007->91|1034->92|1109->142|1139->164|1170->175|1207->183
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|29->5|31->7
                  -- GENERATED --
              */
          