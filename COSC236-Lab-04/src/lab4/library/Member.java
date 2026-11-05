
package lab4.library;

import java.util.ArrayList;
import java.util.List;

public class Member {

    // GRASP Principle: Information Expert and Low Coupling
    // Can borrow and return books.

    private String name;
    private int memberID;
    private List<Book> borrowedBooks = new ArrayList<>();

    // Constructor
    public Member(String name, int memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberID() {
        return memberID;
    }

    public List<Book> getBorrowedBooks() {
        return new ArrayList<>(borrowedBooks);
    }

    // Checks whether the member can borrow the book
    public boolean borrowBook(Book book) {
        if (book.borrow()) {
            borrowedBooks.add(book);
            return true;
        } else {
            return false;
        }
    }

    // Checks whether the book is returned successfully
    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            if (book.returnBook()) {
                borrowedBooks.remove(book);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Checks if the member has borrowed any books
    public boolean hasBorrowedBooks() {
        return !borrowedBooks.isEmpty();
    }

    @Override
    public String toString() {
        return "Member ID: " + memberID +
                ", Name: " + name +
                ", Borrowed Books: " + borrowedBooks.size();
    }
}
