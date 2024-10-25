public class Escola {
    private String nome;
    private Aluno[] alunos;

    public Escola(String nome){
        this.nome = nome;
        this.alunos = new Aluno[20];
    }

    private int posicaoLivre(){
        for(int i=0;i<alunos.length;i++){
            if(alunos[i] == null){
                return i;
            }
        }
        return -1;
    }

    public boolean adicionarAluno(Aluno a){

        Aluno busca = buscarAlunoCpf(a.getCpf());
        if(busca != null){
            return false;
        }

        /*if(buscarAlunoCpf(a.getCpf())!=null){
            return false;
        }*/

        int posicaoLivre = posicaoLivre();

        if(posicaoLivre == -1){
            return false;
        }

        alunos[posicaoLivre] = a;
        return true;
    }

    public Aluno buscarAlunoNome(String nome){
        for(int i=0;i<alunos.length;i++){
            if(alunos[i] != null && alunos[i].getNome().equals(nome)){
                return alunos[i];
            }
        }
        return null;
    }


    public Aluno buscarAlunoCpf(String cpf){
        for(int i=0;i<alunos.length;i++){
            if(alunos[i] != null && alunos[i].getCpf().equals(cpf)){
                return alunos[i];
            }
        }
        return null;
    }


    public boolean removerAluno(String cpf){
        
        for(int i=0;i<alunos.length;i++){
            if(alunos[i] != null && alunos[i].getCpf().equals(cpf)){
                alunos[i] = null;
                return true;
            }
        }
        return false;
        
        
    }

    public String toString(){
        String str="";

        str += "Nome:"+nome+"\nAlunos:\n";
        if(posicaoLivre() == 0){
            str += "\tSem alunos!";
        }else{
            for(int i=0;i<alunos.length;i++){
                if(alunos[i] != null){
                    str += alunos[i].toString();
                }
            }    
        }

        return str;
    }
}
