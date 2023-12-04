package mx.tecnm.delicias.poo;

/**
 * Main App class.
 *
 * @author Benjamin Cisneros Barraza
 */
public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
