package mx.tecnm.delicias.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void testGetGreetingShouldReturnHelloWorld() {
    App sut = new App();
    assertEquals("Hello World!", sut.getGreeting(), "The greeting should be Hello World!");
  }
}
