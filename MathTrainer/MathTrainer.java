import java.util.Scanner;
import java.util.Random;
import java.lang.*;
/**
	This class was a challenge requested on ACADEMIA DO JAVA, ajtf96.
	The main objective was to show how we organized Levels  and use arrays and Java's control flow statements.
	@author:	Patrick Alex Freitas da Silva - patrickalex@gmail.com - Academia do Java, VOFFICE
	@date: 2016-06-27
*/
/*	
	## Como Jogar
	- O jogo apresenta o objetivo ao jogador;
	- O jogador se identifica;
	- Para os operadores envolvendo valor numérico inteiro, os operandos devem ser gerados aleatoriamente entre os valores 0 e 9;
	- No final o jogo deve apresentar o nome do jogador ,sua pontuação e se venceu levando em conta as regras de cada nível;
*/	
/*	
	## regras para a realização deste desafio
	- podemos criar novos arquivos ".java"
	- os atributos podem ter qualquer modificador
	- os métodos tem que ser static

*/
/*
	// ### Nível 1
	// - 10 perguntas, operador de adição, 1 ponto por acerto, o jogador vence se fizer mais de 6 pontos;

	// ### Nível 2
	// - 10 perguntas, operador de adição, 2 pontos por acerto, -1 ponto por erro. O jogador vence se fizer mais de 6 pontos;

	// ### Nível 3
	// - 10 perguntas, operadores de adição e subtração, o jogador vence se fizer mais de 6 pontos. Não pode gerar perguntas com respostas negativas;

	// ### Nível 4
	// - 10 perguntas, os 4 operadores aritméticos (+,-,*,/). 2 pontos extras se acertar 3 seguidas. -1 ponto por erro. Não pode gerar pergunta com divisão por zero. Não pode gerar pergunta de divisão com resultado tipo ponto flutuante (apenas inteiro). Pode gerar pergunta com resposta negativa. O jogador vence se fizer mais da metade dos pontos possíveis;

	// ### Nível 5
	// - 15 perguntas, demais regras conforme nível 4, o jogador joga contra o computador. O computador deve acertar aleatoriamente entre 3 e 12 perguntas em cada rodada. O jogador vence se acertar mais que o computador;

	// ### Nível 6
	// - 15 perguntas envolvendo os operadores de divisão, o resto de divisão e o operador ternário. Os operandos são números de ponto flutuante. Pontuação equivalente à do nível 4;

	// ### Nível 7
	// - 15 perguntas envolvendo operadores de deslocamento de bits. Pontuação equivalente à do nível 4;

	// ### Nível 8
	// - 15 perguntas envolvendo os operadores lógicos e os operadores de incremento e decremento. Pontuação equivalente à do nível 4;

	// ### Nível 9
	// - 15 perguntas envolvendo os operadores bit a bit e o operador de inversão. Pontuação equivalente à do nível 4;

	// ### Nível 10
	// - Todos os operadores usados nos níveis anteriores. 2 pontos a mais para cada pergunta correta respondida em menos de 10 segundos. Usar o seguinte método para recuperar o momento atual:
*/
class MathTrainer {
	
	static int limit = 10;
	static int tries = 1;
	static int points = 0;
	static boolean[] pts = new boolean[10];
	static int levelSelected = 0;
	
	public static void main (String[] args) {
		
		gameIntro();
		
		String nm = prompt("Name: ");
		
		Player player = new Player(nm, 0);
		
		showLevels();
		
		levelSelected = promptNumbers("Type in one number to choose a level: ");
		
		mathTrainerStart(levelSelected, pts);
		
//		player.points = totalPoints(pts);
		player.points = score(pts, 1, 0);
		
		System.out.println("Name: " + player.name + " Points: " + player.points);
	}
	
