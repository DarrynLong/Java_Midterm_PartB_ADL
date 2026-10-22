package midtermPartB;
/**
 * @author Darryn
 * @since 10/21/2026
 * Abstract Person Class
 */

public abstract class Person implements Headers, ExceptionHandler, Details{

	//================================================
	// Declaration
	//================================================
	final String personId, name, phoneNumber;
	static int personCount = 0;
	
	
	
	//================================================
	// Constructor
	//================================================
	public Person(String name, String phoneNumber)
	{
		validatePerson(name, phoneNumber);
		this.name = name;
		this.phoneNumber = phoneNumber;
		personCount++;
		personId = FormatId(personCount, "P");
	}
	
	
	
	//================================================
	// Method: Get Person Count
	//================================================
	public int getPersonCount()
	{
		return personCount;
	}
	
	
	
	//================================================
	// Method: Display Basic Details
	//================================================
	public void displayBasicDetails()
	{
		detailsHeader();
		personDetails(personId, name, phoneNumber);
	}
	
	
	
	//================================================
	// Override Method: To String
	//================================================
	@Override
	public String toString()
	{
		return "Person { Name : " + name + ", ID : " + personId + ", Phone Number : " + phoneNumber + " } ";
	}
	
	
	
	//================================================
	// Abstract Method Role Description
	//================================================
	abstract void getRoleDescription();
	
	
	
}
