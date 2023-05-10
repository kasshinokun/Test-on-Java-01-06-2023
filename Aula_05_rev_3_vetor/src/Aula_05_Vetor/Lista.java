package Aula_05_Vetor;

/*Observação:

   Adaptação de ArrayList(Classe Lista) para Vetor 
   Alguns codigos mantidos como comentário 
*/
//Bibliotecas para execução
import java.util.*;//Simplificação das bibliotecas necessarias

//Classe para o ArrayList 

import java.util.Locale;
import java.util.Scanner;

public class Lista{//declaração da classe
    private static Duende[] Lista= new Duende[30];
    private static Time[] Equipe= new Time[(Lista.length/3)];
    public static int Tamanho=Lista.length;
    //Metodo de retorno do Array
    public Lista(){
        
    }
    //Metodos de adição e, analise para retorno ou atualização
    public static void cadastro(){//Cadastro dos Duendes
    
        Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        Duende objLista;//Atribui a Classe ao objeto
      
        //Variavel para entrada do teclado
        Scanner scanner = new Scanner(System.in);
                
        
        
        //Variaveis para Cadastro
        int idade;
        String nome;
        //Boas vindas
        //System.out.println("\nBem vindo ao Sistema de Cadastros de Duendes");
        System.out.println("===Bem=vindo=ao=Sistema=de=Cadastros=de=Duendes===\n");//Enunciado
	
        int op=1;
        
        for(int i=0;i<Tamanho&&op==1;i++){
            if(Lista[i]==null){
                //Nome do duende
                System.out.print("Digite o Nome:.......");
                nome = scanner.nextLine();
                //Idade do duende
                System.out.print("Digite a Idade:......");
                idade = Integer.parseInt(scanner.nextLine());
                //Envia do objeto a classe
                objLista = new Duende(nome,idade);
                //System.out.println(objLista);//Teste
                //Envia a função da classe
                Lista[i]=objLista;
                //System.out.println(Lista[i].toString());//Teste
                
                //Solicitação ao Usuario 
                System.out.println("==================================================");
                System.out.println("\nDigite 1 para cadastrar Duendes:");
                op = Integer.parseInt(scanner.nextLine());
            }
        }
    }
    
public static void listaDuende(){//Listagem 
      
        Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        
        if(Lista[0]==null){//se estiver vazia    
            System.out.println("================Sem=Registros=!!==================");
        }else{//se não estiver vazia
            System.out.println("================Lista=de=Duendes==================");//Enunciado
            System.out.println("\n==================================================");
            //laço de repetição
            for(int i=0; i<Tamanho;i++){//Variavel para Analise na Lista 
                if(Lista[i]!=null){
                    //System.out.println(Lista[i].toString());//Codigo original adaptado;
                    System.out.println("Nome:----------"+Lista[i].getNome());//.println(Lista[i]);  
                    System.out.println("Idade:---------"+Lista[i].getIdade());//.println(Lista[i]);  
                    System.out.println("==================================================");
                }
            }
        }
    }
	/*public static void Ordenate_Sort2() {//codigo para adaptação se o codigo final não funcionasse
		
	}
	public static void Ordenate_Sort_teste() {//teste inicial
		//Variavel para entrada do teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite um valor para i:");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("digite um valor para j:");
		int j=Integer.parseInt(scanner.nextLine());
		System.out.println("Antes");
		int a=0;
		int b=0;
		System.out.println("Antes: "+a+"\t"+b);
		if(Lista[i].getIdade()>Lista[j].getIdade()) {
			a = Lista[i].getIdade();
			b= Lista[j].getIdade();
			System.out.println("Depois: "+a+"\t"+b);
		}
	}*/
	public static void Ordenate_Sort() {//em Analise(Versão Final(03/04/2023))
		if(Lista[0]==null){//se estiver vazia    
            System.out.println("================Sem=Registros=!!==================");
        }else{//se não estiver vazia
        	//laço de repetição
            for(int i=0; i<Tamanho-1&&Lista[i]!=null;i++){//Variavel para Analise na Lista 
            	int menor=i;//Atribuição de valor de i a "menor"
            	for(int j=i+1; j<Tamanho;j++){//Variavel para Analise na Lista
            		if(Lista[j]!=null){//enquanto nao for nulo
            			if( Lista[menor].getIdade()>Lista[j].getIdade()) {//comparação
            				menor=j;//Atribuição de valor de j a "menor"
            			}
            		}
            	}swap(i,menor);//Envio ao procedimento
            }
            listaDuende();//Exibição da lista
	    }
		
	}
	public static void swap(int i, int j){//mudança de valores
		
		Duende temp=new Duende();
		temp = Lista[i];//Atribuição de valor de Lista[i] a temp
		Lista[i] = Lista[j];//Atribuição de valor de Lista[j] a Lista[i] 
		Lista[j] = temp;//Atribuição de valor de Lista[j] a temp
		
	}
    public static void cadastrar_Time(){
        Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        
        if(Lista[0]==null){//se estiver vazia    
            System.out.println("================Sem=Registros=!!==================");
        }else{//se não estiver vazia
            int cont=0;//contador de termos
            while(Lista[cont]!=null){
                ++cont;
            }    
            if(cont%3!=0){
                System.out.println("==Parametros=para=criar=equipes=nao=atingidos!!===");
            }else{
                System.out.println("==Parametros=para=criar=equipes=====atingidos!!===");
                Time objEquipe;//Atribui a Classe ao objeto
                
                int third_1=cont/3;
                int third_2=cont/3*2;
               
                for(int i =0,j=1;i<third_1;i++,j++){
                    if(Equipe[i]==null){
                        objEquipe=new Time();
                        objEquipe.setLider(Lista[i]);
                        objEquipe.setEntregador(Lista[third_1+i]);
                        objEquipe.setPiloto(Lista[third_2+i]);
                        //System.out.print(objEquipe.toString());//Teste
                        //Envia a função da classe
                        Equipe[i]=objEquipe;
                        System.out.println("Time=0"+j+"===========================================");
                        System.out.println(Equipe[i].toString());//Teste
                        System.out.println("==================================================");
                    }
                }
            }
        }
    }
}

