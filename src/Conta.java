public class Conta{

    //atributos=variáveis
    private String agencia;
    private String numero;
    private String cpf;
    private String titular;
    private double saldo;

    public Conta(String agencia, String numero, String cpf, String titular){
        setCpf(cpf);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta(String numero, String cpf, String titular){
        this.numero = numero;
        this.cpf = cpf;
        this.titular = titular;
        this.agencia = "1111";
    }

    private void setCpf(String cpf){
        if(!cpf.isEmpty() && !cpf.isBlank()){
            if(cpf.length() == 14){
                this.cpf = cpf;
            }
        }
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    //métodos=função
    void sacar(double valor){
        saldo = saldo - valor;
    }

    void depositar(double valor){
        saldo = saldo + valor;
    }

    public String toString(){
        String str;

        str =   "\n\tAgencia:"+agencia+
                "\n\tNumero:"+numero+
                "\n\tTitular:"+titular+
                "\n\tCpf:"+cpf+
                "\n\tSaldo:"+saldo;
        
        return str;
    }

}