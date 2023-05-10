
package com.teste.preview_aula_11;//Nome do Projeto

import java.util.*;//Simplificação de bibliotecas necessarias

public class Preview_Aula_11 {

    public static void main(String[] args) {
        Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        
        int opcao;//Variavel de escolha
        
        do{
            
            System.out.println("===Analise de Metodos Sort====");//Enunciado
            System.out.println("=======Menu de opcoes:========\n");//Enunciado
            System.out.println("=======01 - Merge Sort========");//Enunciado
            System.out.println("=======02 - Quick Sort========");//Enunciado
            System.out.println("=======03 - Heap Sort=========");//Enunciado
            System.out.println("=======04 - Nao Definido======");//Enunciado
            System.out.println("\n========= 0 - Sair============");//Enunciado
            System.out.println("\n======Escolha uma opcao:======");
            
            opcao = reader.nextInt();
            switch(opcao){//Analise do que foi digitado
                case 1://Chama o procedimento
                	System.out.println("=======01 - Merge Sort========");//Enunciado
                    Main_Mergesort.main(args);//Exibe o Metodo Merge Sort e seus resultados
                    break;//Condição de parada
                case 2://Chama o procedimento
                    Quick_Sort.main(args);//Exibe o Metodo Quick Sort e seus resultados
                    break;//Condição de parada
                case 3://Chama o procedimento
                    Heap_Sort.main(args);//Exibe o Metodo Heap Sort e seus resultados
                    break;//Condição de parada
                case 4://Chama o procedimento
                	//Teste em aberto
                	System.out.println("=======04 - Nao Definido======");//Enunciado
                	break;//Condição de parada
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                    	System.out.println("\n========Muito obrigado========");
                    	System.out.println("===Analise de Metodos Sort====");//Enunciado
                        System.exit(0);//Encerra o programa
                    }
                    else{//Se não estiver no intervalo, informa ao usuario
                        //e reapresenta o menu
                        System.out.println("=======Opcao Invalida.========");
                        System.out.println("Tente novamente por gentileza!\n");
                    } 
            }      
        }while( opcao!=0);//Se repetira enquanto não for zero
    }
}
