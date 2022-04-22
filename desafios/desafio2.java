package desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int ano;
        System.out.print("Digite o valor do ano: ");
        ano = in.nextInt();
        in.nextLine();

        System.out.println("\nDia da pascoa: " + PASCOA(ano) + "/" + P(ano) + "/" + ano + "\n");

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
            return ((19 * A(ano) + B(ano) - D(ano) - G(ano) + 15) % 30);
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