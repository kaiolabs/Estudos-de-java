package aulas.aula09.ex02_03.testes;

import aulas.aula09.ex02_03.Empregado;

public class teste_empregado {
    public static void main(String[] args) {
        Teste1();
    }

    public teste_empregado() {

    }

    public static void Teste1(){
        Empregado empregado = new Empregado();

        empregado.setCodigoDoSetor(1);
        empregado.setImposto(100.0);
        empregado.setSalarioBase(1000.0);

        System.out.println("Salario Liquido: " + empregado.obterSalarioLiquido());
    }

}
