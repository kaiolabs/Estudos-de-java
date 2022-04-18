package aulas.aula05;

public class Funcionario {
    // Ctrl + ponto pata criar gats e seters
    
    private String nome;
    private int idade;
    private String cidade;

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    

}
