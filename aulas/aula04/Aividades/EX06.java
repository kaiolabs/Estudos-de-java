package aulas.aula04.Aividades;

public class EX06 {
    public static void main(String[] args){

        // Escreva uma classe que contenha métodos estáticos para retornar o maior e o menor de dois, três, quatro e cinco valores (com um total de oito métodos), considerando que os argumentos e retorno dos métodos podem ser dos tipos int e double. Dica: Os métodos podem ser chamados em cascata: para calcular o maior de três valores a, b e c, pode-se calcular o maior valor de a e b, e comparar esse resultado com c.
        
        System.out.println(maior(5, 4, 10, 2, 1));

    }

    private static int maior(int a, int b){
        
        return (a > b) ? a : b;
    }

    private static int maior(int a, int b, int c){

        int maior = maior(a, b);
        return (maior > c) ? maior : c;
    }

    private static int maior(int a, int b, int c, int d){

        int maior = maior(a, b, c);
        return (maior > d) ? maior : d;
    }

    private static int maior(int a, int b, int c, int d, int e){

        int maior = maior(a, b, c, d);
        return (maior > e) ? maior : e;
    }
}


