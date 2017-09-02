package services

import scala.util.Try

object InitializationService
{
  def verifyEnvValues(): Try[Boolean] = for {
    teamServiceUrl <- ConfigService.getEnvValue(TeamService.ENV_VALUE)
  } yield {
    println(s"TEAM_SERVICE_URL: $teamServiceUrl")
    true
  }
}
