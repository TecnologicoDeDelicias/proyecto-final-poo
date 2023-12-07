package mx.tecnm.delicias.poo.unit3.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

class DogTest {
  @Test
  void testGetSpecie() {
    var dog = new Dog("Firulais", "Bones");

    assertEquals("Canine", dog.getSpecie());
  }

  @Test
  void testGreetingFido() {
    var dog = new Dog("Fido", "Spaghetti");

    assertEquals(
        "Hello, my name is Fido and I am of Canine specie. My favorite food is Spaghetti",
        dog.greeting());
  }

  @Test
  void testGreetingDaisy() {
    var dog = new Dog("Daisy", "Beef");

    assertEquals(
        "Hello, my name is Daisy and I am of Canine specie. My favorite food is Beef",
        dog.greeting());
  }

  @Test
  void testDogIsAnAnimal() {
    var dog = new Dog("Daisy", "Beef");

    assertInstanceOf(Animal.class, dog);
  }
}
