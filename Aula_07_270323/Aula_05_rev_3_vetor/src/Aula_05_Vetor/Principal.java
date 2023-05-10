package Aula_05_Vetor;
//Codigo mantido igual a Aula_5_rev_2
import java.util.*;//Simplificação das bibliotecas necessarias
import Aula_05_Vetor.Lista;
public class Principal {
    
    public static void main(String[] args) {//Declaração do Main do programa
        Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        
        int opcao;//Variavel de escolha
        
        do{
            //Enunciado
            System.out.println("\n\t      Gestao de Duendes");
            //Menu de Opções
            System.out.println("\t       Menu de Opcoes:");
            System.out.println("\n\t  1)Cadastro de Duendes");
            System.out.println("\t  2)Lista de Duendes");
            System.out.println("\t  3)Ordenacao de Registro");
            System.out.println("\t  4)Criacao de Equipes");            
            System.out.println("\n\t\t0)Sair");
            //Solicitação ao usuário
            System.out.println("\n\t     Por gentileza\n\t   Escolha uma opcao:\t");
            //Vincula a entrada do programa com a variavel 
            opcao = reader.nextInt();
            switch(opcao){//Analise do que foi digitado
                case 1://Chama o procedimento
                    
                	Lista.cadastro();//Cadastra os Duendes
                	
                    break;//Condição de parada
                case 2://Chama o procedimento
                    
                    Lista.listaDuende();//Lista os Duendes
                   
                    break;//Condição de parada
                case 3://Chama o procedimento
                    
                	//Lista.Ordenate_sort();
                	
                    break;//Condição de parada
                case 4://Chama o procedimento
                    
                	Lista.cadastrar_Time();//Cadastra os Times de Duendes
                    
                    break;//Condição de parada
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                        System.out.println("\t    Gestao de Duendes");
                        System.out.println("Muito Obrigado, por usar nossos servicos.");
                        System.out.println("\t   Programa Encerrado");
                        System.exit(0);//Encerra o programa
                    }
                    else{//Se não estiver no intervalo, informa ao usuario
                        //e reapresenta o menu
                        System.out.println("\tOpcao Invalida.");
                        System.out.println("\nTente novamente por gentileza!!\n");
                    } 
            }      
        }while( opcao!=0);//Se repetira enquanto não for 
    }
}