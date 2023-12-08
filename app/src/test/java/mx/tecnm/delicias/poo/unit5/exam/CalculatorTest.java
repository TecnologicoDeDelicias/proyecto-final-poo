package mx.tecnm.delicias.poo.unit5.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings({"PMD.AvoidDuplicateLiterals"})
class CalculatorTest {

  private Calculator calc;

  @BeforeEach
  void setup() {
    calc = new Calculator();
  }

  @SuppressWarnings({"PMD.JUnitTestContainsTooManyAsserts"})
  @Test
  void testUnsafeDivision() {
    assertEquals(2, calc.unsafeDivision(4, 2));
    assertEquals(10, calc.unsafeDivision(100, 10));
    assertEquals(2, calc.unsafeDivision(5, 2));
    assertEquals(3, calc.unsafeDivision(10, 3));
  }

  @Test
  @SuppressWarnings({"PMD.JUnitTestContainsTooManyAsserts"})
  void testUnsafeDivisionWithZero() {
    var exception = assertThrows(ArithmeticException.class, () -> calc.unsafeDivision(10, 0));

    assertEquals("/ by zero", exception.getMessage());
  }

  @Test
  @SuppressWarnings({"PMD.JUnitTestContainsTooManyAsserts"})
  void testSafeDivision() {
    assertEquals(2, calc.safeDivision(4, 2));
    assertEquals(10, calc.safeDivision(100, 10));
    assertEquals(2, calc.safeDivision(5, 2));
    assertEquals(3, calc.safeDivision(10, 3));
  }

  @Test
  void testSafeDivisionWithZero() {
    assertEquals(0, calc.safeDivision(100, 0));
  }

  @Test
  @SuppressWarnings({"PMD.JUnitTestContainsTooManyAsserts"})
  void testUncheckedDivision() {
    assertEquals(2, calc.uncheckedDivision(4, 2));
    assertEquals(10, calc.uncheckedDivision(100, 10));
    assertEquals(2, calc.uncheckedDivision(5, 2));
    assertEquals(3, calc.uncheckedDivision(10, 3));
  }

  @Test
  @SuppressWarnings({"PMD.JUnitTestContainsTooManyAsserts"})
  void testUncheckedDivisionWithZero() {
    var exception = assertThrows(RuntimeException.class, () -> calc.uncheckedDivision(10, 0));

    assertEquals("Cannot divide by zero", exception.getMessage());
  }

  @Test
  @SuppressWarnings({"PMD.JUnitTestContainsTooManyAsserts"})
  void testCheckedDivision() throws DivisionByZero {
    assertEquals(2, calc.checkedDivision(4, 2));
    assertEquals(10, calc.checkedDivision(100, 10));
    assertEquals(2, calc.checkedDivision(5, 2));
    assertEquals(3, calc.checkedDivision(10, 3));
  }

  @Test
  @SuppressWarnings({"PMD.JUnitTestContainsTooManyAsserts"})
  void testCheckedDivisionWithZero() throws DivisionByZero {
    var exception = assertThrows(DivisionByZero.class, () -> calc.checkedDivision(10, 0));

    assertEquals("Cannot divide by zero", exception.getMessage());
  }
}
