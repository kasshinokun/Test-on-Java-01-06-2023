package Main;//Nome do Subprojeto

import java.util.*;//Simplificação de bibliotecas necessarias 

public class Main {//Main responsavel por todos os exercicios deste codigo
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        int opcao;//Variavel de escolha
        do{
            
            System.out.println("\n=======Atividade Pratica BST e Generics======\n");//Enunciado

            System.out.println("=====Inteiros - Menu de Exercicos============");//Enunciado

            System.out.println("===1) - Arvore de Inteiros===================");//Enunciado
            System.out.println("===2) - Arvore de Generics===================");//Enunciado
            System.out.println("\n==========Digite 0 para Encerrar=============");//Enunciado

            System.out.println("\n======Por favor escolha uma opcao: ==========");//Enunciado
            opcao = Integer.parseInt(reader.nextLine());//armazena o valor
            switch(opcao){//Analise do que foi digitado

                case 1://Chama o procedimento
                    I_Main.main(args);//Atividade com Int BST
                    break;//Condição de parada
                case 2://Chama o procedimento
                    G_Main.main(args);//Atividade com Generics BST	
                    break;//Condição de parada
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                        System.out.println("\n===============Muito obrigado================");
                        System.out.println("=======Atividade Pratica BST e Generics======\n");//Enunciado
                        System.exit(0);//Encerra o Programa
                    }
                    else{//Se não estiver no intervalo, informa ao usuario
                        //e reapresenta o menu
                        System.out.println("\n============Opcao Invalida.==================");
                        System.out.println("======Tente novamente por gentileza!=========\n");
                    } 
            }      
        }while(opcao!=0);//Se repetira enquanto não for zero
    }
}


