import java.util.Scanner;

public class ListEigth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
		int valor,
		    nota1 = 1,
			nota5 = 5, 
			nota10 = 10, 
			nota50 = 50;
		    System.out.println("Qual o valor desejado: ");
			valor = sc.nextInt();
			
			nota50 = valor/50;
			valor = valor%50;
			nota10 = valor/10;
			valor = valor%10;
			nota5 = valor/5;
			nota1 = valor%5;
			
		
		System.out.println("Notas de 50: " + nota50);
		System.out.println("Notas de 10: " + nota10);
		System.out.println("Notas de 5: " + nota5);
		System.out.println("Notas de 1: " + nota1);
    }
}
