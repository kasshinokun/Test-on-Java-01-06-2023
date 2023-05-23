package Main;//Nome do Subprojeto

import java.util.*;//Simplificação de Bibliotecas necessárias
import TAF.*;//Package para Lista Simples Encadeada e outros TAFs

public class Act_7 {
    static Scanner reader = new Scanner(System.in);
    //Variavel global para entrada do teclado na classe
        
    public static void main(String[] args) {//Main da classe
        
        int opcao;//Variavel de escolha

        do{
            System.out.println("07 - Manipulacao de Listas Encadeadas Simples");//Enunciado

            System.out.println("===========Menu de Sub-exercicos=============");//Enunciado
            System.out.println("=1) - A)Verificacao de numero em Lista=======");//Enunciado
            System.out.println("=2) - B)Insercao mantendo a ordenacao========");//Enunciado
            System.out.println("=3) - C)Remocao de elemento==================");//Enunciado
            System.out.println("=4) - D)Impressão da Lista===================");//Enunciado
            System.out.println("=5) - E)Copiar Lista para outra Lista========");//Enunciado
            System.out.println("=6) - F)Concatenar Duas Listas===============");//Enunciado
            System.out.println("=7) - G)Intercalar Duas Listas===============");//Enunciado
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
                        System.out.println("\n==========Saindo da Atividade 07=============");//Enunciado
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
        System.out.println("\n=1) - A)Verificacao de numero em Lista=======");//Enunciado
        Lista_Simples lista=new Lista_Simples();
        lista=criarLista();
        System.out.print("Digite um numero por favor:-------------");//Enunciado
        int value=Integer.parseInt(reader.nextLine());//armazena o valor
        lista.buscarNumero(value);
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_B(){
        System.out.println("\n=2) - B)Insercao mantendo a ordenacao========");//Enunciado
        Lista_Simples lista=new Lista_Simples();
        lista=criarLista();
        System.out.print("Digite um numero por favor:-------------");//Enunciado
        int value=Integer.parseInt(reader.nextLine());//armazena o valor
        lista.inserirOrdenado(value);
        System.out.println("=============================================\n");//Enunciado
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_C(){
        System.out.println("\n=3) - C)Remocao de elemento==================");//Enunciado
        Lista_Simples lista=new Lista_Simples();
        lista=criarLista();       
        lista.mostrar();
        System.out.print("\nDigite um numero para remover:-------------");//Enunciado
        int value=Integer.parseInt(reader.nextLine());//armazena o valor
        value=lista.removerElemento(value);
        System.out.println("Apos a remocao do numero "+value+" da Lista:");//Enunciado
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_D(){
        System.out.println("\n=4) - D)Impressão da Lista===================");//Enunciado
        Lista_Simples lista=new Lista_Simples();
        lista=criarLista();
        lista.mostrar();
        System.out.println("\n=============================================");//Enunciado
        System.out.println("\nExecutando letra: B-Inserir 12; e C-remover 5\n");
        lista.inserirOrdenado(12);
        lista.removerElemento(5);
        System.out.println("\nApos procedimentos===========================");//Enunciado
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_E(){
        System.out.println("\n=5) - E)Copiar Lista para outra Lista========");//Enunciado
        Lista_Simples lista=new Lista_Simples();
        System.out.print("\nLista 1: ");
        lista=criarLista();
        lista.mostrar();
        System.out.print("\nLista 2: ");
        Lista_Simples lista2=new Lista_Simples();
        lista2=lista.copiarLista(lista2);
        lista2.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static void letra_F(){
        System.out.println("\n=6) - F)Concatenar Duas Listas===============");//Enunciado
        Lista_Simples lista=new Lista_Simples();
        Lista_Simples lista2=new Lista_Simples();
        System.out.print("\nLista 1: ");
        lista=criarLista();
        lista2=criarLista();
        lista.mostrar();
        System.out.print("\nLista 2: ");
        lista2.mostrar();
        System.out.println("\nApos Concatenar as Listas:");//Enunciado
        lista=lista.concatenarLista(lista2);
        System.out.print("Lista 1: ");
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
    }private static void letra_G(){
        System.out.println("\n=7) - G)Intercalar Duas Listas===============");//Enunciado
        Lista_Simples lista=new Lista_Simples();
        Lista_Simples lista2=new Lista_Simples();
        System.out.print("\nLista 1: ");
        lista=criarLista();
        lista2=criarLista();
        lista.mostrar();
        System.out.print("\nLista 2: ");
        lista2.mostrar();
        System.out.println("\nApos Intercalar as Listas:");//Enunciado
        lista=lista.intercalarLista(lista2);
        System.out.print("Lista 1: ");
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
    }
    private static Lista_Simples criarLista(){
        int arr[]={1,2,3,4,5,6,7,8,9};//Vetor base
        Lista_Simples lista=new Lista_Simples();
        for(int i=0;i<arr.length;i++){
            lista.inserirFim(arr[i]);
        }
        
        return lista;
    }
    
}
