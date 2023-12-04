package mx.tecnm.delicias.poo;

/**
 * Main App class.
 *
 * @author Benjamin Cisneros Barraza
 */
@SuppressWarnings("PMD.ShortClassName")
public class App {
  /** Returns a greeting. */
  public String getGreeting() {
    return "Hello World!";
  }

  /**
   * The main method.
   *
   * @param args the app arguments.
   */
  @SuppressWarnings("PMD.SystemPrintln")
  public static void main(final String[] args) {
    System.out.println(new App().getGreeting());
  }
}
