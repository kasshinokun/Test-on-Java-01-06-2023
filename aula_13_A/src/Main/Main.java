package Main;//Nome do Subprojeto
import java.util.*;//Simplificação de bibliotecas necessarias 

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        int opcao;//Variavel de escolha
        do{
            System.out.println("\n===Atividade Pratica TAFs Hibridas===========\n");//Enunciado

            System.out.println("=============Menu de Exercicos===============");//Enunciado

            System.out.println("===01 - Gestao de Lista de Contatos==========");//Enunciado
            System.out.println("===02 - Gestao de Lista de Contatos==========");//Enunciado
            System.out.println("===03 - Gestao de Lista de Contatos==========");//Enunciado
            System.out.println("===04 - Gestao de Lista de Contatos==========");//Enunciado
            System.out.println("===05 - Gestao de Matriz de Inteiros=========");//Enunciado
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
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                        System.out.println("\n===============Muito obrigado================");
                        System.out.println("===Atividade Pratica TAFs Hibridas===========\n");//Enunciado
                        System.exit(0);//Encerra o programa
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