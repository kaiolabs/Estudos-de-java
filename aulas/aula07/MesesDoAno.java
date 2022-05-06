package aulas.aula07;

public class MesesDoAno {
//     Crie enumeradores para os meses do ano retornando o número
//     referente ao mês quando chamada a função getNumber. Use uma
//     classe Teste para executar a enumeração acima.

    public enum Meses {
        JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO;

        public int getNumber() {
            switch (this) {
                case JANEIRO:
                    return 1;
                case FEVEREIRO:
                    return 2;
                case MARCO:
                    return 3;
                case ABRIL:
                    return 4;
                case MAIO:
                    return 5;
                case JUNHO:
                    return 6;
                case JULHO:
                    return 7;
                case AGOSTO:
                    return 8;
                case SETEMBRO:
                    return 9;
                case OUTUBRO:
                    return 10;
                case NOVEMBRO:
                    return 11;
                case DEZEMBRO:
                    return 12;
                default:
                    return 0;
            }
        }
    }
}

        
