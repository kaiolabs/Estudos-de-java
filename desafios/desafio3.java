package desafios;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int ano, d, dia_da_pascoa, e, mes_da_pascoa;
        System.out.print("Digite o valor do ano: ");
        ano = in.nextInt();

        cal = (ano % 19) + 1;
        d = (19 * cal) % 30;
        e = (2 * (ano % 4) + 4 * (ano % 7) + 6 * d + 5) % 7;
        dia_da_pascoa = d + e - 9;

        System.out.println("\n\nDia da Páscoa: " + dia_da_pascoa + "/" + mes_da_pascoa + "/" + ano + "\n\n");
        

    }
        
}