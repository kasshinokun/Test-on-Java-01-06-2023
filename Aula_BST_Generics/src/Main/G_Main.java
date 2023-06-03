package Main;//Nome do Subprojeto
import java.util.*;//Simplificação de bibliotecas necessarias 
import Generics.Tree;
public class G_Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        int opcao;//Variavel de escolha
        do{
            Tree<Integer> Arvore=new Tree<>();
            System.out.println("\n=======Atividade Pratica BST e Generics======\n");//Enunciado

            System.out.println("=====Generics - Menu de Exercicos============");//Enunciado
            
            System.out.println("===1) - Executar Metodos=====================");//Enunciado
            /*  //Só está salvando em tempo de execução(precisaria ser com retorno)
            System.out.println("===A) - Inserir Generics=====================");//Enunciado
            System.out.println("===B) - Pesquisar Generics===================");//Enunciado
            System.out.println("===C) - Remover Generics=====================");//Enunciado
            System.out.println("===D) - Caminhar Pre-Order===================");//Enunciado
            System.out.println("===E) - Caminhar Central=====================");//Enunciado
            System.out.println("===F) - Caminhar Pos-Order===================");//Enunciado
            System.out.println("\n==========Digite 0 para Encerrar=============");//Enunciado
            */
            System.out.println("\n======Por favor escolha uma opcao: ==========");//Enunciado
            opcao = Integer.parseInt(reader.nextLine());//armazena o valor
            switch(opcao){//Analise do que foi digitado

                case 1://Chama o procedimento
                	letra_A(Arvore);//Inserir
                    break;//Condição de parada
                case 2://Chama o procedimento
                	letra_B(Arvore);//pesquisar 
                    break;//Condição de parada
                case 3://Chama o procedimento
                	letra_C(Arvore);//remover 
                    break;//Condição de parada
                case 4://Chama o procedimento
                	letra_D(Arvore);//caminharPre() 
                    break;//Condição de parada
                case 5://Chama o procedimento
                	letra_E(Arvore);//void caminharCentral()
                    break;//Condição de parada
                case 6://Chama o procedimento
                	letra_F(Arvore);//caminharPos() 
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
    public static void letra_A(Tree<Integer> Arvore) {
        System.out.println("===A) - Inserir Generics=====================");//Enunciado
        int arr[]={19,17,15,13,11,9,7,5,3,1};//Vetor base
        System.out.println("Inserindo Inteiros.......");//Enunciado
        for(int i=0;i<arr.length;i++){
            Arvore.inserir(arr[i]);
        }
        letra_B(Arvore);//Pesquisa
        letra_C(Arvore);//Remoção
        letra_D(Arvore);//Caminhar Pre
        letra_E(Arvore);//Caminhar Central
        letra_F(Arvore);//Caminhar Pos
            
        System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_B(Tree<Integer> Arvore) {
        System.out.println("\n===B) - Pesquisar Inteiros===================");//Enunciado
        Arvore.pesquisar(5);
        Arvore.pesquisar(18);
        System.out.println("\n=============================================\n");//Enunciado
        //System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_C(Tree<Integer> Arvore) {
        System.out.println("\n===C) - Remover Inteiros=====================");//Enunciado
        Arvore.remover(5);
        Arvore.remover(18);
        System.out.println("\n=============================================\n");//Enunciado
        //System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_D(Tree<Integer> Arvore) {
        System.out.println("\n===D) - Caminhar Pre-Order===================");//Enunciado
        Arvore.caminharPre(Arvore.raiz);
        System.out.println("\n=============================================\n");//Enunciado
        //System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_E(Tree<Integer> Arvore) {
        System.out.println("\n===E) - Caminhar Central=====================");//Enunciado
        Arvore.caminharCentral(Arvore.raiz);
        System.out.println("\n=============================================\n");//Enunciado
        //System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
    public static void letra_F(Tree<Integer> Arvore) {
        System.out.println("\n===F) - Caminhar Pos-Order===================");//Enunciado
        Arvore.caminharPos(Arvore.raiz);
        System.out.println("\n=============================================\n");//Enunciado
        //System.out.println("\n===Retornando ao Menu da Atividade-Inteiros==\n");//Enunciado
    }
}
