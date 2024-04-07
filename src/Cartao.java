public class Cartao implements PagamentoStrategy{
    @Override
    public void pagar(double total) {
        System.out.println("Pagamento feito com cartão de " + total);
    }

}
