class Score {
	static byte points = 0;
	
	public static void main(String[] args) {
		
	}
	
	static void Player(String plr, byte pts) {
		player = plr;
		points = pts;
	}
	
	static void addPoints(int pts) {
		points += pts;
	}
	
	static void removePoints(int pts) {
		points -= pts;
	}
}