package com.niit.SpringCore;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//injection through Collection getbooklist/stringList
public class LibraryClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Book.xml");
		Library library = (Library) context.getBean("lib");

		List<Book> bookList = library.getBookList();
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println("*Book*" + (i + 1) + " Properties");
			Book book = (Book) bookList.get(i);
			System.out.println("Book Title :" + book.getTitle());
			System.out.println("Book Author :" + book.getAuthor());
			System.out.println("Book Publication :" + book.getPublications());
		}

		List<Library> stringList = library.getStringList();
		System.out.println("Primitive set to List :"+stringList );
	}

}
