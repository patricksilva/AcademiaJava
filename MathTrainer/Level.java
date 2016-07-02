/**
	Description
	@author:	Patrick Alex Freitas da Silva
	@date: 2016-07-01
*/
class Level {
	Quiz quiz;
	
	Level(int levelSelected){
		
		switch(levelSelected){
			case 2: Quiz quiz = new Quiz(); break;
			case 1: Quiz quiz = new Quiz(); break;	
			default: notYet(); break;
		}
		
	}
	
		switch(levelSelected){
			case 2:
				level02(pts,"+");
				break;
			case 1:
				level01(pts);
				break;
			default:
				notYet();
		}	
}