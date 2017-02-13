package controllers

import models.Pcode
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}
import utils.SVNCLoaderCsv
import controllers.responses._

/**
  * Controller class for the 'Pcode' model
  */
object Pcodes extends Controller {

  // get all available pcodes
  def list = Action { request =>
    val pcodes: Seq[Pcode] = SVNCLoaderCsv.pcodesAvailable.sorted
    Ok(Json.toJson(pcodes))
  }

  // get all available pcodes for specific region code
  def getByRegCode(regCode: Int) = Action { request =>
    val pcodes: Seq[Pcode] = SVNCLoaderCsv.filterPcodes(regCode).sorted
    // converting Seq[Pcode] to Json
    if (pcodes.isEmpty) {
      NotFound(Json.toJson(ErrorResponse(NOT_FOUND, "No regions were selected!")))
    } else {
      Ok(Json.toJson(SuccessResponse(pcodes)))
    }
  }

//  def create = Action { request =>
//    // parse from json post body
//    val incomingEvent: Event = ???
//
//    // save event and get a copy back
//    val createdEvent: Event = ???
//
//    Created(Json.toJson(createdEvent))
//  }

}
