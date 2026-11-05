
package lab4.library;

// GRASP Principle: Controller
// Handles user requests like borrowing and returning books.
// Delegates tasks to the appropriate objects.

public class LibrarianController {

    private Library library;

    // Constructor
    public LibrarianController(Library library) {
        this.library = library;
    }

    // Handle borrowing requests
    public void borrowBook(String bookTitle, String memberName) {

        Book book = library.findBookByTitle(bookTitle);
        Member member = library.findMemberByName(memberName);

        // Check if member exists
        if (member == null) {
            System.out.println("Member " + memberName + " not found.");
            return;
        }

        // Check if book exists
        if (book == null) {
            System.out.println("Book " + bookTitle + " not found.");
            return;
        }

        // Delegate borrowing to Member
        if (member.borrowBook(book)) {
            System.out.println(memberName +
                    " successfully borrowed " + bookTitle + ".");
        } else {
            System.out.println("Request rejected: " +
                    bookTitle + " is not available.");
        }
    }

    // Handle returning requests
    public void returnBook(String bookTitle, String memberName) {

        Book book = library.findBookByTitle(bookTitle);
        Member member = library.findMemberByName(memberName);

        // Check if member exists
        if (member == null) {
            System.out.println("Member " + memberName + " not found.");
            return;
        }

        // Check if book exists
        if (book == null) {
            System.out.println("Book " + bookTitle + " not found.");
            return;
        }

        // Delegate returning to Member
        if (member.returnBook(book)) {
            System.out.println(memberName +
                    " successfully returned " + bookTitle + ".");
        } else {
            System.out.println(memberName +
                    " did not borrow " + bookTitle + ".");
        }
    }
}
