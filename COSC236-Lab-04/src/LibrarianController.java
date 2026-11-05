package lab4.library;

public class LibrarianController {

    // GRASP Principle: Controller
    // Handles user requests like borrowing and returning books.
    // Delegates tasks to the appropriate objects.

    // DONE: implement functionality of Member class
    private Library library;

    public LibrarianController(Library library) {
        this.library = library;
    }

    public boolean borrowBook(String memberName, int memberId, String bookTitle) {

        Member member = library.findMemberByName(memberName, memberId);
        Book book = library.findBookByTitle(bookTitle);

        if (member == null || book == null) {
            return false;
        }

        return member.borrowBook(book);
    }

    public boolean returnBook(String memberName, int memberId, String bookTitle) {

        Member member = library.findMemberByName(memberName, memberId);
        Book book = library.findBookByTitle(bookTitle);

        if (member == null || book == null) {
            return false;
        }

        return member.returnBook(book);
    }
}
