public class BoletoPagamento implements PagamentoStrategy{

    @Override
    public void pagar(double total) {
        System.out.println("Pagamento via Boleto de " + total);
    }
}
