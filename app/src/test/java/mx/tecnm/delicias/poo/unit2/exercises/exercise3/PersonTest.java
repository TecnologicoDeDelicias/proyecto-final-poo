package mx.tecnm.delicias.poo.unit2.exercises.exercise3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PersonTest {
  @Test
  void testIsOlderThanWithOlderPerson() {
    var older = new Person("John", 30);
    var younger = new Person("Brian", 20);

    assertTrue(older.isOlderThan(younger));
  }

  @Test
  void testIsOlderThanWithYounger() {
    var older = new Person("Teresa", 30);
    var younger = new Person("Fabian", 20);

    assertFalse(younger.isOlderThan(older));
  }

  @Test
  void testIsOlderThanWithSameAge() {
    var one = new Person("One", 56);
    var two = new Person("Two", 56);

    assertFalse(one.isOlderThan(two));
  }

  @Test
  void testCompareAgeOlder() {
    var older = new Person("Older", 30);
    var younger = new Person("Younger", 20);

    assertEquals("Older is older than Younger", older.compareAge(younger));
  }

  @Test
  void testCompareAgeYounger() {
    var older = new Person("Older", 30);
    var younger = new Person("Younger", 20);

    assertEquals("Younger is younger than Older", younger.compareAge(older));
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void testCompareAgeSameAge() {
    var one = new Person("One", 30);
    var two = new Person("Two", 30);

    assertEquals("One and Two have the same age", one.compareAge(two));
    assertEquals("Two and One have the same age", two.compareAge(one));
  }
}
