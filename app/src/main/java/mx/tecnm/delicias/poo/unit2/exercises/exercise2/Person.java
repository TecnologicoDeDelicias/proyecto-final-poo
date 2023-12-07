package mx.tecnm.delicias.poo.unit2.exercises.exercise2;

/**
 * Person class with private attributes.
 *
 * @author Benjamin Cisneros Barraza
 */
class Person {
  private final String name;
  private int age;
  private boolean alive = true;

  /**
   * Constructor of Person.
   *
   * @param name The person's name.
   * @param age the person's initial age.
   */
  Person(final String name, final int age) {
    this.name = name;
    this.age = age;
  }

  boolean isAlive() {
    return alive;
  }

  int getAge() {
    return age;
  }

  String sayHello() {
    return isAlive() ? "Hello, my name is " + name : "RIP " + name;
  }

  void incrementAge() {
    age = age + 1;
  }

  void die() {
    if (isAlive()) {
      alive = false;
    }
  }
}
