// Cliente.java
package principal;

public class Cliente {
    String nome;
    String cpf;
    Pedido pedido;

    // Construtor padrão vazio
    public Cliente() {

    }

    // Construtor com parâmetros para inicializar um Cliente com nome, CPF e Pedido
    public Cliente(String nome, String cpf, Pedido pedido) {
        this.nome = nome;
        this.cpf = cpf;
        this.pedido = pedido;
    }

    // Sobrescrita do método toString para exibir informações do Cliente e seu Pedido
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Pedido: " + pedido.toString() +
                ", Valor Total: " + pedido.calcularValorTotal();
    }
}
