// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def departmentAge(d_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "itt/department/departmentage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("d_id", d_id)))
    }
  
    // @LINE:15
    def ittAverageAge(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "itt/ittAverageAge")
    }
  
    // @LINE:16
    def ittAge(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "itt/ittAge")
    }
  
    // @LINE:19
    def recommendedForDirector(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "itt/department/recommendedForDirector")
    }
  
    // @LINE:10
    def viewEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "itt/employee")
    }
  
    // @LINE:9
    def department(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "itt/department")
    }
  
    // @LINE:14
    def departmentAverageAge(d_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "itt/department/departmentaverageage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("d_id", d_id)))
    }
  
    // @LINE:11
    def eldestInDepartment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "itt/department/elder")
    }
  
    // @LINE:12
    def youngestInDepartment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "itt/department/younger")
    }
  
    // @LINE:18
    def availableVacancies(d_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "itt/department/availableVacancies/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("d_id", d_id)))
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
