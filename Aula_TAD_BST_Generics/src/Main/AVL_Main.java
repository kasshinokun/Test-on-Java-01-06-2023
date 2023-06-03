package Main;//Nome do Subprojeto
import java.util.*;//Simplificação de bibliotecas necessarias 

import BST.AVL.*;//Arvore Binaria AVL(Em desenvolvimento)

;public class AVL_Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        int opcao;//Variavel de escolha
        do{
            AVL Arvore= new AVL();
            System.out.println("\n=======Atividade Pratica BST e Generics======\n");//Enunciado

            System.out.println("=====AVL - Inteiros - Menu de Exercicos======");//Enunciado

            System.out.println("===A) - Inserir Inteiros=====================");//Enunciado
            System.out.println("===B) - Pesquisar Inteiros===================");//Enunciado
            System.out.println("===C) - Remover Inteiros=====================");//Enunciado
            System.out.println("===D) - Caminhar Pre-Order===================");//Enunciado
            System.out.println("===E) - Caminhar Central=====================");//Enunciado
            System.out.println("===F) - Caminhar Pos-Order===================");//Enunciado
            System.out.println("\n==========Digite 0 para Encerrar=============");//Enunciado

            System.out.println("\n======Por favor escolha uma opcao: ==========");//Enunciado
            opcao = Integer.parseInt(reader.nextLine());//armazena o valor
            switch(opcao){//Analise do que foi digitado

                case 1://Chama o procedimento
                	letra_A(Arvore);//Inserir
                    break;//Condição de parada
                case 2://Chama o procedimento
                	letra_B();//pesquisar 
                    break;//Condição de parada
                case 3://Chama o procedimento
                	letra_C();//remover 
                    break;//Condição de parada
                case 4://Chama o procedimento
                	letra_D();//caminharPre() 
                    break;//Condição de parada
                case 5://Chama o procedimento
                	letra_E();//void caminharCentral()
                    break;//Condição de parada
                case 6://Chama o procedimento
                	letra_F();//caminharPos() 
                    break;//Condição de parada
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                        System.out.println("\n===============Muito obrigado================");
                        System.out.println("=======Retornando ao Menu da Atividade=======\n");//Enunciado
                        Main.main(args);
                    }
                    else{//Se não estiver no intervalo, informa ao usuario
                        //e reapresenta o menu
                        System.out.println("\n============Opcao Invalida.==================");
                        System.out.println("======Tente novamente por gentileza!=========\n");
                    } 
            }      
        }while(opcao!=0);//Se repetira enquanto não for zero
    }
    public static void letra_A(AVL Arvore) {
        System.out.println("===A) - Inserir Inteiros=====================");//Enunciado
        int arr[]={1,2,3,4,5,6,7,8,9};//Vetor base
        
        for(int i=0;i<arr.length;i++){
            Arvore.inserir(arr[i]);
        }
        Arvore.caminharCentral(Arvore.raiz);
        System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_B() {
        System.out.println("===B) - Inserir Inteiros=====================");//Enunciado
        
        System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_C() {
        System.out.println("===C) - Inserir Inteiros=====================");//Enunciado
        
        System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_D() {
        System.out.println("===D) - Inserir Inteiros=====================");//Enunciado
        
        System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_E() {
        System.out.println("===E) - Inserir Inteiros=====================");//Enunciado
        
        System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_F() {
        System.out.println("===F) - Inserir Inteiros=====================");//Enunciado
        
        System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
}



