
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

object departmentAverageAge extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(departmentAverageAge : Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Department Age")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
"""),format.raw/*4.1*/("""<h1>Department Average  Age</h1>
<h3>"""),_display_(/*5.6*/departmentAverageAge),format.raw/*5.26*/("""</h3>

""")))}),format.raw/*7.2*/("""


"""))
      }
    }
  }

  def render(departmentAverageAge:Long): play.twirl.api.HtmlFormat.Appendable = apply(departmentAverageAge)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (departmentAverageAge) => apply(departmentAverageAge)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/departmentAverageAge.scala.html
                  HASH: c65a64e8174c0f222bfe0610729a0a8ff28b428f
                  MATRIX: 742->1|865->31|892->33|922->55|961->57|988->58|1051->96|1091->116|1128->124
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|31->7
                  -- GENERATED --
              */
          