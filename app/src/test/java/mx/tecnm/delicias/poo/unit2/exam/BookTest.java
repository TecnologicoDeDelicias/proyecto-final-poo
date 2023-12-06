package mx.tecnm.delicias.poo.unit2.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

  @BeforeEach
  void setup() {
    Book.resetBookCounter();
  }

  @Test
  void shouldGetPriceWithoutDiscount() {
    var book = createAnyBook();
    var price = 300.0d;
    book.setPrice(price);

    assertEquals(price, book.getPrice(), "Should calculate price without discount");
  }

  @Test
  void shouldGetPriceWithDiscount() {
    var book = createAnyBook();
    var price = 1000.0d;
    book.setPrice(price);

    assertEquals(900d, book.getPrice(10), "Should calculate price with discount");
  }

  @Test
  @SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
  void canCountNumberOfBooksCreated() {
    assertEquals(0, Book.getBookCount(), "Book count should be 0");
    createAnyBook();
    assertEquals(1, Book.getBookCount(), "Book count should be 1");
    createAnyBook();
    assertEquals(2, Book.getBookCount(), "Book count should be 2");
  }

  @Test
  void canGetItsDataAsString() {
    var book = createAnyBook();

    assertEquals(
        "Book [title=Any book, author=Any author, pages=100, price=100.0, available=true]",
        book.toString(),
        "Should get Book String representation");
  }

  @Test
  void canGetItsDataAsString2() {
    var book = createAnyBook();
    book.setAvailable(false);
    book.setPrice(540.99);

    assertEquals(
        "Book [title=Any book, author=Any author, pages=100, price=540.99, available=false]",
        book.toString(),
        "Should get Book String representation");
  }

  private Book createAnyBook() {
    return new Book("Any book", "Any author", 100);
  }
}
