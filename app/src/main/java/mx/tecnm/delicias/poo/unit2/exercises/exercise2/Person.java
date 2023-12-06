package mx.tecnm.delicias.poo.unit2.exercises.exercise2;

/**
 * Person class with private attributes.
 *
 * @author Benjamin Cisneros Barraza
 */
public class Person {
  private final String name;
  private int age;
  private boolean alive = true;

  /**
   * Constructor of Person.
   *
   * @param name The person's name.
   * @param age the person's initial age.
   */
  public Person(final String name, final int age) {
    this.name = name;
    this.age = age;
  }

  void sayHello() {
    if (alive) {
      System.out.println("Hello, my name is " + name);
    } else {
      System.out.println("RIP " + name);
    }
  }

  void incrementAge() {
    age = age + 1;
  }

  void die() {
    if (alive) {
      alive = false;
    }
  }
}
