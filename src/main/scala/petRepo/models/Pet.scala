package petRepo.models

/**
  * Created by digital032676 on 05/02/18.
  */
trait Pet {
  val name: String
}

trait Talking {
  def talk: String
}

trait Woof extends Talking {

  override def talk: String = "woof"
}
trait Meow extends Talking {
  override def talk: String = "meow"
}

final case class Dog(override val name: String) extends Pet with Woof {

  override def toString = s"The Dogs name is $name and goes $talk"

}

final case class Cat (override val name : String) extends Pet with Meow {

  override def toString = s"The Cats name $name and goes $talk"

}
