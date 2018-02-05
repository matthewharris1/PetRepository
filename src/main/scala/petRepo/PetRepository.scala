package petRepo


import scala.collection.mutable.ArrayBuffer

/**
  * Created by digital032676 on 05/02/18.
  */
class PetRepository extends Pet {

  val Pets = new ArrayBuffer[Pet]

  def all() : List[Pet] = Nil

  def findByName(name: String) : Option[Pet] = None
  
  def dogs() : List[Pet] = Nil

  def cats() : List[Pet] = Nil

  def other() : List[Pet] = Nil

  def add(pet : Pet*) : List[Pet] = ???

  def removeByName(name : String) : List[Pet] = ???

  def update(pet: Pet) : List[Pet] = ???

}
