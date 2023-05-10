package Aula_02;//Nome do Projeto
import java.util.Locale;//biblioteca para padrões regionais
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
			System.out.println("Posicao : "+Array[i]);//executa a impressão do Array
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
	public void Selection_sort1() {//declaração do procedimento de Selection Sort Padrão
        
        //int contC=0;//variavel para contador de Comparações
        //int contM=0;//variavel para contador de Movimentações
        
        for (int i = 0; i <Array.length; i++){//laço para percorrer o Array a partir de i
            int index = i;//Instancia e atribui o valor da variavel i a index
            
            for (int j = i ; j <Array.length; j++){//laço para percorrer o Array a partir de j
                
                //contC++;//Incrementa Contador de Comparações
                if (Array[index]>Array[j]){//compraração
                    //contM++;//Incrementa Contador de Movimentações
                    index = j;//se menor, atribui o valor da variavel j a index
                }
            }
            
            int temp = Array[i];//Atribuição de valor de Array[i] a temp
            Array[i] = Array[index];//Atribuição de valor de Array[index] a Array[i] 
            Array[index] = temp;//Atribuição de valor de Array[index] a temp
            
            //contM+=3;//Incrementa Contador de Movimentações
        }
        //System.out.println("Movimentacoes: "+contM+"\tComparacoes: "+contC);
    }
    public void Selection_sort2(){//declaração do procedimento de Selection Sort Otimizado
        
        //int contC=0;//variavel para contador de Comparações
        //int contM=0;//variavel para contador de Movimentações
        
        for (int i = 0; i < (N - 1); i++) {//laço para percorrer o Array a partir de i            
            int menor = i;//Instancia e atribui o valor da variavel i a menor
            
            for (int j = (i + 1); j < N; j++){//laço para percorrer o Array a partir de j
                
                //contC++;//Incrementa Contador de Comparações
                if (Array[menor] > Array[j]){//compraração
                    //contM++;//Incrementa Contador de Movimentações
                    menor = j;//se menor, atribui o valor da variavel j a menor
                }
            }
            swap(menor, i);//envia valores ao procedimento swap
            
            //contM+=3;//Incrementa Contador de Movimentações
        }
        //System.out.println("Movimentacoes: "+contM+"\tComparacoes: "+contC);	
    }
    public void Selection_sort(){//declaração do procedimento de Selection Sort Padrão
        
        int contC=0;//variavel para contador de Comparações
        int k=Array.length;
        for (int i = 0; i <k; i++){//laço para percorrer o Array a partir de i
            int index = i;//Instancia e atribui o valor da variavel i a index
            
            for (int j = i ; j <k; j++){//laço para percorrer o Array a partir de j
                contC++;//Incrementa Contador de Comparações
                if (Array[index]>Array[j]){//compraração
                    index = j;//se menor, atribui o valor da variavel j a index
                }
            }
            int temp = Array[i];//Atribuição de valor de Array[i] a temp
            Array[i] = Array[index];//Atribuição de valor de Array[index] a Array[i] 
            Array[index] = temp;//Atribuição de valor de Array[index] a temp
           
        }
        System.out.println("Comparacoes: "+contC);
        
        System.out.println("\n---------"+k+"\n");
        k*=k;
        System.out.println("\n---------"+k+"\n");
        k-=Array.length;
        System.out.println("\n---------"+k+"\n");
        k/=2;
        System.out.println("\n---------"+k+"\n");
		
    }
    public void swap(int a, int b) {//declaração do procedimento de troca de posições
        int temp = Array[a];//Atribuição de valor de Array[a] a temp
        Array[a] = Array[b];//Atribuição de valor de Array[b] a Array[a] 
        Array[b] = temp;//Atribuição de valor de Array[b] a temp
    }

}
