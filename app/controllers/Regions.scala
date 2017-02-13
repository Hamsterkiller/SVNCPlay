package controllers

import controllers.responses.{ErrorResponse, SuccessResponse}
import models.Region
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}
import utils.SVNCLoaderCsv

/**
  * Controller class for the 'Region' model
  */
object Regions extends Controller {
  // get all available pcodes
  def list = Action { request =>
    val regions: Seq[Region] = SVNCLoaderCsv.regions.sorted
    Ok(Json.toJson(regions))
  }

  // get all available pcodes for specific region code
  def getByPcode(pcode: String) = Action { request =>
    val regions: Seq[Region] = SVNCLoaderCsv.filterRegions(pcode).sorted
    // converting Seq[Pcode] to Json
    if (regions.isEmpty) {
      NotFound(Json.toJson(ErrorResponse(NOT_FOUND, "No regions were selected!")))
    } else {
      Ok(Json.toJson(SuccessResponse(regions)))
    }
  }
}
