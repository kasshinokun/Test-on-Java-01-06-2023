package Aula_09;//Nome do Projeto

import java.util.*;//Simplificação de bibliotecas necessarias

public class Aula_09 {//declaração da classe Main
    
    public static void main(String[] args) {
        
        int M=100;//Variavel para tamanho
        
        //instancia vetores do tipo int de tamanho M
        int[] V=new int[M];//vetor base para melhor caso
        int[] W=new int[M];//vetor base para pior caso
        
        //instancia novos objetos do tipo Dados baseados em V e W
        Dados D1= new Dados(V);//mellhor caso
        Dados D2= new Dados(W);//pior caso
        
        //inserção de valores
        D1.InsertArray(M);//ordem crescente
        D2.InvertArray(M);//ordem decrescente
        
        D1.printArrays(D1, D2);//Exibe vetores lado a lado(adaptação de codigo base)
        
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
