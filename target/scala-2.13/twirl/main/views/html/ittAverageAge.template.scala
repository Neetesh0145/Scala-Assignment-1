
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

object ittAverageAge extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ittAverageAge : Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("ITT Average Age")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<h1>ITT Average  Age</h1>
<h3>"""),_display_(/*5.6*/ittAverageAge),format.raw/*5.19*/("""</h3>

""")))}),format.raw/*7.2*/("""


"""))
      }
    }
  }

  def render(ittAverageAge:Long): play.twirl.api.HtmlFormat.Appendable = apply(ittAverageAge)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (ittAverageAge) => apply(ittAverageAge)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/ittAverageAge.scala.html
                  HASH: afa858de71a23aff47025c563e9452556368f478
                  MATRIX: 735->1|851->24|878->26|909->49|948->51|975->52|1031->83|1064->96|1101->104
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|31->7
                  -- GENERATED --
              */
          