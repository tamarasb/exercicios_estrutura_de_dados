package ifma.lista01;

public class TestarAlunos {

    public static void main(String[] args) {
        CadastrarAlunos cadastro = new CadastrarAlunos(5);
        cadastro.adicionarNoFinal(new Aluno(1,"1111","aluno1"));
        cadastro.adicionarNoFinal(new Aluno(2,"2222","aluno2"));
        cadastro.adicionarNoInicio(new Aluno(4,"4444","aluno4"));
        cadastro.adicionarNoInicio(new Aluno(3,"3333","aluno3"));
        cadastro.adicionarNoFinal(new Aluno(5,"5555","aluno5"));
       
        System.out.println("Alunos cadastrados:");
        for(int i = 0; i < cadastro.size; i++){
            System.out.printf(cadastro.alunos[i].getCodigo()+" - ");
            System.out.printf(cadastro.alunos[i].getMatricula()+" - ");
            System.out.println(cadastro.alunos[i].getNome());
        }
        System.out.println("\nVetor ordenado por codigo:");
        cadastro.ordenarVetor();

        cadastro.removerNoInicio();
        cadastro.removerNoFinal();
        cadastro.removerComIndice(2);
       
        System.out.println("\nAlunos cadastrados:");
        for(int i = 0; i < cadastro.size; i++){
            System.out.printf(cadastro.alunos[i].getCodigo()+" - ");
            System.out.printf(cadastro.alunos[i].getMatricula()+" - ");
            System.out.println(cadastro.alunos[i].getNome());
        }
        System.out.println("\nVetor ordenado por codigo:");
        cadastro.ordenarVetor();
    }
}
