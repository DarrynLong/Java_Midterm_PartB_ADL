package midtermPartB;
/**
 * @author Darryn
 * @since 10/21/2026
 * Abstract Library Staff Class
 */

public abstract class LibraryStaff extends Person implements BookList, Reservable, Reportable {

	//================================================
	// Declaration
	//================================================
	final String staffId, department;
	final double monthlySalary;
	static int staffCount;
	
	
	
	//================================================
	// Constructor
	//================================================
	public LibraryStaff(String name, String phoneNumber, String department, double monthlySalary)
	{
		super(name, phoneNumber);
		validateLibraryStaff(department, monthlySalary);
		this.department = department;
		this.monthlySalary = monthlySalary;
		staffCount++;
		this.staffId = super.FormatId(staffCount, "S");
	}
	
	//================================================
	// Method: Get Staff Count
	//================================================
	public int getStaffCount()
	{
		return staffCount;
	}
	
	//================================================
	// Abstract Method: Calculate Monthly Compensation
	//================================================
	abstract void calculateMonthlyCompensation();
	
	
	
	//================================================
	// Method: Display Staff Details
	//================================================
	public void displayStaffDetails()
	{
		staffHeader();
		libraryStaffDetails(personId, name, phoneNumber, staffId, department, monthlySalary);
	}
	
	
	
	//================================================
	// Implement Reserve-able
	//================================================
	@Override
	public void reserveBook(String bookId)
	{
		boolean found = false;
		
		reservableHeader();
		System.out.printf("\nSearching for BookID: " + bookId + "\n\n");
		// Search Book List for Book Id
			for (var i = 0; i < libraryBooks.length; i++)
			{
				if (bookId.equals(libraryBooks[i].ISBN) || bookId.equals(libraryBooks[i].title) || bookId.equals(libraryBooks[i].author))
			        {
			            System.out.println("This library has that book!");
			            found = true;
			            
			            if (libraryBooks[i].availability)
			            {
			                System.out.println("The book is available!");
			            }
			            else
			            {
			                System.out.println("That book is unavailable.");
			            }
					
				}
						
			}
			
			if (found == false)
			{
				System.out.println("Unable to find that book.");
			}
	}
	
	
	
	//================================================
	// Implement Report-able
	//================================================
	@Override
	public void generateReport()
	{
		super.bookListHeader();
		
		// Available Books
		System.out.println("       ------ Available ------");
		for (var i = 0; i < libraryBooks.length; i++)
		{
			if (libraryBooks[i].availability)
				System.out.println("Available: " + libraryBooks[i].title + " by " + libraryBooks[i].author);
		}
		
		// Unavailable Books
		System.out.printf("\n      ------ Unavailable ------\n");
		for (var i = 0; i < libraryBooks.length; i++)
		{
			if (!libraryBooks[i].availability)
				System.out.println("Unavailable: " + libraryBooks[i].title + " by " + libraryBooks[i].author);
		}
	}
	
	
	
	
	//================================================
	// Override Method: To String
	//================================================
	@Override
	public String toString()
	{
		return "Library Staff Member { Name : " + name + ", ID : " + staffId + ", Department : " + department + " } ";
	}
	
}
