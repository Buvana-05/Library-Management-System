package com.app.librarysystem;

import java.util.ArrayList;
import java.util.List;

public class Member {
	String username;
	
	List<Book> borrowedBooks;
	
	Member(String username){
		this.username = username;
		this.borrowedBooks = new ArrayList<>();
	}
	
	boolean borrowBook(Book book) {
		if(borrowedBooks.size() < 5 && book.isAvailable) {
			borrowedBooks.add(book);
			book.isAvailable = false;
			return true;
		}
		return false;
	}
	
	void returnBook(Book book) {
		borrowedBooks.remove(book);
		book.isAvailable = true;
	}
}
