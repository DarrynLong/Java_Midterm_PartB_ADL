package midtermPartB;
/**
 * @author Darryn
 * @since 10/21/2026
 * Details for strings & system outputs
 */

public interface Details {

	//================================================
	// Method: Formatting Id Strings
	//================================================
	default String FormatId(int staticCounter, String idString)
	{
		String id;
		
		if (staticCounter < 10)
			id = idString + "-00" + staticCounter;
		
		else if (staticCounter < 100)
			id = idString + "-0" + staticCounter;
		
		else
			id = idString +"-" + staticCounter;
		
		return id;
	}
	
	
	
	//================================================
	// Person Details
	//================================================
	default void personDetails(String personId, String name, String phoneNumber)
	{
		System.out.println("_______________________________________");	
		System.out.println("[1] ID:           | " + personId);
		System.out.println("[2] Name:         | " + name);
		System.out.println("[3] Phone #:      | " + phoneNumber);
	}
	
	
	
	//================================================
	// Member Details
	//================================================
	default void memberDetails(String personId, String name, String phoneNumber, int age, String memberNumber, String membershipType, double outstandingFees)
	{
		System.out.println("_______________________________________");	
		System.out.println("[1] ID:           | " + personId);
		System.out.println("[2] Age:          | " + age);
		System.out.println("[3] Name:         | " + name);
		System.out.println("[4] Phone #:      | " + phoneNumber);
		System.out.println("[5] Member #:     | " + memberNumber);
		System.out.println("[6] Membership:   | " + membershipType);
		System.out.printf ("[7] Member Fees:  | $%.2f\n", outstandingFees);
	}
	
	
	
	//================================================
	// Library Staff Details
	//================================================
	default void libraryStaffDetails(String personId, String name, String phoneNumber, String staffId, String department, double monthlySalary)
	{
		System.out.printf("\nLibrarian\n\n");
		System.out.println("_______________________________________");	
		System.out.println("[1] ID:           | " + personId);
		System.out.println("[2] Name:         | " + name);
		System.out.println("[2] Phone #:      | " + phoneNumber);
		System.out.println("[4] Staff ID:     | " + staffId);
		System.out.println("[5] Department:   | " + department);
		System.out.printf ("[6] Monthly Pay:  | $%.2f", monthlySalary);
	}
	
	//================================================
	// Senior Librarian Staff Details
	//================================================
	default void SeniorLibrarianDetails(String personId, String name, String phoneNumber, String staffId, String department, double monthlySalary, String specialization)
	{
		System.out.printf("\nSenior Librarian\n\n");
		System.out.println("_______________________________________");	
		System.out.println("[1] ID:           | " + personId);
		System.out.println("[2] Name:         | " + name);
		System.out.println("[2] Phone #:      | " + phoneNumber);
		System.out.println("[4] Staff ID:     | " + staffId);
		System.out.println("[5] Department:   | " + department);
		System.out.println("[6] Speciality:   | " + specialization);
		System.out.printf ("[7] Monthly Pay:  | $%.2f", monthlySalary);
	}
	
	//================================================
	// Library Staff Details
	//================================================
	default void libraryAssistantDetails(String personId, String name, String phoneNumber, String staffId, String department, double monthlySalary, String shiftType, double shiftAllowance)
	{
		System.out.printf("\nLibrary Assistant\n\n");
		System.out.println("_______________________________________");	
		System.out.println("[1] ID:           | " + personId);
		System.out.println("[2] Name:         | " + name);
		System.out.println("[2] Phone #:      | " + phoneNumber);
		System.out.println("[4] Staff ID:     | " + staffId);
		System.out.println("[5] Department:   | " + department);
		System.out.println("[6] Shift Type:   | " + shiftType);
		System.out.printf ("[7] Monthly Pay:  | $%.2f", monthlySalary + shiftAllowance);
	}
	
}


