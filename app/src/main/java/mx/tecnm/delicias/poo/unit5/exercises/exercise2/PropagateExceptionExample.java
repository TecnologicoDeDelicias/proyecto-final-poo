package mx.tecnm.delicias.poo.unit5.exercises.exercise2;

class PropagateExceptionExample {
  /** Runs an example of how an exception is propagated. */
  public void run() {
    System.out.println("Execute first()");
    first();
    System.out.println("Program finished");
  }

  private void first() {
    System.out.println("Execute second()");
    second();
  }

  private void second() {
    System.out.println("Execute third()");
    third();
  }

  private void third() {
    final int result = 10 / 0;

    System.out.println("The result is " + result);
  }
}
