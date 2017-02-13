package controllers

import play.api.mvc.{Action, Controller}

/**
  * This controller is for the page with SVNC analysis
  */
object ForecastController extends Controller {
  def svncForecastShow = Action {
    Ok(views.html.svnc_forecast("Прогнозирование СВНЦ в разрезе ГП-Субъект РФ"))
  }
}
