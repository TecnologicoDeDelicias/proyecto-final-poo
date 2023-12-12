package mx.tecnm.delicias.poo.unit5.exam;

class DivisionByZero extends Exception {
  DivisionByZero() {}

  DivisionByZero(Throwable cause) {
    super("Cannot divide by zero", cause);
  }
}
