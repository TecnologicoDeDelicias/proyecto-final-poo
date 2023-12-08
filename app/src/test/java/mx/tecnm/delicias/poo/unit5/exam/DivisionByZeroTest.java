package mx.tecnm.delicias.poo.unit5.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DivisionByZeroTest {

  @Test
  void shouldBeCheckedException() {
    var clazz = DivisionByZero.class.getAnnotatedSuperclass().getType();
    var name = clazz.getTypeName();
    assertEquals("java.lang.Exception", name);
  }
}
