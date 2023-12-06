// Pedido.java
package principal;

public class Pedido {
    String nomeProduto;
    int quantidade;
    double preco;

    public Pedido(String nomeProduto, int quantidade, double preco) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double calcularValorTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto + ", Quantidade: " + quantidade + ", Preço: " + preco +
               ", Valor Total: " + calcularValorTotal();
    }
}
