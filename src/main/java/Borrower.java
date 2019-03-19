import java.util.ArrayList;

public class Borrower {


    private ArrayList<BookItem> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<BookItem>();
    }

    public int getTotalBorrowedBooks() {
        return this.borrowedBooks.size();
    }

    public void addBookItemToBorrower(BookItem bookItem){
        this.borrowedBooks.add(bookItem);
    }

    public void borrowBookFromLibrary(Library library, BookItem bookItem){
        BookItem requestedBook = library.lendBook(bookItem);
        this.addBookItemToBorrower(requestedBook);
    }
}
