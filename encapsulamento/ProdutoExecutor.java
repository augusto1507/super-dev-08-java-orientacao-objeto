package encapsulamento;

import javax.swing.JOptionPane;

public class ProdutoExecutor {
    public void executar() {
        Produto produtoA = new Produto();

        produtoA.setNome("bola");
        produtoA.setPreco(8.50);
        produtoA.setQuantidade(50);

        Produto produtoB = new Produto();

        produtoB.setNome("carrinho");
        produtoB.setPreco(11.30);
        produtoB.setQuantidade(100);

        JOptionPane.showMessageDialog(null, 
            "=== Produto A ===\n" +
            "Nome: " + produtoA.getNome() +
            "\nPreço: " + produtoA.getPreco() +
            "\nQuantidade: " + produtoA.getQuantidade() + "\n\n\n" +
            "=== Produto B ===\n" +
            "Nome: " + produtoB.getNome() +
            "\nPreço: " + produtoB.getPreco() +
            "\nQuantidade: " + produtoB.getQuantidade() 
        );
    }
}
