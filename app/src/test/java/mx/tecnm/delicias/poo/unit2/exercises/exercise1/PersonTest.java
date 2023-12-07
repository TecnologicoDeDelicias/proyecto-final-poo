package mx.tecnm.delicias.poo.unit2.exercises.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class PersonTest {
  @Test
  void testDie() {
    final var person = new Person();
    person.alive = true;

    person.die();

    assertFalse(person.alive);
  }

  @Test
  void testIncrementAge() {
    final var person = new Person();
    person.age = 15;

    person.incrementAge();

    assertEquals(16, person.age);
  }

  @Test
  void testSayHello() {
    final var person = new Person();
    person.name = "John Doe";
    person.age = 60;
    person.alive = true;

    assertEquals("Hello, my name is John Doe", person.sayHello());
  }
}
