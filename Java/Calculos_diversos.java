package testedepacote;
import java.util.Scanner;

public class Calculos_diversos {
	
	static boolean continuar_programa(Scanner leitor) {
		System.out.println("Deseja continuar com o programa? 1 = Sim ; 2 = Não");
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int escolha;
		int num1, num2, num3, num4;
		float flt1, flt2, flt3, flt4;

		
		
		
		

		while (true) {
			System.out.println("Bem vindo(a) ao Programa Garagem dos Muitos Cálculos, como podemos lhe ajudar hoje?");
			System.out.println("1 = adição ; 2 = Média de notas; 3 = Cálculo de ferraduras para cavalos(não questione) \n4 - Conversor de M para CM ; 5 - Calculadora de área de quadrados(e seu dobro) ; 6 - Calculadora de selário mensal(Caixista não abra) \n7 - Calculadora de peso ideal ; 8 - Conversor de graus Fº para Cº");
			escolha = leitor.nextInt();
		
			if (escolha == 1){			//Adições
				System.out.println("Insira o primeiro número da adição");
				num1 = leitor.nextInt();
				System.out.println(num1 + "+");
				
				System.out.println("Insira o Segundo número da adição");
				num2 = leitor.nextInt();
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

				if(!continuar_programa(leitor)) break;
			}
			else if(escolha == 2) {
				System.out.println("Insira a primeira nota do aluno");
				num1 = leitor.nextInt();
				
				System.out.println("Insira a segunda nota do aluno");
				num2 = leitor.nextInt();
				
				System.out.println("Insira a terceira nota do aluno");
				num3 = leitor.nextInt();
				
				System.out.println("Insira a quarta nota do aluno");
				num4 = leitor.nextInt();
				
				flt1 = (float)((num1 + num2 + num3 + num4) / 4.0);
				System.out.println("A média do aluno nesta unidade foi: " + flt1);
				
				if(!continuar_programa(leitor)) break;
			}
			else if(escolha == 3) {
				System.out.println("Obrigado por não questionar, quantos cavalos estão sem ferraduras?");
				num1 = leitor.nextInt();
				
				System.out.println("Você vai precisar de "+ (num1*4) + " ferraduras");
				
				if(!continuar_programa(leitor)) break;
				}
			
			else if(escolha == 4) {
				System.out.println("Insira a quantidade de metros a ser convertida");
			
				flt1 = leitor.nextFloat();
				
				System.out.println(flt1 + " metros resulta em " + (flt1 * 100) + " centímetros");
				
				if(!continuar_programa(leitor)) break;
			}
			
			else if(escolha == 5) { //Calculadora da área de quadrados
				System.out.println("Insira o tamanho do lador de um quadrado em cm(em caso de dúvidas acessar o setor número 4 para conversões)");
				
				flt1 = leitor.nextFloat();
				
				System.out.println("a área do quadrado é de " + (flt1*2) + "cm, o dobro desta respectiva área é igual a " + (flt1*2 * 2) +"cm");
				if(!continuar_programa(leitor)) break;	
			}
			else if(escolha == 6) {
				System.out.println("Insira o seu salário por hora");
				
				flt1 = leitor.nextFloat();
				
				System.out.println("Agora insira quantas horas você trabalha por mês");
				
				flt2 = leitor.nextFloat();
				
				System.out.println("Seu salário mensal deveria ser de " + flt1*flt2 + "R$ por mês");
				
				if(!continuar_programa(leitor)) break;
			}
			else if(escolha == 7) {
				System.out.println("Insira a sua altura (em metros)");
				
				flt1 = leitor.nextFloat();
				
				flt2 =(float) ((71.7 * flt1) - 58);
				
				System.out.println("Seu peso ideal é com " + flt2 + "KG");
				
				if(!continuar_programa(leitor)) break;
			}
			
			else if(escolha == 8) { //Conversor de graus
				System.out.println("Insira a temperatura em Fahrenheit");
				
				flt1 = leitor.nextFloat();
				
				flt2 = (5*(flt1 - 32) /9);
				
				System.out.println("A conversão de " + flt1 + "Fº resulta em" + flt2 + "Cº");
				
				if(!continuar_programa(leitor)) break;
			}
		}
	};

}
