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

    public void realizaPagamento(PagamentoStrategy strategy){
        double total = this.calculaTotal();
        strategy.pagar(total);
    }
}
