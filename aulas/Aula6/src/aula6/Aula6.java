/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.Aula6.src.aula6;

import java.util.Scanner;

/**
 *
 * @author ghelfer
 */
public class Aula6 {

    /**
     * @param args the command line arguments
     */   
 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int tam = scan.nextInt();
        ControladorFuncionario ctrl = new ControladorFuncionario(tam);
        Funcionario f = new Funcionario();
        f.setNome("voce");
        f.setIdade(30);
        ctrl.adicionar(f);
        
        ctrl.mostrar();
        
        f = new Funcionario();
        f.setNome("ele");
        f.setIdade(20);
        ctrl.adicionar(f);
        
        ctrl.mostrar();
        
        ctrl.editar("ela", 25, 1);
        
        ctrl.mostrar();
        
        ctrl.excluir(0);
        ctrl.mostrar();
    }



  



    
}
