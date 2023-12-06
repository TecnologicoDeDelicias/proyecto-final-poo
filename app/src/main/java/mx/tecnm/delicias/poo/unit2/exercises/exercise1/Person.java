package mx.tecnm.delicias.poo.unit2.exercises.exercise1;

/**
 * Person class.
 *
 * <p>It represents a basic class with default access to their attributes and methods.
 *
 * @author Benjamin Cisneros Barraza
 */
public class Person {
  String name;
  int age;
  boolean alive;

  void sayHello() {
    System.out.println("Hello, my name is " + name);
  }

  void incrementAge() {
    age = age + 1;
  }

  void die() {
    alive = false;
  }
}
