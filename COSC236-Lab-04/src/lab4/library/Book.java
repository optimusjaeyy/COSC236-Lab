
package lab4.library;

public class Book {

    // GRASP Principle: Information Expert
    // Manages its own state (available or borrowed).

    private String title;
    private String author;
    private boolean isAvailable = true;

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Check if the book is available to borrow
    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        } else {
            return false;
        }
    }

    // Check if the book is returned
    public boolean returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            return true;
        } else {
            return false;
        }
    }
}
