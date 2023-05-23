package Main;//Nome do Sub-Projeto


import java.util.*;//simplificação de Bibliotecas 

public class Principal {

    public static void main(String[] args) {//Main da classe
        
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        
        int opcao;//Variavel de escolha

        do{
            System.out.println("===== Atividade Teorica TAFs Flexiveis ======\n");//Enunciado

            System.out.println("=============Menu de Exercicos===============");//Enunciado

            System.out.println("===01 - Comparacao de Metodos de Ordenacao ==");//Enunciado
            System.out.println("===02 - Comparacao MergeSort, QuickSort e====");//Enunciado
            System.out.println("================== HeapSort =================");//Enunciado
            System.out.println("==03 - Analise via grafico em PDF (Sem Codigo)");//Enunciado
            System.out.println("04 - Manipulacao de Listas Encadeadas Simples");//Enunciado
            System.out.println("===05 - Analise de Itens que se repetem =====");//Enunciado
            System.out.println("============por multiplo de 3 vezes==========");//Enunciado
            System.out.println("06 - Manipulacao de Listas Encadeadas Simples");//Enunciado
            System.out.println("07 - Manipulacao de Listas Encadeadas Simples");//Enunciado
            System.out.println("===08 - Gestao de Lista de Sites=============");//Enunciado
            System.out.println("09 - Manipulacao de Listas Encadeadas Dupla==");//Enunciado
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
                    Act_4.main(args);
                    break;//Condição de parada
                case 5://Chama o procedimento
                    Exercises.Exercise_5();
                    break;//Condição de parada
                case 6://Chama o procedimento
                    Act_6.main(args);
                    break;//Condição de parada
                case 7://Chama o procedimento
                    Act_7.main(args);
                    break;//Condição de parada
                case 8://Chama o procedimento
                    Exercises.Exercise_8();
                    break;//Condição de parada
                case 9://Chama o procedimento
                    Act_9.main(args);
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
                        System.exit(0);//Encerra o programa
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