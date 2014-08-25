package collections.linkedlist.srujana;

public class Book {

	private int bookNo;
	private String bName;
	private String author;
	private int yearPublished;
	
	public Book(){
		
	}
	public Book(int bookNo, String bName, String author, int yearPublished){
		this.bookNo = bookNo;
		this.bName = bName;
		this.author = author;
		this.yearPublished = yearPublished;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	@Override
	public String toString() {
		return "\nBook number::" + bookNo + ", Book name::" + bName + ", Author::"
				+ author + ", Year published::" + yearPublished;
	}
	@Override
	public int hashCode() {
	
		return bookNo+bName.hashCode()+author.hashCode()+yearPublished;
	}
	@Override
	public boolean equals(Object object){
		Book book = (Book) object;
		if(book.bookNo==this.bookNo && book.bName.equalsIgnoreCase(this.bName) && book.author.equalsIgnoreCase(this.author) && book.yearPublished==this.yearPublished)
			return true;
		return false;
	}
	
	
	
}
