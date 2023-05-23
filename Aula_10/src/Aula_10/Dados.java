package Aula_10;

//Simplificação das bibliotecas necessárias
import java.util.*;

//Codigo da classe Dados das atividades 02 e 03 
//adaptado para atividade 10

public class Dados {//declaração da classe Dados
  int Array[];//Instancia a variavel para o Array
  private int N;//Tamanho do Array
  public int cont=0;//Exibe as contagens
  public Dados() {//constructor default
          Array= new int[10];//tipo e tamanho do Array
          N=Array.length;//Variavel para análise de tamanho
  }
  public Dados(int[] array) {//construtor com atribuições
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
  public void Merge_sort() {//Procedimento para o Merge sort
      
  	sendArray(0, N-1);//Envia com valores predefinidos
  	System.out.println("\nMovimentacoes : "+ cont);//exibe o contador
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
  public Dados Soma(Dados a){//Função para criação de vetores, execução do Merge sort 500 vezes
      //e armazenamento de valores em vetor
	    
  	int[] Soma=new int[a.N];//Instancia vetor de inteiros de tamanho 500
      
      //System.out.println("Valor de N:"+a.N);//Aferição do tamanho
      
      for(int i=0;i<Soma.length;i++) {//laço até 500

          GerarArray(15);//gera os array's

          cont=0;//Zera o contador

          sendArray(0, 15);//Envia com valores predefinidos

          Soma[i]=cont;//Armazena  valor do contador na posição.

          //exibe o contador e valor do vetor na posição
          //System.out.println("Valor "+(i+1)+": "+cont+" Vetor"+(i)+": "+Soma[i]);
      }
      a.InsertArray(Soma);//Copiar o vetor de inteiros para o vetor do tipo Dados
      
      return a;//retorna o vetor
  }
  private void InsertArray(int[] Soma){//declaração do procedimento para preencher vetor
      
      for(int i=0;i<Soma.length;i++){//laço de repetição
          
          Array[i]=Soma[i];//atribui a posição o valor de i no vetor Soma
      }
  }
  public double Calcula_Media() {//Media dos componentes do Array
      
      int Soma=0;//Variavel para a soma de componentes do Array
      
      for(int i=0;i<N;i++) {//laço para percorrer o Array
          Soma+=Array[i];//soma de componentes do Array
      }
              
      return Soma/N;//retorna a media(divide soma pelo tamanho) 
  }    
  /*========================================================================*/
  //Outros Metodos de Ordenação
  
  public void Insertion_sort() {//declaração do procedimento de Insertion Sort
      
      int contC=0;//Contador de Comparações 
      int contM=0;//Contador de Movimentações

      for(int i=1; i <N; i++) {//laço de repetição

      int tmp = Array[i];//atribui o valor de Array[i] a temp

      int j = i - 1;//atribui o valor de (i-1) a j

      contC++;//Incrementa Contador de Comparações
      while ( (j >= 0) && (Array[j] > tmp) ){
          //enquanto J maior ou igual a zero......
          //...e....Array na posição j maior que temp....
          contC++;//Incrementa Contador de Comparações

          Array[j + 1] = Array[j]; //atribui o valor de Array[j+1] a Array[j] 
          j--;//decrementa j
          contM++;//Incrementa Contador de Movimentações
      }
      Array[j + 1] = tmp; //atribui o valor de temp a Array[j+1] 
      contM++;//Incrementa Contador de Movimentações
      }
      System.out.println("Movimentacoes: "+contM+"\tComparacoes: "+contC);
  }
  public void Selection_sort1() {//declaração do procedimento de Selection Sort Padrão
      
      int contC=0;//variavel para contador de Comparações
      int contM=0;//variavel para contador de Movimentações
      
      for (int i = 0; i <Array.length; i++){//laço para percorrer o Array a partir de i
          int index = i;//Instancia e atribui o valor da variavel i a index
          
          for (int j = i ; j <Array.length; j++){//laço para percorrer o Array a partir de j
              
              contC++;//Incrementa Contador de Comparações
              if (Array[index]>Array[j]){//compraração
                  contM++;//Incrementa Contador de Movimentações
                  index = j;//se menor, atribui o valor da variavel j a index
              }
          }
          
          int temp = Array[i];//Atribuição de valor de Array[i] a temp
          Array[i] = Array[index];//Atribuição de valor de Array[index] a Array[i] 
          Array[index] = temp;//Atribuição de valor de Array[index] a temp
          
          contM+=3;//Incrementa Contador de Movimentações
      }
      System.out.println("Movimentacoes: "+contM+"\tComparacoes: "+contC);
  }
  public void Selection_sort2(){//declaração do procedimento de Selection Sort Otimizado
      
      int contC=0;//variavel para contador de Comparações
      int contM=0;//variavel para contador de Movimentações
      
      for (int i = 0; i < (N - 1); i++) {//laço para percorrer o Array a partir de i            
          int menor = i;//Instancia e atribui o valor da variavel i a menor
          
          for (int j = (i + 1); j < N; j++){//laço para percorrer o Array a partir de j
              
              contC++;//Incrementa Contador de Comparações
              if (Array[menor] > Array[j]){//compraração
                  contM++;//Incrementa Contador de Movimentações
                  menor = j;//se menor, atribui o valor da variavel j a menor
              }
          }
          swap(menor, i);//envia valores ao procedimento swap
          
          contM+=3;//Incrementa Contador de Movimentações(Movimentações dentro de swap)
      }	
      System.out.println("Movimentacoes: "+contM+"\tComparacoes: "+contC);//Exibe em tela os valores	
  }
  public void swap(int a, int b) {//declaração do procedimento de troca de posições
      int temp = Array[a];//Atribuição de valor de Array[a] a temp
      Array[a] = Array[b];//Atribuição de valor de Array[b] a Array[a] 
      Array[b] = temp;//Atribuição de valor de Array[b] a temp
  }
  public void InvertArray(int x){//declaração do procedimento para preencher vetor
      for(int i=0;i<x;i++){//laço de repetição
          //ordem decrescente
          Array[i]=(x-1)-i;//atribui a posição o valor de (x-1) decrementado de i
      }
  }
  public void InsertArray2(int x){//declaração do procedimento para preencher vetor
      for(int i=0;i<x;i++){//laço de repetição
          //ordem crescente
          Array[i]=i;//atribui a posição o valor de i
      }
  }
  public void printArrays(Dados a,Dados b){//declaração do procedimento de exibição de 2 vetores
      //Adaptação de codigo base(ImprimirArray)
      for(int i=0;i<N;i++) {//laço para percorrer o Array
              System.out.println("Posicao "+i+": "+a.Array[i]+"\t"+b.Array[i]);//executa a impressão do Array
      }
  }
}