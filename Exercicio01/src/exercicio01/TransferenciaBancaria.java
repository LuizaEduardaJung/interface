
package exercicio01;

public class TransferenciaBancaria implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagou com trasnferência" + valor); 
    }
    
}
