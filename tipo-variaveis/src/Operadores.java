public class Operadores {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }
        System.out.println("Fim");
        if(condicao1 || condicao2){
            System.out.println("Uma das condições são verdadeiras");
        }
    }
}
