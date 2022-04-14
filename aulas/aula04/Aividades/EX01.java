package aulas.aula04.Aividades;

public class EX01 {
    public static void main(String[] args) {

        // Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para conversão das unidades de área segundo a lista abaixo.

        double x = 10;

        double m = ConversaoDeUnidadesDeArea.metrosQuadradosParaPesQuadrados(x);
        System.out.println("\n" + x + " metros quadrados = " + m + " pes quadrados");

        double p = ConversaoDeUnidadesDeArea.pesQuadradosParaCentimetrosQuadrados(x);
        System.out.println("\n" + x + " pes quadrados = " + p + " centimetros quadrados");

        double h = ConversaoDeUnidadesDeArea.milhasQuadradasParaHectares(x);
        System.out.println("\n" + x + " milhas quadradas = " + h + " hectares");

        double c = ConversaoDeUnidadesDeArea.hectaresParaPesQuadrados(x);
        System.out.println("\n" + x + " hectares = " + c + " pes quadrados");

        System.out.println("\n");

        
        
    }
}
