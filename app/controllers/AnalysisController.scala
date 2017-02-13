package controllers

import play.api.mvc.{Action, Controller}
import play.api.data._
import play.api.data.Forms._
import play.api.data.format.Formats.doubleFormat
import models.{PcodeRegionName, PcodeRegionSVNC, Pcode}
import utils.SVNCLoaderCsv

/**
  * This controller is for the page with SVNC forecasting
  */
object AnalysisController extends Controller {

  val pcodeRegSVNC: Form[PcodeRegionSVNC] = Form(

    // Defines a mapping that will handle svnc-fact table rows
    mapping(
      "tdate" ->  jodaDate,
      "pname" -> nonEmptyText,
      "tcode" -> optional(text),
      "pcode" -> nonEmptyText,
      "regCode" -> number.verifying("Region code must be non-negative integer!", _ >= 0),
      "regName" -> nonEmptyText,
      "price_EE" -> of(doubleFormat),
      "price_N" -> of(doubleFormat)
    )(PcodeRegionSVNC.apply)(PcodeRegionSVNC.unapply)
  )

  val pcodeForm: Form[Pcode] = Form {
    // Defines a mapping that will handle pcode-region_name submit information
    mapping(
      "pcode" -> nonEmptyText
    )(Pcode.apply)(Pcode.unapply)
  }

  val pcodeRegNameForm: Form[PcodeRegionName] = Form(

    // Defines a mapping that will handle pcode-region_name submit information
    mapping(
      "pcode" -> nonEmptyText,
      "regName" -> Forms.list(nonEmptyText)
    )(PcodeRegionName.apply)(PcodeRegionName.unapply)
  )

//  def pcodeValueSubmit = Action {
//    pcodeForm.bindFromRequest.fold(
//      formWithErrors => {
//        // binding failure, you retrieve the form containing errors:
//        BadRequest(views.html.svnc_analysis(formWithErrors))
//      },
//      userData => {
//        /* binding success, you get the actual value. */
//        val newUser = models.User(userData.name, userData.age)
//        val id = models.User.create(newUser)
//        Redirect(routes.Application.home(id))
//      }
//    )
//  }

  def svncAnalysisShow = Action {

    Ok(views.html.svnc_analysis("Анализ фактических значений СВНЦ")
      (views.html.select_parameters(SVNCLoaderCsv.pcodesAvailable.sorted)(pcodeRegNameForm)))

  }
}