	static int score(boolean[] pts, int weightCorrectAnswer, int weightWrongAnswer){
		int correctAnswers = 0;
		int result = 0;
		for(boolean point : pts)
			correctAnswers += (point) ? 1 : 0;
		
		result = correctAnswers * weightCorrectAnswer - (pts.length - correctAnswers) * weightWrongAnswer;
		return result;
	}
	
	static int totalPoints(boolean[] pts) {
		int result = 0;
		for(boolean point : pts)
			result += (point) ? 1 : 0;
		return result;
	}
	
	static void addPoints(int pts) {
		points += pts;
	}
	
	static void removePoints(int pts) {
		points -= pts;
	}
	
	static void nivel01(){
		int nPerguntas = 10;
		System.out.println("Responda 10 perguntas sobre operador de adição.\nVocê ganha 1 ponto por acerto e vence se fizer mais de 6 pontos.");
		
	}
	
	static void gameIntro() {
		System.out.println("Welcome to Math Trainer!");
		System.out.println("In this game, you must get right as much questions as you can.");
	}
	
	static void showLevels() {
		String levels = "Choose one level:\n\n" + 
						"Level 1: 10 questions, addition operator, 1 point per hit, player wins if he gets more than 6 points\n" +
						"Level 2: (not yet implemented)\n" +
						"Level 3: (not yet implemented)\n" +
						"Level 4: (not yet implemented)\n" +
						"Level 5: (not yet implemented)\n" +
						"Level 6: (not yet implemented)\n" +
						"Level 7: (not yet implemented)\n" +
						"Level 8: (not yet implemented)\n" +
						"Level 9: (not yet implemented)\n" +
						"Level 10: (not yet implemented)\n";
		System.out.println(levels);
	}
	
