
package com.teste.preview_aula_11;

//Adaptação recriada para execução perfeita dos códigos

//Main próprio para gerenciamento
import java.util.*;//Simplificação das bibliotecas necessárias

public class Outros_Sort {//declaração da classe Outros_Sort
    int Array[];//Instancia a variavel para o Array
    private int N;//Tamanho do Array
    public int cont=0;//Exibe as contagens
    public Outros_Sort() {//constructor default
            Array= new int[10];//tipo e tamanho do Array
            N=Array.length;//Variavel para análise de tamanho
    }
    public Outros_Sort(int[] array) {//construtor com atribuições
            Array=array;//Instancia a nova variavel para o Array baseada no constructor default
            N=Array.length;//Variavel para análise de tamanho
    }
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
    public void printArrays(Outros_Sort a,Outros_Sort b){//declaração do procedimento de exibição de 2 vetores
        //Adaptação de codigo base(ImprimirArray)
        for(int i=0;i<N;i++) {//laço para percorrer o Array
                System.out.println("Posicao "+i+": "+a.Array[i]+"\t"+b.Array[i]);//executa a impressão do Array
        }
    } 
    public static void main(String[] args){//Main proprio da classe
        
        int M=100;//Variavel para tamanho
        
        //instancia vetores do tipo int de tamanho M
        int[] V=new int[M];//vetor base para melhor caso
        int[] W=new int[M];//vetor base para pior caso
        
        //instancia novos objetos do tipo Dados baseados em V e W
        Outros_Sort D1= new Outros_Sort(V);//mellhor caso
        Outros_Sort D2= new Outros_Sort(W);//pior caso
        
        //inserção de valores
        D1.InsertArray2(M);
        D2.InvertArray(M);//ordem decrescente
        
        //D1.printArrays(D1, D2);//Exibe vetores lado a lado(adaptação de codigo base)
        
        //Exibi os valores de comparações e movimentações de Insertion Sort
        System.out.println("\nPor Insertion Sort:\nMelhor Caso");//Enunciado
        D1.Insertion_sort();//Melhor caso
        System.out.println("Pior Caso");
        D2.Insertion_sort();//Pior caso
        
        //Exibi os valores de comparações e movimentações de Selection Sort Padrao
        System.out.println("\nPor Selection Sort Padrao:\nMelhor Caso");//Enunciado
        D1.Selection_sort1();//Melhor caso
        D2.InvertArray(M);//Inverte o array novamente
        //D2.ImprimirArray();//Exibe vetor
        System.out.println("Pior Caso");//Enunciado
        D2.Selection_sort1();//Pior caso
        
        
        //Exibi os valores de comparações e movimentações de Selection Sort Padrao
        System.out.println("\nPor Selection Sort Otimizado:\nMelhor Caso");//Enunciado
        D1.Selection_sort2();//Melhor caso
        D2.InvertArray(M);//Inverte o array novamente
        //D2.ImprimirArray();//Exibe vetor
        System.out.println("Pior Caso");//Enunciado
        D2.Selection_sort2();//Pior caso
    
    }
}
