package aulas.aula09.ex02_03.testes;

import aulas.aula09.ex02_03.Fornecedor;

public class teste_fornecedor {
    // teste unitario para a classe Pessoa

    public static void main(String[] args) {
        Teste3();
    }

    public teste_fornecedor() {

    }

    public static void Teste3(){
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Fornecedor 1");
        fornecedor.setEndereco("Endereco 1");
        fornecedor.setTelefone("9920022");

        fornecedor.setValorCredito(100.0);
        fornecedor.setValorDivida(50.0);

        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
