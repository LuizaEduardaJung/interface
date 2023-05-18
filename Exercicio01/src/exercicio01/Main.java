
package exercicio01;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Pagamento pagCartao = new CartaoCredito();
        pagCartao.realizarPagamento(500);
        
        Pagamento pagPix = new Pix();
        pagPix.realizarPagamento(45);
        
        Pagamento transBancaria = new TransferenciaBancaria();
        transBancaria.realizarPagamento(200);
    }
    
}
