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

        conta1 = new Conta("456", "456", "Maria");
        banco.adicionar(conta1);

        conta1 = new Conta("789", "789", "Hum");
        banco.adicionar(conta1);

        String retorno = banco.depositar("1111", "123", 100);
        System.out.println(retorno);

        retorno = banco.sacar("1111", "123", 50);
        System.out.println(retorno);


        System.out.println(banco);


    }

}
