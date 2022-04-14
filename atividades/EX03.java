package atividades;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {

        int v1 = 0, v2 = 0, v3 = 0, maior;

        System.out.println("Digite o primeiro número: ");
        Scanner scan = new Scanner(System.in);
        v1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        v2 = scan.nextInt();
        System.out.println("Digite o terceiro número: ");
        v3 = scan.nextInt();
  
        maior = (v1 > v2) ? (v1 > v3 ? v1 : v3) : (v2 > v3 ? v2 : v3);
        
        System.out.println("\nO maior valor é: " + maior + "\n");
    }
}
