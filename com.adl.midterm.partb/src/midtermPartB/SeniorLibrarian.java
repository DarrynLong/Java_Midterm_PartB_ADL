package midtermPartB;
/**
 * @author Darryn
 * @since 10/21/2026
 * Senior Librarian Class
 */

public class SeniorLibrarian extends Librarian{

	//================================================
	// Declaration
	//================================================
	final String specialization;
	final double seniorityAllowance = 3.00;
	
	
	
	//================================================
	// Constructor
	//================================================
	public SeniorLibrarian(String name, String phoneNumber, String department, double monthlySalary, int dailyIssueLimit, int booksProcessed, String specialization) 
	{
		
		super(name, phoneNumber, department, monthlySalary, dailyIssueLimit, booksProcessed);
		validateSeniorLibrarian(specialization);
		this.specialization = specialization;
		
	}
	
	
	
	//================================================
	// Override Method: Calculate Monthly Compensation
	//================================================
	@Override
	public void calculateMonthlyCompensation()
	{
		int booksIssued; 
		double maxBonus = (processAllowance + seniorityAllowance)*dailyIssueLimit;
		double compensation = monthlySalary + (booksProcessed * (processAllowance + seniorityAllowance));
		
		if (booksProcessed > dailyIssueLimit)
		{
			booksIssued = dailyIssueLimit;
		}
		else 
		{
			booksIssued = booksProcessed;
		}
			
		super.paymentHeader();
		System.out.printf("\n$%.2f Bonus for every book processed up \nto the daily issue limit of %d Books!\nFor a maxium bonus of $%.2f!\n\n", (processAllowance + seniorityAllowance), dailyIssueLimit, maxBonus);
		System.out.printf("Monthly Salary       = $%.2f\n", monthlySalary);
		System.out.printf("Books Processed      = %d Books\n", booksProcessed);
		System.out.printf("Proccess Bonus       = $%.2f\n", (booksIssued * (processAllowance + seniorityAllowance)));
		System.out.printf("Monthly Compensation = $%.2f\n",compensation);
	}

	
	
	//================================================
	// Override Method: Get Role Description
	//================================================
	@Override
	public void getRoleDescription() 
	{
		super.descriptionHeader();
		System.out.printf("\n%s is one of the Senior Librarians here at\nMaple Leaf Public Library.\n\nDuties Include: \nCalculating Late Fees & Returning Books\n", name);
	}
	
	
	
	//================================================
	// Override Method: Display Staff Details
	//================================================
	@Override
	public void displayStaffDetails() 
	{
		staffHeader();
		SeniorLibrarianDetails(personId, name, phoneNumber, staffId, department, monthlySalary, specialization);
	}

}
