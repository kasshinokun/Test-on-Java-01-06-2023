package Aula_08;//Nome do Projeto

//Codigo para atividade 08_B

import java.util.*;//Simplificação de bibliotecas necessarias ao projeto

public class Pilha {//declaração da classe
    String[] pilha;//Vetor de Strings para a Pilha
    int n=0;//Variavel para analise da Pilha
 
    public Pilha(){//Construtor default
        this(6);//Instancia uma Pilha de String de tamanho 6
    }
    public Pilha(int tamanho){//Sobrecarga
        pilha =new String[tamanho];
    }
    public void Empilhar(String s){//Adição de Strings ao vetor
        if(n>=pilha.length){//Se n igual ou maior que o tamanho da pilha....
        	//Informa ao Usuario
        	System.out.println("\n========Nao e possivel========");
        	System.out.println("========inserir dados,========");
        	System.out.println("========Pilha Cheia===========\n");
        }else{//senao....
            pilha[n]=s;//Atribui o valor de s a posição na pilha
            n++;//incrementa N
        }
    
    }
    public String Desempilhar(){//Remoção de Strings ao vetor
        String resp;//Variavel de Retorno
        if(n==0){//Se n igual a zero....
        	//Informa ao Usuario
        	System.out.println("\n========Nao e possivel========");
        	System.out.println("========remover dados,========");
        	System.out.println("========Pilha Vazia===========\n");
        	return "Vazio";//Retorna a resp a String "Vazio"
        }else{//senao....
            resp=pilha[n-1];//resp recebe o valor da posição na pilha
            n--;//decrementa N
            return resp;//Retorna a resp ao Main
        }
    }
    public void Mostrar1(){//Mostra a pilha do topo a base
        for(int i=n-1;i>=0;i--){
            System.out.println(pilha[i]);//Exibe a string na posição
        }
    }
    public void Mostrar2(){//Mostra a pilha da base ao topo
        for(int i=0;i<n;i++){
            System.out.println(pilha[i]);//Exibe a string na posição
        }
    }
    
    //Codigos automaticos para Inserir e Apagar 
	
    public void Adicionar(Pilha P1) {//Adição Sequencial
    	
    	//Variavel para entrada do teclado
    	Scanner reader = new Scanner(System.in);
    	
    	String texto;//Variavel para adiciona strings no vetor
    	
    	//laço de repetição para a Inserção continua
        for(int i=0;i<=P1.pilha.length;i++){
            
        	if(i==P1.n) {//Condicional para tratar erro observado
            	
        		System.out.print("Digite String 0"+(P1.n+1)+":......");
	            texto = reader.nextLine();//Armazena valor 
	      		P1.Empilhar(texto);//Adiciona String no Vetor
            }
        }
    }
    public void Apagar(Pilha P1) {//Remoção Sequencial
    	
    	//Variavel para entrada do teclado
    	Scanner reader = new Scanner(System.in);
    	System.out.println("\n===Remocao de Dados da Pilha==");//Enunciado
		
		for(int i=0;i<=P1.pilha.length;i++){//laço de repetição para a remoção continua
	    	String resp=P1.Desempilhar();//Remove e retorna String
	    	
	    	System.out.println("String Apagada:....: "+resp);//Exibe a String removida
	    	
	    	System.out.println("======Exibir Pilha Modo 1=====");//Enunciado  
			P1.Mostrar1();//Exibe vetor
			System.out.println("======Exibir Pilha Modo 2=====");//Enunciado
			P1.Mostrar2();//Exibe vetor
			
		}
    }
    public static void main(String[] args) {//Main da Classe Pilha
    	
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
    
        System.out.println("======Exibir Pilha Modo 1=====");//Enunciado  
		P1.Mostrar1();//Exibe vetor
		System.out.println("======Exibir Pilha Modo 2=====");//Enunciado
		P1.Mostrar2();//Exibe vetor
		
		//Adicionar(P1);//Envia pilha ao Procedimento e adiciona até preencher a pilha
		
		//Remoção unica
		System.out.println("\n===Remocao de Dados da Pilha==");//Enunciado
		
		String resp=P1.Desempilhar();//Remove e retorna String
    	System.out.println("String Apagada:....: "+resp);//Exibe a String removida
    	System.out.println("======Exibir Pilha Modo 1=====");//Enunciado  
		P1.Mostrar1();//Exibe vetor
		System.out.println("======Exibir Pilha Modo 2=====");//Enunciado
		P1.Mostrar2();//Exibe vetor
		
		//Apagar(P1);//Envia pilha ao Procedimento e remove até tornar vazio a pilha
		
		System.out.println("\n=========Retornando===========");//  Informação
		System.out.println("======Ao  Menu Inicial========\n");//ao Usuario
    }
}