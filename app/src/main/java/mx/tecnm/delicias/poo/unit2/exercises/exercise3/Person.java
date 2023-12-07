package mx.tecnm.delicias.poo.unit2.exercises.exercise3;

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

  public String getName() {
    return name;
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

  boolean isOlderThan(final Person otherPerson) {
    // The keyword "this" is used to reference the current instance
    // It is not required at least there is ambiguity between any other parameter or variable
    return this.age > otherPerson.age;
  }
}
