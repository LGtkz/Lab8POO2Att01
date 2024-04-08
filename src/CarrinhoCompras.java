import java.util.ArrayList;

public class CarrinhoCompras {
    ArrayList<Item> itens = new ArrayList<Item>();

    public void adicionaItem(Item item){
        itens.add(item);
    }
    public void removeItem(Item item){
        itens.remove(item);
    }

    public double calculaTotal(){
        double sum = 0;
        for(Item item: itens){
            sum += item.getPreco();
        }
        return sum;
    }


    public double calculaFrete(int tipoFrete) {
        int frete = 0;
        if(tipoFrete == 0)
            frete = 34;
        else{
            frete = 10;
        }
        double total = calculaTotal();
        return frete + total;
    }
    public void realizaPagamento(PagamentoStrategy strategy, int tipo){
        double total = calculaFrete(tipo);
        strategy.pagar(total);
    }
}
