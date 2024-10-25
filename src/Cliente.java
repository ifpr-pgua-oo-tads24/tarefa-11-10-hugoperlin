public class Cliente {
    
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public String toString(){
        return "Nome:"+nome+" Cpf:"+cpf;
    }
}
