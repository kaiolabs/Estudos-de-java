package aulas.aula09.ex02_03;

public class Adiministrador extends Empregado{
    private double ajudaDeCusto;


    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }
    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double obterSalarioLiquido() {
        return super.obterSalarioLiquido() + this.ajudaDeCusto;
    }
}
