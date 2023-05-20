package Main;//Nome do Subprojeto

import java.util.*;//Simplificação de Bibliotecas necessárias

//Importação de outros subprojetos
import TAD.*;//Package contendo os TADs
import TAF.*;//Package contendo os TAFs
import Sort.*;//Package contendo os metodos de Ordenação

public class Exercises {
    public static Scanner reader=new Scanner(System.in);
    //Objeto Scanner para Entrada global do teclado
    
    //Exercicios Atividade teorica 2 TAF
    public static void Exercise_1() {
        System.out.println("\nAnalise Lexicografica de metodos de Ordenacao");//Enunciado
        int []arr= {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int []arr2= {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int []arr3= {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        System.out.println("=Impressao do Vetor Base=====================");//Enunciado
        Another vector=new Another(arr);
        vector.ImprimirArray();

        System.out.println("=No Selection Sort===========================");//Enunciado
        System.out.println("Pior Caso");//Enunciado
        vector.Selection_sort1();//Pior caso
        System.out.println("Melhor Caso");//Enunciado
        vector.Selection_sort1();//Pior caso       

        System.out.println("\n=No Insertion Sort===========================");//Enunciado
        Another vector2=new Another(arr2);
        System.out.println("Pior Caso");
        vector2.Insertion_sort();//Pior caso 
        System.out.println("Melhor Caso");
        vector2.Insertion_sort();//Melhor caso   

        System.out.println("\n=No Merge Sort===============================");//Enunciado
        MergeSort vector3 =new MergeSort(arr3);
        System.out.println("Pior Caso");
        vector3.Merge_sort();//Executa o Merge Sort e Mostra as Movimentações
        System.out.println("Movimentacoes: "+vector3.cont+"\tComparacoes: "+vector3.cont);
        System.out.println("Melhor Caso");
        vector3.Merge_sort();//Executa o Merge Sort e Mostra as Movimentações
        System.out.println("Movimentacoes: "+vector3.cont+"\tComparacoes: "+vector3.cont);

        System.out.println("\n=No Quick Sort===============================");//Enunciado
        QuickSort vector4=new QuickSort(arr);
        System.out.println("Pior Caso");
        vector4.quicksort();
        vector4.print();
        System.out.println("Melhor Caso");
        vector4.quicksort();
        vector4.print();

        System.out.println("\n=No Heap Sort================================");//Enunciado
        System.out.println("Pior Caso");
        HeapSort vector5=new HeapSort(arr);
        vector5.Heap_Sort();
        System.out.println("Movimentacoes: "+vector5.contM+"\tComparacoes: "+vector5.contC);
        System.out.println("Melhor Caso");
        vector5.Heap_Sort();
        System.out.println("Movimentacoes: "+vector5.contM+"\tComparacoes: "+vector5.contC);
        System.out.println("=============================================\n");//Enunciado

    }
    public static void Exercise_2() {
        System.out.println("\n===02 - Comparacao MergeSort, QuickSort e====");//Enunciado
        System.out.println("================== HeapSort =================");//Enunciado
        int []arr= {3,4,9,2,5,8,2,1,7,4,6,2,9,8,5,1};
        System.out.println("=Impressao do Vetor Base=====================");//Enunciado
        MergeSort vector2 =new MergeSort(arr);
        vector2.ImprimirArray2();

        System.out.println("\n=No Merge Sort===============================");//Enunciado

        vector2.Merge_sort();//Executa o Merge Sort e Mostra as Movimentações
        vector2.ImprimirArray2();
        System.out.println("\n=No Quick Sort===============================");//Enunciado
        QuickSort vector3=new QuickSort(arr);
        vector3.quicksort();
        vector3.ImprimirArray2();
        System.out.println("\n=No Heap Sort================================");//Enunciado
        HeapSort vector4=new HeapSort(arr);
        vector4.Heap_Sort();
        vector4.ImprimirArray2();
        System.out.println("=============================================\n");//Enunciado

    }
    public static void Exercise_3() {}//Em analise
    public static void Exercise_4() {}//Em analise
    public static void Exercise_5() {
        System.out.println("\n===05 - Analise de Itens que se repetem =====");//Enunciado
        System.out.println("============por multiplo de 3 vezes==========");//Enunciado
        System.out.print("\nDigite um numero desejado:  ");
        int n=Integer.parseInt(reader.nextLine());//armazena o valor
        create(n);//envia ao procedimento

    }
 //==========Exercicio 6 precisou do proprio main======================
    public static void Exercise_7() {}
    public static void Exercise_8() {}
    public static void Exercise_9() {}
    public static void Exercise_10() {}
    public static void Exercise_11() {}
    public static void Exercise_12() {}
//======Procedimento do Exercicio 05 =============================================================
    private static void create(int n){//Vetor proposta do exxercicio

        int[] arr=new int[n];//instacia e cria um vetor de tamanho n
        MergeSort m=new MergeSort(arr);//Cria um vetor para o MergeSort
        m.GerarArray(n);//Gera valores aleatorios e armazena no vetor
        m.print3();/*executa a analise de repetições atraves 
        de algoritmo similar ao Selection Sort*/
        System.out.print("=Impressao do Vetor Base=====================");//Enunciado
        m.ImprimirArray2();//Exibe o array
        System.out.println();//Salta linha

    }
//======Inicio - Procedimentos da classe =========================================================
    public static void gestao_lista(){//Operações com lista simples
        System.out.println("\n==Lista Simples Encadeada - Teste=============");//Enunciado
        int arr[]={1,2,3,4,5,6,7,8,9};//Vetor base
        Lista_Simples lista=new Lista_Simples();
        for(int i=0;i<arr.length;i++){
            lista.inserirFim(arr[i]);
    }
        System.out.println("\n==Insercao===================================");//Enunciado
        lista.mostrar();
        System.out.println("\n==No Inicio==================================");//Enunciado
        lista.inserirInicio(arr[4]);
        lista.mostrar();
        System.out.println("\n==Na Posicao=================================");//Enunciado
        lista.inserirPos(arr[4], 4);
        lista.mostrar();
        System.out.println("\n==Remocao====================================");//Enunciado
        int x=lista.removerInicio();
        System.out.println("Deletado no Inicio: "+x);
        lista.mostrar();
        System.out.println("\n=============================================");//Enunciado
        int y=lista.removerFim();
        System.out.println("Deletado no Fim: "+y);
        lista.mostrar();
        System.out.println("\n=============================================");//Enunciado
        int z=lista.removerPos(4);
        System.out.println("Deletado na Posicao: "+z);
        lista.mostrar();
        System.out.println("\n=============================================");//Enunciado
    }
    public static void gestao_lista_dupla(){//Operações com lista simples
        System.out.println("\n==Lista Dupla Encadeada - Teste===============");//Enunciado
        int arr[]={1,2,3,4,5,6,7,8,9};//Vetor base
        Lista_Dupla lista=new Lista_Dupla();
        for(int i=0;i<arr.length;i++){
            lista.inserirFim(arr[i]);
        }
        System.out.println("\n==Insercao===================================");//Enunciado
        lista.mostrar();
        
        System.out.println("\n==No Inicio==================================");//Enunciado
        lista.inserirInicio(arr[4]);
        lista.mostrar();
        System.out.println("\n==Na Posicao=================================");//Enunciado
        lista.inserirPos(arr[4], 4);
        lista.mostrar();
        System.out.println("\n==Remocao====================================");//Enunciado
        int x=lista.removerInicio();
        System.out.println("Deletado no Inicio: "+x);
        lista.mostrar();
        System.out.println("\n=============================================");//Enunciado
        int y=lista.removerFim();
        System.out.println("Deletado no Fim: "+y);
        lista.mostrar();
        System.out.println("\n=============================================");//Enunciado
        int z=lista.removerPos(4);
        System.out.println("Deletado na Posicao: "+z);
        lista.mostrar();
        
        System.out.println("\n=============================================");//Enunciado
    }
    public static void gestao_matriz(){
        
        int v[]={1,2,3,4,5,6,7,8,9};//Vetor base
        
        Matriz m=new Matriz(3,3);//Dimensionando e Instanciando Matriz
        System.out.println("\n=Aula 12 - Gestao de Matriz Flexivel=========");//Enunciado
        System.out.println("====Adicionando itens na Matriz==============");//Enunciado
        m.Preencher(v);//Preencher
        
        System.out.print("\n========Impressao da Matriz==================\n");//Enunciado
        m.Imprimir();//Imprimir
        
        System.out.print("\n==========Soma de Matrizes===================\n");//Enunciado
        m=m.soma(m);//Soma de Matrizes
        m.Imprimir();//Imprimir
        
        System.out.print("\n=====Multiplicacao de Matrizes===============\n");//Enunciado
        m=m.Multiplicação(m);//Multiplicação de matrizes
        m.Imprimir();//Imprimir
        System.out.print("\n====Diagonal Pricipal da Matriz==============\n");//Enunciado
        int k=m.DiagonalPrincipal();
        
        System.out.println("\nSoma da Diagonal Pricipal: "+k);
        System.out.print("\n====Diagonal Secundaria da Matriz============\n");//Enunciado
        int l=m.DiagonalSecundaria();
        System.out.println("\nSoma da Diagonal Secundaria: "+l);
        System.out.print("\n");
        
        
    }
 //======Fim - Procedimentos da classe ======================================================       
	//Exercicios Aula 13
	public static void Exercise_Tree() {}
        
}

