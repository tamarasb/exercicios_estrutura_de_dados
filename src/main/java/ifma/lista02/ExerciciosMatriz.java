package ifma.lista02;

public class ExerciciosMatriz {
    int[][] M = {{1,2,3},{4,5,6},{7,8,9}};
    public void q01(){
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                if(i==j){
                    System.out.print(0+" ");
                    continue;
                }
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public void q02(){
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                if(i+j == M.length-1){
                    System.out.print(0+" ");
                    continue;
                }
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public void q03(){
        for(int i = 0; i < M.length; i++){
            int j = M.length-1-i;
            System.out.print(M[i][j]+" ");
        }
        System.out.println("");
    }
    
    public int q04(){
        int soma = 0;
        for(int i = 0; i < M.length; i++){
            int j = M.length-1-i;
            soma += M[i][j];
        }
        return soma;
    }
    
    public void q05(){
        for(int i = 0; i < M.length; i++){
            for(int j = M[i].length-1-i; j < M[i].length; j++){
                System.out.print(M[i][j]+" ");
            }
        }
    }
    
    public float q06(){
        int count = 0, soma = 0;
        for(int i = 0; i < M.length; i++){
            for(int j = M[i].length-1-i; j < M[i].length; j++){
                soma += M[i][j];
                count++;
            }
        }
        return (float)soma/count;
    }
    
    public void q07(){
        for(int i = 0; i < M.length; i++){
            for(int j = M[i].length-i; j < M[i].length; j++){
                System.out.print(M[i][j]+" ");
            }
        }
    }
    
    public int q08(){
        int tamLinha = M[1].length;
        int maior = M[1][tamLinha-1];
        for(int i = 1; i < M.length; i++){
            for(int j = tamLinha-i; j < tamLinha; j++){
                if(M[i][j] >= maior)
                    maior = M[i][j];
            }
        }
        return maior;
    }

    public void q09(){
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length-i; j++){
                System.out.print(M[i][j]+" ");
            }
        }
    }
    
    public int q10(){
        int menor = M[0][0];
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length-i; j++){
                if(M[i][j] < menor)
                    menor = M[i][j];
            }
        }
        return menor;
    }
    
    public void q11(){
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length-i-1; j++){
                System.out.print(M[i][j]+" ");
            }
        }
    }
    
    public int q12(){
        int produto = M[0][0];
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length-i-1; j++)
                produto *= M[i][j];
        }
        return produto;
    }
    
    public void q13(){
        int[][] B = new int[M.length][M[0].length];
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                if(M[i][j] % 2 == 0)
                    B[i][j] = M[i][j]*M[i][j];
                else
                    B[i][j] = (int) Math.pow(M[i][j],3);
                System.out.print(B[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    public void q14(int[][] A){
        for(int i = 0; i < A.length; i++){
            for(int j = A[i].length-1; j >= 0; j--){
                System.out.print(A[j][i]+"\t");
            }
            System.out.println("");
        }
    }
    
    public void q15(int[][] A){
        for(int i = A.length-1; i >= 0; i--){
            for(int j = A[i].length-1; j >= 0; j--){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    public void q16(int[][] A){
        for(int i = A.length-1; i >= 0; i--){
            for(int j = 0; j < A[i].length; j++){
                System.out.print(A[j][i]+"\t");
            }
            System.out.println("");
        }
    }
    
    public void q17(int[][] A){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j+=A.length-1){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    public void q18(int[][] A){
        int[][] Ct = new int[A[0].length][A.length];
        for(int i = 0; i < Ct.length; i++){
            for(int j = 0; j < Ct[i].length; j++){
                Ct[i][j] = A[j][i];
                System.out.print(Ct[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}