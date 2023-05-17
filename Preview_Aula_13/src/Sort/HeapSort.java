package Sort;

import java.util.*;

public class HeapSort {
    int Array[];//Instancia a variavel para o Array
    private int N;//Tamanho do Array
    public int cont=0;//Exibe as contagens
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
    public void GerarArray(int x){
      //declaração do procedimento para preencher vetor

        for(int i=0;i<x;i++){//laço de repetição

            Random x1 = new Random();//Instancia um objeto random

            Array[i]=Math.abs(x1.nextInt(x/2));//atribui a posição o valor aleatorio
            //Obs.:em execução continua apresentou erro, por isto o uso de Math.abs
        }
    }
    private void Exibir_Heap(int M) {//Impressão dos componentes do Array em Heap
        int i=1, j=0;//instancia os contadores com valores predefinidos
        System.out.println();//Salta linha
        for(j=0;j<M;i++){//laço para exibição em Heap
            for(;j<(Math.pow(2, i)-1)&&j<M;j++) {//Calculo para a Heap
                System.out.print("0"+(j)+": "+Array[j]+" ");//executa a impressão do Array
            }System.out.println();//Salta linha
        }
    }

    //Adaptação de código
    //Construção da Heap para analise
    private void BuildHeap()
    {
        for (int k = 1; k < N; k++)
        {

            //se filho menor que pai
            if (Array[k] < Array[(k - 1) / 2])
            {
                int j = k;//Instancia j e atribui o valor de k

                while (Array[j] < Array[(j - 1) / 2])
           //equanto j(filho) menor que j dividido por 2(pai)
                {
                    swap( j, (j - 1) / 2);//realiza a troca
                    j = (j - 1) / 2;//atribui a j o valor do pai
                }
            }
        }
    }

    public void Heap()//Adaptação de código-Heap Invertida
    {
        BuildHeap();//constroi a Heap

        for (int k = N - 1; k > 0; k--)//laço de repetição
        {

            swap( 0, k);//troca a posição final pela inicial

            int j = 0, Esq,Dir;//instancia variaveis de analise

            do//laço de repetição interno
            {
                Esq = (2 * j + 1);//filho a esquerda

                Dir=(2 * j + 2);//filho a direita

                //se filho a esquerda menor que filho a direita
                if (Esq < (k - 1) && Array[Esq] > Array[Dir])
                    Esq++;//incrementa Esq

                //Se valor de Array na posição Esq menor que pai
                if (Esq < k && Array[j] > Array[Esq])
                    swap( j, Esq);//troca Array[j] por Array[Esq]

                j = Esq;//j recebe Esq

            }while (Esq < k);//Enquanto Esq menor que k
        }
        Exibir_Heap(N);//Exibe Array em Heap
    }
    public void swap(int a, int b) {//declaração do procedimento de troca de posições
        int temp = Array[a];//Atribuição de valor de Array[a] a temp
        Array[a] = Array[b];//Atribuição de valor de Array[b] a Array[a] 
        Array[b] = temp;//Atribuição de valor de Array[b] a temp
    }

