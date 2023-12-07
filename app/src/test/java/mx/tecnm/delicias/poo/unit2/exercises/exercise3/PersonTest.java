package mx.tecnm.delicias.poo.unit2.exercises.exercise3;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PersonTest {
  @Test
  void testIsOlderThanTrue() {
    var older = new Person("Older", 30);
    var younger = new Person("Younger", 20);

    assertTrue(older.isOlderThan(younger));
  }

  @Test
  void testIsOlderThanFalse() {
    var older = new Person("Older", 30);
    var younger = new Person("Younger", 20);

    assertFalse(younger.isOlderThan(older));
  }

  @Test
  void testIsOlderThanSameAge() {
    var one = new Person("One", 56);
    var two = new Person("Two", 56);

    assertFalse(one.isOlderThan(two));
  }
}
