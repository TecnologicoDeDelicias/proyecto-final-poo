package mx.tecnm.delicias.poo.unit5.exercises.exercise1;

class ArithmeticExceptionExample {

  void run() {
    final int[] numerators = {100, 256, 309, 678};
    final int[] divisors = {2, 7, 0, 12};
    for (final int divisor : divisors) {
      for (final int numerator : numerators) {
        makeDivision(numerator, divisor);
      }
    }
  }

  private void makeDivision(final int numerator, final int divisor) {
    System.out.println("Numerator: " + numerator);
    System.out.println("Divisor: " + divisor);
    final int result = numerator / divisor;
    System.out.println("The result is " + result);
    System.out.println();
  }
}
