package Aula_11;//nome do projeto

import java.util.*;//Simplificaçãode bibliotecas necessarias

public class Principal {//Classe Principal do projeto

    public static void main(String[] args) {//main da classe
	
        Scanner scanner=new Scanner(System.in); //variavel para input do teclado 
        
        int M=16;//Variavel para tamanho
        
        int[] Teste = new int[M];//Instancia vetor de inteiros de tamanho M
        
        Dados i =new Dados(Teste);//instancia o primeiro vetor do tipo dados
        
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
