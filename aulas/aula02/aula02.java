package aulas.aula02;

public class aula02 {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.name = "Chevrolet Montana";
        carro1.ano = 2015;
        carro1.cor = "Azul";
        carro1.peso = 1786;
        carro1.estado = "NOVO";

        System.out.println("\n" + "Nome: " + carro1.name + "\n" + "Ano: " + carro1.ano + "\n"+ "Cor: " + carro1.cor + "\n" + "peso: " + carro1.peso + " kg" + "\n" + "Estado do carro: " + carro1.estado + "\n");
        System.out.println(carro1.hashCode());
        carro1.acelerar();

        Carro carro2 = new Carro();

        carro2.name = "Audi A6";
        carro2.ano = 2019;
        carro2.cor = "Branco";
        carro2.peso = 2186;
        carro2.estado = "USADO";

        System.out.println("\n" + "Nome: " + carro2.name + "\n" + "Ano: " + carro2.ano + "\n"+ "Cor: " + carro2.cor + "\n" + "peso: " + carro2.peso + " kg" + "\n" + "Estado do carro: " + carro2.estado + "\n");
        System.out.println(carro2.hashCode());
        carro2.frear();
    }
}
