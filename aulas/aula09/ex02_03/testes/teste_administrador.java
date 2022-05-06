package aulas.aula09.ex02_03.testes;

import aulas.aula09.ex02_03.Adiministrador;

public class teste_administrador{
    // teste unitario para a classe Pessoa

    public static void main(String[] args) {
        Teste4();
    }

    public teste_administrador() {

    }

    public static void Teste4(){
        Adiministrador administrador = new Adiministrador();
        administrador.setNome("Administrador 1");
        administrador.setEndereco("Endereco 1");
        administrador.setTelefone("9920022");
        administrador.setAjudaDeCusto(250.0);
        administrador.setSalarioBase(1000.0);
        administrador.setImposto(100.0);

        System.out.println("Salario Liquido: " + administrador.obterSalarioLiquido());
}
}
