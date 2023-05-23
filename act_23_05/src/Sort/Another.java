package Sort;

import java.util.*;

public class Another {
    int Array[];//Instancia a variavel para o Array
    private int N;//Tamanho do Array
    public int cont=0;//Exibe as contagens
    public Another() {//constructor default
            Array= new int[10];//tipo e tamanho do Array
            N=Array.length;//Variavel para análise de tamanho
    }
    public Another(int[] array) {//construtor com atribuições
            Array=array;//Instancia a nova variavel para o Array baseada no constructor default
            N=Array.length;//Variavel para análise de tamanho
    }
    public void ImprimirArray() {//Impressão dos componentes do Array
            for(int i=0;i<N;i++) {//laço para percorrer o Array
                System.out.println("Posicao "+i+": "+Array[i]);//executa a impressão do Array
            }
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
    public void swap(int a, int b) {//declaração do procedimento de troca de posições
        int temp = Array[a];//Atribuição de valor de Array[a] a temp
        Array[a] = Array[b];//Atribuição de valor de Array[b] a Array[a] 
        Array[b] = temp;//Atribuição de valor de Array[b] a temp
    }
    //=========================================================================================
    //Adaptação para Counting Sort Apostila e site:https://www.javatpoint.com/counting-sort
    public int getMaior() {  
           int max = Array[0];  
           for(int i = 1; i<Array.length; i++) {  
              if(Array[i] > max)  
                 max = Array[i];  
           }  
           return max; //maximum element from the array  
        }  
    
    public void countingsort(int k) {//declaração do procedimento de Counting Sort 
        //Array para contar o numero de ocorrencias de cada elemento

        int[] count = new int[getMaior() + 1];
        int[] ordenado = new int[N];
        //Inicializar cada posicao do array de contagem
        for(int i = 0; i < count.length;i++){
            count[i] = 0;
        }
        //Agora, o count[i] contem o numero de elemento iguais a i
        for(int i = 0; i < N;  i++){
            count[Array[i]]++;
        }
        //Agora, o count[i] contem o numero de elemento menores ou iguais a i
        for(int i = 1; i < count.length;i++){
            count[i]+= count[i- 1];
        }
        //Ordenando
        for(int i = N-1; i >=0;i--){
            ordenado[count[Array[i]]-1] = Array[i]; 
            count[Array[i]]--;
        }
        System.out.println("==Vetor apos ordenar com Counting Sort:");//Enunciado
        Array=ordenado;
        for(int i=0;i<10;i++){
            
            System.out.print(Array[i]+" ");
            
        }
        System.out.println("\n==Termos menores que K:");//Enunciado
        menor_k(k);
        
    }  
    public void menor_k(int k){
        for(int i=0;i<N;i++){
            if(Array[i]<k){
                System.out.print(Array[i]+" ");
            }
        }
    }
}
