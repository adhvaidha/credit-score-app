import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    void testAddBooks() {
        Library lib = new Library();
        lib.addBook(10);
        assertEquals(10, lib.getAvailableBooks());
    }

    @Test
    void testLendBooksNormal() {
        Library lib = new Library();
        lib.addBook(10);
        assertEquals(5, lib.lendBook(5));
    }

    @Test
    void testLendMoreThanAvailable() {
        Library lib = new Library();
        lib.addBook(5);
        assertEquals(-1, lib.lendBook(10));
    }

    @Test
    void testZeroBooks() {
        Library lib = new Library();
        assertEquals(0, lib.getAvailableBooks());
    }
}