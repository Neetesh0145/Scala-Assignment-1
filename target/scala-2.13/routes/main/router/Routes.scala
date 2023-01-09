// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:23
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:23
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """itt/department""", """controllers.HomeController.department()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """itt/employee""", """controllers.HomeController.viewEmployee()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """itt/department/elder""", """controllers.HomeController.eldestInDepartment()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """itt/department/younger""", """controllers.HomeController.youngestInDepartment()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """itt/department/departmentage/""" + "$" + """d_id<[^/]+>""", """controllers.HomeController.departmentAge(d_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """itt/department/departmentaverageage/""" + "$" + """d_id<[^/]+>""", """controllers.HomeController.departmentAverageAge(d_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """itt/ittAverageAge""", """controllers.HomeController.ittAverageAge()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """itt/ittAge""", """controllers.HomeController.ittAge()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """itt/department/availableVacancies/""" + "$" + """d_id<[^/]+>""", """controllers.HomeController.availableVacancies(d_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """itt/department/recommendedForDirector""", """controllers.HomeController.recommendedForDirector()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_department1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("itt/department")))
  )
  private[this] lazy val controllers_HomeController_department1_invoker = createInvoker(
    HomeController_0.department(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "department",
      Nil,
      "GET",
      this.prefix + """itt/department""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_viewEmployee2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("itt/employee")))
  )
  private[this] lazy val controllers_HomeController_viewEmployee2_invoker = createInvoker(
    HomeController_0.viewEmployee(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewEmployee",
      Nil,
      "GET",
      this.prefix + """itt/employee""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_eldestInDepartment3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("itt/department/elder")))
  )
  private[this] lazy val controllers_HomeController_eldestInDepartment3_invoker = createInvoker(
    HomeController_0.eldestInDepartment(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "eldestInDepartment",
      Nil,
      "GET",
      this.prefix + """itt/department/elder""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_youngestInDepartment4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("itt/department/younger")))
  )
  private[this] lazy val controllers_HomeController_youngestInDepartment4_invoker = createInvoker(
    HomeController_0.youngestInDepartment(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "youngestInDepartment",
      Nil,
      "GET",
      this.prefix + """itt/department/younger""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_departmentAge5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("itt/department/departmentage/"), DynamicPart("d_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_departmentAge5_invoker = createInvoker(
    HomeController_0.departmentAge(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "departmentAge",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """itt/department/departmentage/""" + "$" + """d_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_departmentAverageAge6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("itt/department/departmentaverageage/"), DynamicPart("d_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_departmentAverageAge6_invoker = createInvoker(
    HomeController_0.departmentAverageAge(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "departmentAverageAge",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """itt/department/departmentaverageage/""" + "$" + """d_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_ittAverageAge7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("itt/ittAverageAge")))
  )
  private[this] lazy val controllers_HomeController_ittAverageAge7_invoker = createInvoker(
    HomeController_0.ittAverageAge(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ittAverageAge",
      Nil,
      "GET",
      this.prefix + """itt/ittAverageAge""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_ittAge8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("itt/ittAge")))
  )
  private[this] lazy val controllers_HomeController_ittAge8_invoker = createInvoker(
    HomeController_0.ittAge(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ittAge",
      Nil,
      "GET",
      this.prefix + """itt/ittAge""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_availableVacancies9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("itt/department/availableVacancies/"), DynamicPart("d_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_availableVacancies9_invoker = createInvoker(
    HomeController_0.availableVacancies(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "availableVacancies",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """itt/department/availableVacancies/""" + "$" + """d_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_recommendedForDirector10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("itt/department/recommendedForDirector")))
  )
  private[this] lazy val controllers_HomeController_recommendedForDirector10_invoker = createInvoker(
    HomeController_0.recommendedForDirector(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "recommendedForDirector",
      Nil,
      "GET",
      this.prefix + """itt/department/recommendedForDirector""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:9
    case controllers_HomeController_department1_route(params@_) =>
      call { 
        controllers_HomeController_department1_invoker.call(HomeController_0.department())
      }
  
    // @LINE:10
    case controllers_HomeController_viewEmployee2_route(params@_) =>
      call { 
        controllers_HomeController_viewEmployee2_invoker.call(HomeController_0.viewEmployee())
      }
  
    // @LINE:11
    case controllers_HomeController_eldestInDepartment3_route(params@_) =>
      call { 
        controllers_HomeController_eldestInDepartment3_invoker.call(HomeController_0.eldestInDepartment())
      }
  
    // @LINE:12
    case controllers_HomeController_youngestInDepartment4_route(params@_) =>
      call { 
        controllers_HomeController_youngestInDepartment4_invoker.call(HomeController_0.youngestInDepartment())
      }
  
    // @LINE:13
    case controllers_HomeController_departmentAge5_route(params@_) =>
      call(params.fromPath[Long]("d_id", None)) { (d_id) =>
        controllers_HomeController_departmentAge5_invoker.call(HomeController_0.departmentAge(d_id))
      }
  
    // @LINE:14
    case controllers_HomeController_departmentAverageAge6_route(params@_) =>
      call(params.fromPath[Long]("d_id", None)) { (d_id) =>
        controllers_HomeController_departmentAverageAge6_invoker.call(HomeController_0.departmentAverageAge(d_id))
      }
  
    // @LINE:15
    case controllers_HomeController_ittAverageAge7_route(params@_) =>
      call { 
        controllers_HomeController_ittAverageAge7_invoker.call(HomeController_0.ittAverageAge())
      }
  
    // @LINE:16
    case controllers_HomeController_ittAge8_route(params@_) =>
      call { 
        controllers_HomeController_ittAge8_invoker.call(HomeController_0.ittAge())
      }
  
    // @LINE:18
    case controllers_HomeController_availableVacancies9_route(params@_) =>
      call(params.fromPath[Long]("d_id", None)) { (d_id) =>
        controllers_HomeController_availableVacancies9_invoker.call(HomeController_0.availableVacancies(d_id))
      }
  
    // @LINE:19
    case controllers_HomeController_recommendedForDirector10_route(params@_) =>
      call { 
        controllers_HomeController_recommendedForDirector10_invoker.call(HomeController_0.recommendedForDirector())
      }
  
    // @LINE:23
    case controllers_Assets_versioned11_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
