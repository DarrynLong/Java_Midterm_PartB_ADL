package midtermPartB;
/**
 * @author Darryn
 * @since 10/21/2026
 * Book Class
 */

public class Book implements Headers{
	
	//================================================
	// Declaration
	//================================================
	final String ISBN, title, author;
	protected boolean availability;
	
	
	
	//================================================
	// Constructor
	//================================================
	public Book(String ISBN, String title, String author, boolean availability)
	{
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		this.availability = availability;	
	}
	
	
	
	//================================================
	// Method: Display Book Details
	//================================================
	public void bookDetails()
	{
		bookHeader();
		System.out.println("[1] ISBN:       | " + ISBN);
		System.out.println("[2] Title:      | " + title);	
		System.out.println("[3] Author:     | " + author);
		System.out.println("[4] Available:  | " + availability);
	}
	
	
}
