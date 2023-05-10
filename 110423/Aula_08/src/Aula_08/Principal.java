package Aula_08;//Nome do Projeto

//Codigo para atividade 08_B

/*
 OBS. IMPORTANTE: Classes com Main Próprio para facilitar 
 a organização do código, e me pareceu mais prático 
 além de me permitir testar uma técnica nova para mim.
 
 Muito obrigado pela ajuda e incentivo.
 
 */

import java.util.*;//Simplificação de bibliotecas necessarias ao projeto

public class Principal {//declaração da classe

	public static void main(String[] args) {
		
		Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        
        int opcao;//Variavel de escolha
        
        do{
            
        	System.out.println("=====Analise de Dados TAD=====");//Enunciado
            System.out.println("=======Menu de opcoes:========\n");//Enunciado
            
    		System.out.println("=========01 - Lista===========");//Enunciado
    		System.out.println("=========02 - Fila============");//Enunciado
    		System.out.println("=========03 - Pilha===========");//Enunciado
    		System.out.println("\n========= 0 - Sair============");//Enunciado
            System.out.println("\n======Escolha uma opcao:======");
            
            opcao = reader.nextInt();
            switch(opcao){//Analise do que foi digitado
                
                case 1://Chama o procedimento
                    
                	Lista.main(args);//Main da classe Lista
                	
                    break;//Condição de parada
                case 2://Chama o procedimento

                	Fila.main(args);//Main da classe Fila
                   
                    break;//Condição de parada
                case 3://Chama o procedimento
                    
                	Pilha.main(args);//Main da classe Pilha
                	                	
                    break;//Condição de parada
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                    	System.out.println("\n========Muito obrigado========");
                    	System.out.println("=====Analise de Dados TAD=====");//Enunciado
                        System.exit(0);//Encerra o programa
                    }
                    else{//Se não estiver no intervalo, informa ao usuario
                        //e reapresenta o menu
                        System.out.println("=======Opcao Invalida.========");
                        System.out.println("Tente novamente por gentileza!\n");
                    } 
            }      
        }while( opcao!=0);//Se repetira enquanto não for zero
	}
}
