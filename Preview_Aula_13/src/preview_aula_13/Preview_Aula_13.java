
package preview_aula_13;

import java.util.*;

public class Preview_Aula_13 {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        int opcao;//Variavel de escolha
    do{
            System.out.println("===== Atividade Teorica TADs Lineares =======\n");//Enunciado

            System.out.println("=============Menu de Exercicos===============");//Enunciado

            System.out.println("===01 - Gestao de Matriz Flexivel============");//Enunciado
            System.out.println("===02 - Gestao de Lista Flexivel Simples=====");//Enunciado
            System.out.println("===03 - Gestao de Lista Flexivel Dupla=======");//Enunciado
            System.out.println("===04 - Gestao de Fila Flexivel Simples======");//Enunciado
            System.out.println("===05 - Gestao de Fila Flexivel Dupla=======");//Enunciado
            System.out.println("===06 - Gestao de Pilha Flexivel Simples=====");//Enunciado
            System.out.println("===07 - Gestao de Pilha Flexivel Dupla=======");//Enunciado
            System.out.println("===08 - Gestao de Arvore Binaria=============");//Enunciado
            System.out.println("===09 - =====================================");//Enunciado
            System.out.println("===10 - =====================================");//Enunciado

            System.out.println("\n==========Digite 0 para Encerrar=============");//Enunciado

            System.out.println("\n======Por favor escolha uma opcao: ==========");//Enunciado
            opcao = Integer.parseInt(reader.nextLine());//armazena o valor
            switch(opcao){//Analise do que foi digitado

                case 1://Chama o procedimento
                    Principal.main(args);
                    break;//Condição de parada
                case 2://Chama o procedimento
                    Lista_Simples.main(args);
                    break;//Condição de parada
                case 3://Chama o procedimento
                    
                    break;//Condição de parada
                case 4://Chama o procedimento
                    
                    break;//Condição de parada
                case 5://Chama o procedimento
                    
                    break;//Condição de parada
                case 6://Chama o procedimento
                    
                    break;//Condição de parada
                case 7://Chama o procedimento
                    
                    break;//Condição de parada
                case 8://Chama o procedimento
                    
                    break;//Condição de parada
                case 9://Chama o procedimento
                    
                    break;//Condição de parada
                case 10://Chama o procedimento
                    
                    break;//Condição de parada
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                        System.out.println("\n===============Muito obrigado================");
                        System.out.println("===== Atividade Teorica TADs Flexiveis ======\n");//Enunciado
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
