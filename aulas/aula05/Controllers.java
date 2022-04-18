package aulas.aula05;

public class Controllers {

    private Funcionario[] list;

    public Controllers() {
        list = new Funcionario[5];
    }

    public void addFuncionario(Funcionario f) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = f;
                break;
            }else{
                System.out.println("Funcionario ja cadastrado");
            }
        }
    }

    public void listarFuncionarios() {
        for (Funcionario f : list) {
            if (f != null) {
                System.out.println(f.getNome() + " " + f.getIdade() + " " + f.getCidade());
            }
        }
    }

    public void editarFuncionario(String nome, int idade, String cidade) {
        for (Funcionario f : list) {
            if (f != null && f.getNome().equals(nome)) {
                f.setIdade(idade);
                f.setCidade(cidade);
                break;
            }else{
                System.out.println("Funcionario não encontrado");
            }
        }
    }

    public void removerFuncionario(String nome) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getNome().equals(nome)) {
                list[i] = null;
                break;
            }else{
                System.out.println("Funcionario não encontrado");
            }
        }
    }

  
}
