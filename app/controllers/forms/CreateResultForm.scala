package controllers.forms

import java.util.Date

import exceptions.FormValidationException
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc.{AnyContent, Request}

import scala.util.{Failure, Success, Try}

case class CreateResultForm(
     winner: String,
     loser: String,
     winnerScore: Int,
     loserScore: Int,
     date: Option[Date]
)

object CreateResultForm
{
  def fromRequest(implicit request: Request[AnyContent]): Try[CreateResultForm] =
    Form(
      mapping(
        "winner" -> text,
        "loser" -> text,
        "winnerScore" -> number,
        "loserScore" -> number,
        "date" -> optional(date)
      )(CreateResultForm.apply)(CreateResultForm.unapply)
    )
      .bindFromRequest()
      .fold(
        form => Failure(FormValidationException(form.errors.toList)),
        Success(_)
      )
}
