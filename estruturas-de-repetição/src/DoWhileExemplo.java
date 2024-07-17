import java.util.Random;
public class DoWhileExemplo {
    public static void main(String[] args) {
        System.out.println("DISCANDO...");
        do { 
            System.out.println("Telefone tocando");

        } while (tocando());
        System.out.println("Alôôô");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu?" + atendeu);
        return ! atendeu;
    }
}