    public boolean CheckHeap(){//Analise para verificar se é uma Heap Invertida

        for(int k=N-1;k>0;k--){
            int Pai=k/2;//instancia a variavel pai
            if(Array[Pai]<Array[k]){//se filho maior que pai
                return false;//retorna falso
            }

        }
        return true;//se for uma Heap Invertida retorna verdadeiro
    }
    //adaptação de codigo C
    public void Heap_Sort(){//Prodedimento para Heap Sort em ordem crescente
        
        for(int i=N/2-1;i>0;i--){
            ordenate_heap(i,N-1);//envia valores para construir a heap e ordenar
        }
        for(int i=N-1;i>0;i--){
            swap(0,i);//troca a posição i com o valor na posição 0 do vetor
            ordenate_heap(0,i-1);
            //envia valores 0 e (i-1) para construir a heap e ordenar
        }
        Exibir_Heap(N);//Exibe Array em Heap
    }
    //adaptação de codigo C
    private void ordenate_heap(int i, int f){//Ordena a heap em ordem crescente
        int aux=Array[i];//variavel para analisar a heap
        int j=i*2+1;//variavel para analisar filho a esquerda
        while(j<=f){//enquanto j menor/igual a f(não for maior que o intervalo)
            if(j<f){//se j menor que o intervalo
                if(Array[j]<Array[j+1]){//filho a direita for maior que filhoa aesquerda
                    j++;//incrementa o j
                }
            }if(aux<Array[j]){//se pai menor que filho
                Array[i]=Array[j];//troca os valores
                i=j;//i recebe o valor de j
                j=2*i+1;//j é refeito para localizar proximo filho a esquerda
            }else{//senão
                j=f+1;//usa-se o valor do intervalo para configurar j
            }
        
        }Array[i]=aux;//ao final Arrai[i](valor-base)recebe aux
    }
    public void random_Heap_Sort(){//procedimento para 
        //criação e execução de vetores aleatorios ordenados por heap sort
        Scanner scanner=new Scanner(System.in); //variavel para input do teclado 
        int op=1;//variavel para execução das repetiçoes
        
        do{    
            System.out.print("\nPor Favor Digite um valor valido ");//Enunciado
            System.out.print( "\npara executar as repetiçoes de ");//Enunciado
            System.out.print( "\nexecucao do Heap Sort..........");//Enunciado
            op = Integer.parseInt(scanner.nextLine());//Armazena o valor

        }while(op<=0);//se fara a pergunta enquanto for menor/iguala zero
        
        for(int i=0;i<op;i++){
            
            Random x1 = new Random();//Instancia um objeto random
            
            int M=Math.abs(x1.nextInt(20)+1);//Variavel para tamanho
            //Obs.:em execução continua apresentou erro, por isto o uso de Math.abs
            
            int[] Teste = new int[M];//Instancia vetor de inteiros de tamanho M

            HeapSort k = new HeapSort(Teste);//instancia o primeiro vetor do tipo dados

            k.GerarArray(M);//Envia e criar valores para as posições de modo aleatorio
            
            System.out.print("\nVetor 0"+(i+1));//Enunciado
            k.Heap_Sort();//Executa a ordenação por Heap Sort em ordem crescente
        
        }
    }
    public static void main() {//main da classe
    	
        Scanner scanner=new Scanner(System.in); //variavel para input do teclado 
        
        int M=16;//Variavel para tamanho
        
        int[] Teste = new int[M];//Instancia vetor de inteiros de tamanho M
        
        HeapSort i =new HeapSort(Teste);//instancia o primeiro vetor do tipo dados
        
        i.GerarArray(M);//Envia e criar valores para as posições de modo aleatorio
        
        System.out.println("\nImprimindo Array : \n");//Enunciado
        
        i.ImprimirArray();//Exibe o Array
        
        System.out.println("\nArray Exibindo em Heap : ");//Enunciado
        
        i.Heap();//Constroi e Exibe o Array em Heap
        
        boolean resp=i.CheckHeap();//Analisa o array
        
        System.out.println("\nO Array analisado se trata de uma Heap Invertida: "+resp+"\n");//Enunciado
        
        System.out.println("Heap Sort em Execucao\nArray Exibindo em Heap : ");//Enunciado
        
        i.Heap_Sort();//Executa a ordenação por Heap Sort em ordem crescente
        
        System.out.println("\nImprimindo Array : \n");//Enunciado
        
        i.ImprimirArray();//Exibe o Array
        
        System.out.println("\nPor Favor Digite algo para prosseguir..........\n");//Enunciado
        
        String op = scanner.nextLine();//armazena em uma string para evitar erros
          
        i.random_Heap_Sort();//execução de vetores aleatorios ordenados por heap sort
        
    }
}
