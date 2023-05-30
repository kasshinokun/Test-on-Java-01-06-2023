package Sort;
import java.util.*;
public class QuickSort{
    
    int Array[];//Instancia a variavel para o Array
    int N;//Tamanho do Array
    int contM=0;
    int contC=0;
    
    public QuickSort() {//constructor default
        Array= new int[10];//tipo e tamanho do Array
        N=Array.length;//Variavel para análise de tamanho
    }
    public QuickSort(int[] array) {//construtor com atribuições
        Array=array;//Instancia a nova variavel para o Array baseada no constructor default
        N=Array.length;//Variavel para análise de tamanho
    }
    public void ImprimirArray() {//Impressão dos componentes do Array
            for(int i=0;i<N;i++) {//laço para percorrer o Array
                System.out.println("Posicao "+i+": "+Array[i]);//executa a impressão do Array
            }
    }
    public void ImprimirArray2() {//Impressão dos componentes do Array
        System.out.println();       
        for(int i=0;i<N;i++) {//laço para percorrer o Array
            System.out.print(Array[i]+" ");//executa a impressão do Array
        }System.out.println(); 
    }
    public void quicksort(){
       Quicksort(0, N-1);
       
    }
    public void print(){
        System.out.println("Movimentacoes: "+contM+"\tComparacoes: "+contC);
    }
    private void Quicksort(int esq, int dir){
        int i=esq;
        int j=dir;
        int pivo=Array[(esq+dir)/2];
        while(i<=j){
            contC++;
            while(Array[i]<pivo){
                contC++;
                i++;
            }
            while(Array[j]>pivo){
                contC++;
                j--;
            }
            contC++;
            if(i<=j){
                
                swap(i,j);
                contM+=3;
                i++;
                j--;
            }
        }
        if(esq<j){
            Quicksort(esq,j);
        }
        if(i<dir){
            Quicksort(i,dir);
        }
        
    }
    public void swap(int a, int b) {//declaração do procedimento de troca de posições
        int temp = Array[a];//Atribuição de valor de Array[a] a temp
        Array[a] = Array[b];//Atribuição de valor de Array[b] a Array[a] 
        Array[b] = temp;//Atribuição de valor de Array[b] a temp
    }

}
