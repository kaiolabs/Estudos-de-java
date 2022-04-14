package desafios;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ;
        System.out.print("Digite o ano: ");
        int ano = in.nextInt();

        int dia_da_pascoa = DiaPascoa(ano);
        int mes_da_pascoa = MesPascoa(ano);

        System.out.println("\n\nDia da Páscoa: " + dia_da_pascoa + "/" + mes_da_pascoa + "/" + ano + "\n\n");

    }

    

    public static int d(int ano) {
        return (19 * (ano % 19) + 24) % 30;
    }

    public static int e(int ano) {
        int d = d(ano);
        return (2 * (ano % 4) + 4 * (ano % 7) + 6 * d + 5) % 7;
    }

    public static int DiaPascoa(int ano) {
        int dia_da_pascoa;

        int d = d(ano);
        int e = e(ano);
        int mes_da_pascoa = MesPascoa(ano);

        if (d + e < 10)
            dia_da_pascoa = d + e + 22;
        else
            dia_da_pascoa = d + e - 9;

        if (dia_da_pascoa == 26 && mes_da_pascoa == 4) {
            dia_da_pascoa = 19;
        }
        if (dia_da_pascoa == 25 && mes_da_pascoa == 4 && d == 28 && e == 6 && (ano % 19) > 10) {
            dia_da_pascoa = 18;
        }

        return dia_da_pascoa;

    }

    public static int MesPascoa(int ano) {
        int mes_da_pascoa;

        int d = d(ano);
        int e = e(ano);

        if (d + e < 10)
            mes_da_pascoa = 3;
        else
            mes_da_pascoa = 4;

        return mes_da_pascoa;

    }

}