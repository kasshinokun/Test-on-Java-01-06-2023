package Aula_02;
//Nome do Projeto
import java.util.Locale;//biblioteca para padrões regionais
import java.lang.Math;
public class Dados {//declaração da classe Dados
	private int Array[];//Instancia a variavel para o Array
	private int N;//Tamanho do Array
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
			System.out.println("Posição "+i+": "+Array[i]);//executa a impressão do Array
		}
	}
	public double CalculaMedia() {//Media dos componentes do Array
		//double M;//Simplificação de código
		int Soma=0;//Variavel para a soma de componentes do Array
		for(int i=0;i<N;i++) {//laço para percorrer o Array
			Soma+=Array[i];//soma de componentes do Array
		}
		//M=Soma/N;//Simplificação de código
		return Soma/N;//retorna a media(divide soma pelo tamanho) 
	}
	public void Ordenar() {//Ordenação dos componentes do Array
		int index;//variavel para posição de menor valor
		for (int i = 0; i <N; i++){//laço para percorrer o Array
			index = i;//Atribuição de valor da variavel i a index
			for (int j = i ; j <= N-1; j++){//laço para percorrer o Array a partir de i
				if (Array[j] < Array[index]){//compraração
					index = j;//se menor, atribui o valor da variavel j a index
				}
			}
			int temp = Array[i];//Atribuição de valor de Array[i] a temp
			Array[i] = Array[index];//Atribuição de valor de Array[index] a Array[i] 
			Array[index] = temp;//Atribuição de valor de Array[index] a temp
		}
	}
	public void selection_sort() {//Executa seleção por ordenação do Array(Selection Sort)---Professor
		int count=0;//contador
		for (int i = 0; i < (N - 1); i++) {
			int menor = i; 
			for (int j = (i + 1); j < N; j++){
			    count++;
				if (Array[menor] > Array[j]){
					menor = j;
			    }
			}
			swap(menor, i);
		}
		
     //Calculo (N^2/2) - (N/2) em Etapas
		int k=(int)Math.pow(N, 2);//Potencia de N^2 Etapa 1
      k/=2;//N^2/2 Etapa 2
      int l=N/2;//N-2 Etapa 3
      k-=l;//(N^2/2) - (N/2)   Etapa 4 
      //Exibição e Validação da contagem de Comparações
      System.out.println("\n" + count + " Comparacoes = "+ k + " Comparacoes\n");
  }   
  public void swap( int a, int b) {//metodo para troca na ordenação do Array
      int temp = Array[a];//Atribuição de valor de Array[a] a temp
      Array[a] = Array[b];//Atribuição de valor de Array[b] a Array[a]
      Array[b] = temp;//Atribuição de valor de Array[b] a temp
  }

	public double CalculaMediana() {//Mediana dos componentes do Array
		//double Y;//Simplificação de código
		int k;//variavel para posição no Array
		
		if(N%2==0) {//se o tamanho for par
			k=(N/2);//Atribui a metade do tamanho a k
			//Y=((Array[k]+Array[k-1])/2.0);//Simplificação de código
			return ((Array[k]+Array[k-1])/2.0);//Retorna a mediana(soma Array[k] e Array[k-1] e divide por 2)
		}
		else {//se não for par.....
			k=(N/2);//Atribui a metade do tamanho a k
			//Y=Array[k];//Simplificação de código
			return Array[k];//Retorna a mediana(Array na posição k)
		}
		//return Y;//Simplificação de código
	}
}