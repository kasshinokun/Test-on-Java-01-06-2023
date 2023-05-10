package Aula_08;//Nome do Projeto

//Codigo para atividade 08_B

import java.util.*;//Simplificação de bibliotecas necessarias ao projeto

public class Lista{//declaração da classe
	String[] lista;//Vetor de Strings para a Lista
    int n=0;//Variavel para analise da Lista
    public Lista(){//Construtor default
        this(5);//Instancia uma Lista de String de tamanho 5
    }
    public Lista(int tamanho){//Sobrecarga
    	lista =new String[tamanho];
    }
    public void InserirInicio(String s){//Adição de Strings no inicio do vetor
        if(n>=lista.length){//Se n igual ou maior que o tamanho da lista....
        	//Informa ao Usuario
        	System.out.println("\n========Nao e possivel========");
        	System.out.println("========inserir dados,========");
        	System.out.println("========Lista Cheia===========\n");
        }else{//senao....
        	for(int i=n;i>0;i--) {
        		lista[i]=lista[i-1];//Move as strings para o fim
        	}
        	lista[0]=s;//Atribui o valor de s a posição 0
            n++;//incrementa N
        }
    
    }
    public void InserirFim(String s){//Adição de Strings no fim do vetor
        if(n>=lista.length){//Se n igual ou maior que o tamanho da lista....
        	//Informa ao Usuario
        	System.out.println("\n========Nao e possivel========");
        	System.out.println("========inserir dados,========");
        	System.out.println("========Lista Cheia===========\n");
        }else{//senao....
        	lista[n]=s;//Atribui o valor de s a posição na lista
            n++;//incrementa N
        }
    
    }
    public void InserirPosicao(String s,int pos) {
    	//Inserção de Strings na posição designada do vetor
    	
    	if(n>=lista.length||pos<0||pos>n){
    		//Se n igual ou maior que o tamanho da lista....
    		//Ou também se pos menor que 0.... 
    		//Ou pos maior que n..... 
    		
        	//Informa ao Usuario
        	System.out.println("\n========Nao e possivel========");
        	System.out.println("========inserir dados,========");
        	System.out.println("====Parametros Invalidos !!===\n");
        }else{//senao....
        	for(int i=n;i>pos;i--) {
        		lista[i]=lista[i-1];
        		//Move as strings para o fim
        		//(Baseado na posição designada)
        	}
        	lista[pos]=s;//Atribui o valor de s a posição 0
            n++;//incrementa N
        }
    }
    public String RemoverInicio(){//Remoção de Strings no inicio do vetor
    	
        String resp;//Variavel de Retorno
        
        if(n==0){//Se n igual a zero....
        	//Informa ao Usuario
        	System.out.println("\n========Nao e possivel========");
        	System.out.println("========remover dados,========");
        	System.out.println("========Lista Vazia===========\n");
        	return "Vazio";//Retorna a resp a String "Vazio"
        }else{//senao....
            
        	resp=lista[0];//resp recebe o valor da posição 0 na lista
            n--;//decrementa N
            for(int i=0;i<n;i++) {
        		lista[i]=lista[i+1];//Move as strings para o inicio
        	}
            return resp;//Retorna a resp ao Main
        }
    }
    public String RemoverFim(){//Remoção de Strings no fim do vetor
        
        if(n==0){//Se n igual a zero....
        	//Informa ao Usuario
        	System.out.println("\n========Nao e possivel========");
        	System.out.println("========remover dados,========");
        	System.out.println("========Lista Vazia===========\n");
        	return "Vazio";//Retorna a resp a String "Vazio"
        }else{//senao....
            //decrementa o N e depois 
        	//retorna uma String 
        	//na posição N da lista  
        	return lista[--n];
        }
    }
    public String RemoverPosicao(int pos) {
    	//Remoção de Strings na posição designada do vetor
    	
    	if(n==0||pos<0||pos>=n){
    		//Se n igual a 0....
    		//Ou também se pos menor que 0.... 
    		//Ou pos maior ou igual a n..... 
    		
        	//Informa ao Usuario
        	System.out.println("\n========Nao e possivel========");
        	System.out.println("========inserir dados,========");
        	System.out.println("====Parametros Invalidos !!===\n");
        	return "String Invalida!!";
        }else{//senao....
        	String resp=lista[pos];//Atribui String na posição designada a resp
        	n--;//decrementa N
        	for(int i=pos;i<n;i++) {
        		lista[i]=lista[i+1];
        		//Move as strings para o inicio
        		//(Baseado na posição designada)
        	}
        	return resp;//Retorna a resp ao Main
        }
    }
    public void Mostrar() {//Exibe a Lista
    	if(n==0){//Se n igual a zero....
        	//Informa ao Usuario
        	System.out.println("\n====Nao existem dados,========");
        	System.out.println("========Lista Vazia===========\n");
    	}
    	else {//senao....
	    	for(int i=0;i<n;i++) {
	    		System.out.println(lista[i]);
	    	}
    	}
    }
  //Codigos automaticos para Inserir e Apagar no Inicio Apenas
	
  	public void AdicionarInicio(Lista L1){//Adição Sequencial
  		
  		Scanner reader = new Scanner(System.in);
          //Variavel para entrada do teclado
  		
  		for(int i=0;i<=L1.lista.length;i++){//laço de repetição
  			if(i==L1.n) {//Condicional para tratar erro observado
  				
  				System.out.print("Digite String 0"+(L1.n+1)+":......");//Solicita ao usuario
  	            //Instancia Variavel receber as Strings e Armazena valor
  	            String texto = reader.nextLine(); 
  	      		L1.InserirInicio(texto);//Adiciona String no Vetor
  			}
          }
  		System.out.println("\n=========Retornando===========");//Informação ao Usuario
  	}
  	public void ApagarInicio(Lista L1) {//Remoção Sequencial
      	
      	//Variavel para entrada do teclado
      	Scanner reader = new Scanner(System.in);
      	System.out.println("\n===Remocao de Dados da Pilha==");//Enunciado
  		
  		for(int i=0;i<=L1.lista.length;i++){//laço de repetição para a remoção continua
  			String texto=L1.RemoverInicio();//Remove no Fim e retorna String
  		    System.out.println("String Apagada:....: "+texto);//Exibe a String removida    	
  		    System.out.println("====Apos Remover no Inicio====");//Enunciado
  		    L1.Mostrar();//Exibe vetor
  		}
  		System.out.println("\n=========Retornando===========");//Informação ao Usuario
  	}
	public static void main(String[] args) {
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
}
