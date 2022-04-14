// Escreva um código em Java que apresente a classe Pessoa, com atributos nome, endereço e
// telefone e, o método imprimir (Imprime todos os dados da pessoa). O método imprimir
// deve mostrar na tela os valores de todos os atributos. Não esqueça de adicionar os
// métodos Get,s e Set's.

package aulas.aula03.atividades;

public class EX01 {
    public static void main(String[] args) {
        Pessoa2 p = new Pessoa2();
        
        p.setNome("João");
        p.setEndereco("Rua das Flores");
        p.setTelefone(123456789);
        p.imprimir();
        
    }
}
