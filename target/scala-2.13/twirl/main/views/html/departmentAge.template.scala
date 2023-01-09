
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

object departmentAge extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(departmentAge : Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Department Age")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
"""),format.raw/*4.1*/("""<h1>Department Age</h1>
<h3>"""),_display_(/*5.6*/departmentAge),format.raw/*5.19*/("""</h3>

""")))}),format.raw/*7.2*/("""


"""))
      }
    }
  }

  def render(departmentAge:Long): play.twirl.api.HtmlFormat.Appendable = apply(departmentAge)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (departmentAge) => apply(departmentAge)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/departmentAge.scala.html
                  HASH: c74309b3bf3ac0ffc72c8d1ff7b5de5816d2a485
                  MATRIX: 735->1|851->24|878->26|908->48|947->50|974->51|1028->80|1061->93|1098->101
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|31->7
                  -- GENERATED --
              */
          