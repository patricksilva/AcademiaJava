# Jogo da Matemática (Math Trainer)

## Objetivo

- Desenvolver um jogo usando os operadores da linguagem Java. O jogador deve acertar o maior número de perguntas que conseguir.

## Como Jogar

- O jogo apresenta o objetivo ao jogador;
- O jogador se identifica;
- Para os operadores envolvendo valor numérico inteiro, os operandos devem ser gerados aleatoriamente entre os valores 0 e 9;
- No final o jogo deve apresentar o nome do jogador ,sua pontuação e se venceu levando em conta as regras de cada nível;

##Níveis

### Nível 1
- 10 perguntas, operador de adição, 1 ponto por acerto, o jogador vence se fizer mais de 6 pontos;

### Nível 2
- 10 perguntas, operador de adição, 2 pontos por acerto, -1 ponto por erro. O jogador vence se fizer mais de 6 pontos;

### Nível 3
- 10 perguntas, operadores de adição e subtração, o jogador vence se fizer mais de 6 pontos. Não pode gerar perguntas com respostas negativas;

### Nível 4
- 10 perguntas, os 4 operadores aritméticos (+,-,*,/). O jogador vence se fizer mais de 6 pontos. 2 pontos extras se acertar 3 seguidas. -1 ponto por erro. Não pode gerar pergunta com divisão por zero. Não pode gerar pergunta de divisão com resultado tipo ponto flutuante (apenas inteiro). Pode gerar pergunta com resposta negativa. O jogador vence se dizer mais da metade dos pontos;

### Nível 5
- 15 perguntas, demais regras conforme nível 4, o jogador joga contra o computador. O computador deve acertar aleatoriamente entre 3 e 12 perguntas em cada rodada. O jogador vence se acertar mais que o computador;

### Nível 6
- 15 perguntas envolvendo os operadores de divisão, o resto de divisão e o operador ternário. Os operandos são números de ponto flutuante. Pontuação equivalente à do nível 4;

### Nível 7
- 15 perguntas envolvendo operadores de deslocamento de bits. Pontuação equivalente à do nível 4;

### Nível 8
- 15 perguntas envolvendo os operadores lógicos e os operadores de incremento e decremento. Pontuação equivalente à do nível 4;

### Nível 9
- 15 perguntas envolvendo os operadores bit a bit e o operador de inversão. Pontuação equivalente à do nível 4;

### Nível 10
- Todos os operadores usados nos níveis anteriores. 2 pontos a mais para cada pergunta correta respondida em menos de 10 segundos. Usar o seguinte método para recuperar o momento atual:

http://docs.oracle.com/javase/8/docs/api/java/lang/System.html#currentTimeMillis()

## Importante
- Se for necessário usar outra classe do SE além das citadas nas dicas, favor comunicar antes;
- Novas classes podem ser criadas, desde que os atributos e os métodos sejam estáticos;

## Dicas
- para ler a resposta do jogador, usar a classe java.util.Scanner.
Exemplo:
 Scanner sc = new Scanner(System.in);
 String text = sc.next();
 int answer = Integer.parseInt(text);
- para gerar cada operando de um pergunta, usar a classe Random.
(http://docs.oracle.com/javase/8/docs/api/java/util/Random.html)
Exemplo:
Min + (new Random.nextInt(Max - Min))
- para escrever uma pergunta ou o resultado final no console, usar a classe System.
Exemplo:
System.out.println(operando1 + " " + operacao +  " " + operando2 + " = ");

## Entrega

- Enviem a solução, completa ou parcial, com o nome ajtf96-aj1-mathtrainer-NOME.zip para sala privada do instrutor no slack até 27 de junho (segunda).


## Referências

- http://arithmetic.zetamac.com/
- http://www.mental-math-trainer.com/
- http://www.sheppardsoftware.com/mathgames/arithmetic/arithmetic.htm
