package Sort;

import java.util.*;



public class MergeSort {
    int Array[];//Instancia a variavel para o Array
    private int N;//Tamanho do Array
    public int cont=0;//Exibe as contagens
    public boolean contC;
    public MergeSort() {//constructor default
            Array= new int[10];//tipo e tamanho do Array
            N=Array.length;//Variavel para análise de tamanho
    }
    public MergeSort(int[] array) {//construtor com atribuições
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

            Array[i]=1 +x1.nextInt(x/2);//atribui a posição o valor aleatorio
        }
    }
    public void Merge_sort() {//Procedimento para o Merge sort

        sendArray(0, N-1);//Envia com valores predefinidos
          //System.out.println("\nMovimentacoes : "+ cont);//exibe o contador
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
    public MergeSort Soma(MergeSort a){//Função para criação de vetores, execução do Merge sort 500 vezes
        //e armazenamento de valores em vetor

        int[] Soma=new int[a.N];//Instancia vetor de inteiros de tamanho 500

        //System.out.println("Valor de N:"+a.N);//Aferição do tamanho

        for(int i=0;i<Soma.length;i++) {//laço até 500

            GerarArray(100);//gera os array's

            cont=0;//Zera o contador

            sendArray(0, 99);//Envia com valores predefinidos

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
    public static void main() {

        int M=100;//Variavel para tamanho

        int[] Teste = new int[M];//Instancia vetor de inteiros de tamanho M

        int[] Soma=new int[5*M];//Instancia vetor de inteiros de tamanho 500

        MergeSort i =new MergeSort(Teste);//instancia o primeiro vetor do tipo dados

        MergeSort Contagens =new MergeSort(Soma);//instancia o segundo vetor do tipo dados

        i.GerarArray(M);//Envia e criar valores para as posições de modo aleatorio

        i.ImprimirArray();//Exibe o vetor de objetos

        i.Merge_sort();//Exceuta o Merge Sort e Mostra as Movimentações

        /*Envia o vetor, cria 500 vetores 
        e armazena os valores de merge sort 
        no vetor enviado*/
        Contagens.Soma(Contagens);

        //Contagens.ImprimirArray();//Exibe o vetor de objetos

        double x=Contagens.Calcula_Media();//Calcula a media

        //Enunciado e Calculo
        System.out.println("\nCalculo do Merge Sort via Formula: "+(M)*(Math.log10(M)/Math.log10(2)));

        System.out.println("Calculo do Merge Sort via Media: "+x);//Exibe o valor da media

        System.out.println("\nOutros Metodos de Ordenacao para vetor com 100 itens: ");//Exibe o valor da media

        //instancia novos vetores do tipo int de tamanho M
        int[] V=new int[M];//vetor base para melhor caso
        int[] W=new int[M];//vetor base para pior caso

        //instancia novos objetos do tipo Dados baseados em V e W
        Another D1= new Another(V);//mellhor caso
        Another D2= new Another(W);//pior caso

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
    public void print3(){
        
        System.out.print("Itens repetidos");
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
