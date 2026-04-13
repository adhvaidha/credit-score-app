public class Library {

    int totalBooks = 0;
    int availableBooks = 0;

    public void addBook(int count) {
        if (count > 0) {
            totalBooks += count;
            availableBooks += count;
        }
    }

    public int lendBook(int count) {
        if (count <= availableBooks) {
            availableBooks -= count;
            return availableBooks;
        }
        return -1; // not enough books
    }

    public int getAvailableBooks() {
        return availableBooks;
    }
}