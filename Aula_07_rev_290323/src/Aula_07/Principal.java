package Aula_07;
//Simplificação para importação de Bibliotecas necessárias
import java.util.*;

public class Principal {//Declaração da Classe Principal
    
    public static void main(String[] args){//Declaração do Main
        int op;//Variavel de escolha
        
        //Objeto para coleta de dados do teclado
        Scanner reader = new Scanner(System.in);
        
        do{//Laço de repetição do Menu
            System.out.println("Calculos de Perimetro e Area de Circunferencia");//Enunciado
            System.out.println("Calculos Padrao e pelo Metodo de Monte Carlo");//Enunciado
            System.out.println("=============Menu de opcoes:===========");//Opçoes
            System.out.println("1) Circunferencia");
            
            System.out.println("0) para encerrar\n");
            System.out.println("===========Escolha uma opcao:==========\n");//Solicitação ao Usuario
            op=reader.nextInt();//Armazenamento do valor
            switch(op){//Analise do termo digitado
	            case 1://Chama o procedimento
	            	MostraCircunferencia();
	                break;//Chama o procedimento
                
                default://tratamento de exceções e despedida
                    if(op==0){//despedida do usuario e agradecimento
                        System.out.println("Calculos de Perimetro e Area de Figuras");
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
        }while(op!=0);//Condição de Parada do Main
    }
    public static void MostraCircunferencia(){//Procedimento para a MostraCircunferencia
    	double Raio1 = 5;//Valor baseado no ultimo numero da Matricula
    	Circunferencia C1 = new Circunferencia();//Instancia um objeto do tipo Circunferencia
    	double A1,//Para Area
               A2,//Para Area(Monte Carlo)
               P1,//Para Perimetro
               P2;//Para Perimetro(Monte Carlo)
    	
        C1.setRaio(Raio1);//Atribui o Valor de Raio1 ao objeto C1
    	A1=(C1.getArea());//Solicita a area   
    	P1=(C1.getPerimetro());//Solicita o perimetro
    	
        System.out.println(C1.toString());//Exibe as propriedades de C1
        System.out.println("\nCalculos Padrao:");//Enunciado
        //Exibe o valor para PI e a area
        System.out.println("O valor de PI-Padrao: "+Math.PI+"\nArea:--------------- "+A1);
        //Exibe o valor para PI e o perimetro
        System.out.println("O valor de PI-Padrao: "+Math.PI+"\nPerimetro:---------- "+P1);
    	
        //Reexibe as propriedades de C1    
    	System.out.println("\n"+C1.toString());
        System.out.print("Calculos Monte Carlo:"//Enunciado
                       + "\nObs.:Os valores de Pi(Monte Carlo)"//--Observação
                       + "\npodem variar pois sao aleatorios."//---para o usuario
                       + "\n\nValor de L: 50");//Enunciado
        
        //Solicita a area e exibe o valor para PI(Ambos pelo Calculo de Monte Carlo)       
        A2=(C1.GetAreaMonteCarlo(50));
        //Exibe o valor da area pelo Calculo de Monte Carlo       
        System.out.print("\nArea:--------------- "+A2);
        //Solicita o perimetro e exibe o valor para PI(Ambos pelo Calculo de Monte Carlo)
        P2=(C1.GetPerimetroMonteCarlo(50));
        //Exibe o valor do perimetro pelo Calculo de Monte Carlo       
        System.out.print("\nPerimetro:---------- "+P2+"\n\n");
        
        System.out.print("Valor de L: 500");//Enunciados
        //Solicita a area e exibe o valor para PI(Ambos pelo Calculo de Monte Carlo)       
        A2=(C1.GetAreaMonteCarlo(500));
        //Exibe o valor da area pelo Calculo de Monte Carlo       
        System.out.print("\nArea:--------------- "+A2);
        //Solicita o perimetro e exibe o valor para PI(Ambos pelo Calculo de Monte Carlo)
        P2=(C1.GetPerimetroMonteCarlo(500));
        //Exibe o valor do perimetro pelo Calculo de Monte Carlo       
        System.out.print("\nPerimetro:---------- "+P2+"\n\n");
        
        System.out.print("Valor de L: 1000");//Enunciados
        //Solicita a area e exibe o valor para PI(Ambos pelo Calculo de Monte Carlo)       
        A2=(C1.GetAreaMonteCarlo(1000));
        //Exibe o valor da area pelo Calculo de Monte Carlo       
        System.out.print("\nArea:--------------- "+A2);
        //Solicita o perimetro e exibe o valor para PI(Ambos pelo Calculo de Monte Carlo)
        P2=(C1.GetPerimetroMonteCarlo(1000));
        //Exibe o valor do perimetro pelo Calculo de Monte Carlo       
        System.out.print("\nPerimetro:---------- "+P2+"\n\n");
        
        System.out.print("Valor de L: 10000");//Enunciados
        //Solicita a area e exibe o valor para PI(Ambos pelo Calculo de Monte Carlo)       
        A2=(C1.GetAreaMonteCarlo(10000));
        //Exibe o valor da area pelo Calculo de Monte Carlo       
        System.out.print("\nArea:--------------- "+A2);
        //Solicita o perimetro e exibe o valor para PI(Ambos pelo Calculo de Monte Carlo)
        P2=(C1.GetPerimetroMonteCarlo(10000));
        //Exibe o valor do perimetro pelo Calculo de Monte Carlo       
        System.out.print("\nPerimetro:---------- "+P2+"\n\n");
    }

}
