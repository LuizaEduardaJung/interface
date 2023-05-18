
package exercicio01;

public class Pix implements Pagamento{

    @Override
    public void realizarPagamento(double valor) {
        
        System.out.println("Pagou com pix" + valor);
    }
    
    
}
