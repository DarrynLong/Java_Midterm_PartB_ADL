package midtermPartB;
/**
 * @author Darryn
 * @since 10/21/2026
 * Library Assistant Class
 */

public class LibraryAssistant extends LibraryStaff {
	
	//================================================
	// Declaration
	//================================================
	final String shiftType;
	final double shiftAllowance = 50.00;
	
	
	
	//================================================
	// Constructor
	//================================================
	public LibraryAssistant(String name, String phoneNumber, String department, double monthlySalary, String shiftType) 
	{
		
		super(name, phoneNumber, department, monthlySalary);
		validateLibraryAssistant(shiftType);
		this.shiftType = shiftType;
			
	}
	
	
	
	//================================================
	// Override Method: Calculate Monthly Compensation
	//================================================
	@Override
	public void calculateMonthlyCompensation()
	{
		double compensation = monthlySalary + shiftAllowance;
		
		super.paymentHeader();
		System.out.printf("\nMonthly Salary       = $%.2f\n", monthlySalary);
		System.out.printf("Shift Bonus          = $%.2f\n", shiftAllowance);
		System.out.printf("Monthly Compensation = $%.2f\n", compensation);
	}

	
	
	//================================================
	// Override Method: Get Role Description
	//================================================
	@Override
	public void getRoleDescription() 
	{
		super.descriptionHeader();
		System.out.printf("\n%s is one of the Librarian Assitants here at\nMaple Leaf Public Library.\n\nDuties Include: \nReturning Books\n", name);
		System.out.printf("\nShift Type: " + shiftType + " shift.\n");
	}
	
	
	
	//================================================		
	// Override Method: Display Staff Details
	//================================================
	@Override
	public void displayStaffDetails() 
	{
		staffHeader();
		libraryAssistantDetails(personId, name, phoneNumber, staffId, department, monthlySalary, shiftType, shiftAllowance);
	}

}
