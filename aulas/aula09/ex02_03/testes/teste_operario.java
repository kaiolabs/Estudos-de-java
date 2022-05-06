package aulas.aula09.ex02_03.testes;

import aulas.aula09.ex02_03.Operario;

public class teste_operario{
    // teste unitario para a classe Pessoa

    public static void main(String[] args) {
        Teste2();
    }

    public teste_operario() {

    }

    public static void Teste2(){
        Operario operario = new Operario();
        operario.setNome("Operario 1");
        operario.setEndereco("Endereco 1");
        operario.setTelefone("9920022");
        operario.setSalarioBase(2000.0);
        operario.setImposto(500.0);
        operario.setComissao(10.0);
        operario.setValorProducao(1000.0);

        System.out.println("Salario Liquido: " + operario.obterSalarioLiquido());

}
}
