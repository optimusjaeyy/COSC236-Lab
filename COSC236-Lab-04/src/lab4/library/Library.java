
package lab4.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    // GRASP Principles: Creator and Controller
    // Manages the catalog of books and members.
    // Tracks which books are borrowed and available.

    // Attributes
    private List<Book> catalog;
    private List<Member> members;

    // Constructor
    public Library() {
        catalog = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(String title, String author) {

        if (findBookByTitle(title) == null) {
            Book book = new Book(title, author);
            catalog.add(book);

            System.out.println(title + " has been added to the catalog.");
        } else {
            System.out.println(title + " already exists.");
        }
    }

    // Register a new member
    public void registerMember(String name, int memberID) {

        if (findMemberByName(name) == null) {
            Member member = new Member(name, memberID);
            members.add(member);

            System.out.println(name + " has been registered.");
        } else {
            System.out.println(name + " already exists.");
        }
    }

    // Find a book by title
    public Book findBookByTitle(String title) {

        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }

    // Find a member by name
    public Member findMemberByName(String name) {

        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member;
            }
        }

        return null;
    }

    // Remove a book from the catalog
    public void removeBook(String title) {

        Book book = findBookByTitle(title);

        if (book != null && book.isAvailable()) {
            catalog.remove(book);
            System.out.println(title + " has been removed.");
        } else {
            System.out.println(title + " cannot be removed.");
        }
    }

    // Remove a member from the library
    public void removeMember(String name) {

        Member member = findMemberByName(name);

        if (member != null && !member.hasBorrowedBooks()) {
            members.remove(member);
            System.out.println(name + " has been removed.");
        } else {
            System.out.println(name + " cannot be removed.");
        }
    }

    // Display all books
    public void displayCatalog() {

        System.out.println("Available Book Catalog:");

        for (Book book : catalog) {
            System.out.println(book.getTitle() +
                    " by " + book.getAuthor() +
                    " | Available: " + book.isAvailable());
        }
    }

    // Display all members
    public void displayMembers() {

        System.out.println("Library Members:");

        for (Member member : members) {
            System.out.println("ID: " + member.getMemberID() +
                    " | Name: " + member.getName());
        }
    }
}
