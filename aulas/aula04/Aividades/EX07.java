package aulas.aula04.Aividades;

public class EX07 {
    public static void main(String[] args){
        
        System.out.println(media(5, 4, 10, 2, 1));

    }

    private static int soma(int a, int b){
        return a + b;
    }

    private static int soma(int a, int b, int c){
        int aux = soma(a, b);
        return aux + c;
    }

    private static int soma(int a, int b, int c, int d){
        int aux = soma(a, b, c);
        return aux + d;
    }

    private static int soma(int a, int b, int c, int d, int e){
        int aux = soma(a, b, c, d);
        return aux + e;
    }

    private static double soma(double a, double b){
        return a + b;
    }

    private static double soma(double a, double b, double c){
        double aux = soma(a, b);
        return aux + c;
    }

    private static double soma(double a, double b, double c, double d){
        double aux = soma(a, b, c);
        return aux + d;
    }

    private static double soma(double a, double b, double c, double d, double e){
        double aux = soma(a, b, c, d);
        return aux + e;
    }

    private static int media(int a, int b){
        return (a + b) / 2;
    }

    private static int media(int a, int b, int c){
        return (a + b + c) / 3;
    }

    private static int media(int a, int b, int c, int d){
        return (a + b + c + d) / 4;
    }

    private static int media(int a, int b, int c, int d, int e){
        return (a + b + c + d + e) / 5;
    }

    private static double media(double a, double b){
        return (a + b) / 2;
    }

    private static double media(double a, double b, double c){
        return (a + b + c) / 3;
    }

    private static double media(double a, double b, double c, double d){
        return (a + b + c + d) / 4;
    }

    private static double media(double a, double b, double c, double d, double e){
        return (a + b + c + d + e) / 5;
    }

}


