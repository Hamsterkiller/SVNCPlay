package controllers.responses

import play.api.libs.json._


case class ErrorResult(status: Int, message: String)

object ErrorResult {
  implicit val format: Format[ErrorResult] = Json.format[ErrorResult]
}

/**
  * response is already JsValue and will stay JsValue after convertion to JSON
  * we do not need Option[JsValue] since JsValue class has it's own JsNull value
  * @param result - resulting message
  * @param response - JsValue response
  * @param error
  */
case class EndpointResponse(
                             result: String,
                             response: JsValue,
                             error: Option[ErrorResult])

object EndpointResponse {
  implicit val format: Format[EndpointResponse] = Json.format[EndpointResponse]
}

/**
  * objects need to separate false response from positive one
  */
object ErrorResponse {
  val INVALID_JSON = 1000
  def apply(status: Int, message: String) = {
    EndpointResponse("ko", JsNull, Option(ErrorResult(status, message)))
  }
}

object SuccessResponse {
  def apply[A](successResponse: A)(implicit w: Writes[A]) = {
    EndpointResponse("ok", Json.toJson(successResponse), None)
  }
}