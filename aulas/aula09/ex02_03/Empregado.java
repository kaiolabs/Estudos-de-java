package aulas.aula09.ex02_03;

public class Empregado extends Pessoa {
    private int codigoDoSetor;
    private double salarioBase;
    private double imposto;


    public int getCodigoDoSetor() {
        return codigoDoSetor;
    }
    public double getImposto() {
        return imposto;
    }


    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public double getSalarioBase() {
        return salarioBase;
    }


    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public void setCodigoDoSetor(int codigoDoSetor) {
        this.codigoDoSetor = codigoDoSetor;
    }

    public double obterSalarioLiquido() {
        return this.salarioBase - this.imposto;
    }
}
