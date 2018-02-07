package petRepo

import petRepo.models.Dog
import petRepo.models.Cat

import petRepo.repositories.PetRepository

object PetRepo extends App {

  //instantiate pet repo - call all on repo - add pets - remove pets -

  //val pets = PetRepository.all()

  //println(pets)

  //create dog example

  val d1 = new Dog("Jessie")

  //add dog example

  PetRepository.add(d1)

  //generate 100 dogs by foreach

  val dogs = for(i<- 1 to 100) yield new Dog(s"Dog $i")

  //adds list of 100 dogs to list individually
  PetRepository.add(dogs: _*)

  //assign list of all items to val
  val p2 = PetRepository.all()
  println(p2)

  PetRepository.removeByName(d1.name)

  val p3 = PetRepository.all()
  println(p3)

}

