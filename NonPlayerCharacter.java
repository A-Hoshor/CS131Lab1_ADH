import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	private String intelligenceType;
	private boolean active;
	
	public NonPlayerCharacter() {
		
		super();
		this.active = false;
		this.intelligenceType = "AVERAGE";
		
	}//end empty argument constructor
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		
		super.setUniqueID(id);
		super.setPersonality(personality);
		this.active= active;
		this.intelligenceType = intelligenceType;
		
	}// end preferred constructor

	//Getters and Setters
	
	public String getIntelligenceType() {
		return intelligenceType;
	}

	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	//Methods
	
	public String reportStructure() {
		
		String reportStructure = super.reportStructure();
		StringBuilder sb = new StringBuilder();
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		return reportStructure + sb;
	}//end reportStructure
	
	public String introduce() {
		
		String name = "Hello my name is " + super.getUniqueID();
		return name;
		
	}// end introduce
	
	public String exclaim() {
		
		String[] arr = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		SecureRandom random = new SecureRandom();
		int randomInt = random.nextInt(5);
		return arr[randomInt];
		
	}//end exclaim   

}//end class
