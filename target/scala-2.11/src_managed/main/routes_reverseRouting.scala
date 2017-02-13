// @SOURCE:/home/ilya/Work/PlayProjects/SVNCPlay/conf/routes
// @HASH:2e316bb1eb7f32cc78f224ed5e4808d27374d9f3
// @DATE:Mon Feb 13 19:23:36 MSK 2017

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:19
// @LINE:18
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:6
// @LINE:3
package controllers {

// @LINE:14
// @LINE:13
class ReversePcodes {


// @LINE:13
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "svnc_analysis/pcodes/")
}
                        

// @LINE:14
def getByRegCode(regCode:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "svnc_analysis/" + implicitly[PathBindable[Int]].unbind("regCode", regCode) + "/")
}
                        

}
                          

// @LINE:9
class ReverseForecastController {


// @LINE:9
def svncForecastShow(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "svnc_forecast")
}
                        

}
                          

// @LINE:19
// @LINE:18
class ReverseRegions {


// @LINE:19
def getByPcode(pcode:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "svnc_analysis/regions/" + implicitly[PathBindable[String]].unbind("pcode", dynamicString(pcode)) + "/")
}
                        

// @LINE:18
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "svnc_analysis/regions/")
}
                        

}
                          

// @LINE:6
class ReverseAnalysisController {


// @LINE:6
def svncAnalysisShow(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "svnc_analysis")
}
                        

}
                          

// @LINE:3
class ReverseHomeController {


// @LINE:3
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:19
// @LINE:18
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:6
// @LINE:3
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:14
// @LINE:13
class ReversePcodes {


// @LINE:13
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Pcodes.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "svnc_analysis/pcodes/"})
      }
   """
)
                        

// @LINE:14
def getByRegCode : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Pcodes.getByRegCode",
   """
      function(regCode) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "svnc_analysis/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("regCode", regCode) + "/"})
      }
   """
)
                        

}
              

// @LINE:9
class ReverseForecastController {


// @LINE:9
def svncForecastShow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ForecastController.svncForecastShow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "svnc_forecast"})
      }
   """
)
                        

}
              

// @LINE:19
// @LINE:18
class ReverseRegions {


// @LINE:19
def getByPcode : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Regions.getByPcode",
   """
      function(pcode) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "svnc_analysis/regions/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("pcode", encodeURIComponent(pcode)) + "/"})
      }
   """
)
                        

// @LINE:18
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Regions.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "svnc_analysis/regions/"})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseAnalysisController {


// @LINE:6
def svncAnalysisShow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalysisController.svncAnalysisShow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "svnc_analysis"})
      }
   """
)
                        

}
              

// @LINE:3
class ReverseHomeController {


// @LINE:3
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.HomeController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:19
// @LINE:18
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:6
// @LINE:3
package controllers.ref {


// @LINE:14
// @LINE:13
class ReversePcodes {


// @LINE:13
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Pcodes.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Pcodes", "list", Seq(), "GET", """ Pcode Resource
 POST    /svnc_analysis/pcodes/        controllers.Pcodes.create""", _prefix + """svnc_analysis/pcodes/""")
)
                      

// @LINE:14
def getByRegCode(regCode:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Pcodes.getByRegCode(regCode), HandlerDef(this.getClass.getClassLoader, "", "controllers.Pcodes", "getByRegCode", Seq(classOf[Int]), "GET", """""", _prefix + """svnc_analysis/$regCode<[^/]+>/""")
)
                      

}
                          

// @LINE:9
class ReverseForecastController {


// @LINE:9
def svncForecastShow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ForecastController.svncForecastShow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ForecastController", "svncForecastShow", Seq(), "GET", """ forecast page""", _prefix + """svnc_forecast""")
)
                      

}
                          

// @LINE:19
// @LINE:18
class ReverseRegions {


// @LINE:19
def getByPcode(pcode:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Regions.getByPcode(pcode), HandlerDef(this.getClass.getClassLoader, "", "controllers.Regions", "getByPcode", Seq(classOf[String]), "GET", """""", _prefix + """svnc_analysis/regions/$pcode<[^/]+>/""")
)
                      

// @LINE:18
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Regions.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Regions", "list", Seq(), "GET", """ Region Resource
 POST    /svnc_analysis/regions/        controllers.Regions.create""", _prefix + """svnc_analysis/regions/""")
)
                      

}
                          

// @LINE:6
class ReverseAnalysisController {


// @LINE:6
def svncAnalysisShow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalysisController.svncAnalysisShow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalysisController", "svncAnalysisShow", Seq(), "GET", """ analysis page""", _prefix + """svnc_analysis""")
)
                      

}
                          

// @LINE:3
class ReverseHomeController {


// @LINE:3
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.HomeController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.HomeController", "index", Seq(), "GET", """ index page""", _prefix + """""")
)
                      

}
                          
}
        
    