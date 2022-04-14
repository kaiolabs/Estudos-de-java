package Atividade3;

public class Aula4 {
    public static void main(String[] args){
        Trator a = new Trator();
        a.setMarca("Fiat");
        a.setLigado(true);
        a.setCor("azul");
        a.setMarcha(4);
        a.setRevisado(true);
        a.subirMarcha();
        a.reduzirMarcha();
        a.desligar();
        a.mostrarCarac();
        a.ligar();
        a.andar();
    }

}
