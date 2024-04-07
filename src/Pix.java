public class Pix implements PagamentoStrategy{
    @Override
    public void pagar(double total) {
        System.out.println("Efetuando pagamento via pix");
    }
}
