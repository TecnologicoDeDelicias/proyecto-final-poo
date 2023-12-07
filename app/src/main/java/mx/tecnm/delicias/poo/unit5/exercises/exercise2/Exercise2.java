package mx.tecnm.delicias.poo.unit5.exercises.exercise2;

@SuppressWarnings("PMD.UseUtilityClass")
class Exercise2 {
  /** Main method. */
  public static void main(final String[] args) {
    System.out.println("Execute first()");
    first();
    System.out.println("Program finished");
  }

  private static void first() {
    System.out.println("Execute second()");
    second();
  }

  private static void second() {
    System.out.println("Execute third()");
    third();
  }

  private static void third() {
    final int result = 10 / 0;

    System.out.println("The result is " + result);
  }
}
