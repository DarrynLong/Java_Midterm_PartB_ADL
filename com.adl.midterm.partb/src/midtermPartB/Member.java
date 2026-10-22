package midtermPartB;
/**
 * @author Darryn
 * @since 10/21/2026
 * Member Class
 */

public class Member extends Person implements BookList, Reservable, Reportable{
	
	//================================================
	// Declaration
	//================================================
	final String memberNumber, membershipType;
	final int age;
	final double outstandingFees;
	static int membershipCount = 0;
	protected String customMembershipType = "";
	
	
	
	//================================================
	// Constructor
	//================================================
	public Member(String name, String phoneNumber, String membershipType, int age, double outstandingFees)
	{
		super(name, phoneNumber);
		validateMember(membershipType, age, outstandingFees);
		this.membershipType = membershipType;
		this.age = age;
		this.outstandingFees = outstandingFees;
		membershipCount++;
		this.memberNumber = super.FormatId(membershipCount, "M");			
	}
	
	//================================================
	// Method: Get Member Count
	//================================================
	public int getMemberCount()
	{
		return membershipCount;
	}
	
	//================================================
	// Overloaded Method: Register Member (Basic)
	//================================================
	public void registerMember()
	{
		registrationHeader();
		
		// Checks Validity
		if(isValidRegistration(name, memberNumber, membershipType, age)) 
			System.out.printf("\nBasic registration successful!\nMembership Type: %s\n\n", membershipType);	
		else
			System.out.printf("\nBasic registration failed:\nMissing Required Details.\n\n");
		
	}
	
	
	
	//================================================
	// Overloaded Method: Register Member (With Type)
	//================================================
	public void registerMember(String customMembershipType)
	{
		this.customMembershipType = customMembershipType;
		registrationHeader();
		
		// If Custom Membership Type is Empty String
		if (this.customMembershipType.trim().isEmpty())
		{
			// Checks Validity
			if(isValidRegistration(name, memberNumber, membershipType, age)) 
				System.out.printf("\nBasic registration successful!\nMembership Type: %s\n\n", membershipType);	
			else
				System.out.printf("\nBasic registration failed:\nMissing Required Details.\n\n");
		}
		else
		{
			// Checks Validity
			if(isValidRegistration(name, memberNumber, membershipType, age))
				System.out.printf("\nCustom registration successful!\nMembership Type: %s\n\n", customMembershipType);	
			else
				System.out.printf("\nCustom registration failed:\nMissing Required Details.\n\n");
		}
		
	}
	
	
	
	//================================================
	// Method: Display Basic Details
	//================================================
	@Override
	public void displayBasicDetails()
	{
		if (this.customMembershipType.trim().isEmpty())
		{
			memberDetails(personId, name, phoneNumber, age, memberNumber, membershipType, outstandingFees);
		}
		else
		{
			memberDetails(personId, name, phoneNumber, age, memberNumber, customMembershipType, outstandingFees);
		}
		
	}
	
	
	
	//================================================
	// Override Abstract Method Get Role Description
	//================================================
	@Override 
	public void getRoleDescription()
	{
		descriptionHeader();
		System.out.printf("\n%s is a member of the Maple Leaf \nPublic Library.\n", name);
	}
	
	
	
	//================================================
	// Implement Reserve-able
	//================================================
	@Override
	public void reserveBook(String bookId)
	{
		boolean found = false;
		
		reservableHeader();
		System.out.printf("\nI'm looking for BookID: " + bookId + "\n\n");
		
		
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
	                System.out.println("You have reserved that book.");
	                libraryBooks[i].availability = false;
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
		reportableHeader();
		System.out.printf("\n\nOutstanding Library Fees: $%.2f\n", outstandingFees);
	}
	
	
}


