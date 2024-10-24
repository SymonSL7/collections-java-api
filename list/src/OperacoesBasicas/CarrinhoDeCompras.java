package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoLista;

    public CarrinhoDeCompras() {
        this.carrinhoLista = new ArrayList<>();
    } 


    public void adicionarItem(String nome, Double preco, Integer quantidade){
        carrinhoLista.add(new Item(nome, preco, quantidade));
    }


    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinhoLista.isEmpty()) {
          for (Item i : carrinhoLista) {
            if (i.getNome().equalsIgnoreCase(nome)) {
              itensParaRemover.add(i);
            }
          }
          carrinhoLista.removeAll(itensParaRemover);
        } else {
          System.out.println("A lista está vazia!");
        }
    }


    public Double calcularValorTotal() {
        Double valorTotal = 0d;
        if (!carrinhoLista.isEmpty()) {
          for (Item item : carrinhoLista) {
            Double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
          }
          return valorTotal;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!carrinhoLista.isEmpty()) {
          System.out.println(this.carrinhoLista);
        } else {
          System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        
    // Criando uma instância do carrinho de compras
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

    }

}
