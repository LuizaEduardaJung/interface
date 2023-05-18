
package exercicio03;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        CalculoSalario analista = new Analista();
        analista.calcularSalario();
        
        CalculoSalario desenvolvedor = new Desenvolvedor();
        desenvolvedor.calcularSalario();
        
        CalculoSalario gerente = new Gerente();
        gerente.calcularSalario();
    }
    
}
