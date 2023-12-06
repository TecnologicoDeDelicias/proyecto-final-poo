package mx.tecnm.delicias.poo.unit2.exercises.exercise1;

/**
 * Example of class attributes and methods.
 *
 * @author Benjamin Cisneros Barraza
 */
public class Exercise1 {
  /** Main method. */
  public static void main(final String[] args) {
    final var exercise = new Exercise1();
    exercise.doExercise();
  }

  private void doExercise() {
    final Person john = new Person();
    john.sayHello();
    john.name = "John";
    john.age = -10;
    john.alive = true;
    john.sayHello();

    john.die();

    john.sayHello();
    john.alive = false;
  }
}
