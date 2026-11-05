package lab4.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)
	
	private List<Book> catalog;
	private List<Member> members;

	// DONE: implement functionality of Member class
	public Library() {
		this.catalog = new ArrayList<>();
		this.members = new ArrayList<>();
	}
	
	public void addBook(String title, String author) {
		if(title != null && !title.isEmpty()) {
			catalog.add(new Book(title, author));
		}
	}
	
	public void registerMember(String name, int memberId) {
		if(name != null && !name.isEmpty()) {
			members.add(new Member(name, memberId));
		}
	}
	
	public Book findBookByTitle(String title) {
		for(Book book: catalog) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		return null;
	}
	
	public Member findMemberByName(String name, int memberId) {
		for(Member member: members) {
			if(member.getName().equalsIgnoreCase(name) && member.getMemberID() == memberId) {
				return member;
			}
		}
		return null;
	}

	

}
