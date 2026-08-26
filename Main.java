import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
    
        }else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        if (numero > 0) {
            System.out.println("Ele é POSITIVO");
        } else if (numero < 0) {
            System.out.println("Ele é NEGATIVO");
        } else {
            System.out.println("Ele é ZERO (neutro).");
        }

        scanner.close();

    }


}