package mx.tecnm.delicias.poo.unit5.exercises.exercise2;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PropagateExceptionExampleTest {
  @Test
  void testRun() {
    assertThrows(ArithmeticException.class, () -> new PropagateExceptionExample().run());
  }
}
