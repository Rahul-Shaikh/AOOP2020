package BookList;

import java.util.*;
import java.util.Scanner;

public class BookList {
	ArrayList<Book> bookList = new ArrayList<Book>();
	private static Scanner psc = new Scanner(System.in);
	
	public void addBook()
	{
		System.out.print("ENTER BOOK TITLE: ");
		String title = psc.nextLine();
		int i = search(title);
		if (i < 0)
		{
			bookList.add(new Book(title));
		}
		else
		{
			Book temp = bookList.get(i);
			temp.addCopy();
		}
	}
	
	int search(String title)
	{
		System.out.println("NEED TO FIND " + title);
		for (int i = 0; i < bookList.size(); i++)
		{
			Book temp = bookList.get(i);
			System.out.println(i + ". " + temp.title);
			if (temp.title.equals(title)) {
				System.out.println("FOUND\n");
				return i;
			}
		}
		System.out.println("NOT FOUND\n");
		return -1;
	}
	
	public void show()	{
		for (Book b: bookList) {
			b.show();
		}
	}
}
