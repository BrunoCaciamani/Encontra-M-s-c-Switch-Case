import java.util.Scanner;

public class Meses{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o mês: ");
		
		String mes = sc.nextLine();
		
		switch(mes){
			
			case "Janeiro":
			case "janeiro":
			case "Março":
			case "março":
			case "Maio":
			case "maio":
			case "Julho":
			case "julho":
			case "Agosto":
			case "agosto":
			case "Outubro":
			case "outubro":
			case "Dezembro":
			case "dezembro":
			System.out.println("Mês de 31 dias");
			break;
			case "Fevereiro":
			case "fevereiro":
			System.out.println("Mês de 28 ou 29dias");
			break;
			default:
			System.out.println("Mês de 30 dias");
			break;
		}
	
	}
}