package atividades;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        exerc2();
    }

    private static void exerc2() {
        int Qloop = 3;
        float  numero = 0, somador = 0;

        for(int x = 0; x < Qloop; x++){
            String res = String.format("Digite o %d° número: ", x+1);
            System.out.println(res);
            Scanner scan = new Scanner(System.in);
            numero = scan.nextInt();
            somador = somador + numero;
            
        }
        float media = somador / Qloop;
        System.out.println("\n" + "A média é: " + media + "\n");
    }

}
