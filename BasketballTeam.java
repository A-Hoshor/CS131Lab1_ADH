
public class BasketballTeam extends SportsTeam {
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	//constructors
	
	public BasketballTeam() {
		
		super();
		this.fieldGoals=0;
		this.fieldGoalsAttempted=0;
		this.freeThrows=0;
		this.freeThrowsAttempted=0;
		
	}//end empty argument constructor

	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		
		this.teamName=teamName;
		this.teamMascot=teamMascot;
		this.headCoach=headCoach;
		this.wins=0;
		this.losses=0;
		this.fieldGoals=0;
		this.fieldGoalsAttempted=0;
		this.freeThrows=0;
		this.freeThrowsAttempted=0;
		
	}//end preferred argument constructor
	
	public double fieldGoalPercentage() {
		double f = fieldGoals;
		double at = fieldGoalsAttempted;
		double fgPercent = f/at;
		return fgPercent;
	}// end fieldGoal Percentage
	
	public double freeThrowPercentage() {
		double f = freeThrows;
		double at = freeThrowsAttempted;
		double ftPercent = f/at;
		return ftPercent;
	}//end freeThrowPercentage
	
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		
		this.wins = wins;
		this.losses=losses;
		this.fieldGoals=fieldGoals;
		this.fieldGoalsAttempted=fieldGoalsAttempted;
		this.freeThrows=freeThrows;
		this.freeThrowsAttempted=freeThrowsAttempted;
	}//end setStats
	
	public double[] getStats() {
		double[] stats= {super.getWinPercentage(), this.fieldGoalPercentage(), this.freeThrowPercentage()};
		return stats;
	}//end getStats

	//toString for testing
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Team: " + this.teamName);
		sb.append("\nTeam Mascot: " + this.teamMascot);
		sb.append("\nHead Coach: " + this.headCoach);
		sb.append("\nWin Percentage: " + this.getWinPercentage());
		sb.append("\nField Goal Percentage: " + this.fieldGoalPercentage());
		sb.append("\nFree Throw Percentage: " + this.freeThrowPercentage());
		return sb.toString();	
	}//end toString
}//end class
