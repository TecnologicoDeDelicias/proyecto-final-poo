package mx.tecnm.delicias.poo.unit3.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnimalTest {
  @Test
  void testGetSpecie() {
    var animal = new Animal("Bob");
    assertEquals("Unknown", animal.getSpecie());
  }

  @Test
  void testGreeting() {
    var animal = new Animal("Boris the Animal");
    assertEquals(
        "Hello, my name is Boris the Animal and I am of Unknown specie.", animal.greeting());
  }
}
