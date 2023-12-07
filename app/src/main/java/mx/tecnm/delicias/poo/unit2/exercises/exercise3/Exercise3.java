package mx.tecnm.delicias.poo.unit2.exercises.exercise3;

/**
 * Exercise 3 of Unit 2.
 *
 * <p>Demonstrate private attributes usage.
 *
 * @author Benjamin Cisneros Barraza
 */
public class Exercise3 {
  /** Main method. */
  public static void main(final String[] args) {
    new Exercise3().doExercise();
  }

  private void doExercise() {
    final Person john = new Person("John", 30);
    final Person peter = new Person("Peter", 15);
    final Person jessy = new Person("Jessy", 15);

    printOlder(john, peter);
    printOlder(peter, john);
    printOlder(peter, jessy);
  }

  private void printOlder(final Person firstPerson, final Person secondPerson) {
    System.out.println(firstPerson.compareAge(secondPerson));
  }
}
