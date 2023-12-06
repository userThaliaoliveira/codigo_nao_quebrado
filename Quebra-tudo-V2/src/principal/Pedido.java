// Pedido.java
package principal;

public class Pedido {
    String nomeProduto;
    int quantidade;
    double preco;

    // Construtor para inicializar um Pedido com nome do produto, quantidade e preço
    public Pedido(String nomeProduto, int quantidade, double preco) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Método para calcular o valor total do pedido (quantidade * preço)
    public double calcularValorTotal() {
        return quantidade * preco;
    }

    // Sobrescrita do método toString para exibir informações do Pedido
    @Override
    public String toString() {
        return "Produto: " + nomeProduto + ", Quantidade: " + quantidade + ", Preço: " + preco +
               ", Valor Total: " + calcularValorTotal();
    }
}
