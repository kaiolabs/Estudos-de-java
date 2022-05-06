package aulas.aula07;

public class Diretor extends Gerente {

    @Override
    public boolean autentica() {
        return false;
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.25;
    }

    @ Override
    public double getHorasTrabalhadas() {
        return super.getHorasTrabalhadas() + 20;
    }
    
}
