package Aula_08;//Nome do Projeto

//Codigo para atividade 08_B

import java.util.*;//Simplificação de bibliotecas necessarias ao projeto

public class Principal_Base {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
        
        int opcao;//Variavel de escolha
        
        do{
        	System.out.println("===Codigo Main Simplificado===");//Enunciado
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
                    clsLista();
                    break;//Condição de parada
                case 2://Chama o procedimento

                	clsFila();//Main da classe Fila
                   
                    break;//Condição de parada
                case 3://Chama o procedimento
                    
                	clsPilha();//Main da classe Pilha
                	                	
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
	public static void clsLista() {//procedimento para lista
		System.out.println("\n=====Analise de Dados TAD=====");//Enunciado
		System.out.println("=========01 - Lista===========\n");//Enunciado
		
		System.out.println("==Insercao de Dados na Lista==");//Enunciado
    	
		Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
		
		String texto;//Variavel receber as Strings
		
		Lista L1= new Lista(5);//Instancia um objeto do tipo Lista
		
		System.out.println("\n=Insercao de Dados no Inicio==");//Enunciado
		
		//Inserção unica
		System.out.print("Digite String 0"+(L1.n+1)+":......");//Solicita ao usuario
        texto = reader.nextLine();//Armazena valor
        L1.InserirInicio(texto);//Adiciona String no Vetor no Inicio
        System.out.print("Digite String 0"+(L1.n+1)+":......");//Solicita ao usuario
        texto = reader.nextLine();//Armazena valor
        L1.InserirInicio(texto);//Adiciona String no Vetor no Inicio
		
        //AdicionarInicio(L1);//Adição de Strings até preencher o vetor
		
        L1.Mostrar();//Exibe o vetor
		
		System.out.println("\n=Insercao de Dados na Posicao=");//Enunciado
		
		int pos;//Variavel para posição designada
		System.out.print("Digite String 0"+(L1.n+1)+":......");//Solicita ao usuario
		texto = reader.nextLine();//Armazena valor
		System.out.println("Digite Posicao desejada:");//Solicitação ao usuario
		pos=Integer.parseInt(reader.nextLine());//Armazena valor
		L1.InserirPosicao(texto,pos);//Adiciona String no Vetor na Posição designada
		
		System.out.print("Digite String 0"+(L1.n+1)+":......");//Solicita ao usuario
		texto = reader.nextLine();//Armazena valor
		System.out.println("Digite Posicao desejada:");//Solicitação ao usuario
		pos=Integer.parseInt(reader.nextLine());//Armazena valor
		L1.InserirPosicao(texto,pos);//Adiciona String no Vetor na Posição designada
		
        L1.Mostrar();//Exibe o vetor
        
        System.out.println("\n===Insercao de Dados no Fim===");//Enunciado
		
        System.out.print("Digite String 0"+(L1.n+1)+":......");//Solicita ao usuario
        texto = reader.nextLine();//Armazena valor
        L1.InserirFim(texto);//Adiciona String no Fim do Vetor
        System.out.print("Digite String 0"+(L1.n+1)+":......");//Solicita ao usuario
        texto = reader.nextLine();//Armazena valor
        L1.InserirFim(texto);//Adiciona String no Fim do Vetor
        
		System.out.println("\n===Remocao de Dados no Inicio=");//Enunciado
		
		//ApagarInicio(L1);//Remoção de Strings até esvaziar o vetor
		
		texto=L1.RemoverInicio();//Remove no Inicio e retorna String
	    System.out.println("String Apagada:....: "+texto);//Exibe a String removida    	
		L1.Mostrar();//Exibe vetor
		
		System.out.println("\n==Remocao de Dados na Posicao=");//Enunciado
		
		System.out.println("Digite Posicao desejada:");//Solicitação ao usuario
		pos=Integer.parseInt(reader.nextLine());//Armazena valor
		
        texto=L1.RemoverPosicao(pos);//Remove String no Vetor na Posição designada
        System.out.println("String Apagada:....: "+texto);//Exibe a String removida
        L1.Mostrar();//Exibe o vetor
        
		System.out.println("\n====Remocao de Dados no Fim===");//Enunciado
		
		texto=L1.RemoverFim();//Remove no Fim e retorna String
	    System.out.println("String Apagada:....: "+texto);//Exibe a String removida    	
		L1.Mostrar();//Exibe vetor
		
		System.out.println("\n=========Retornando===========");//  Informação
		System.out.println("======Ao  Menu Inicial========\n");//ao Usuario  
	}
	public static void clsFila(){//procedimento para fila
		System.out.println("\n=====Analise de Dados TAD=====");//Enunciado
		System.out.println("=========02 - Fila============\n");//Enunciado
		
		Scanner reader = new Scanner(System.in);
        //Variavel para entrada do teclado
    	
		String texto;//Variavel receber as Strings
		
    	Fila F1= new Fila(5);//Instancia um objeto do tipo Fila
		
		System.out.println("==Insercao de Dados na Fila===");//Enunciado
		//Inserção unica
		System.out.print("Digite String 0"+(F1.U+1)+":......");//Solicita ao usuario
        texto = reader.nextLine();//Armazena valor
        F1.Inserir(texto);//Adiciona String no Vetor no Inicio
        System.out.print("Digite String 0"+(F1.U+1)+":......");//Solicita ao usuario
        texto = reader.nextLine();//Armazena valor
        F1.Inserir(texto);//Adiciona String no Vetor no Inicio
		
        //F1.Adicionar(F1);//Adição de Strings até preencher o vetor
        
        F1.Mostrar();//Exibe o vetor
		
		System.out.println("\n===Remocao de Dados na Fila===");//Enunciado
		texto=F1.Remover();//Remove e retorna String
	    System.out.println("String Apagada:....: "+texto);//Exibe a String removida    	
	    System.out.println("====Apos Remover da Fila======");//Enunciado
	    F1.Mostrar();//Exibe vetor
	    texto=F1.Remover();//Remove e retorna String
	    System.out.println("String Apagada:....: "+texto);//Exibe a String removida    	
	    System.out.println("====Apos Remover da Fila======");//Enunciado
	    F1.Mostrar();//Exibe vetor
		
	    //F1.Apagar(F1);//Remoção de Strings até esvaziar o vetor
		
	    System.out.println("\n=========Retornando===========");//  Informação
		System.out.println("======Ao  Menu Inicial========\n");//ao Usuario
	}
	public static void clsPilha() {//procedimento para pilha
		System.out.println("\n=====Analise de Dados TAD=====");//Enunciado
		System.out.println("=========03 - Pilha===========\n");//Enunciado
		
		System.out.println("==Insercao de Dados na Pilha==");//Enunciado
    	
		//Variavel para entrada do teclado
		Scanner reader = new Scanner(System.in);
    	
    	Pilha P1= new Pilha(6);//Instancia um objeto do tipo Pilha
    	
    	String texto;//Variavel para adiciona strings no vetor
    	
    	//Inserção unica
        System.out.println("Digite String 0"+(P1.n+1)+":.............");//Solicita ao usuario
        texto = reader.nextLine();//Armazena valor 
  		P1.Empilhar(texto);//Adiciona String no Vetor
  		System.out.println("Digite String 0"+(P1.n+1)+":.............");//Solicita ao usuario
        texto = reader.nextLine();//Armazena valor 
  		P1.Empilhar(texto);//Adiciona String no Vetor
    
        System.out.println("========Inserir Modo 1========");//Enunciado  
		P1.Mostrar1();//Exibe vetor
		System.out.println("========Inserir Modo 2========");//Enunciado
		P1.Mostrar2();//Exibe vetor
		
		//Adicionar(P1);//Envia pilha ao Procedimento e adiciona até preencher a pilha
		
		//Remoção unica
		System.out.println("\n===Remocao de Dados da Pilha==");//Enunciado
		
		String resp=P1.Desempilhar();//Remove e retorna String
    	System.out.println("String Apagada:....: "+resp);//Exibe a String removida
    	System.out.println("========Remover Modo 1========");//Enunciado  
		P1.Mostrar1();//Exibe vetor
		System.out.println("========Remover Modo 2========");//Enunciado
		P1.Mostrar2();//Exibe vetor
		
		//Apagar(P1);//Envia pilha ao Procedimento e remove até tornar vazio a pilha
		
		System.out.println("\n=========Retornando===========");//  Informação
		System.out.println("======Ao  Menu Inicial========\n");//ao Usuario
	}
}
