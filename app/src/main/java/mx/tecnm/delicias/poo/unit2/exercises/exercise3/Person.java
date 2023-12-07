package mx.tecnm.delicias.poo.unit2.exercises.exercise3;

import mx.tecnm.delicias.poo.Generated;

/**
 * Person class with private attributes.
 *
 * @author Benjamin Cisneros Barraza
 */
class Person {
  private final String name;
  private final int age;

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

  @Generated
  String getName() {
    return name;
  }

  boolean isOlderThan(final Person otherPerson) {
    // The keyword "this" is used to reference the current instance
    // It is not required at least there is ambiguity between any other parameter or variable
    return this.age > otherPerson.age;
  }
}
