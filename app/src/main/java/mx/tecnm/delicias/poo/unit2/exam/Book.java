package mx.tecnm.delicias.poo.unit2.exam;

import mx.tecnm.delicias.poo.Generated;

/**
 * Book class.
 *
 * @author Benjamin Cisneros Barraza
 */
public class Book {
  private static int bookCount;
  private final String title;
  private final String author;
  private final int pages;
  private double price = 100;
  private boolean available = true;

  /**
   * Constructor of Book.
   *
   * @param title The book title.
   * @param author The book author.
   * @param pages The number of pages of the book.
   */
  public Book(final String title, final String author, final int pages) {
    this.title = title;
    this.author = author;
    this.pages = pages;

    bookCount += 1;
  }

  @Override
  public String toString() {
    return "Book [title="
        + title
        + ", author="
        + author
        + ", pages="
        + pages
        + ", price="
        + price
        + ", available="
        + available
        + "]";
  }

  public void setPrice(final double newPrice) {
    this.price = newPrice;
  }

  public void setAvailable(final boolean isAvailable) {
    this.available = isAvailable;
  }

  public double getPrice() {
    return this.price;
  }

  /**
   * Gets the book price with a given discount, limited to 15%.
   *
   * @param discount Represents the % of discount.
   */
  public double getPrice(final int discount) {
    final var allowedDiscount = Math.min(discount, 15);
    final var priceDiscounted = (this.price * allowedDiscount) / 100;
    return this.price - priceDiscounted;
  }

  /**
   * Returns the number of books created.
   *
   * @return an integer that represents the number of books created.
   */
  public static int getBookCount() {
    return bookCount;
  }

  /** Prints the book information. */
  @SuppressWarnings("PMD.SystemPrintln")
  @Generated
  public void print() {
    System.out.println(this);
  }

  /** Resets the book counter. */
  public static void resetBookCounter() {
    bookCount = 0;
  }
}
