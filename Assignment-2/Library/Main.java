import BookList.BookList;

class Main {
	public static void main(String args[]) {
		BookList bookList = new BookList();
		
		bookList.addBook();
		bookList.addBook();
		bookList.addBook();
		
		bookList.show();
	}
}
