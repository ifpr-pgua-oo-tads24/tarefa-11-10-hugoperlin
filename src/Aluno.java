public class Aluno {
    
    private String cpf;
    private String nome;
    private String email;
    private int anoNascimento;

    public Aluno(String cpf, String nome, String email, int anoNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.anoNascimento = anoNascimento;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String toString(){
        return "\tCpf:"+cpf+"\n\tNome:"+nome
               +"\n\tEmail:"+email+"\n\tAno Nascimento:"+anoNascimento+"\n";
    }

    
}
