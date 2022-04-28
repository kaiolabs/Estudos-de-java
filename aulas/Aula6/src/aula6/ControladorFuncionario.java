/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.Aula6.src.aula6;

/**
 *
 * @author ghelfer
 */
public class ControladorFuncionario {

    private Funcionario[] array;
    private int pos;

    public ControladorFuncionario() {
        this.array = new Funcionario[10];
        this.pos = 0;    
    }
    
    public ControladorFuncionario(int tam) {
        this.array = new Funcionario[tam];
        this.pos = 0;    
    }

    public void adicionar(Funcionario f) {
        this.array[pos] = f;
        this.pos++;
    }

    public void mostrar() {
        //for (Funcionario f : array) {
        //     System.out.println(f.getNome() + " " + f.getIdade());
        //}
        for (int i = 0; i < this.array.length; i++) {
            Funcionario f = this.array[i];
            if (f != null) {
                System.out.println("posicao " + i + " " + f.getNome() + " " + f.getIdade());
            } else {
                System.out.println("posicao " + i + " é nula");
            }

        }
        System.out.println("------------------");
    }

    public void editar(String nome, int idade, int pos) {
        if (this.array[pos] != null) {
            this.array[pos].setNome(nome);
            this.array[pos].setIdade(idade);
        } else {
            System.out.println("no way, object func[" + pos + "] not exist!");
        }
    }
    
    public void excluir(int pos) {
        if (this.array[pos] != null) {
            array[pos] = null;
        } else {
            System.out.println("no way, object func[" + pos + "] not exist!");
        }
    }


}
