package aulas.aula04.Aividades;

public class EX02 {
    public static void main(String[] args) {

        // A distância média da Terra à Lua é de aproximadamente 382.000 quilômetros. Usando a classe com métodos estáticos escreva um programa em Java que mostre qual é a distância média da Terra à Lua em milhas e pés.

        double quilômetros =  382.000;

        double milhas = ConversaoDeUnidadesDeArea.kmToMi(quilômetros);
        System.out.println("\n" + quilômetros + " quilômetros = " + Math.round(milhas) + " milhas");

        double pes = ConversaoDeUnidadesDeArea.kmToFt(quilômetros);
        System.out.println("\n" + quilômetros + " quilômetros = " + Math.round(pes) + " pés");

        System.out.println("\n");
    }
}
