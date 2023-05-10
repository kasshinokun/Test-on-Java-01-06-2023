package Aula_05_Vetor;


import java.util.*;
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
        //Metodo de retorno do ArrayList
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

