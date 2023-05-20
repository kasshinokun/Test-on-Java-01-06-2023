package Main;//Nome do Subprojeto

import java.util.*;//Simplificação de Bibliotecas necessárias
import TAF.*;//Package para Lista Simples Encadeada e outros TAFs

public class Act_7 {
    public static void main(String[] args) {//Main da classe
        
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        
        int opcao;//Variavel de escolha

        do{
            System.out.println("07 - Manipulacao de Listas Encadeadas Simples");//Enunciado

            System.out.println("===========Menu de Sub-exercicos=============");//Enunciado
            System.out.println("=1) - A)=====================================");//Enunciado
            System.out.println("=2) - B)=====================================");//Enunciado
            System.out.println("=3) - C)=====================================");//Enunciado
            System.out.println("=4) - D)=====================================");//Enunciado
            System.out.println("=5) - E)=====================================");//Enunciado
            System.out.println("=6) - F)=====================================");//Enunciado
            System.out.println("=7) - G)=====================================");//Enunciado
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
                    letra_E();
                    break;//Condição de parada
                case 5://Chama o procedimento
                    letra_E();
                    break;//Condição de parada
                case 6://Chama o procedimento
                    letra_F();
                    break;//Condição de parada
                case 7://Chama o procedimento
                    letra_G();
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
        Principal.main(args);//retorna ao main do subprojeto
    }
    private static void letra_A(){
        System.out.println("\n=1) - A)=====================================");//Enunciado
        
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_B(){
        System.out.println("\n=2) - B)=====================================");//Enunciado
        
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_C(){
        System.out.println("\n=3) - C)=====================================");//Enunciado
        
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_D(){
        System.out.println("\n=4) - D)=====================================");//Enunciado
        
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_E(){
        System.out.println("\n=5) - E)=====================================");//Enunciado
        
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_F(){
        System.out.println("\n=6) - F)=====================================");//Enunciado
        
        System.out.println("\n=============================================\n");//Enunciado
    }private static void letra_G(){
        System.out.println("\n=7) - G)=====================================");//Enunciado
        
        System.out.println("\n=============================================\n");//Enunciado
    }
}
