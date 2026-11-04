package lab4.library;
 
public class Book {
	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private String author;
	private boolean isAvailable = true;
	//all the getters and setters
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

public Book(String title, String author) {
		this.title = title;
		this.author = author;
	} 
	
	// DONE: implement Book functionality 
//checking if the book is available to borrow or not 
	public boolean borrow() {
		if(isAvailable) {
			isAvailable = false;
			return true;
			
		}
		else {
			return false;
		}
	}
	//checking if the book is returned or not
	public boolean returnBook() {
		if(! isAvailable ) {
			isAvailable = true;
			return true;
		}else {
			return false;
		}
	}
	
}
