// Cliente.java
package principal;

public class Cliente {
    String nome;
    String cpf;
    Pedido pedido;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, Pedido pedido) {
        this.nome = nome;
        this.cpf = cpf;
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Pedido: " + pedido.toString() +
                ", Valor Total: " + pedido.calcularValorTotal();
    }
}
