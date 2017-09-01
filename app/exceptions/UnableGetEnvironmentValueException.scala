package exceptions

case class UnableGetEnvironmentValueException(name: String) extends Exception
{
  override def getMessage = s"Unable to find environment value: $name"
}
