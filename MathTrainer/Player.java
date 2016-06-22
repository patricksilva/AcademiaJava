class Player {
	
	static String 	player;
	static byte 	points = 0;
	
	static Player(String plr, byte pts) {
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