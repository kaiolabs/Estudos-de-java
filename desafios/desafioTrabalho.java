package desafios;

import java.util.Scanner;

public class desafioTrabalho {
    public static void main(String[] args) {

         //input de frase
         Scanner input = new Scanner(System.in);
         System.out.println("Digite uma frase: ");
         String frase = input.nextLine();
 
         //remover espaços
         frase = frase.replace(" ", "");
 
         //raiz do tamanho da frase
         double raiz = Math.sqrt(frase.length());
 
         //criar matriz
         char[][] matriz;
         double linhas;
         double colunas;
         int coluna2 = 0;
         int linha2 = 0;
 
         if (raiz % 1 == 0) {
             int tamanho = (int) raiz;
             matriz = new char[tamanho][tamanho];
         }
         else {
             linhas = Math.floor(raiz);
             colunas = Math.ceil(raiz);
             if (linhas*colunas < frase.length()) {
                 colunas += 1;
             }
             matriz = new char[(int) linhas][(int) colunas];
             linha2 = (int) linhas;
             coluna2 = (int) colunas;
         }
         System.out.println("\nMatriz criada!\n");
 
         //preencher matriz
         int contador = 0;

         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 if (contador < frase.length()) {
                     matriz[i][j] = frase.charAt(contador);
                     contador++;
                 }
             }
         }
 
         //imprimir matriz
         for (char[] chars : matriz) {
             for (char aChar : chars) {
                 System.out.print(aChar);
             }
             System.out.println(" ");
         }
 
         System.out.println(" ");
 
         //imprimir matriz por coluna
         for (int i = 0; i < coluna2; i++) {
             for (int j = 0; j < linha2; j++) {
                 System.out.print(matriz[j][i]);
             }
             System.out.println(" ");
         }

         // trocar coluna por linha

         char[][] matriz2;

            if (raiz % 1 == 0) {
                int tamanho = (int) raiz;
                matriz2 = new char[tamanho][tamanho];
            }
            else {
                linhas = Math.floor(raiz);
                colunas = Math.ceil(raiz);
                if (linhas*colunas < frase.length()) {
                    colunas += 1;
                }
                matriz2 = new char[(int) colunas][(int) linhas];
                linha2 = (int) colunas;
                coluna2 = (int) linhas;
            }

            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    matriz2[i][j] = matriz[j][i];
                }
            }

            System.out.println("\nMatriz invertida!\n");

            //imprimir matriz
            for (char[] chars : matriz2) {
                for (char aChar : chars) {
                    System.out.print(aChar);
                }
                System.out.println(" ");
            }

            System.out.println(" ");

            //imprimir matriz por coluna
            for (int i = 0; i < linha2; i++) {
                for (int j = 0; j < coluna2; j++) {
                    System.out.print(matriz2[j][i]);
                }
                System.out.println(" ");
            }


        

    }

}
