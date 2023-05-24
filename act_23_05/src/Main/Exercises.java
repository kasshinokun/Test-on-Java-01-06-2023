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
        System.out.println("Melhor Caso");
        vector3.Merge_sort();//Executa o Merge Sort e Mostra as Movimentações
        

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
        System.out.println("Melhor Caso");
        vector5.Heap_Sort();
        System.out.println("\n=============================================\n");//Enunciado

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
    public static void Exercise_3() {
        System.out.println("===========Resposta em Arquivo PDF===========\n");//Enunciado
    }//Exercicio Analitico de algoritmo de ordenação sqrt(n^3)
//==========Exercicio 4 precisou do proprio main======================
    public static void Exercise_5() {
        System.out.println("\n===05 - Analise de Itens que se repetem =====");//Enunciado
        System.out.println("============por multiplo de 3 vezes==========");//Enunciado
        System.out.print("\nDigite um numero desejado:  ");
        int n=Integer.parseInt(reader.nextLine());//armazena o valor
        create(n);//envia ao procedimento

    }
//==========Exercicio 6 precisou do proprio main======================
//==========Exercicio 7 precisou do proprio main======================
    public static void Exercise_8() {
        System.out.println("\n===08 - Gestao de Lista de Sites=============");//Enunciado
        Lista_Site Historico=new Lista_Site();
        System.out.println("\n==Insercao e Exibir Lista de Sites===========");//Enunciado
        Historico.inserirFim("Google", "www.google.com");
        Historico.inserirFim("Yahoo", "www.yahoo.com");
        Historico.inserirFim("Gmail", "www.gmail.com");
        Historico.inserirFim("Outlook", "www.outlook.com");
        Historico.inserirFim("Youtube", "www.youtube.com");
        Historico.mostrar();
        System.out.println("\n==Busca por (Yahoo) e Exibir Lista de Sites==");//Enunciado
        Historico.buscar("Yahoo");
        System.out.println("\n==Exibir Lista de Sites apos Busca===========");//Enunciado
        Historico.mostrar();
        System.out.println("\n==Busca por (GDrive)========================="); 
        Historico.buscar("GDrive");
        System.out.println("\n=============================================\n");//Enunciado
    }
//==========Exercicio 9 precisou do proprio main======================
//==========Exercicio 10 precisou do proprio main======================}
    public static void Exercise_11() {
        System.out.println("\n===11 - Remocao de Chaves Pares==============");//Enunciado
        Lista_Simples lista=new Lista_Simples();
        lista=lista.criarLista();     
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
        lista.removerKey();
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
    }
    public static void Exercise_12() {
    System.out.println("===12 - Manipulacao de Caracteres em Listas==");//Enunciado
    Lista_Simples lista=new Lista_Simples();
    lista=lista.criarLista();     
    //lista.mostrar3();
    System.out.println("\n=============================================\n");//Enunciado
    lista.organizar_Letras_Numeros();
    //lista.mostrar3();
    System.out.println("\n=============================================\n");//Enunciado
    Lista_Dupla lista2=new Lista_Dupla();
    lista2=lista2.criarLista();     
    //lista2.mostrar3();
    System.out.println("\n=============================================\n");//Enunciado
    lista2.organizar_Letras_Numeros();
    //lista2.mostrar3();
    System.out.println("\n=============================================\n");//Enunciado
    }
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

        
}

