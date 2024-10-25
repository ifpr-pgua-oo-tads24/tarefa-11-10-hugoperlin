public class AppEscola {
    
    public static void main(String[] args) {
        Escola escola = new Escola("Teste");

        for(int i=0;i<5;i++){
            Aluno a = new Aluno("1234"+i, "Zé"+i, "ze@teste.com"+i, 1999);
            System.out.println(escola.adicionarAluno(a));

        }
        
        System.out.println(escola.toString());

        escola.removerAluno("12342");

        System.out.println(escola.toString());
    }
}
