// Questão 2
// Crie uma classe Produto para representar um produto do mundo real. Sua classe deverá conter os seguintes atributos e métodos:
// 1) Um campo de dados privado do tipo String chamado nome, que representará o nome do produto.
// 2) Um campo de dados privado do tipo double chamado precoCusto, que guardará o preço de custo do produto.
// 3) Um campo de dados privado do tipo double chamado precoVenda, que guardará o preço de venda do produto.
// 4) Um campo de dados privado do tipo double chamado margemLucro, que guardará a margem de lucro do produto.
// 5) Métodos públicos get() e set() para os atributos acima. Modifique o método setPrecoVenda() para que o preço de
// venda não seja inferior ao preço de compra. Caso isso aconteça, exiba uma mensagem alertando o usuário.
// 6) Crie um método chamado calcularMargemLucro() que calculará a margem de lucro do produto.
// 7) Crie um método chamado getMargemLucroPorcentagem() que retornará a margem de lucro como percentual.
// Para finalizar, no método main() da classe de teste, crie um novo objeto da classe Produto, peça para o usuário
// informar os preços de custo e de venda e exiba a margem de lucro em moeda e em percentual. Sua saída deverá
// ser algo parecido com o mostrado na imagem abaixo:

package aulas.aula03.atividades;

public class Ex02 {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setNome("Celular");
        p.setPrecoCusto(1000.00);
        p.setPrecoVenda(1543.00);
        p.calcularMargemLucro();
        System.out.println("Margem de lucro: R$" + p.getMargemLucro());
        System.out.println("Margem de lucro em porcentagem: " + p.getMargemLucroPorcentagem() + "%");

    }
}
