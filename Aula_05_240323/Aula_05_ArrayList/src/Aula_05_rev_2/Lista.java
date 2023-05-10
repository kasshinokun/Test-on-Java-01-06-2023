package Aula_05_rev_2;
import java.util.*;
/*Observação:

    Após testes sem sucesso, 
    reaproveitei um codigo 
    baseado em ArrayLista 
    que criei semestre passado
    e adaptei algumas partes    
    
*/
//Bibliotecas para execução
import java.util.*;//Simplificação das bibliotecas necessarias

//Classe para o ArrayList 
public class Lista {//declaração da classe
  
    //Declaração do ArrayList
    private static List<Duende>lista= new ArrayList<Duende>();

    //Metodo de retorno do ArrayList
    public List<Duende> getLista() {
        return lista;
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
	
        do{
            
            //Nome do duende
            System.out.print("Digite o Nome:.......");
            nome = scanner.nextLine();
            //Idade do duende
            System.out.print("Digite a Idade:......");
            idade = Integer.parseInt(scanner.nextLine());
            
            
            //Envia do objeto a classe
            objLista = new Duende(nome,idade);
            //System.out//.println(objLista);
            //Envia a função da classe
            lista.add(objLista);
            
            
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
        }while(op == 1 );
    }    
    public static void listaDuende(){//Listagem 
      
        Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        
        if((lista.isEmpty())){//se estiver vazia    
            System.out.println("================Sem=Registros=!!==================");
        }else{//se não estiver vazia
            System.out.println("================Lista=de=Duendes==================");//Enunciado
            System.out.println("\n==================================================");
            //laço de repetição
            for(Duende d1:lista){//Variavel para Analise na Lista 

                if(d1.getNome()!= null){//Se não for nulo
                    //encontrado exibira cada registro
                    System.out.println(d1.toString());
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
        
        if((lista.isEmpty())){//se estiver vazia    
            System.out.println("================Sem=Registros=!!==================");
        }else{//se não estiver vazia
            System.out.println("========Ordenacao=por=Idade=dos=Duendes===========");//Enunciado
            
            for (int i = 0; i <lista.size()-1; i++){//laço para percorrer o Array 
                menor=i;
                for (int j = (i + 1) ; j <lista.size(); j++){//laço para percorrer o Array a partir de i
                    if(lista.get(menor).getIdade()>lista.get(j).getIdade()){//compraração
                        //se menor, atribui o valor da variavel j a menor
                        menor = j;
                    }
                }
                swap(menor, i);//em analise*/               
            }
            listaDuende();//imprime ao final	
        }
    }
   
    public static void swap(int a, int b) {
        Duende temp = new Duende();
        temp = lista.get(a);
        lista.set(a, lista.get(b));
        lista.set(b, temp);
    }
    public static void cadastrar_Time(){
        Locale pt_br = new Locale("pt","Brazil");
        Locale.setDefault(pt_br);
        
        if((lista.isEmpty())){//se estiver vazia    
            System.out.println("================Sem=Registros=!!==================");
        }else{//se não estiver vazia
            
            if(lista.size()%3==0){//se for multiplo de 3
                //Ordenate_sort(); //para ordenação
                List<Time>Equipe= new ArrayList<Time>(lista.size());
                
                Time objEquipe = new Time();//Atribui a Classe ao objeto
                
                int third_1=(lista.size()/3);//limita o 2º terço
                int third_2=((lista.size()/3)*2);//limita o 3º terço
                
                for(int i=0;i<third_1;i++){
                    
                    objEquipe.setLider(lista.get(i));//envia para Lider
                    
                    objEquipe.setEntregador(lista.get(third_1+i));//Envia para Entregador
                    
                    objEquipe.setPiloto(lista.get(third_2+i));//Envia para Piloto          
                    
                    //Envia a função da classe
                    Equipe.add(objEquipe); 
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
}
