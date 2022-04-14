package atividades;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        int r = 1, n, x, i = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        n = scan.nextInt();
        System.out.print("Digite o expoente: ");
        x = scan.nextInt();

        // while ------------------------------------------
            while (i != x) {
                r = r * n;
                i++;
            }
        // do-while ---------------------------------------
            // do {
            //     r = r * n;
            //     i++;
            // } while (i != x);
        // for --------------------------------------------
            // for (i = 0; i != x; i++) {
            //     r = r * n;
            // }
        // ------------------------------------------------
        System.out.print("Resultado: " + r);
    }
}