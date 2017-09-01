package controllers

import javax.inject.{Inject, Singleton}

import controllers.forms.CreateResultForm
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ResultController @Inject()(controllerComponents: ControllerComponents)
                                (implicit executionContext: ExecutionContext)
  extends AbstractController(controllerComponents)
{
  def create() = Action async {
    implicit request => for {
      createResultForm <- Future.fromTry(CreateResultForm.fromRequest)
    } yield ???
  }

}
