package BookList;

import java.util.*;
import java.util.Scanner;

public class Book {
	private int numCopy = 0;
	private int numAvail = 0;
	private Set<String> availIds = new HashSet<String>();
	private Set<String> issuedIds = new HashSet<String>();
	private static Set<String> allIds = new HashSet<String>();
	String title;
	private static Scanner psc = new Scanner(System.in);
	
	public Book() {
		System.out.print("\nENTER BOOK TITLE: ");
		title = psc.nextLine();
		addCopy();
	}
	
	Book(String title) {
		this.title = title;
		addCopy();
	}
	
	public void addCopy() {
		String id;
		System.out.print("ENTER BOOKID: ");
		id = psc.nextLine();
		if (allIds.contains(id))
		{
			System.out.println("\n\n[ERROR] THIS ID ALREADY EXISTS !!!!!!!!!!!!!!!!!!\n\n");
		}
		else
		{
			allIds.add(id);
			availIds.add(id);
			System.out.println("\n\nBOOK ADDED\n\n");
		}
		numCopy++;
		numAvail++;
	}
	
	@Override
	public boolean equals(Object book) {
		if (book instanceof Book)
		{
			if (((Book)book).title.equals(title)) return true;
		}
		
		return false; 
	}
	
	void show() {
		System.out.println("---------------------------------\n");
		System.out.println("BOOK TITLE: " + title);
		System.out.println("NUMBER OF COPY AVAILABLE: " + numCopy);
		System.out.println("NUMBER OF COPY PURCHASED: " + numAvail);
		System.out.println("---------------------------------\n");
	}
}
