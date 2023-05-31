package Main;//Nome do Subprojeto
import java.util.*;//Simplificação de bibliotecas necessarias 
import Generics.BST_Tree;
public class G_Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        int opcao;//Variavel de escolha
        do{
            BST_Tree<Integer> Tree=new BST_Tree<>();
            System.out.println("\n=======Atividade Pratica BST e Generics======\n");//Enunciado

            System.out.println("=====Generics - Menu de Exercicos============");//Enunciado

            System.out.println("===A) - Inserir Generics=====================");//Enunciado
            System.out.println("===B) - Pesquisar Generics===================");//Enunciado
            System.out.println("===C) - Remover Generics=====================");//Enunciado
            System.out.println("===D) - Caminhar Pre-Order===================");//Enunciado
            System.out.println("===E) - Caminhar Central=====================");//Enunciado
            System.out.println("===F) - Caminhar Pos-Order===================");//Enunciado
            System.out.println("\n==========Digite 0 para Encerrar=============");//Enunciado

            System.out.println("\n======Por favor escolha uma opcao: ==========");//Enunciado
            opcao = Integer.parseInt(reader.nextLine());//armazena o valor
            switch(opcao){//Analise do que foi digitado

                case 1://Chama o procedimento
                	letra_A(Tree);//Inserir
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
    public static void letra_A(BST_Tree<Integer> Tree) {
        System.out.println("===A) - Inserir Generics=====================");//Enunciado
            int arr[]={19,17,15,13,11,9,7,5,3,1};//Vetor base

            for(int i=0;i<arr.length;i++){
                Tree.inserir(arr[i]);
            }
            Tree.caminharCentral(Tree.raiz);
        System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_B() {
        System.out.println("===B) - Inserir Inteiros=====================");//Enunciado
        
        System.out.println("===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_C() {
        System.out.println("===C) - Inserir Inteiros=====================");//Enunciado
        
        System.out.println("===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_D() {
        System.out.println("===D) - Inserir Inteiros=====================");//Enunciado
        
        System.out.println("===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_E() {
        System.out.println("===E) - Inserir Inteiros=====================");//Enunciado
        
        System.out.println("===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_F() {
        System.out.println("===F) - Inserir Inteiros=====================");//Enunciado
        
        System.out.println("===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
}