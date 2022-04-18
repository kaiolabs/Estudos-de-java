package aulas.aula05;

public class Ex01 {
    public static void main(String[] args) {
        Controllers c = new Controllers();
        Funcionario f = new Funcionario();
        f.setNome("Nome 1");
        f.setIdade(30);
        f.setCidade("SCS");

        Funcionario k = new Funcionario();

        k.setNome("Nome 2");
        k.setIdade(40);
        k.setCidade("SCS");

        c.addFuncionario(f);
        c.addFuncionario(k);
        c.editarFuncionario("Nome 1", 50, "Praia Grande");
        c.listarFuncionarios();
        c.removerFuncionario("Nome 2");
        c.listarFuncionarios();
    }
    
}
