// Escreva um código em Java que apresente a classe Pessoa, com atributos nome, endereço e
// telefone e, o método imprimir (Imprime todos os dados da pessoa). O método imprimir
// deve mostrar na tela os valores de todos os atributos. Não esqueça de adicionar os
// métodos Get,s e Set's.

package aulas.aula03.atividades;

public class Pessoa2 {

    private String nome;
    private String endereco;
    private int telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void imprimir() {
        System.out.println("\nNome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\n");
    }
}
