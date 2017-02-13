package controllers

import play.api.mvc.{Action, Controller}

/**
  * This controller is for the index page of the application
  */

object HomeController extends Controller {

  def index = Action {
    Ok(views.html.main("АРМ аналитика СВНЦ")(views.html.index("АРМ аналитика СВНЦ")))
  }
}
