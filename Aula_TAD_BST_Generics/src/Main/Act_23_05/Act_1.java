package Main.Act_23_05;//Nome do Subprojeto

import java.util.*;//Simplificação de Bibliotecas necessárias
import TAF.*;//Package para Lista Simples Encadeada e outros TAFs

public class Act_1 {
    public static void main(String[] args) {//Main da classe
        
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        
        int opcao;//Variavel de escolha

        do{
            System.out.println("06 - Manipulacao de Listas Encadeadas Simples");//Enunciado

            System.out.println("===========Menu de Sub-exercicos=============");//Enunciado
            System.out.println("=1) - A)Lista Simples Encadeada - L1 ao Final");//Enunciado
            System.out.println("=2) - B)Lista Simples Encadeada - Ln ao L1===");//Enunciado
            System.out.println("=3) - C)Lista Simples Encadeada -Soma de Item");//Enunciado
            System.out.println("\n==========Digite 0 para Encerrar=============");//Enunciado

            System.out.println("\n======Por favor escolha uma opcao: ==========");//Enunciado
            opcao = Integer.parseInt(reader.nextLine());//armazena o valor
            switch(opcao){//Analise do que foi digitado

                case 1://Chama o procedimento
                    letra_A();
                    break;//Condição de parada
                case 2://Chama o procedimento
                    letra_B();
                    break;//Condição de parada
                case 3://Chama o procedimento
                    letra_C();
                    break;//Condição de parada
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                        System.out.println("\n===============Muito obrigado================");
                        System.out.println("\n==========Saindo da Atividade 06=============");//Enunciado
                        System.out.println("=====E voltando para Menu de Exercicios======\n");//Enunciado
                    }
                    else{//Se não estiver no intervalo, informa ao usuario
                        //e reapresenta o menu
                        System.out.println("\n============Opcao Invalida.==================");
                        System.out.println("======Tente novamente por gentileza!=========\n");
                    } 
            }      
        }while( opcao!=0);//Se repetira enquanto não for zero
        Main_23_05.main(args);//retorna ao main do subprojeto
    }
    private static void letra_A(){
        System.out.println("\n=1) - A)Lista Simples Encadeada - L1 ao Final");//Enunciado
        int arr[]={1,2,3,4,5,6,7,8,9};//Vetor base
        Lista_Simples lista=new Lista_Simples();
        Lista_Simples lista2=new Lista_Simples();
        for(int i=0;i<arr.length;i++){
            lista.inserirFim(arr[i]);
        }
        lista2=lista.add_LA(lista2);
        System.out.println("\n==Insercao===================================");//Enunciado
        System.out.print("Lista B: ");
        lista2.mostrar();
        System.out.print("\nLista A: ");
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_B(){
        System.out.println("\n===2) - B)Lista Simples Encadeada - Ln ao L1=");//Enunciado
        int arr[]={1,2,3,4,5,6,7,8,9};//Vetor base
        Lista_Simples lista=new Lista_Simples();
        Lista_Simples lista2=new Lista_Simples();
        for(int i=0;i<arr.length;i++){
            lista.inserirFim(arr[i]);
        }
        lista2=lista.add_LB(lista2);
        System.out.println("\n==Insercao===================================");//Enunciado
        System.out.print("Lista B: ");
        lista2.mostrar();
        System.out.print("\nLista A: ");
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_C(){
        System.out.println("\n=3) - C)Lista Simples Encadeada -Soma de Item");//Enunciado
        int arr[]={1,2,3,4,5,6,7,8,9};//Vetor base
        Lista_Simples lista=new Lista_Simples();
        Lista_Simples lista2=new Lista_Simples();
        for(int i=0;i<arr.length;i++){
            lista.inserirFim(arr[i]);
        }
        lista2=lista.add_LC(lista2);
        System.out.println("\n==Insercao===================================");//Enunciado
        System.out.print("Lista B: ");
        lista2.mostrar();
        System.out.print("\nLista A: ");
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
    }
}
