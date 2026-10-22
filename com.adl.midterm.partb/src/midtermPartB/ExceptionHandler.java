package midtermPartB;
/**
 * @author Darryn
 * @since 10/21/2026
 * Handles the exception for all constructors
 */

public interface ExceptionHandler {
	
	//================================================
	// Method: Exception message
	//================================================
	default void exceptionMessage(Exception e)
	{
		System.out.printf("\nAn Error has Occured:\n");
		System.out.println("Exception: " + e.getMessage());
		System.out.println("Stack Trace: " + e.getStackTrace());
		System.out.println("Hash Code: " + e.hashCode());
	}
	
	
	
	//================================================
	// Method: Validate Person Attributes
	//================================================
	default void validatePerson(String name, String phoneNumber)
	{
		// Name Exception Handling
		try { if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Names cannot be null or empty."); } 
		catch (Exception e) { exceptionMessage(e); }
				
		// Phone Number Exception Handling
		try { if (phoneNumber == null || phoneNumber.trim().isEmpty()) throw new IllegalArgumentException("Phone Numbers cannot be null or empty."); } 
		catch (Exception e) { exceptionMessage(e); }
	}
	
	
	
	//================================================
	// Method: Validate Member Attributes
	//================================================
	default void validateMember(String membershipType, int age, double outstandingFees)
	{
		// Membership Type Exception Handling
		try { if (membershipType == null || membershipType.trim().isEmpty()) throw new IllegalArgumentException("Membership Type cannot be null or empty."); } 
		catch (Exception e) { exceptionMessage(e); }
		
		// Age Exception Handling
		try { if (age < 0 || age > 100) throw new IllegalArgumentException("Age cannot be less than 0 or greater than 100."); } 
		catch (Exception e) { exceptionMessage(e); }

		// Outstanding Fees Exception Handling
		try { if (outstandingFees < 0) throw new IllegalArgumentException("Outstanding Fees cannot be less than 0."); }
		catch (Exception e) { exceptionMessage(e); }
	}
	
	// Method: Valid Registration
	default boolean isValidRegistration(String name, String memberNumber, String membershipType, int age)
	{
		// Verify Attributes are not null or empty
		if (name == null || name.trim().isEmpty() || memberNumber == null || memberNumber.trim().isEmpty() || membershipType == null || membershipType.trim().isEmpty())
			return false;
		
		// Validate age
		if (age < 0 || age > 100)
			return false;
		
		// If All Pass Return Valid
		return true;
			
	}
	
	
	
	//================================================
	// Method: Validate Library Staff Attributes
	//================================================
	default void validateLibraryStaff(String department, double monthlySalary)
	{
		// Department Exception Handling
		try { if (department == null || department.trim().isEmpty()) throw new IllegalArgumentException("Department cannot be null or empty."); } 
		catch (Exception e) { exceptionMessage(e); }
			
		// Monthly Salary Exception Handling
		try { if (monthlySalary < 1000.00) throw new IllegalArgumentException("Monthly Salary cannot not be less than $1000.00."); }
		catch (Exception e) { exceptionMessage(e); }
				
	}	
	
	
	
	//================================================
	// Method: Validate Librarian Attributes
	//================================================
	default void validateLibrarian(int dailyIssueLimit, int booksProcessed)
	{
		// Daily Issue Limit Exception Handling
		try { if (dailyIssueLimit < 10) throw new IllegalArgumentException("Daily Issue Limit cannot not be less than 10."); } 
		catch (Exception e) { exceptionMessage(e); }
				
		// Books Processed Exception Handling
		try { if (booksProcessed < 0) throw new IllegalArgumentException("Books Processed cannot not be less than 0."); }
		catch (Exception e) { exceptionMessage(e); }
	}
	
	// Overdue Days Exception Handling
	default boolean negativeOverdueDays(int daysOverdue)
	{
		try { if (daysOverdue < 0) throw new IllegalArgumentException("Overdue days cannot be less than 0."); }
		catch (Exception e) { exceptionMessage(e); }
		
		if (daysOverdue < 0)
			return false;
		else
			return true;
	}	
	
	
		
	//================================================
	// Method: Validate Senior Librarian Attributes
	//================================================
	default void validateSeniorLibrarian(String specialization)
	{
		// Specialization Exception Handling
		try { if (specialization == null || specialization.trim().isEmpty()) throw new IllegalArgumentException("Specialization cannot be null or empty."); } 
		catch (Exception e) { exceptionMessage(e); }
	}
	
	
	
	//================================================
	// Method: Validate Library Assistant Attributes
	//================================================
	default void validateLibraryAssistant(String shiftType)
	{
		// ShiftType Exception Handling
		try { if (shiftType == null || shiftType.trim().isEmpty()) throw new IllegalArgumentException("Shift Type cannot be null or empty."); } 
		catch (Exception e) { exceptionMessage(e); }
	}
	

}
