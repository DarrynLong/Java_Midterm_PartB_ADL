package midtermPartB;
/**
 * @author Darryn
 * @since 10/21/2026
 * Librarian Class
 */

public class Librarian extends LibraryStaff {
	
	//================================================
	// Declaration
	//================================================
	final int dailyIssueLimit, booksProcessed;
	final double processAllowance = 2.00;
	final double lateCharge = 1.00;
	
	
	
	//================================================
	// Constructor
	//================================================
	public Librarian(String name, String phoneNumber, String department, double monthlySalary, int dailyIssueLimit, int booksProcessed)
	{
		super(name, phoneNumber, department, monthlySalary);
		validateLibrarian(dailyIssueLimit, booksProcessed);
		this.dailyIssueLimit = dailyIssueLimit;
		this.booksProcessed = booksProcessed;
	}
	
	
	
	//================================================
	// Override Method: Calculate Monthly Compensation
	//================================================
	@Override
	public void calculateMonthlyCompensation()
	{
		int booksIssued; 
		double maxBonus = processAllowance*dailyIssueLimit;
		double compensation = monthlySalary + (booksProcessed * processAllowance);
		
		if (booksProcessed > dailyIssueLimit)
		{
			booksIssued = dailyIssueLimit;
		}
		else 
		{
			booksIssued = booksProcessed;
		}
		
		super.paymentHeader();
		System.out.printf("\n$%.2f Bonus for every book processed up \nto the daily issue limit of %d Books!\nFor a maxium bonus of $%.2f!\n\n", processAllowance, dailyIssueLimit, maxBonus);
		System.out.printf("Monthly Salary       = $%.2f\n", monthlySalary);
		System.out.printf("Books Processed      = %d Books\n", booksProcessed);
		System.out.printf("Proccess Bonus       = $%.2f\n", (booksIssued * processAllowance));
		System.out.printf("Monthly Compensation = $%.2f\n",compensation);
	}

	
	
	//================================================
	// Override Method: Get Role Description
	//================================================
	@Override
	public void getRoleDescription() 
	{
		super.descriptionHeader();
		System.out.printf("\n%s is one of the Librarians here at\nMaple Leaf Public Library.\n\nDuties Include: \nCalculating Late Fees & Returning Books\n", name);
	}

	
	
	//================================================
	// Overloaded Method: Calculate Late Fee
	//================================================
	public void calculateLateFee(int daysOverdue)
	{
		if (!negativeOverdueDays(daysOverdue))
			return;
		else
		{
			double fee = daysOverdue * lateCharge;
			
			super.lateFeeHeader();
			System.out.printf("Days Late     =   %d Days\n", daysOverdue);
			System.out.printf("Late Fee      =   $%.2f @$%.2f per day\n", (daysOverdue * lateCharge), lateCharge);
			System.out.printf("Late Charge   =   $%.2f\n", fee);	
		}
	}
	
	
	
	//================================================
	// Overloaded Method: Calculate Late Fee + Damage
	//================================================
	public void calculateLateFee(int daysOverdue, double damageCost, String bookId)
	{
		if (!negativeOverdueDays(daysOverdue))
			return;
		else
		{
			double fee = damageCost + (daysOverdue * lateCharge);
			
			super.lateFeeWDamageHeader();
			System.out.printf("Days Late     =   %d Days\n", daysOverdue);
			System.out.printf("Late Fee      =   $%.2f @$%.2f per day\n", (daysOverdue * lateCharge),lateCharge);
			System.out.printf("Damage Fee    =   $%.2f\n", damageCost);	
			System.out.printf("Late Charge   =   $%.2f\n", fee);	
			
			for (var i = 0; i < libraryBooks.length; i++)
			{
				if (bookId == libraryBooks[i].ISBN || bookId == libraryBooks[i].title || bookId == libraryBooks[i].author)
				{
					System.out.println(libraryBooks[i].title + " is now damaged!");
					System.out.println("It is unavailable now..");
					libraryBooks[i].availability = false;
				}
			}
		}
			
	}
	
	
	
	//================================================
	// Overloaded Method: Calculate Daily Rate
	//================================================
	public void calculateLateFee(int daysOverdue, double dailyRate)
	{
		if (!negativeOverdueDays(daysOverdue))
			return;
		else
		{
			double fee = daysOverdue * dailyRate;
			
			super.lateFeeWRateHeader();
			System.out.printf("Days Late     =   %d Days\n", daysOverdue);
			System.out.printf("Late Fee      =   $%.2f @$%.2f per day\n", daysOverdue *  dailyRate, dailyRate);
			System.out.printf("Late Charge   =   $%.2f\n", fee);	
		}
	}
	
	
	
	
}
