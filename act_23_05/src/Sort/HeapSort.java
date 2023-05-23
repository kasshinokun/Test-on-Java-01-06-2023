package Sort;

import java.util.*;

public class HeapSort {
    int Array[];//Instancia a variavel para o Array
    private int N;//Tamanho do Array
    public int contM=0;//Exibe as Comparações
    public int contC=0;//Exibe as Movimentações
    public HeapSort() {//constructor default
        Array= new int[10];//tipo e tamanho do Array
        N=Array.length;//Variavel para análise de tamanho
    }
    public HeapSort(int[] array) {//construtor com atribuições
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
    public void GerarArray(int x){
      //declaração do procedimento para preencher vetor

        for(int i=0;i<x;i++){//laço de repetição

            Random x1 = new Random();//Instancia um objeto random

            Array[i]=Math.abs(x1.nextInt(x/2));//atribui a posição o valor aleatorio
            //Obs.:em execução continua apresentou erro, por isto o uso de Math.abs
        }
    }
    //Adaptação de código
    //Construção da Heap para analise
    private void BuildHeap()
    {
        for (int k = 1; k < N; k++)
        {

            //se filho menor que pai
            contC++;
            if (Array[k] < Array[(k - 1) / 2])
            {
                
                int j = k;//Instancia j e atribui o valor de k
                contC++;
                while (Array[j] < Array[(j - 1) / 2])
           //equanto j(filho) menor que j dividido por 2(pai)
                {
                    swap( j, (j - 1) / 2);//realiza a troca
                    contM+=3;
                    j = (j - 1) / 2;//atribui a j o valor do pai
                }
            }
        }
    }
    public void swap(int a, int b) {//declaração do procedimento de troca de posições
        int temp = Array[a];//Atribuição de valor de Array[a] a temp
        Array[a] = Array[b];//Atribuição de valor de Array[b] a Array[a] 
        Array[b] = temp;//Atribuição de valor de Array[b] a temp
    }
    //adaptação de codigo C
    public void Heap_Sort(){//Prodedimento para Heap Sort em ordem crescente
        
        for(int i=N/2-1;i>0;i--){
            ordenate_heap(i,N-1);//envia valores para construir a heap e ordenar
        }
        for(int i=N-1;i>0;i--){
            swap(0,i);//troca a posição i com o valor na posição 0 do vetor
            contM+=3;
            ordenate_heap(0,i-1);
            //envia valores 0 e (i-1) para construir a heap e ordenar
        }
        System.out.println("Movimentacoes: "+contM+"\tComparacoes: "+contC);
        //Exibir_Heap(N);//Exibe Array em Heap
        contM=0;//Exibe as Comparações
        contC=0;
        
    }
    //adaptação de codigo C
    private void ordenate_heap(int i, int f){//Ordena a heap em ordem crescente
        int aux=Array[i];//variavel para analisar a heap
        int j=i*2+1;//variavel para analisar filho a esquerda
        while(j<=f){//enquanto j menor/igual a f(não for maior que o intervalo)
            contC++;
            if(j<f){//se j menor que o intervalo
                contC++;
                if(Array[j]<Array[j+1]){//filho a direita for maior que filhoa aesquerda
                    j++;//incrementa o j
                }
            }
            contC++;
            if(aux<Array[j]){//se pai menor que filho
                Array[i]=Array[j];//troca os valores
                contM++;
                i=j;//i recebe o valor de j
                j=2*i+1;//j é refeito para localizar proximo filho a esquerda
            }else{//senão
                j=f+1;//usa-se o valor do intervalo para configurar j
            }
        
        }contM++;
        Array[i]=aux;//ao final Arrai[i](valor-base)recebe aux
    }
    
}
