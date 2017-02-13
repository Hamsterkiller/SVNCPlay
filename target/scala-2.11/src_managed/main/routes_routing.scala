// @SOURCE:/home/ilya/Work/PlayProjects/SVNCPlay/conf/routes
// @HASH:2e316bb1eb7f32cc78f224ed5e4808d27374d9f3
// @DATE:Mon Feb 13 19:23:36 MSK 2017


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:3
private[this] lazy val controllers_HomeController_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
controllers.HomeController.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.HomeController", "index", Nil,"GET", """ index page""", Routes.prefix + """"""))
        

// @LINE:6
private[this] lazy val controllers_AnalysisController_svncAnalysisShow1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("svnc_analysis"))))
private[this] lazy val controllers_AnalysisController_svncAnalysisShow1_invoker = createInvoker(
controllers.AnalysisController.svncAnalysisShow,
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalysisController", "svncAnalysisShow", Nil,"GET", """ analysis page""", Routes.prefix + """svnc_analysis"""))
        

// @LINE:9
private[this] lazy val controllers_ForecastController_svncForecastShow2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("svnc_forecast"))))
private[this] lazy val controllers_ForecastController_svncForecastShow2_invoker = createInvoker(
controllers.ForecastController.svncForecastShow,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ForecastController", "svncForecastShow", Nil,"GET", """ forecast page""", Routes.prefix + """svnc_forecast"""))
        

// @LINE:13
private[this] lazy val controllers_Pcodes_list3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("svnc_analysis/pcodes/"))))
private[this] lazy val controllers_Pcodes_list3_invoker = createInvoker(
controllers.Pcodes.list,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Pcodes", "list", Nil,"GET", """ Pcode Resource
 POST    /svnc_analysis/pcodes/        controllers.Pcodes.create""", Routes.prefix + """svnc_analysis/pcodes/"""))
        

// @LINE:14
private[this] lazy val controllers_Pcodes_getByRegCode4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("svnc_analysis/"),DynamicPart("regCode", """[^/]+""",true),StaticPart("/"))))
private[this] lazy val controllers_Pcodes_getByRegCode4_invoker = createInvoker(
controllers.Pcodes.getByRegCode(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Pcodes", "getByRegCode", Seq(classOf[Int]),"GET", """""", Routes.prefix + """svnc_analysis/$regCode<[^/]+>/"""))
        

// @LINE:18
private[this] lazy val controllers_Regions_list5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("svnc_analysis/regions/"))))
private[this] lazy val controllers_Regions_list5_invoker = createInvoker(
controllers.Regions.list,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Regions", "list", Nil,"GET", """ Region Resource
 POST    /svnc_analysis/regions/        controllers.Regions.create""", Routes.prefix + """svnc_analysis/regions/"""))
        

// @LINE:19
private[this] lazy val controllers_Regions_getByPcode6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("svnc_analysis/regions/"),DynamicPart("pcode", """[^/]+""",true),StaticPart("/"))))
private[this] lazy val controllers_Regions_getByPcode6_invoker = createInvoker(
controllers.Regions.getByPcode(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Regions", "getByPcode", Seq(classOf[String]),"GET", """""", Routes.prefix + """svnc_analysis/regions/$pcode<[^/]+>/"""))
        
def documentation = List(("""GET""", prefix,"""controllers.HomeController.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """svnc_analysis""","""controllers.AnalysisController.svncAnalysisShow"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """svnc_forecast""","""controllers.ForecastController.svncForecastShow"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """svnc_analysis/pcodes/""","""controllers.Pcodes.list"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """svnc_analysis/$regCode<[^/]+>/""","""controllers.Pcodes.getByRegCode(regCode:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """svnc_analysis/regions/""","""controllers.Regions.list"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """svnc_analysis/regions/$pcode<[^/]+>/""","""controllers.Regions.getByPcode(pcode:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:3
case controllers_HomeController_index0_route(params) => {
   call { 
        controllers_HomeController_index0_invoker.call(controllers.HomeController.index)
   }
}
        

// @LINE:6
case controllers_AnalysisController_svncAnalysisShow1_route(params) => {
   call { 
        controllers_AnalysisController_svncAnalysisShow1_invoker.call(controllers.AnalysisController.svncAnalysisShow)
   }
}
        

// @LINE:9
case controllers_ForecastController_svncForecastShow2_route(params) => {
   call { 
        controllers_ForecastController_svncForecastShow2_invoker.call(controllers.ForecastController.svncForecastShow)
   }
}
        

// @LINE:13
case controllers_Pcodes_list3_route(params) => {
   call { 
        controllers_Pcodes_list3_invoker.call(controllers.Pcodes.list)
   }
}
        

// @LINE:14
case controllers_Pcodes_getByRegCode4_route(params) => {
   call(params.fromPath[Int]("regCode", None)) { (regCode) =>
        controllers_Pcodes_getByRegCode4_invoker.call(controllers.Pcodes.getByRegCode(regCode))
   }
}
        

// @LINE:18
case controllers_Regions_list5_route(params) => {
   call { 
        controllers_Regions_list5_invoker.call(controllers.Regions.list)
   }
}
        

// @LINE:19
case controllers_Regions_getByPcode6_route(params) => {
   call(params.fromPath[String]("pcode", None)) { (pcode) =>
        controllers_Regions_getByPcode6_invoker.call(controllers.Regions.getByPcode(pcode))
   }
}
        
}

}
     