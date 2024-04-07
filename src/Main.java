public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionaItem(new Item(200,"livro x") );
        carrinho.adicionaItem(new Item(350, "tenis y"));

        PagamentoStrategy strategy = new Cartao();

        carrinho.realizaPagamento(strategy);
    }
}