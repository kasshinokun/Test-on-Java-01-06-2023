package Main.Act_23_05;//Nome do Sub-Projeto


import java.util.*;//simplificação de Bibliotecas 

public class Main_23_05 {

    public static void main(String[] args) {//Main da classe
        
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        
        int opcao;//Variavel de escolha

        do{
            System.out.println("===== Atividade Teorica TAFs Flexiveis ======\n");//Enunciado

            System.out.println("=============Menu de Exercicos===============");//Enunciado

            System.out.println("01 1)Manipulacao de Listas Encadeadas Simples");//Enunciado
            System.out.println("02 2)Manipulacao de Listas Encadeadas Simples");//Enunciado
            System.out.println("03 3)Gestao de Lista de Sites================");//Enunciado
            System.out.println("04 3-A)Gestao de Lista de Sites-Lista Simples");//Enunciado
            System.out.println("05 4)Manipulacao de Listas Encadeadas Dupla==");//Enunciado
            System.out.println("06 5)Manipulacao de Conjuntos com Listas=====");//Enunciado
            System.out.println("07 6)Remocao de Chaves Pares=================");//Enunciado
            System.out.println("08 7)Manipulacao de Caracteres em Listas=====");//Enunciado

            System.out.println("\n==========Digite 0 para Encerrar=============");//Enunciado

            System.out.println("\n======Por favor escolha uma opcao: ==========");//Enunciado
            opcao = Integer.parseInt(reader.nextLine());//armazena o valor
            switch(opcao){//Analise do que foi digitado

                case 1://Chama o procedimento
                    Act_1.main(args);
                    break;//Condição de parada
                case 2://Chama o procedimento
                    Act_2.main(args);
                    break;//Condição de parada
                case 3://Chama o procedimento
                    Exercises.Exercise_3();
                    break;//Condição de parada
                case 4://Chama o procedimento
                    Exercises.Exercise_3_A();
                    break;//Condição de parada
                case 5://Chama o procedimento
                    Act_4.main(args);
                    break;//Condição de parada
                case 6://Chama o procedimento
                    Act_5.main(args);
                    break;//Condição de parada
                case 7://Chama o procedimento
                    Exercises.Exercise_6();
                    break;//Condição de parada
                case 8://Chama o procedimento
                    Exercises.Exercise_7();
                    break;//Condição de parada
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                        System.out.println("\n===============Muito obrigado================");
                        System.out.println("\n=Saindo de Atividade Teorica TAFs Flexiveis =");//Enunciado
                        System.out.println("====E voltando para Atividade Teorica TADs,==");
                        System.out.println("===============TAFs e Testes=================\n");//Enunciado
                        Main.Main.main(args);
                    }
                    else{//Se não estiver no intervalo, informa ao usuario
                        //e reapresenta o menu
                        System.out.println("\n============Opcao Invalida.==================");
                        System.out.println("======Tente novamente por gentileza!=========\n");
                    } 
            }      
        }while( opcao!=0);//Se repetira enquanto não for zero
        
    }
}