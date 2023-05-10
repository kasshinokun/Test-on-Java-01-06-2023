
package com.teste.preview_aula_11;//Nome do Projeto

import java.util.*;//Simplificação de bibliotecas necessarias
public class Main_Mergesort {//declaração da classe Main
    
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
        
        Outros_Sort.main(args);//Exibe outros metodos e seus resultados
        
        
    }

}
