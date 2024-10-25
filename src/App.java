public class App {
    



    public static void main(String[] args) {
        
        Banco banco;
        banco = new Banco("Xpto", 3);

        System.out.println(banco.toString());

        Conta conta1;
        conta1 = new Conta("123", "123", "Zé");
        banco.adicionar(conta1);

        conta1 = new Conta("234", "234", "Chico");
        banco.adicionar(conta1);

        Cliente cliente = new Cliente( "Maria","1234");
        banco.adicionar(cliente);

        Cliente cliente2 = new Cliente("Zé","3456");
        banco.adicionar(cliente2);

        Cliente cliente3 = new Cliente("Chico","6789");
        banco.adicionar(cliente3);

        System.out.println(banco);

        System.out.println("Removendo Meio");
        banco.removerCLiente("3456");

        System.out.println(banco);

    }

}
