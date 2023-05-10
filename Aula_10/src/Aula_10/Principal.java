package Aula_10;

import java.util.*;
public class Principal {//declaração da classe Main
    
    public static void main(String[] args) {
        
        int M=100;//Variavel para tamanho
        
        int[] Teste = new int[M];//Instancia vetor de inteiros de tamanho M
        
        int[] Soma=new int[5*M];//Instancia vetor de inteiros de tamanho 500
        
        Dados i =new Dados(Teste);//instancia o primeiro vetor do tipo dados
        
        Dados Contagens =new Dados(Soma);//instancia o segundo vetor do tipo dados
        
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
        Dados D1= new Dados(V);//mellhor caso
        Dados D2= new Dados(W);//pior caso
        
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
