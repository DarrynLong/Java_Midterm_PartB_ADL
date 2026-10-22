package midtermPartB;
/**
 * @author Darryn
 * @since 10/21/2026
 * Headers for text outputs
 */

public interface Headers {
	
	//================================================
	// Method: Registration Header
	//================================================
	default void registrationHeader()
	{
		System.out.printf("\n\n\n_______________________________________\n\n");
		System.out.println("-|             New Member            |-");
		System.out.println("_______________________________________");
	}
	
	
	
	//================================================
	// Method: Registration Header
	//================================================
	default void detailsHeader()
	{
		System.out.printf("\n_______________________________________\n\n");
		System.out.println("           Display Details");
		System.out.println("_______________________________________");
	}	
	
	
	
	//================================================
	// Method: Role Description Header
	//================================================
	default void descriptionHeader() 
	{
		System.out.printf("\n_______________________________________\n\n");
		System.out.println("           Role Discription");
		System.out.println("_______________________________________");
	}
	
	
	
	//================================================
	// Method: Payment Header
	//================================================
	default void paymentHeader() 
	{
		System.out.printf("\n_______________________________________\n\n");
		System.out.println("             Compensation");
		System.out.println("_______________________________________");		
	}
	
	
	
	//================================================
	// Method: Late Fee Header
	//================================================
	default void lateFeeHeader() 
	{
		System.out.printf("\n_______________________________________\n\n");
		System.out.println("               Late Fee");
		System.out.println("_______________________________________");		
	}
	
	
	
	//================================================
	// Method: Late Fee + Damages Header
	//================================================
	default void lateFeeWDamageHeader() 
	{
		System.out.printf("\n_______________________________________\n\n");
		System.out.println("          Late Fee + Damages");
		System.out.println("_______________________________________");		
	}
	
	//================================================
	// Method: Late Fee + Rate Header
	//================================================
	default void lateFeeWRateHeader() 
	{
		System.out.printf("\n_______________________________________\n\n");
		System.out.println("          Late Fee + Rate");
		System.out.println("_______________________________________");		
	}	
	
	//================================================
	// Method: Book Details Header
	//================================================
	default void bookHeader() 
	{
		System.out.printf("\n_______________________________________\n\n");
		System.out.println("             Book Details");
		System.out.println("_______________________________________");		
	}
	
	
	
	//================================================
	// Method: Book Details Header
	//================================================
	default void bookListHeader() 
	{
		System.out.printf("\n_______________________________________\n\n");
		System.out.println("              Book List");
		System.out.println("_______________________________________");		
	}

	//================================================
	// Method: Member Reserve-able Header
	//================================================
	default void reservableHeader() 
	{
		System.out.printf("\n_______________________________________\n\n");
		System.out.println("            Reserve Book...");
		System.out.println("_______________________________________");		
	}
	
	//================================================
	// Method: Member Report-able Header
	//================================================
	default void reportableHeader() 
	{
		System.out.printf("\n_______________________________________\n\n");
		System.out.println("          Generate Report...");
		System.out.println("_______________________________________");		
	}
	
	//================================================
	// Method: Staff Header
	//================================================
	default void staffHeader()
	{
		System.out.printf("\n\n\n_______________________________________\n\n");
		System.out.println("-|             New Staff              |-");
		System.out.println("_______________________________________");
	}
}
