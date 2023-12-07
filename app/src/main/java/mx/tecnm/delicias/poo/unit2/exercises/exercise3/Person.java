package mx.tecnm.delicias.poo.unit2.exercises.exercise3;

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

  boolean isOlderThan(final Person otherPerson) {
    // The keyword "this" is used to reference the current instance
    // It is not required at least there is ambiguity between any other parameter or variable
    return this.age > otherPerson.age;
  }

  String compareAge(final Person otherPerson) {
    if (this.isOlderThan(otherPerson)) {
      return this.name + " is older than " + otherPerson.name;
    }
    if (otherPerson.isOlderThan(this)) {
      return this.name + " is younger than " + otherPerson.name;
    }
    return this.name + " and " + otherPerson.name + " have the same age";
  }
}
