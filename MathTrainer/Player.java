/**
	Description
	@author:	Patrick Alex Freitas da Silva
	@date: 2016-06-22
*/
class Player {
	
	public String name;
	public int points;

	public Player(String nm, int initialPoints) {
		
		do{
			if ( nm.equals(null) | nm.equals("") ){
				System.out.println("Sorry, the game will not begin until you type in a player name.");
				nm = getPlayerName();
			}
		} while (nm.equals(null) | nm.equals(""));
		
		name = nm;
		points = initialPoints;
	}
	
	static String getPlayerName(){
		System.out.print("Please, type in player name: ");
		return MathTrainer.prompt("");
	}
}