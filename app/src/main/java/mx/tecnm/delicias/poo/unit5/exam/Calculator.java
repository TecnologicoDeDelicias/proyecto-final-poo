package mx.tecnm.delicias.poo.unit5.exam;

class Calculator {

  int unsafeDivision(int first, int second) {
    return first / second;
  }

  int safeDivision(int first, int second) {
    try {
      return unsafeDivision(first, second);
    } catch (ArithmeticException ae) {
      return 0;
    }
  }

  int uncheckedDivision(int first, int second) {
    try {
      return unsafeDivision(first, second);
    } catch (ArithmeticException ae) {
      throw new ArithmeticException("Cannot divide by zero");
    }
  }

  int checkedDivision(int first, int second) throws DivisionByZero {
    try {
      return unsafeDivision(first, second);
    } catch (ArithmeticException ae) {
      throw new DivisionByZero(ae);
    }
  }
}
