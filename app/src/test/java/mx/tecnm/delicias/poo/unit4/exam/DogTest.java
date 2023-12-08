package mx.tecnm.delicias.poo.unit4.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

@SuppressWarnings({"PMD.AvoidDuplicateLiterals", "PMD.MethodName", "PMD.TooManyMethods"})
class DogTest {
  @Test
  void haveFullEnergyWhenIsCreated() {
    var dog = new Dog("Fido", 1);
    assertEquals(100, dog.getEnergy());
  }

  @Test
  void haveZeroDistanceWhenIsCreated() {
    var dog = new Dog("Fido", 1);
    assertEquals(0, dog.getDistance());
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void canWalkOneMeterByStep() {
    var dog = new Dog("Fido", 1);
    dog.walk(10);
    assertEquals(10, dog.getDistance());

    dog.walk(10);
    assertEquals(20, dog.getDistance());

    dog.walk(20);
    assertEquals(40, dog.getDistance());

    dog.walk(30);
    assertEquals(70, dog.getDistance());

    dog.walk(30);
    assertEquals(100, dog.getDistance());
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void canWalkTwoMetersByStep() {
    var dog = new Dog("Fido", 2);
    dog.walk(10);
    assertEquals(20, dog.getDistance());

    dog.walk(10);
    assertEquals(40, dog.getDistance());

    dog.walk(20);
    assertEquals(80, dog.getDistance());

    dog.walk(10);
    assertEquals(100, dog.getDistance());
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void canWalkThreeMetersByStep() {
    var dog = new Dog("Fido", 3);
    dog.walk(10);
    assertEquals(30, dog.getDistance());

    dog.walk(10);
    assertEquals(60, dog.getDistance());

    dog.walk(5);
    assertEquals(75, dog.getDistance());

    dog.walk(8);
    assertEquals(99, dog.getDistance());
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void eachMeterWastedOnePercentOfEnergy() {
    var dog = new Dog("Fido", 1);
    dog.walk(10);
    assertEquals(90, dog.getEnergy());

    dog.walk(90);
    assertEquals(0, dog.getEnergy());
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void eachMeterWastedOnePercentOfEnergy2() {
    var dog = new Dog("Fido", 2);
    dog.walk(10);
    assertEquals(80, dog.getEnergy());

    dog.walk(40);
    assertEquals(0, dog.getEnergy());
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void eachMeterWastedOnePercentOfEnergy3() {
    var dog = new Dog("Fido", 3);
    dog.walk(10);
    assertEquals(70, dog.getEnergy());

    dog.walk(23);
    assertEquals(1, dog.getEnergy());
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void cannotWalkIfThereIsNoEnergy() {
    var dog = new Dog("Fido", 1);

    dog.walk(101);

    assertEquals(0, dog.getEnergy());
    assertEquals(100, dog.getDistance());

    dog.walk(100);

    assertEquals(0, dog.getEnergy());
    assertEquals(100, dog.getDistance());
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void cannotWalkIfThereIsNoEnergy2() {
    var dog = new Dog("Fido", 2);

    dog.walk(55);

    assertEquals(0, dog.getEnergy());
    assertEquals(100, dog.getDistance());

    dog.walk(10);

    assertEquals(0, dog.getEnergy());
    assertEquals(100, dog.getDistance());
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void cannotWalkIfThereIsNoEnergy3() {
    var dog = new Dog("Fido", 3);

    dog.walk(33);

    assertEquals(1, dog.getEnergy());
    assertEquals(99, dog.getDistance());

    dog.walk(10);

    assertEquals(0, dog.getEnergy());
    assertEquals(100, dog.getDistance());
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void canRecoverItsEnergyBySleeping() {
    var dog = new Dog("Fido", 1);

    dog.walk(100);

    dog.sleep(60);

    assertEquals(20, dog.getEnergy());

    dog.sleep(4 * 60);

    assertEquals(100, dog.getEnergy());
  }

  @Test
  void canRecoverMoreThanFullCapacityOfTheEnergy() {
    var dog = new Dog("Fido", 1);

    dog.walk(100);

    dog.sleep(6 * 60);

    assertEquals(100, dog.getEnergy());
  }

  @Test
  void canGreetCorrectly() {
    var dog = new Dog("Firulais", 2);

    assertEquals("Hello, my name is Firulais, and I am of the Canine specie", dog.greeting());
  }
}
