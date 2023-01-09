// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def departmentAge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.departmentAge",
      """
        function(d_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "itt/department/departmentage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("d_id", d_id0))})
        }
      """
    )
  
    // @LINE:15
    def ittAverageAge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ittAverageAge",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "itt/ittAverageAge"})
        }
      """
    )
  
    // @LINE:16
    def ittAge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ittAge",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "itt/ittAge"})
        }
      """
    )
  
    // @LINE:19
    def recommendedForDirector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.recommendedForDirector",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "itt/department/recommendedForDirector"})
        }
      """
    )
  
    // @LINE:10
    def viewEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewEmployee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "itt/employee"})
        }
      """
    )
  
    // @LINE:9
    def department: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.department",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "itt/department"})
        }
      """
    )
  
    // @LINE:14
    def departmentAverageAge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.departmentAverageAge",
      """
        function(d_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "itt/department/departmentaverageage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("d_id", d_id0))})
        }
      """
    )
  
    // @LINE:11
    def eldestInDepartment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.eldestInDepartment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "itt/department/elder"})
        }
      """
    )
  
    // @LINE:12
    def youngestInDepartment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.youngestInDepartment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "itt/department/younger"})
        }
      """
    )
  
    // @LINE:18
    def availableVacancies: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.availableVacancies",
      """
        function(d_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "itt/department/availableVacancies/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("d_id", d_id0))})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
