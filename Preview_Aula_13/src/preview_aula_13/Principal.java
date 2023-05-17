package preview_aula_13;

import java.util.*;//simplificação de Bibliotecas 

public class Principal {

public static void main(String[] args) {//Main da classe
        
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        
        int opcao;//Variavel de escolha

        do{
            System.out.println("===== Atividade Teorica TAFs Lineares =======\n");//Enunciado

            System.out.println("=============Menu de Exercicos===============");//Enunciado

            System.out.println("===01 - Insercao de valores em Lista=========");//Enunciado
            System.out.println("===02 - Remocao de valor em Lista e Retorno==");//Enunciado
            System.out.println("===03 - Valores em Posicao Inversa na Lista==");//Enunciado
            System.out.println("===04 - Gestao de Pilha Dupla em um Array====");//Enunciado
            System.out.println("===05 - Insercao de valores em Pilhas========");//Enunciado
            System.out.println("===06 - Gestao e Insercao de valores em Filas");//Enunciado
            System.out.println("===07 - Pilha de Filas=======================");//Enunciado
            System.out.println("===08 - Fila de Pilhas=======================");//Enunciado
            System.out.println("===09 - Gestao de Fila com Pilhas Auxiliares=");//Enunciado
            System.out.println("===10 - Sistema de Gestao de Deposito========");//Enunciado
            System.out.println("===11 - Sistema de Gestao de Deposito========");//Enunciado
            System.out.println("===12 - Sistema de Gestao de Deposito========");//Enunciado

            System.out.println("\n==========Digite 0 para Encerrar=============");//Enunciado

            System.out.println("\n======Por favor escolha uma opcao: ==========");//Enunciado
            opcao = Integer.parseInt(reader.nextLine());//armazena o valor
            switch(opcao){//Analise do que foi digitado

                case 1://Chama o procedimento
                    Exercises.Exercise_1();
                    break;//Condição de parada
                case 2://Chama o procedimento
                    Exercises.Exercise_2();
                    break;//Condição de parada
                case 3://Chama o procedimento
                    Exercises.Exercise_3();
                    break;//Condição de parada
                case 4://Chama o procedimento
                    Exercises.Exercise_4();
                    break;//Condição de parada
                case 5://Chama o procedimento
                    Exercises.Exercise_5();
                    break;//Condição de parada
                case 6://Chama o procedimento
                    Exercises.Exercise_6();
                    break;//Condição de parada
                case 7://Chama o procedimento
                    Exercises.Exercise_7();
                    break;//Condição de parada
                case 8://Chama o procedimento
                    Exercises.Exercise_8();
                    break;//Condição de parada
                case 9://Chama o procedimento
                    Exercises.Exercise_9();
                    break;//Condição de parada
                case 10://Chama o procedimento
                    Exercises.Exercise_10();
                    break;//Condição de parada
                case 11://Chama o procedimento
                    Exercises.Exercise_11();
                    break;//Condição de parada
                case 12://Chama o procedimento
                    Exercises.Exercise_12();
                    break;//Condição de parada
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                        System.out.println("\n===============Muito obrigado================");
                        System.out.println("===== Atividade Teorica TAFs=================\n");//Enunciado
                        System.exit(0);//Encerra o programa
                    }
                    else{//Se não estiver no intervalo, informa ao usuario
                        //e reapresenta o menu
                        System.out.println("\n============Opcao Invalida.==================");
                        System.out.println("======Tente novamente por gentileza!=========\n");
                    } 
            }      
        }while( opcao!=0);//Se repetira enquanto não for zero
        Preview_Aula_13.main(args);//retorna ao main
    }
}