	static String prompt(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	static int promptNumbers(String msg){
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		return Integer.parseInt(text);
	}
	
	static void notYet(){
		System.out.println("Not yet implemented");
		return;
	}
	

	// ### Nível 1
	// - 10 perguntas, operador de adição, 1 ponto por acerto, o jogador vence se fizer mais de 6 pontos;
	static void level01( boolean[] pts ) {
		System.out.println("LEVEL 1!");
		int min = 0;
		int max = 9;
		int operando1 = 0;
		int operando2 = 0;
		int playerTry;
		for(int i = 0; i < 10; i++) {
			Random rnd = new Random();
			operando1 =  min + (rnd.nextInt(max - min));
			operando2 =  min + (rnd.nextInt(max - min));
			int result = operando1 + operando2;
			System.out.println(operando1 + " + " + operando2 + " = ");
			playerTry = promptNumbers("");
			// Sets which question player got right
			pts[i] = (playerTry == result) ? true : false;
		}
		return;
	}
	// ### Nível 2
	// - 10 perguntas, operador de adição, 2 pontos por acerto, -1 ponto por erro. O jogador vence se fizer mais de 6 pontos;
	static void level02( boolean[] pts ) {
		System.out.println("LEVEL 2!");
		int min = 0;
		int max = 9;
		int operando1 = 0;
		int operando2 = 0;
		int playerTry;
		for(int i = 0; i < 10; i++) {
			Random rnd = new Random();
			operando1 =  min + (rnd.nextInt(max - min));
			operando2 =  min + (rnd.nextInt(max - min));
			int result = operando1 + operando2;
			System.out.println(operando1 + " + " + operando2 + " = ");
			playerTry = promptNumbers("");
			// Sets which question player got right
			pts[i] = (playerTry == result) ? true : false;
		}
		return;
	}
	// ### Nível 3
	// - 10 perguntas, operadores de adição e subtração, o jogador vence se fizer mais de 6 pontos. Não pode gerar perguntas com respostas negativas;
	static void level03( boolean[] pts ) {
		System.out.println("LEVEL 3!");
		int min = 0;
		int max = 9;
		int operando1 = 0;
		int operando2 = 0;
		int playerTry;
		int result = 0;
		String[] operators = new String[10];
		Random rnd = new Random();
		for(int i = 0; i < 10; i++) {
			operators[i] = raffleOperators(2);
			do {
				operando1 =  min + (rnd.nextInt(max - min));
				operando2 =  min + (rnd.nextInt(max - min));				
				
				switch (operators[i]) {
					case " + ":	result = operando1 + operando2; break;
					case " - ":	result = operando1 - operando2; break;
					default:	result = 0; break;
				}
			} while ( result < 0 );
			System.out.println(operando1 + operators[i] + operando2 + " = ");
			playerTry = promptNumbers("");
			// Sets which question player got right
			pts[i] = (playerTry == result) ? true : false;
		}
		return;
	}
	// ### Nível 4
	/* 
		10 perguntas, 
		os 4 operadores aritméticos (+,-,*,/). 
		2 pontos extras se acertar 3 seguidas. 
		-1 ponto por erro. 
		Não pode gerar pergunta com divisão por zero. 
		Não pode gerar pergunta de divisão com resultado tipo ponto flutuante (apenas inteiro).
		Pode gerar pergunta com resposta negativa.
		O jogador vence se fizer mais da metade dos pontos possíveis;
	*/
	/*
		Diferenças em relação ao level03:
		operando1 data type int -> double
		operando2 data type int -> double
		result data type int -> double
		Não pode gerar pergunta com divisão por zero
		Não pode gerar pergunta de divisão com resultado tipo ponto flutuante (apenas inteiro).
		Pode gerar pergunta com resposta negativa.
	*/
	static void level04( boolean pts [] ) {
		System.out.println("LEVEL 4!");
		int min = 0;
		int max = 9;
		double operando1 = .0;
		double operando2 = .0;
		int playerTry;
		double result = .0;
		String[] operators = new String[10];
		Random rnd = new Random();
		for(int i = 0; i < 10; i++) {
			
			operators[i] = raffleOperators(4);
			
			do {
				operando2 =  min + (rnd.nextInt(max - min));
			} while ( operando2 <= 0);
			
			do {
				operando1 =  min + (rnd.nextInt(max - min));	
				switch (operators[i]) {
					case " + ":	result = operando1 + operando2; break;
					case " - ":	result = operando1 - operando2; break;
					case " * ":	result = operando1 * operando2;	break;
					case " / ":	result = operando1 / operando2;	break;
					default:	result = 0; break;
				}
			} while ( operando1 % operando2 != 0 );
			System.out.println(operando1 + operators[i] + operando2 + " = ");
			playerTry = promptNumbers("");
			// Sets which question player got right
			pts[i] = (playerTry == result) ? true : false;
		}
		return;	
	}
	
	static String evalExpression() {
		//TODO
		String operator  = raffleOperators(0);
		switch (operator) {
			case " + ": break;
			case " - ": break;
			default:	break;
		}
		return "";
	}
	// TODO: change in parameters from int to String of array or String varargs in order to allow any combination of operators
	static String raffleOperators(int numberOperators){
		String operator="";
		int min = 0;
		// int max = (numberOperators > 0) ? numberOperators-1 : numberOperators;
		int max = numberOperators;
		int result;
		Random rnd = new Random();
		result = min + (rnd.nextInt(max - min));
		//System.out.printf("numberOperators: %s min: %s max: %s result: %s %n", numberOperators, min, max, result);
		switch(result){
			case 1: operator = " - "; break;
			case 0: operator = " + "; break;
			default: operator = " ERROR: operator raffle not yet implemented "; break;
		}
		//System.out.println(operator);
		return operator;
	}
	
	static void mathTrainerStart(int levelSelected, boolean[] pts){
		switch(levelSelected){
			case 4:
				level04(pts);
				break;
			case 3:
				level03(pts);
				break;
			case 2:
				level02(pts);
				break;
			case 1:
				level01(pts);
				break;
			default:
				notYet();
		}
	}


}