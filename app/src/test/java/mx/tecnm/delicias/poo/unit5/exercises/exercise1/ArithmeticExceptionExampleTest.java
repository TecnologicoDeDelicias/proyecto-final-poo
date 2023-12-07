package mx.tecnm.delicias.poo.unit5.exercises.exercise1;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ArithmeticExceptionExampleTest {
  @Test
  void testRun() {
    assertThrows(ArithmeticException.class, () -> new ArithmeticExceptionExample().run());
  }
}
