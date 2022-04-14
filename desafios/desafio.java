package desafios;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int ano, d, dia_da_pascoa, e, mes_da_pascoa;
        System.out.print("Digite o valor do ano: ");
        ano = in.nextInt();
        in.nextLine();
        d=(19*(ano%19)+24)%30;
        e=(2*(ano%4)+4*(ano%7)+6*d+5)%7;
        if(d+e<10)
            dia_da_pascoa=d+e+22;
        else
            dia_da_pascoa=d+e-9;
        if(d+e<10)
        {
            mes_da_pascoa=3;
            System.out.println("Mar\u00E7o");
        }
        else
        {
            mes_da_pascoa=4;
            System.out.println("Abril");
        }
        if(dia_da_pascoa==26&&mes_da_pascoa==4)
            dia_da_pascoa=19;
        if(dia_da_pascoa==25&&mes_da_pascoa==4&&d==28&&e==6&&(ano%19)>10)
            dia_da_pascoa=18;
        System.out.println("O valor do dia da pascoa: " + dia_da_pascoa);
        System.out.println("O valor do mes da pascoa: " + mes_da_pascoa);

    }

        public static int A(int ano){
            return (ano % 19);
        }

        public static int B(int ano){
            return (ano / 100);
        }

        public static int C(int ano){
            return (ano % 100);
        }

        public static int D(int ano){
            return (B(ano) / 4);
        }

        public static int E(int ano){
            return (B(ano) % 4);
        }

        public static int F(int ano){
            return ((B(ano) + 8) / 25);
        }

        public static int G(int ano){
            return ((B(ano) - F(ano) + 1) / 3);
        }

        public static int H(int ano){
            return ((19 * A(ano) + B(ano) - D(ano) - G(ano) + 15) / 30);
        }

        public static int I(int ano){
            return (C(ano) / 4);
        }

        public static int K(int ano){
            return (C(ano) % 4);
        }

        public static int L(int ano){
            return ((32 + 2 * E(ano) + 2 * I(ano) - H(ano) - K(ano)) % 7);
        }

        public static int M(int ano){
            return ((A(ano) + 11 * H(ano) + 22 * L(ano)) / 451);
        }

        public static int P(int ano){
            return ((H(ano) + L(ano) - 7 * M(ano) + 114) / 31);
        }

        public static int Q(int ano){
            return ((H(ano) + L(ano) - 7 * M(ano) + 114) % 31);
        }

        public static int PASCOA(int ano){
            return (Q(ano) + 1);
        }
        
        
}