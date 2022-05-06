package aulas.aula07;

public class Gerente extends Funcionario {

    @ Override
    public boolean autentica() {
        return true;
    }

    @ Override
    public double getBonificacao() {
        return this.getSalario() * 0.15;
    }

    @ Override
    public double getHorasTrabalhadas() {
        return super.getHorasTrabalhadas() + 10;
    }
    
}
