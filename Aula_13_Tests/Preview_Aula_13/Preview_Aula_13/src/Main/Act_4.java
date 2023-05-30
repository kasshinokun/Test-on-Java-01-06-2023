package Main;//Nome do Subprojeto

import java.util.*;//Simplificação de Bibliotecas necessárias
import Sort.*;
public class Act_4 {
    public static Scanner reader=new Scanner(System.in);
    //Objeto Scanner para Entrada global do teclado
    
    public static void main(String[] args) {//Main da classe
        
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        
        int opcao;//Variavel de escolha

        do{
            System.out.println("04 - Manipulacao de Listas Encadeadas Simples");//Enunciado
                        
            System.out.println("===========Menu de Sub-exercicos=============");//Enunciado
            System.out.println("1-A)Exibir termos menores que k em tempo O(n)");//Enunciado
            System.out.println("2-B)Ordenar e Exibir (termos<k) em tempo O(n)");//Enunciado
            
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
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                        System.out.println("\n===============Muito obrigado================");
                        System.out.println("\n==========Saindo da Atividade 04=============");//Enunciado
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
        int a=0;
        System.out.println("\n==A)Exibir termos menores que k em tempo O(n)\n");//Enunciado
        do{
            System.out.println("escolha um valor para k diferente de zero:");
            a=Integer.parseInt(reader.nextLine());//armazena o valor//armazena o valor
        }while(a==0);
        
        int arr[]={1,8,2,4,5,6,9,12,17,3};
        arr[4]=a;
        System.out.println("O valor para k equivale a:.........."+a);//Enunciado
        System.out.println("=============================================");
        System.out.println("Termos menores que K:");//Enunciado
        for(int i=0;i<10;i++){
            if(arr[i]<arr[4]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_B(){
        int a;
        System.out.println("\n2-B)Ordenar e Exibir (termos<k) em tempo O(n)");//Enunciado
        do{
            System.out.println("escolha um valor para k diferente de zero:");
            a=Integer.parseInt(reader.nextLine());//armazena o valor//armazena o valor
        }while(a==0);
        
        int arr[]={1,8,2,4,5,6,9,12,17,3};
        arr[4]=a;
        Another array=new Another(arr);
        System.out.println("O valor para k equivale a:.........."+a);//Enunciado
        System.out.println("\nOs metodos mais proximos da Execucao O(n) sao:");//Enunciado
        System.out.println("Counting Sort e Bucket Sort");//Enunciado
        System.out.println("A seguir adaptacao de codigo Java e C para");
        System.out.println("ordenar usando Counting Sort\n");//Enunciado
        array.countingsort(a);
        System.out.println("\n=============================================\n");//Enunciado
        
    }
    
}
