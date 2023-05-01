
public class App {
    public static void main(String[] args) throws Exception {

        Conta contaThiago = new Conta();

        System.out.println("Hello, World!");

        System.out.println(contaThiago.saldo);

        contaThiago.sacar(830.00);

        System.out.println(contaThiago.saldo);

        


    }
}
