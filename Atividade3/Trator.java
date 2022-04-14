package Atividade3;

public class Trator{

    public String cor;
    private String marca;
    private int marcha;
    protected Boolean revisado;
    protected Boolean ligado;

    public Trator(){

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public Boolean getRevisado(){
        return revisado;
    }
    
    public void setRevisado(Boolean revisado){
        this.revisado = revisado;
    }

    public Boolean getLigado(){
        return ligado;
    }
    
    public void setLigado(Boolean ligado){
        this.ligado = ligado;
    }

    public void mostrarCarac(){
        
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Marcha: " + this.marcha);
        System.out.println("Revisado: " + this.revisado);
        System.out.println("Ligado: " + this.ligado);
    }

    public void ligar(){
        if (this.ligado == true){
            System.out.println("Já está ligado.");
        }
        else{
            this.setLigado(true);
        }
    }

    public void andar(){
        if (this.ligado == false){
            this.ligar();  
        }
        this.subirMarcha();
    }

    public void subirMarcha(){
        if (this.marcha == 3){
            System.out.println("Já está no limite.");
        }
        else{
            this.marcha += 1;
        }
    }

    public void reduzirMarcha(){
        if (this.marcha == 0){
            System.out.println("Já está na menor marcha.");
        }
        else{
            this.marcha -= 1;
        }
    }

    public void desligar(){
        if (this.ligado == false){
            System.out.println("Já está desligado.");
        }
        else{
            this.marcha = 0;
            this.ligado = false;
        }
    }
}
