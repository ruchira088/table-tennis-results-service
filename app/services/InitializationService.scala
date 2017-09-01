package services

import scala.util.Try

object InitializationService
{
  def verifyEnvValues(): Try[Boolean] = for {
    _ <- ConfigService.getEnvValue(TeamService.ENV_VALUE)
  } yield true
}
