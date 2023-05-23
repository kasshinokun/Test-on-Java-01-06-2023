package Sort;

import java.util.*;

public class MergeSort {
    int Array[];//Instancia a variavel para o Array
    private int N;//Tamanho do Array
    public int cont=0;//Exibe as contagens
    
    public MergeSort() {//constructor default
            Array= new int[10];//tipo e tamanho do Array
            N=Array.length;//Variavel para análise de tamanho
    }
    public MergeSort(int[] array) {//construtor com atribuições
            Array=array;//Instancia a nova variavel para o Array baseada no constructor default
            N=Array.length;//Variavel para análise de tamanho
    }
    public void ImprimirArray2() {//Impressão dos componentes do Array
        System.out.println();       
        for(int i=0;i<N;i++) {//laço para percorrer o Array
            System.out.print(Array[i]+" ");//executa a impressão do Array
        }System.out.println(); 
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
  public void Merge_sort() {//Procedimento para o Merge sort
      
  	sendArray(0, 14);//Envia com valores predefinidos
  	
        System.out.println("Movimentacoes: "+cont+"\tComparacoes: "+cont);
        cont=0;
  }
  private void sendArray(int esq, int dir) {//recebe o array e executa o merge sort
  	
  	if (esq < dir){//Compara esquerda e direita
          //se esquerda menor....
          
          int meio = (esq + dir) / 2;//Atribui a meio o resultado da divisão da soma
          
          sendArray(esq, meio);//Envia ao procedimento via recurssão

          sendArray(meio + 1, dir);//Envia ao procedimento via recurssão

          Intercalar(esq, meio, dir);//Envia ao procedimento para intercalar
      }
  	
  }
  public void Intercalar(int esq, int meio, int dir) {
  //Procedimento para intercalação do array
  	
  	int nEsq = (meio+1)-esq;//Instancia e atribuir valor atraves
      //da subtração de meio incrementado pelo valor de esquerda
      
  	int nDir = dir - meio;//Instancia e atribuir valor atraves 
      //da subtração de direita pelo valor de meio
  	
  	int iEsq, iDir, i;//Instancia variaveis para analise dos subarrays
  	
  	//Instancia os 2 subarrays
  	int[] arrayEsq = new int[nEsq+1];//Tamanho incrementado baseado na variavel nEsq
  	int[] arrayDir = new int[nDir+1];//Tamanho incrementado baseado na variavel nDir
  	
  	arrayEsq[nEsq] = arrayDir[nDir] = 0x7FFFFFFF;//Sentinela no final dos dois arrays

  	//Inicializa primeiro subarray
  	for (iEsq = 0; iEsq < nEsq; iEsq++){//Executa comparação
          //se iEsq menor....
          arrayEsq[iEsq] = Array[esq+iEsq];
  	}
  	//Inicializa segundo subarray
  	for (iDir = 0; iDir < nDir; iDir++){//Executa comparação
          //se iDir menor....
          arrayDir[iDir] = Array[(meio+1)+iDir];
  	}
  	
  	//Intercalacao dos vetores
  	for (iEsq = iDir = 0, i = esq; i <= dir; i++){//Executa comparações para intercalar

          //Uso do if ternario para analise
          Array[i] = (arrayEsq[iEsq] <= arrayDir[iDir]) ? arrayEsq[iEsq++] : arrayDir[iDir++];
          cont++;//Incrementa o contador
  	}
  	
    }
   
    public void print3(){//exercicio 05
        
        System.out.print("Itens repetidos:");
        for (int i = 0; i <N; i++) {//laço para percorrer o Array a partir de i            
            int multiplo = Array[i];//Instancia e atribui o valor da variavel i a menor
            cont=0;
            for (int j=0; j < N; j++){//laço para percorrer o Array a partir de j
                if (Array[j]==multiplo){//compraração
                    cont++;
                }
            }
            if(cont%3==0){
                System.out.print("\nitem "+multiplo+" Posicao 0"+i);
            }
            
        }
        System.out.println();
    }
}
