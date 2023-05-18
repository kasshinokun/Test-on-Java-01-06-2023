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
    public void quicksort(int esq, int dir){
        int i=esq;
        int j=dir;
        int pivo=Array[(esq+dir)/2];
        while(i<=j){
            while(Array[i]<pivo){
                i++;
            }
            while(Array[j]>pivo){
                j--;
            }
            if(i<=j){
                swap(i,j);
                i++;
                j--;
            }
        }
        if(esq<j){
            quicksort(esq,j);
        }
        if(i<dir){
            quicksort(i,dir);
        }
    
    }
    public void swap(int a, int b) {//declaração do procedimento de troca de posições
        int temp = Array[a];//Atribuição de valor de Array[a] a temp
        Array[a] = Array[b];//Atribuição de valor de Array[b] a Array[a] 
        Array[b] = temp;//Atribuição de valor de Array[b] a temp
    }

}
