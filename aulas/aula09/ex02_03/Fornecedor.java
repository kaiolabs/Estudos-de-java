package aulas.aula09.ex02_03;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;


    public double getValorCredito() {
        return valorCredito;
    }
    public double getValorDivida() {
        return valorDivida;
    }


    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double obterSaldo() {
        return this.valorCredito - this.valorDivida;
    }


}
