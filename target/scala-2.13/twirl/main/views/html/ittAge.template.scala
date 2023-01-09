
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

object ittAge extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ittAge : Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("ITT Age")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
"""),format.raw/*4.1*/("""<h1>ITT Age</h1>
<h3>"""),_display_(/*5.6*/ittAge),format.raw/*5.12*/("""</h3>

""")))}),format.raw/*7.2*/("""


"""))
      }
    }
  }

  def render(ittAge:Long): play.twirl.api.HtmlFormat.Appendable = apply(ittAge)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (ittAge) => apply(ittAge)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/ittAge.scala.html
                  HASH: c0d72469bdfe92ff94ac85716bb23fb9c85e1968
                  MATRIX: 728->1|837->17|864->19|887->34|926->36|953->37|1000->59|1026->65|1063->73
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|31->7
                  -- GENERATED --
              */
          