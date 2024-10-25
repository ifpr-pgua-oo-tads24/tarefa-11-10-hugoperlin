public class Banco {
    
    private String nome;
    private Conta[] contas;

    private int posicaoLivre = 0;

    public Banco(String nome, int quantideContas){
        this.nome = nome;
        this.contas = new Conta[quantideContas]; // criando as posições do vetor
    }


    public boolean adicionar(Conta nova){
        if(posicaoLivre < contas.length){
            contas[posicaoLivre] = nova;
            posicaoLivre += 1;

            return true;
        }

        return false;
        
    }


    private Conta buscarAgenciaNumero(String agencia, String numero){
        
        for(int i=0;i<contas.length;i++){
            if(contas[i] != null &&
               contas[i].getAgencia().equals(agencia) && 
               contas[i].getNumero().equals(numero)){
                return contas[i];
            }
        }

        return null;
    }


    public String depositar(String agencia, String numero, double valor){
        //buscar a conta pela agencia e numero
        //se achou a conta, invocar o metodo depositar da conta passando o valor

        //buscar a conta
           //percorrer o vetor de contas e em cada posicao comparar a agencia e numero
        
        Conta conta = buscarAgenciaNumero(agencia, numero);
        if(conta != null){
            conta.depositar(valor);
            return "Deposito realizado";
        }
        return "Conta não encontrada";
    }

    public String sacar(String agencia, String numero, double valor){
        //buscar uma conta com a agencia e numero
        //se encontrou invocar o método sacar da conta passando valor
        
        Conta conta = buscarAgenciaNumero(agencia, numero);
        if(conta != null){
            conta.sacar(valor);
            return "Saque realizado!";
        }
        return "Conta não encontrada!";
        /* 
        for(int i=0;i<contas.length;i++){
            if(contas[i] != null){
                if(contas[i].getAgencia().equals(agencia) &&
                   contas[i].getNumero().equals(numero)){
                        contas[i].sacar(valor);
                        return "Saque realizado!";
                   }
            }
        }
        return "Conta não encontrada!";
        */
    }


    public String toString(){
        String str = "Contas:\n";

        for(int i=0;i<contas.length;i++){
            str +="--------\n";
            if(contas[i] != null){
                str += contas[i].toString() +"\n";
            }else{
                str += "\tVazio!\n";
            }
            
        }

        return str;
    }

}
