package preview_aula_13;

import java.util.*;//simplificação de Bibliotecas 

public class Principal {

public static void main(String[] args) {//Main da classe
        
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        
        int opcao;//Variavel de escolha

        do{
            System.out.println("===== Atividade Teorica TAFs Flexiveis ======\n");//Enunciado

            System.out.println("=============Menu de Exercicos===============");//Enunciado

            System.out.println("===01 - =Comparacao de Metodos de Ordenacao==");//Enunciado
            System.out.println("===02 - =====================================");//Enunciado
            System.out.println("===03 - =====================================");//Enunciado
            System.out.println("===04 - =====================================");//Enunciado
            System.out.println("===05 - =====================================");//Enunciado
            System.out.println("===06 - =====================================");//Enunciado
            System.out.println("===07 - =====================================");//Enunciado
            System.out.println("===08 - =====================================");//Enunciado
            System.out.println("===09 - =====================================");//Enunciado
            System.out.println("===10 - =====================================");//Enunciado
            System.out.println("===11 - =====================================");//Enunciado
            System.out.println("===12 - =====================================");//Enunciado

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
                        System.out.println("\n=Saindo de Atividade Teorica TAFs Flexiveis =");//Enunciado
                        System.out.println("====E voltando para Atividade Teorica TADs,==");
                        System.out.println("===============TAFs e Testes=================\n");//Enunciado
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