package ifma.lista01;

public class CadastrarAlunos {
    Aluno[] alunos;
    int size;
    
    public CadastrarAlunos(int tam){
        this.size = 0;
        alunos = new Aluno[tam];
    }
    
    public void adicionarNoFinal(Aluno aluno){
        if(size == alunos.length){
            throw new RuntimeException("Sem espaco no array!");
        }
        alunos[size] = aluno;
        size++;
    }
    
    public void adicionarNoInicio(Aluno aluno){
        if(size == alunos.length){
            throw new RuntimeException("Sem espaco no array!");
        }
        
        for (int i = size; i > 0; i--) {
            alunos[i] = alunos[i - 1];
        }
        alunos[0] = aluno;
        size++;
    }
    
    public void removerNoFinal(){
        if(size == 0){
            throw new RuntimeException("Array vazio!");
        }
        
        alunos[size - 1] = null;
        size--;
    }
    
    public void removerNoInicio(){
        if(size == 0){
            throw new RuntimeException("Array vazio!");
        }
        
        for (int i = 0; i < size - 1; i++) {
            alunos[i] = alunos[i + 1];
        }
        alunos[size - 1] = null;
        size--;
    }
    
    public boolean verificarIndice(int indice){
        if(indice < alunos.length && alunos[indice] != null){
            return true;
        }
        return false;
    }
    
    public String removerComIndice(int indice){
        if(!verificarIndice(indice)){
            throw new RuntimeException("Posicao no array está vazia "
                    + "ou indice maior que o tamanho do vetor.");
        }
        
        String nome = alunos[indice].getNome();
        if(indice == 0){
            removerNoInicio();
        }else if(indice == size - 1){
            removerNoFinal();
        }else{
            for (int i = indice; i < size-1; i++) {
                alunos[i] = alunos[i + 1];
            }
            alunos[size - 1] = null;
            size--;
        }
        return nome;
    }
    
    public void ordenarVetor(){
        Aluno[] sorted = new Aluno[size];
        for (int i = 0; i < size; i++) {
            sorted[i] = alunos[i];
        }
        
        int changes = 0;
        for (int i = 0; i < size-1; i++) {
            if(sorted[i].getCodigo() > sorted[i+1].getCodigo()){
                Aluno temp = sorted[i];
                sorted[i] = sorted[i+1];
                sorted[i+1] = temp;
                changes++;
            }
            if(i == size -2 && changes != 0){
                i = -1;
                changes = 0;
            }
        }
        for(int i = 0; i < size; i++){
           System.out.printf(sorted[i].getCodigo()+" - ");
           System.out.printf(sorted[i].getMatricula()+" - ");
           System.out.println(sorted[i].getNome());
        }
    }
}
