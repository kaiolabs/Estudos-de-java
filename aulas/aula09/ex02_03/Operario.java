package aulas.aula09.ex02_03;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double obterSalarioLiquido() {
        double adicional = this.valorProducao * (this.comissao / 100);
        double salarioLiquido = this.valorProducao + adicional;
        return salarioLiquido;
    }
}
