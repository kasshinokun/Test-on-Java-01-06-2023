package Aula_05_rev_2;
//Adaptação de 29/03/2023

import java.util.*;
/*Observação:

   Adaptação de ArrayList(Classe Lista) para Vetor 
   Alguns codigos mantidos como comentário 
*/
//Bibliotecas para execução
import java.util.*;//Simplificação das bibliotecas necessarias

//Classe para o ArrayList 
public class Lista_2 {//declaração da classe
    private static Duende[] Lista= new Duende[30];
    public static int Tamanho;
        //Metodo de retorno do ArrayList
    public Lista_2(){
        
    }
    //Metodos de adição e, analise para retorno ou atualização
    public static void cadastro(){//Cadastro dos Duendes
    
        Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        Duende objLista;//Atribui a Classe ao objeto
      
        //Variavel para entrada do teclado
        Scanner scanner = new Scanner(System.in);
                
        //Variavel de escolha
        int op;
        //Variaveis para Cadastro
        int idade;
        String nome;
        //Boas vindas
        //System.out.println("\nBem vindo ao Sistema de Cadastros de Duendes");
        System.out.println("===Bem=vindo=ao=Sistema=de=Cadastros=de=Duendes===\n");//Enunciado
	int i=0;
        do{
            
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
            System.out.println("\nDigite 1 para cadastrar Duendes ou 0 para sair:");
            op = Integer.parseInt(scanner.nextLine());
            
            //Analise dos termos digitados
            switch(op){
                case 0:
                    System.out.println("Aguarde estamos voltando ao Menu.");
                    break;//Encerra o código
                default:
                    if(op<0||op>1){
                        //Se não estiver no intervalo, informa ao usuario
                        //e reapresenta o menu
                        System.out.println("\tOpção Inválida.");
                        System.out.println("\nTente novamente por gentileza!!\n");
                    }    
            }
            i++;
        }while(op == 1&&i<Lista.length );
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
            for(int i=0; i<Lista.length;i++){//Variavel para Analise na Lista 
                if(Lista[i]!=null){
                    //System.out.println(Lista[i].toString());//Codigo original adaptado;
                    System.out.println("Nome:----------"+Lista[i].getNome());//.println(Lista[i]);  
                    System.out.println("Idade:---------"+Lista[i].getIdade());//.println(Lista[i]);  
                    System.out.println("==================================================");
                }
            }
        }
    }
    
    public static void Ordenate_sort(){
	
        Locale pt_br = new Locale("pt","Brazil");
        Duende temp= new Duende();//Variavel para Teste
        Locale.setDefault(pt_br);
        int menor;//variavel para posição de menor valor
        
        if(Lista[0]==null){//se estiver vazia    
            System.out.println("================Sem=Registros=!!==================");
        }else{//se não estiver vazia
            System.out.println("========Ordenacao=por=Idade=dos=Duendes===========");//Enunciado
            
            for (int i = 0; i <Lista.length-1&&!(Lista[i]==null); i++){//laço para percorrer o Array 
                menor=i;
                /*for (int j =i+1 ; j <Lista.length; j++){//laço para percorrer o Array a partir de i
                    //Erro na captura de Idade e Comparação
                    if(Lista[menor].getIdade()>Lista[j].getIdade()){//compraração
                    if (notaVetor[i] > gabaritoVetor[i])

                        System.out.println(Lista[menor]);
                        System.out.println(Lista[j]);
                        //se menor, atribui o valor da variavel j a menor
                        menor = j;
                    }
                }*/
                //swap(menor, i);//em analise*//*               
            }
            //listaDuende();//imprime ao final	
        }
    }
    public static void swap(int a, int b) {
        Duende temp = new Duende();
        temp = Lista[a];
        Lista[a]= Lista[b];
        Lista[b]= temp;
    }
    /*
    public static void cria_Time(){//Criado para teste
        Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        
        
        if(Lista[0]==null){//se estiver vazia    
            System.out.println("================Sem=Registros=!!==================");
        }else{//se não estiver vazia
            if(lista.size()%3==0){
                int third_1=(lista.size()/3);
                int third_2=((lista.size()/3)*2);
                for(int i=0;i<third_1;i++){
                    System.out.println(lista.get(i)+"\n"+
                               lista.get(third_1+i)+"\n"+
                               lista.get(third_2+i));
                }
            }
            else{
                System.out.println("==Parametros=para=criar=equipes=nao=atingidos!!===");
            }
        }
    }*/
    /*
    public static void cadastrar_Time(){
        Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        
        if(Lista[0]==null){//se estiver vazia    
            System.out.println("================Sem=Registros=!!==================");
        }else{//se não estiver vazia
            
            if(Lista.length%3==0){//se for multiplo de 3
                //Ordenate_sort(); //para ordenação1
                
                Time[] Equipe = new Time[Lista.length];
                
                Time objEquipe = new Time();//Atribui a Classe ao objeto
                
                int third_1=(Lista.length/3);//limita o 2º terço
                int third_2=((Lista.length/3)*2);//limita o 3º terço
                
                for(int i=0;i<third_1;i++){
                    
                    objEquipe.setLider(Lista[i]);//envia para Lider
                    
                    objEquipe.setEntregador(Lista[third_1+i]);//Envia para Entregador
                    
                    objEquipe.setPiloto(Lista[third_2+i]);//Envia para Piloto          
                    
                    //Envia a função da classe
                    Equipe[i]=objEquipe; 
                }
                System.out.println("=================Lista=de=Times===================");//Enunciado
                //laço de repetição
                int j=0;//Contador
                for(Time d1:Equipe){//Variavel para Analise na Lista 
                   if(d1.getLider()!=null){//enquanto não for nulo
                       //encontrado exibira cada registro
                            j++;//Incrementa o contador
                            System.out.println("Time=0"+j+"===========================================");
                            System.out.println(d1.toString());
                            System.out.println("==================================================");
                   } 
                }
            }else{
                System.out.println("==Parametros=para=criar=equipes=nao=atingidos!!===");//quando não for multiplo de 3
            }
        }  
    }
    */
}
