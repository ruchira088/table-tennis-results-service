package modules

import com.google.inject.AbstractModule
import exceptions.UnableGetEnvironmentValueException
import services.InitializationService

class ResultsServiceModule extends AbstractModule
{
  override def configure() = {
    InitializationService.verifyEnvValues().recover {
      case exception @ UnableGetEnvironmentValueException(_) => {
        System.err.println(exception.getMessage)
        System.exit(1)
      }
    }
  }
}
