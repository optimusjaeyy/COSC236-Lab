package lab4.library;
import java.util.ArrayList;
import java.util.List;
public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private int memberID;
	// private borrowedbBooks DONE: implement collection of borrowed books
	private List<Book> borrowedBooks = new ArrayList<> ();
	// DONE: implement functionality of Member class
	public Member(String name, int memberID) {
		this.name = name;
		this.memberID = memberID;
		}
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
		return borrowedBooks;
	}
	//checks whether the member can borrow the book or not
	public boolean borrowBook(Book book) {
		if( book.borrow()) {
			borrowedBooks.add(book);
			return true;
		}else {
			return false;
		}
	}
	//checks that whether the book is returned sucessfully or not
	public boolean returnBook(Book book) {
		if(borrowedBooks.contains(book)) {
            if(book.returnBook()) {
              borrowedBooks.remove(book);
               return true;
            }else {
	         return false;
            }
	    }else {
	     return false;
	
	
	}
	}

}
