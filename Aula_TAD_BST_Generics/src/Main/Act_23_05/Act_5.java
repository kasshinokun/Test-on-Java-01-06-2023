
package Main.Act_23_05;//Nome do Subprojeto

import java.util.*;//Simplificação de Bibliotecas necessárias
import TAF.*;//Package para Lista Simples Encadeada e outros TAFs

public class Act_5 {
    static Scanner reader = new Scanner(System.in);
    //Variavel global para entrada do teclado na classe
    
    public static void main(String[] args) {//Main da classe
        
        int opcao;//Variavel de escolha

        do{
            System.out.println("===10 - Manipulacao de Conjuntos com Listas===");//Enunciado

            System.out.println("===========Menu de Sub-exercicos==============");//Enunciado
            System.out.println("=1) - A)Uniao=================================");//Enunciado
            System.out.println("=2) - B)Intersecao============================");//Enunciado
            System.out.println("=3) - C)Diferenca=============================");//Enunciado
            System.out.println("=4) - D)Soma==================================");//Enunciado
           
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
                case 4://Chama o procedimento
                    letra_D();
                    break;//Condição de parada
                
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                        System.out.println("\n===============Muito obrigado================");
                        System.out.println("\n==========Saindo da Atividade 09=============");//Enunciado
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
        System.out.println("=1) - A)Uniao=================================");//Enunciado
        
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_B(){
        System.out.println("=2) - B)Intersecao============================");//Enunciado
        
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_C(){
        System.out.println("=3) - C)Diferenca=============================");//Enunciado
        
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_D(){
        System.out.println("=4) - D)Soma==================================");//Enunciado
        
        System.out.println("\n=============================================\n");//Enunciado
    }
}
