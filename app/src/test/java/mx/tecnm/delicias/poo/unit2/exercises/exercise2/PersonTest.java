package mx.tecnm.delicias.poo.unit2.exercises.exercise2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PersonTest {
  @Test
  void testPersonIsAliveByDefault() {
    var person = new Person("TestPerson", 30);

    assertTrue(person.isAlive());
  }

  @Test
  void testDie() {
    var person = new Person("TestPerson", 30);

    person.die();

    assertFalse(person.isAlive());
  }

  @Test
  void testIncrementAge() {
    var person = new Person("Test Person", 56);

    person.incrementAge();

    assertEquals(57, person.getAge());
  }

  @Test
  void testSayHelloAlivePerson() {
    var person = new Person("Benjamin", 98);

    assertEquals("Hello, my name is Benjamin", person.sayHello());
  }

  @Test
  void testSayHelloDiedPerson() {
    var person = new Person("Benjamin", 98);

    person.die();

    assertEquals("RIP Benjamin", person.sayHello());
  }
}
