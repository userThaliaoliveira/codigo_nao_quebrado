// Application.java
package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // Inicialização do Scanner para leitura do console
        Scanner sc = new Scanner(System.in);
        
        // Lista para armazenar os clientes e seus pedidos
        List<Cliente> clientes = new ArrayList<>();
        
        // Loop para inserir dados de 3 clientes
        for (int i = 0; i < 3; i++) {
            System.out.println("Nome do cliente: ");
            String nomeCliente = sc.nextLine();
            System.out.println("CPF do cliente: ");
            String cpf = sc.nextLine();
            
            System.out.println("Pedido do cliente:");
            System.out.println("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.println("Quantidade: ");
            int quantidade = Integer.parseInt(sc.nextLine());
            System.out.println("Preço unitário: ");
            double preco = Double.parseDouble(sc.nextLine());
            
            // Criação de um objeto Pedido com os dados inseridos
            Pedido pedido = new Pedido(nomeProduto, quantidade, preco);
            
            // Criação de um objeto Cliente com os dados inseridos e o Pedido associado
            clientes.add(new Cliente(nomeCliente, cpf, pedido));
        }

        // Exibição da lista de Clientes e seus Pedidos
        System.out.println("Lista de Clientes e Pedidos:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.nome + " - " + cliente.pedido.toString());
        }

        // Fechar o Scanner para evitar vazamento de recursos
        sc.close();
    }
}
