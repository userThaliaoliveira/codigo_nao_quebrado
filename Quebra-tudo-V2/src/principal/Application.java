// Application.java
package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Nome do cliente: ");
            String nomeCliente = sc.nextLine();
            System.out.println("CPF do cliente: ");
            String cpf = sc.nextLine();
            
            System.out.println("Pedido do cliente:");
            String nomeProduto = sc.nextLine();
            System.out.println("Quantidade: ");
            int quantidade = Integer.parseInt(sc.nextLine());
            System.out.println("Preço unitário: ");
            double preco = Double.parseDouble(sc.nextLine());
            
            Pedido pedido = new Pedido(nomeProduto, quantidade, preco);
            clientes.add(new Cliente(nomeCliente, cpf, pedido));
        }

        System.out.println("Lista de Clientes e Pedidos:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.nome + " - " + cliente.pedido.toString());
        }

        sc.close();
    }
}
