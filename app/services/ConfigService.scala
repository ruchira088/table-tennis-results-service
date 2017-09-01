package services

import exceptions.UnableGetEnvironmentValueException
import utils.ScalaUtils.toOption

import scala.util.{Failure, Success, Try}

object ConfigService
{
  def getEnvValue(name: String): Try[String] = toOption(System getenv name) match
    {
    case Some(value) => Success(value)
    case _ => Failure(UnableGetEnvironmentValueException(name))
    }
}
