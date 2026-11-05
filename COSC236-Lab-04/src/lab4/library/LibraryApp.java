
package lab4.library;

// Demonstrates the Library Management System
// GRASP Principle: High Cohesion

public class LibraryApp {

    public static void main(String[] args) {

        // Create Library and Controller
        Library library = new Library();
        LibrarianController controller =
                new LibrarianController(library);

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");

        // 1. Add books
        System.out.println("\n--- Adding Books ---");

        library.addBook("Dune", "Frank Herbert");
        library.addBook("1984", "George Orwell");
        library.addBook("Moby Dick", "Herman Melville");

        // 2. Register members
        System.out.println("\n--- Registering Members ---");

        library.registerMember("Alice", 101);
        library.registerMember("Bob", 102);

        // 3. Display books
        System.out.println("\n--- Display Book Catalog ---");

        library.displayCatalog();

        // 4. Display members
        System.out.println("\n--- Display Library Members ---");

        library.displayMembers();

        // 5. Alice borrows Dune
        System.out.println("\n--- Alice Borrows Dune ---");

        controller.borrowBook("Dune", "Alice");

        // 6. Bob borrows 1984
        System.out.println("\n--- Bob Borrows 1984 ---");

        controller.borrowBook("1984", "Bob");

        // 7. Bob tries to borrow Dune
        System.out.println("\n--- Bob Tries to Borrow Dune ---");

        controller.borrowBook("Dune", "Bob");

        // 8. Alice returns Dune
        System.out.println("\n--- Alice Returns Dune ---");

        controller.returnBook("Dune", "Alice");

        // 9. Bob borrows Dune
        System.out.println("\n--- Bob Borrows Dune ---");

        controller.borrowBook("Dune", "Bob");

        // 10. Look up a book
        System.out.println("\n--- Looking Up a Book ---");

        Book book = library.findBookByTitle("Dune");

        if (book != null) {
            System.out.println("Book found: " + book.getTitle());
        } else {
            System.out.println("Book not found.");
        }

        // 11. Look up a member
        System.out.println("\n--- Looking Up a Member ---");

        Member member = library.findMemberByName("Alice");

        if (member != null) {
            System.out.println("Member found: " + member.getName());
        } else {
            System.out.println("Member not found.");
        }

        // 12. Return Dune before removing Bob
        System.out.println("\n--- Bob Returns Dune ---");

        controller.returnBook("Dune", "Bob");

        // 13. Remove a book
        System.out.println("\n--- Removing Moby Dick ---");

        library.removeBook("Moby Dick");

        // 14. Remove a member
        System.out.println("\n--- Removing Alice ---");

        library.removeMember("Alice");

        // 15. Display final catalog
        System.out.println("\n--- Final Book Catalog ---");

        library.displayCatalog();

        // 16. Display final members
        System.out.println("\n--- Final Library Members ---");

        library.displayMembers();

        System.out.println("\n===== DEMONSTRATION COMPLETE =====");
    }
}
