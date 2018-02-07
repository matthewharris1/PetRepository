package petRepo

import petRepo.repositories.{Cat, Dog, PetRepository}


object PetRepo extends App {

  val dogs = for(i <- 1 to 100) yield Dog(s"Dog $i")
  PetRepository.add(dogs: _*)

  val cats = for(i <- 1 to 100) yield Cat(s"Cat $i")
  PetRepository.add(cats: _*)

  val p2 = PetRepository.all()
  println(p2)

}
