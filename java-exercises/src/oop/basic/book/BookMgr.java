package oop.basic.book;

public class BookMgr {
	private Book[] booklist;

	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void printBooklist(){
		for (Book b : booklist) {
			System.out.println(b.getTitle());
		}
	}
	
	public void printTotalPrice(){
		int totalPrice = 0;
		for (Book b : booklist) {
			totalPrice += b.getPrice();
		}
		System.out.println("전체 책 가격의 합: " + totalPrice);
	}
}
