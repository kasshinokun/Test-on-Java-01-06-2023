package com.teste.preview_aula_11;
//Codigo da classe Dados das atividades 02 e 03 
//adaptado para atividade 11 

import java.util.*;


public class Heap_Sort {//declaração da classe Dados
	int Array[];//Instancia a variavel para o Array
	private int N;//Tamanho do Array
	
	public Heap_Sort() {//constructor default
	  	Array= new int[10];//tipo e tamanho do Array
		N=Array.length;//Variavel para análise de tamanho
	}
	public Heap_Sort(int[] array) {//construtor com atribuições
	  	Array=array;//Instancia a nova variavel para o Array baseada no constructor default
		N=Array.length;//Variavel para análise de tamanho
	}
	public void ImprimirArray() {//Impressão dos componentes do Array
	  	for(int i=0;i<N;i++) {//laço para percorrer o Array
	  		System.out.println("Posicao "+i+": "+Array[i]);//executa a impressão do Array
		}
	}
	public void GerarArray(int x){
	  //declaração do procedimento para preencher vetor
	  	
	  	for(int i=0;i<x;i++){//laço de repetição
	  		
	  		Random x1 = new Random();//Instancia um objeto random
	  		
	          Array[i]=1 +x1.nextInt(x/2);//atribui a posição o valor aleatorio
	      }
	}
	public void Heap(int M) {//Impressão dos componentes do Array em Heap
	  	int i=1, j=0;//instancia os contadores com valores predefinidos
	  	System.out.println();//Salta linha
	  	for(j=0;j<M;i++){//laço para exibição em Heap
	  		for(;j<(Math.pow(2, i)-1)&&j<M;j++) {//Calculo para a Heap
	  			System.out.print("0"+(j)+": "+Array[j]+" ");//executa a impressão do Array
	  		}System.out.println();//Salta linha
	  	}
	}
	//Conversão de código recursivo de:
	//https://www.geeksforgeeks.org/heap-sort/
	public void HeapSort() {
		
        System.out.println();
        for(int k=N/2-1;k>=0;k--){

        int Dir=2*k+2;//Variavel para itens a direita no Array
      	int Esq=2*k+1;//Variavel para itens a esquerda no Array
      	
      	/*====Analise de codigo apenas
      	System.out.print(k+" ");
          
          if(Esq<N){
          
          	System.out.print(Esq+" ");  
          }
          if(Dir<N){
          	System.out.print(Dir); 
          }
          */
      	if(Esq<N&&Array[Esq]>=Array[k]){
      		swap(Esq,k);
          }
      	if(Dir<N&&Array[Dir]>=Array[k]){
      	   swap(Dir,k);
      	}
      	/*==Opção 2:
      	 if(Dir<N){
        		if(Array[Dir]>Array[Esq]) {
        			swap(Dir,Esq);
        		}
        	}
    	if(Esq<N&&Array[Esq]>Array[k]){
    		swap(Esq,k);
        }
      	  
      	 */
      	//====Analise de codigo apenas
      	//System.out.println("ok");
		}
  	
	  }
		public void swap(int a, int b) {//declaração do procedimento de troca de posições
	      int temp = Array[a];//Atribuição de valor de Array[a] a temp
	      Array[a] = Array[b];//Atribuição de valor de Array[b] a Array[a] 
	      Array[b] = temp;//Atribuição de valor de Array[b] a temp
	  }
    	
	/* 
	 * Codigo base 
	 * https://www.geeksforgeeks.org/heap-sort/
	 */
	public void Teste_HeapSort(int arr[]){
		int N = arr.length;

		// Constroi a Heap (reorganiza o array)
		for (int i = N / 2 - 1; i >= 0; i--)
      	Teste_heapify(arr, N, i);

      	//Extrai elementos 1 por 1 a partir da Heap
      	for (int i = N - 1; i > 0; i--) {
          	// Move o elemento atual para o fim
    	  	int temp = arr[0];
          	arr[0] = arr[i];
          	arr[i] = temp;

          	//Chama max heapify na Heap reduzida
          	Teste_heapify(arr, i, 0);
      	}
      	Heap_Sort heavy=new Heap_Sort(arr);
  		heavy.Heap(N);
  		heavy.ImprimirArray();
    }

