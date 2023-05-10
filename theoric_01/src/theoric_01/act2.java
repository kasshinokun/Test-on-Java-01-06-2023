package theoric_01;//Nome do Projeto
import java.util.Locale;//biblioteca para padrões regionais
import java.util.Scanner;//biblioteca para entrada de dados
import java.lang.Math;//biblioteca para calculos como potencia e afins
public class act2  {//declaração da classe Dados
	private int Array[];//Instancia a variavel para o Array
	private int N;//Tamanho do Array
	public act2() {//constructor default
		Array= new int[10];//tipo e tamanho do Array
		N=Array.length;//Variavel para análise de tamanho
	}
	public act2(int[] array) {//construtor com atribuições
		Array=array;//Instancia a nova variavel para o Array baseada no constructor default
		N=Array.length;//Variavel para análise de tamanho
	}
	public void selection_sort_sumA() {//Executa seleção por ordenação do Array(Selection Sort)---Professor
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
  public void ImprimirArray() {//Impressão dos componentes do Array
	for(int i=0;i<N;i++) {//laço para percorrer o Array
		System.out.println("Posição "+i+": "+Array[i]);//executa a impressão do Array
		}
  }
	
}
