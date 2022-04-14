package atividades;

public class Ex06 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Maria";
        pessoa1.nascimento = 1999;
        pessoa1.altura = (float) 1.65;
        pessoa1.peso = 67;

        System.out.println("\nNome: " + pessoa1.nome);
        System.out.println("\nData de nascimento: " + pessoa1.nascimento);
        System.out.println("\nAltura: " + pessoa1.altura);
        System.out.println("\nPeso: " + pessoa1.peso);

        pessoa1.imc();
        pessoa1.idade();

    }
}