	// Para heapify uma sub-Heap gerida com o nodo i que é
	// um index no array. n é o tamanho da Heap
	public void Teste_heapify(int arr[], int N, int i){
      
  		int largest = i; // Inicializa largest como base
  		int l = 2 * i + 1; // esquerda = 2*i + 1
  		int r = 2 * i + 2; // direita = 2*i + 2

  		// Se filho a esquerda é maior do que largest
		if (l < N && arr[l] > arr[largest])
			largest = l;

  		// Se filho a direita é maior do que largest 
  		if (r < N && arr[r] > arr[largest])
      		largest = r;

  		// se largest não for mais a base 
	  	if (largest != i) {
	      	int swap = arr[i];
	      	arr[i] = arr[largest];
	      	arr[largest] = swap;

	      	// Recursivamente executa a analise da Sub-Heap afetada
	      	Teste_heapify(arr, N, largest);
            }
  	}
	public static void main(String[] args) {
		System.out.println("=======03 - Heap Sort=========");//Enunciado
		int M=16;//Variavel para tamanho
        
        int[] Teste = new int[M];//Instancia vetor de inteiros de tamanho M
        Heap_Sort i =new Heap_Sort(Teste);//instancia o primeiro vetor do tipo dados
        
        i.GerarArray(M);//Envia e criar valores para as posições de modo aleatorio
        
        i.ImprimirArray();
        i.Heap(M);
        i.HeapSort();
        //i.ImprimirArray();
        i.Heap(M);
	}

}
/*// Java implementation of Iterative Heap Sort
//https://www.geeksforgeeks.org/iterative-heap-sort/

public class HeapSort {

// function build Max Heap where value
// of each child is always smaller
// than value of their parent
private static void buildMaxHeap(int arr[], int n)
{
	for (int i = 1; i < n; i++)
	{
	// if child is bigger than parent
	if (arr[i] > arr[(i - 1) / 2])
	{
		int j = i;

		// swap child and parent until
		// parent is smaller
		while (arr[j] > arr[(j - 1) / 2])
		{
		swap(arr, j, (j - 1) / 2);
		j = (j - 1) / 2;
		}
	}
	}
}

static void HeapSort(int arr[], int n)
{
	buildMaxHeap(arr, n);

	for (int i = n - 1; i > 0; i--)
	{
	// swap value of first indexed
	// with last indexed
	swap(arr, 0, i);

	// maintaining heap property
	// after each swapping
	int j = 0, index;

	do
	{
		index = (2 * j + 1);

		// if left child is smaller than
		// right child point index variable
		// to right child
		if (index < (i - 1) && arr[index] < arr[index + 1])
		index++;

		// if parent is smaller than child
		// then swapping parent with child
		// having higher value
		if (index < i && arr[j] < arr[index])
		swap(arr, j, index);

		j = index;

	} while (index < i);
	}
}

public static void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i]=a[j];
	a[j] = temp;
}

/* A utility function to print array of size n */
/*static void printArray(int arr[])
{
	int n = arr.length;
	for (int i = 0; i < n; i++)
	System.out.print(arr[i] + " ");
	System.out.println();
}

public static void main(String args[])
{
	System.out.println("Ordenacao por Heap Sort: \n");
        
        int arr[] = {10, 20, 15, 17, 9, 21};
	int n = arr.length;

	System.out.print("Vetor antes do Heap Sort: ");
	printArray(arr);

	HeapSort(arr, n);

	System.out.print("Vetor apos o Heap Sort: ");
	printArray(arr);
}*/
/*
===============================================================================
Em processo de adaptação e otimização
*//*
public void Heap_Sort(){
       
        for(int k=N/2;k>=0;k--){

            int Dir=2*k+2;//Variavel para itens a direita no Array
            int Esq=2*k+1;//Variavel para itens a esquerda no Array
            int j=Array[0];//variavel de comparação
            //====Analise de codigo apenas

            
            if(Esq<N){
                //System.out.print(k+" "+j+" "+Esq+" "); 
                if(Dir<N&&Array[Dir]<Array[k]){
                    System.out.println(Array[Dir]);
                    
                }else{
                    //System.out.print(" tem nao");
                }
                if(Array[Esq]>=Array[k]){
                    System.out.println(Array[Esq]);
                }
            }
            if(Array[k]>=Array[j]){
                System.out.println(Array[k]);
            }
            System.out.println();
        }
        System.out.println();
       //Exibir_Heap(N);//exibe em Heap
    }
*/
    //=========================================================================
    //Primeiro Codigo
        /*
        for(int k=N/2;k>=0;k--){
            swap(k,0);
            int Dir=2*k+2;//Variavel para itens a direita no Array
            int Esq=2*k+1;//Variavel para itens a esquerda no Array
           
            if(Dir<N&&Array[Dir]<Array[Esq]){
                swap(Esq,Dir);
                if(Array[Esq]<Array[k]){
                    swap(Esq,k);
                }   
            }else{
                if(Esq<N&&Array[Esq]<Array[k]){
                    swap(Esq,k);
                }
            }
        }
        //segunda tentativa
        int k=0;
        while(k<N){
            int Esq=2*k+1;
            int Dir=2*k+2;
            if(Dir<N&&Esq<N){
               if(Array[Esq] >= Array[Dir]){
                   swap(Esq,Dir);
               }else{
               if(Array[k] <= Array[Dir]){}
                    swap(Dir,k);
               }
               if(Array[k] <= Array[Esq]){
                   swap(Esq,k);
               }
                    
            }else{
                if(Esq<N&&Array[k] <= Array[Esq]){
                   swap(Esq,k);
               }
            }
            k++;
        }
        *//*





===============================================================================
*//*
}
*/
