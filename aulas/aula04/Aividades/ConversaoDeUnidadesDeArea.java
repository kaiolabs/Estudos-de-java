package aulas.aula04.Aividades;

public class ConversaoDeUnidadesDeArea {

    // Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para conversão das unidades de área segundo a lista abaixo.

    // 1 metro quadrado = 10.76 pés quadrados
    public static double metrosQuadradosParaPesQuadrados(double metrosQuadrados) {
        return metrosQuadrados * 10.76;
    }

    // 1 pé quadrado = 929 centímetros quadrados
    public static double pesQuadradosParaCentimetrosQuadrados(double pesQuadrados) {
        return pesQuadrados * 929;
    }

    // 1 milha quadrada = 640 hectares
    public static double milhasQuadradasParaHectares(double milhasQuadradas) {
        return milhasQuadradas * 640;
    }

    // 1 hectare = 43560 pés quadrados
    public static double hectaresParaPesQuadrados(double hectares) {
        return hectares * 43560;
    }

    
    // A distância média da Terra à Lua é de aproximadamente 382.000 quilômetros. Usando a classe com métodos estáticos escreva um programa em Java que mostre qual é a distância média da Terra à Lua em milhas e pés.

    // Qilometros para milhas
    public static double kmToMi(double km) {
        return km * 0.621371;
    }

    // Qilometros para pés
    public static double kmToFt(double km) {
        return km * 3280.84;
    }

}

