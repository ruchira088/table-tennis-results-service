package services

import javax.inject.{Inject, Singleton}

import play.api.libs.ws.WSClient

import scala.concurrent.ExecutionContext

@Singleton
class TeamService @Inject()(wsClient: WSClient)(implicit executionContext: ExecutionContext)
{

}

object TeamService
{
  val ENV_VALUE = "TEAM_SERVICE_URL"
}