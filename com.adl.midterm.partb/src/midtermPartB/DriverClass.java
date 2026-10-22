package midtermPartB;
/**
 * @author Darryn
 * @since 10/21/2026
 * Main Driver Class
 */

public class DriverClass implements BookList{

	public static void main(String[] args) {
		

		//================================================
		// Custom made text graphic 
		//================================================
		System.out.println("_______________________________________");
		System.out.printf("\n-       MAPLE LEAF PUBLIC LIBRARY     -\n");
		System.out.println("_______________________________________");
		System.out.println("|                 x                   |");
		System.out.println("|                xxx                  |");
		System.out.println("|             x  xxx  x               |");
		System.out.println("|              x xxx x                |");
		System.out.println("|            xxxxxxxxxxx              |");
		System.out.println("|              xxxxxxx                |");
		System.out.println("|                 x                   |");
		System.out.println("|                 x                   |");
		System.out.println("|                                     |");
		System.out.println("|     True North Strong And Read      |");
		System.out.printf("_______________________________________\n\n");
		
		
		// Display All Library Books
		//for(var i = 0; i < libraryBooks.length; i++) { libraryBooks[i].bookDetails(); }
		
		
		
		//================================================
		// Register 2 Members: 1
		// + Display Details & Overloading
		// + Interfaces
		//================================================
		
		// Members
		Member[] Members = 
		{
			new Member("Arthur", "416-678-2222", "Standard", 25, 10.00),
			new Member("Darryn", "416-678-3333", "Standard", 29, 20.50),
			new Member("Taylor", "416-678-4444", "Standard", 24, 2.25),
		};
		
		// Book Searches
		String[] BookIds = { "Wacky World", "JRR Tolkien", "Ontario Trees" };
		// Custom Membership
		String[] CustomMemberships = { "Custom", "", "Deluxe" };
		
		
		// Loop through members
		for (var i = 0; i < Members.length; i++)
		{
			Members[i].registerMember(CustomMemberships[i]);
			Members[i].displayBasicDetails();
			Members[i].getRoleDescription();
			Members[i].reserveBook(BookIds[i]);
			Members[i].generateReport();
		}
		
		
		
		//================================================
		// Create One Librarian: 2, 3, & 4
		// + Display Details
		// + Calculate Late Fees (Overloading)
		// + Calculate Compensation
		//================================================
		Librarian L = new Librarian("Jane","416-678-5555", "Fiction", 4000.00, 50, 80);
		
		
		L.displayStaffDetails();
		L.getRoleDescription();
		
		// Overloading
		L.calculateLateFee(5);
		L.calculateLateFee(4, 4.50);
		//libraryBooks[1].bookDetails();
		L.calculateLateFee(7, 10.00, "C# Programming");
		//libraryBooks[1].bookDetails();
		
		L.calculateMonthlyCompensation();
		
		
		
		//================================================
		// Create One Senior Librarian: 2 & 3 
		// + Display Details
		// + Calculate Compensation
		//================================================		
		SeniorLibrarian SL = new SeniorLibrarian("Jack","416-678-6666", "Drama", 6000.00, 100, 80, "Research");
		
		SL.displayStaffDetails();
		SL.getRoleDescription();
		SL.calculateMonthlyCompensation();
		
		
		
		//================================================
		// Create One Library Assistant: 2 & 3
		// + Display Details
		// + Calculate Compensation
		//================================================
		LibraryAssistant LA = new LibraryAssistant("April","416-678-7777", "Non-fiction", 3000.00, "Morning");
		
		LA.displayStaffDetails();
		LA.getRoleDescription();
		LA.calculateMonthlyCompensation();
		
		
		
		
		//================================================
		// Display Total Static Counts: 6
		// + People
		// + Members
		// + Staff
		//================================================
		System.out.printf("\n\n Person Count: " + LA.getPersonCount());
		System.out.printf("\n\n Member Count: " + Members[Members.length -1].getMemberCount());
		System.out.printf("\n\n Staff Count: " + LA.getStaffCount());
		
		
		
		
		//================================================
		// Demonstrating Polymorphism & Interfaces: 8 & 9
		// + generateReport method - Staff
		// + reserveBook method - Staff
		//================================================
		Librarian PM = new SeniorLibrarian("Joe","416-678-8888", "Mystery", 6000.00, 100, 60, "Archiving");
		PM.displayStaffDetails();
		PM.getRoleDescription();
		PM.calculateMonthlyCompensation();
		PM.generateReport();
		PM.reserveBook("Java Programming");
		
		
		
		//================================================
		// Demonstrating Exception Handling
		// + unsuccessful member registration
		//================================================
		Member A = new Member("", "416-678-1111", "Standard", 25, 10.00);
		A.registerMember();
		A.displayBasicDetails();
		
	}

}
