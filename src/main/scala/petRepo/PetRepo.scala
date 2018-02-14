package petRepo

<<<<<<< HEAD
import petRepo.repositories.{Cat, Dog, PetRepository}


object PetRepo extends App {

  val dogs = for(i <- 1 to 100) yield Dog(s"Dog $i")
  PetRepository.add(dogs: _*)

  val cats = for(i <- 1 to 100) yield Cat(s"Cat $i")
  PetRepository.add(cats: _*)

  val p2 = PetRepository.all()
  println(p2)
=======
import petRepo.models.Dog
import petRepo.models.Cat

import petRepo.repositories.PetRepository

object PetRepo extends App {

  //instantiate pet repo - call all on repo - add pets - remove pets -

  //val pets = PetRepository.all()

  //println(pets)

  //create dog example. new keyword not needed in front of Dog as it's a case class.

  val d1 = Dog("Jessie")

  val d2 = Dog("Brian")

  //add dog example

  PetRepository.add(d1, d2)

  println(PetRepository.all())

  //generate 100 dogs by foreach.

  PetRepository.findByName(d1.name)

  val dogs = for(i<- 1 to 100) yield Dog(s"Dog $i")

  //adds list of 100 dogs to list individually
  PetRepository.add(dogs: _*)

  //assign list of all items to val
  val p2 = PetRepository.all()
  println(p2)

  PetRepository.removeByName(d2.name)

  val p3 = PetRepository.all()
  println(p3)
>>>>>>> master

}

