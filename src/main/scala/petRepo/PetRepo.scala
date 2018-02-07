package petRepo

import petRepo.repositories.{Dog, PetRepository}


object PetRepo extends App {

  val pets = PetRepository.all()
  println(pets)

  val dogs = for(i <- 1 to 100) yield new Dog(s"Dog $i")
  PetRepository.add(dogs: _*)

  val p2 = PetRepository.all()
  println(p2)

}
