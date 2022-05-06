package aulas.aula07;

public class MesesDoAnoV2 {
//     Crie enumeradores para os meses do ano retornando o número
//     referente ao mês quando chamada a função getNumber. Use uma
//     classe Teste para executar a enumeração acima.

    public enum Meses {
        JANEIRO(1), FEVEREIRO(2), MARCO(3), ABRIL(4), MAIO(5), JUNHO(6), JULHO(7), AGOSTO(8), SETEMBRO(9), OUTUBRO(10), NOVEMBRO(11), DEZEMBRO(12);

        private int numero;

        Meses(int numero) {
            this.numero = numero;
        }

        public int getNumber() {
            return numero;
        }

        public boolean getFerias() {
            if (this == DEZEMBRO || this == JANEIRO || this == FEVEREIRO) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}

        
