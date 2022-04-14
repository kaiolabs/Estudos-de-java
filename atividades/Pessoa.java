package atividades;

public class Pessoa {
    
    public String nome;
    public int nascimento;
    public float altura;
    public float peso;
    public int idade;
    public char sexo;

    public void imc(){
        float calculaIMC;
        calculaIMC = peso/(altura*altura);
        System.out.println("\nSeu IMC é:" + calculaIMC);

        if(calculaIMC < 18.5){
            System.out.println("\nStatus de saúde: Abaixo do peso");
        }else if(calculaIMC >= 18.5 && calculaIMC <= 24.9){
            System.out.println("\nStatus de saúde: Peso normal");
        }else if(calculaIMC >= 25 && calculaIMC <= 29.9){
            System.out.println("\nStatus de saúde: Sobrepeso");
        }else if(calculaIMC >= 30 && calculaIMC <= 34.9){
            System.out.println("\nStatus de saúde: Obesidade Grau 1");
        }else if(calculaIMC >= 35 && calculaIMC <= 39.9){
            System.out.println("\nStatus de saúde: Obesidade Grau 2");
        }else if (calculaIMC > 40){
            System.out.println("\nStatus de saúde: Obesidade Grau 3 ou Mórbido");
        }
    }

    public void idade(){
        int calculaIdade = 2022 - nascimento;
        System.out.println("\n" + nome + " tem " + calculaIdade + " anos\n");
    }

}
