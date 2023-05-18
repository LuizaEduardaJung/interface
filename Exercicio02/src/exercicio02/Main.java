
package exercicio02;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Ataque soco = new Soco();
        soco.executar();
        
        Ataque chute = new Chute();
        chute.executar();
        
        Ataque especial = new Especial();
        especial.executar();
    }
    
}
