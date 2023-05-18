
package exercicio01;

public class CartaoCredito implements Pagamento{

    @Override
    public void realizarPagamento(double valor) {
        
        System.out.println("Pagou com cartão" + valor);
    }   
}
