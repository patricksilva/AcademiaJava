/**
	Description
	@author:	Patrick Alex Freitas da Silva
	@date: 2016-06-27
*/
class Score {
	public byte points = 0;
	
	public static void main(String[] args) {
		
	}
		
	static void addPoints(int pts) {
		points += pts;
	}
	
	static void removePoints(int pts) {
		points -= pts;
	}
}