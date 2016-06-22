/**

	## Objetivo
	- Desenvolver um jogo usando os operadores da linguagem Java. O jogador deve acertar o maior número de perguntas que conseguir.
	Curso: Academia do Java, VOFFICE
	Autor: Patrick Alex - patrickalex@gmail.com
	Data: 2016-06-21
	
	## Como Jogar
	- O jogo apresenta o objetivo ao jogador;
	- O jogador se identifica;
	- Para os operadores envolvendo valor numérico inteiro, os operandos devem ser gerados aleatoriamente entre os valores 0 e 9;
	- No final o jogo deve apresentar o nome do jogador ,sua pontuação e se venceu levando em conta as regras de cada nível;
	
	
	## regras para a realização deste desafio
	- podemos criar novos arquivos ".java"
	- os atributos podem ter qualquer modificador
	- os métodos tem que ser static

*/
class MathTrainer {
	
	static byte 	limit 		= 10;
	static byte 	tries 		= 1;
	
	public static void main (String[] args) {
		
		gameIntro();
		
		
	}
	
	static void nivel01() {
		// TODO
	}
	
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
	
	static void gameIntro() {
		System.out.println("Welcome to Math Trainer!");
		System.out.println("In this game, you must get right as much questions as you can.");
		System.out.print("What is your name? ");
	}

}