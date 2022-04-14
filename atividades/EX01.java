package atividades;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {

        int idade = 0, quantidadeIOS = 0, quantidadeAPK = 0;
        float somaIdade = 0;
        String sistema, add;

        while (true) {

            System.out.println("Digite sua idade");
            Scanner scan = new Scanner(System.in);
            idade = scan.nextInt();
            // scan.close();

            if (idade > 125 || idade <= 0) {
                System.out.println("Idade inválida!");
                continue;
            }

            System.out.println("Qual sistema operacional você usa (IOS ou ANDROID): ");
            sistema = scan.next().toUpperCase();

            if (sistema.equals("IOS")) {
                quantidadeIOS = quantidadeIOS + 1;
                somaIdade = somaIdade + idade;

            } else if (sistema.equals("ANDROID")) {
                quantidadeAPK = quantidadeAPK + 1;
                somaIdade = somaIdade + idade;
            } else {
                System.out.println(
                        "\nO sistema operacional informado está incorreto! Por favor prenha os dados novamente.\n");
                continue;
            }

            System.out.println("Deseja cadastrar mais dados (S/N):");
            add = scan.next().toUpperCase();

            if (add.equals("N")) {
                break;

            }

        }

        float totalDePessoas = quantidadeIOS + quantidadeAPK;
        float media = somaIdade / totalDePessoas;

        System.out.println("\n======================================\n\nNúmero de entrevistados: " + totalDePessoas
                + "\n\nTotal de usuários de IOS: " + quantidadeIOS + "\n\nTotal de usuários de ANDROID: "
                + quantidadeAPK + "\n\nIdade média dos entrevistados: " + media
                + "\n\n======================================\n\n");
    }
}
