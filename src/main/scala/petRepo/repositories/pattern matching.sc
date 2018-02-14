def double(int: Int) = int * 2

val num : Int = 1
num match {
  case 1 => "One"
  case 2 => "Two"
  case 3 => "Three"
  case _ => "Anything else"
}

sealed trait Pet {
  val name: String
  val age: Int

  def speak(): String = "hello"
}
case class Dog(name: String, age: Int) extends Pet {
  override def speak(): String = "Woof"
}

case class Cat(name: String, age: Int) extends Pet {
  override def speak(): String = "Meow"
}

def whoDis(pet : Pet) = {
  pet match {
    case Dog(name, age) => s"This is a dog, and their name is $name. it is $age"
    case Cat(name, age) => s"This is a cat, and their name is $name. it is $age"
  }
}

val d = Dog("jeff", 12)
whoDis(d)
val c = Cat("Tim", 12)
val num2 = (1, 5)

num2 match {
  case (1, x) if 2 < 5 => double(x * x)
  case (2, _) => 2
  case _ => double(num2._1 * 2)
}