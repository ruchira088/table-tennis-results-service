package utils

object ScalaUtils
{
  def toOption[A](value: A): Option[A] = value match {
    case null => None
    case _ => Some(value)
  }
}
