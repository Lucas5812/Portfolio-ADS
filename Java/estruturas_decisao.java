package testedepacote;

import java.util.Scanner;

public class estruturas_decisao {

	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in); 
			int escolha, num1, num2, num3;
			float flt1, flt2, flt3;
			
			while (true) {
				System.out.println("Bem vindo ao programa de decisões, por favor escolha qual você deseja usar:");
				System.out.println("1 - Checa maior número ; 2 - Checa maior número V2.0! ; 3 - Emissoras de TV ; 4 - Admnistrador de débito/crédito mensal ; 5 - Bilheteria dos cinemas ; 6 - Reajustador Salarial \n7 - Analisador de crimes ; 8 - Confirmador de triângulos");
				escolha = leitor.nextInt();
				
				if(escolha == 1) { //Checa os dois maiores números
					System.out.println("Digite o primeiro número");
					num1 = leitor.nextInt();
					
					System.out.println("Digite o segundo número");
					num2 = leitor.nextInt();
					
					if (num1 > num2) {
						System.out.println(num1 + " é o maior número");
					}
					else if(num1 < num2) {
						System.out.println(num2 + " é o maior número");
					}
					else {
						System.out.println("Os dois valores são iguais");
					}
				}
				
				if (escolha == 2) { //Checa os três maiores números
					System.out.println("Digite o primeiro número");
					num1 = leitor.nextInt();
					
					System.out.println("Digite o segundo número");
					num2 = leitor.nextInt();

					System.out.println("Digite o segundo número");
					num3 = leitor.nextInt();
					
					
					if (num1 > num2 && num1 > num3) {
						System.out.println(num1 + " é o maior número");
					}
					else if(num1 < num2 && num3 < num2) {
						System.out.println(num2 + " é o maior número");
					}
					else if(num1 < num3 && num2 < num3) {
						System.out.println(num3 + " é o maior número");
					}
					
					
					else {
						System.out.println("Dois ou mais valores são o maior número");
					}
				}
				
				if (escolha == 3) { //Emissoras de TV
					System.out.println("Digite o canal da emissora \n SBT: 2 ; BAND: 4 ; RedeTV!: 6 ; Record: 9; Globo: 13");
					num1 = leitor.nextInt();
					
					switch(num1) {
					case 2:
						System.out.println("Sintonizando com a SBT...");
						break;
						
					case 4:
						System.out.println("Sintonizando com a BAND...");
						break;
					
					case 6:
						System.out.println("Sintonizando com a RedeTV!...");
						break;
						
					case 9:
						System.out.println("Sintonizando com a Record...");
						break;
						
					case 13:
						System.out.println("Sintonizando com a Globo...");
						break;
						
					default:
						System.out.println("Erro de conexão: canal desconhecido, tente inserir um canal válido");
					}
				}
				
				if (escolha == 4) { //Admnistrador de créditos
					System.out.println("Insira o seu saldo inicial");
					flt1 = leitor.nextFloat();
					
					System.out.println("Insira o crédito total obtido");
					flt2 = leitor.nextFloat();
					
					System.out.println("Agora insira o débito total obtido");
					flt3 = leitor.nextFloat();
					
					float montante = flt1 + flt2 - flt3;
					
					if(montante > 0 ) {
						System.out.println("Você está no crédito de R$" + montante);
					}
					
					else if(montante < 0) {
						System.out.println("Você está com débito de R$" + montante);
					}
					
					else {
						System.out.println("Você não lucrou nem perdeu valor algum");
					}
				}
				
				if (escolha == 5) { //Bilheteria dos cinemas
					System.out.println("Antes de tudo, insira o dia da semana(terça feira tem desconto de 50%) \n Digite 1 para domingo, 2 para segunda e assim suscetivamente");
					num1 = leitor.nextInt();
					
					boolean desconto_terca = num1 == 3 ? true : false; 
						
					System.out.println("Agora insira sua idade, menores de 14 anos tem desconto de 50%");
					num2 = leitor.nextInt();
					
					boolean desconto_idade = num2 < 14 ? true : false;
					
					System.out.println("Por fim, insira o preço do ingresso a ser comprado");
					flt1 = leitor.nextFloat();
					
					flt1 = desconto_terca == true ? (float) (flt1 * 0.5) : flt1;
					
					flt1 = desconto_idade == true ? (float) (flt1 * 0.5) : flt1;
					
					System.out.println("O valor total do ingresso é R$" + flt1);
				}
				
				if (escolha == 6) { //reajustes salariais
					System.out.println("Insira o salário a ser reajustado");
					flt1 = leitor.nextFloat();
					
					if (flt1 <= 280) {
						flt2 = (float) 0.20;
					}
					else if (flt1 > 280 && flt1 <= 780) {
						flt2 = (float) 0.15;
					}
					else if (flt1 > 780 && flt1 <=1500) {
						flt2 = (float) 0.10;
					}
					else {
						flt2 = (float) 0.05;
					}
					
					System.out.println("Seu salário antes do reajuste era de R$" + flt1 + "\nSeu salário pós-reajuste foi de R$" + (flt1 + (flt1 * flt2) + "\nO aumento foi de " + (flt2*100) + "%\nSeu aumento em reais foi de R$" + (flt1*flt2)));
				}
				
				if (escolha == 7) { //Analisador de Crimes
					num2 = 0;
					System.out.println("Boas vindas ao analisador de crimes, aqui você terá que resolver um pequeno questionário para podermos julgar o seu envolvimento no caso, esperamos que você responda com honestidade e etc e tals você sabe do protocolo, vamo lá \nVocê fez uma ligação para a vítima nos meados do ocorrido? 1: Sim; 2: Não");
					num1 = leitor.nextInt();
					num1 = (num1  == 1) ? num2++ : num2;
					
					System.out.println("Você esteve no local antes do acontecimento?");
					num1 = leitor.nextInt();
					num1 = (num1  == 1) ? num2++ : num2;
					
					System.out.println("Você mora perto da vítima?");
					num1 = leitor.nextInt();
					num1 = (num1  == 1) ? num2++ : num2;
					
					System.out.println("Você devia algum bem ou valor à vitima?");
					num1 = leitor.nextInt();
					num1 = (num1  == 1) ? num2++ : num2;
					
					System.out.println("Você ja trabalhou com a vítima?");
					num1 = leitor.nextInt();
					num1 = (num1  == 1) ? num2++ : num2;
					
					switch (num2){
						case 2:
							System.out.println("Você é suspeito");
							break;
						case 3:
						case 4:
							System.out.println("Você é cúmplice");
							break;
						case 5:
							System.out.println("VOCÊ É O ASSASINO");
							break;
						default:
							System.out.println("Você não está envolvido com o caso");
					}
				}
				
				if (escolha == 8) { //Confirmador de Triângulos
					System.out.println("Para começar, envie o tamanho do primeiro lado");
					flt1 = leitor.nextFloat();
					
					System.out.println("Agora insira o segundo lado");
					flt2 = leitor.nextFloat();
					
					System.out.println("Por fim, adicione o terceiro lado");
					flt3 = leitor.nextFloat();
					
					if ((flt1 + flt2) > flt3 || (flt1 + flt3) > flt2 || (flt2 + flt3) > flt1) {
						
						if (flt1 == flt2 || flt1 == flt3 || flt2 == flt3) {
							System.out.println("A forma se trata de um triângulo Isósceles");
						}
						
						else if(flt1 == flt2 && flt2 == flt3) {
							System.out.println("A forma se trata de um triângulo Equilátero");
						}
						
						else {
							System.out.println("A forma se trata de um triângulo Escaleno");
						}
						
					}
					else {
						System.out.println("A forma não é um triângulo");
					}

					}
					
			}
		}
}
	
