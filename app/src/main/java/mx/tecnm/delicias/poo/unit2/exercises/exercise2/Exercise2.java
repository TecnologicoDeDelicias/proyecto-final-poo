package mx.tecnm.delicias.poo.unit2.exercises.exercise2;

/**
 * Exercise 2 of Unit 2.
 *
 * <p>Demonstrate private attributes usage.
 *
 * @author Benjamin Cisneros Barraza
 */
public class Exercise2 {
  /** Main method. */
  public static void main(final String[] args) {
    new Exercise2().doExercise();
  }

  private void doExercise() {
    final Person john = new Person("John", 30);

    john.sayHello();
    john.die();
    john.sayHello();
  }
}
