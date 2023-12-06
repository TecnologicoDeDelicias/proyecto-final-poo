package mx.tecnm.delicias.poo.unit2.exam;

import mx.tecnm.delicias.poo.Generated;

/**
 * Unit 2 Exam class.
 *
 * @author Benjamin Cisneros Barraza.
 */
@Generated
public class Exam {
  /**
   * Main method to test Exam.
   *
   * @param args The main args.
   */
  public static void main(final String[] args) {
    new Exam().doExam();
  }

  @SuppressWarnings("PMD.SystemPrintln")
  private void doExam() {
    printBookCount();
    final var quijoteBook = new Book("Don Quijote de la Mancha", "Miguel Cervantes", 3000);
    quijoteBook.print();
    printBookCount();

    System.out.println("Regular price: " + quijoteBook.getPrice());
    System.out.println("Price with 10% discount: " + quijoteBook.getPrice(10));

    final var harryPotterBook = new Book("Harry Potter", "JK Rowling", 1500);
    harryPotterBook.setPrice(200);
    harryPotterBook.setAvailable(false);
    harryPotterBook.print();
    printBookCount();

    System.out.println("Regular price: " + harryPotterBook.getPrice());
    System.out.println("Price with 15% discount: " + harryPotterBook.getPrice(15));
  }

  @SuppressWarnings("PMD.SystemPrintln")
  private void printBookCount() {
    System.out.println("Book count: " + Book.getBookCount());
  }
}
