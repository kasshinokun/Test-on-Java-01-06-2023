package Aula_06;//Nome do Projeto
import java.util.*;//Simplificação para importação de Bibliotecas necessárias
public class Principal {//Declaração da Classe Principal
    
    public static void main(String[] args){//Declaração do Main
        int op;//Variavel de escolha
        
        //Objeto para coleta de dados do teclado
        Scanner reader = new Scanner(System.in);
        
        do{//Laço de repetição do Menu
            System.out.println("Calculos de Perimetro e Area de Figuras");//Enunciado
            System.out.println("=============Menu de opcoes:===========");//Opçoes
            System.out.println("1) Retangulo");
            System.out.println("2) Triangulo");
            System.out.println("3) Quadrado\n");
            System.out.println("0) para encerrar\n");
            System.out.println("===========Escolha uma opcao:==========\n");//Solicitação ao Usuario
            op=reader.nextInt();//Armazenamento do valor
            switch(op){//Analise do termo digitado
                case 1://Chama o procedimento
                    MostraRetangulo();
                    break;//Condição de Parada
                case 2://Chama o procedimento
                    MostraTriangulo();
                    break;//Chama o procedimento
                case 3://Chama o procedimento
                    MostraQuadrado();
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
    public static void MostraRetangulo(){//Procedimento para os Retangulos
        
        //Instancia os objetos do tipo Retangulo
        Retangulo R1= new Retangulo();
        Retangulo R2= new Retangulo();
        
        //Objeto para coleta de dados do teclado
        Scanner reader= new Scanner(System.in);
        
        //Primeiro Retangulo
        System.out.print("Digite a Altura do Retangulo 1:-----");//Solicitação ao Usuario
        R1.setAltura(reader.nextInt());//Armazena a Altura
        System.out.print("Digite a Largura do Retangulo 1:----");//Solicitação ao Usuario
        R1.setLargura(reader.nextInt());//Armazena a Largura
        System.out.println("\n"+R1.toString());//Exibição em tela das medidas 
        if(R1.getLargura()==R1.getAltura()){//Apos Comparar.....
            //Se igual, informa ao Usuario
            System.out.println("Retangulo 1 tem Largura = Altura, entao...");
            System.out.println("Retangulo 1 se trata de um Quadrado!!!....");
        }
        System.out.println("\nArea-----: "+R1.getArea());//Exibe a Area
        System.out.println("Perimetro: "+R1.getPerimetro());//Exibe o Perimetro
        System.out.println("Diagonal-: "+R1.getDiagonal()+"\n");//Exibe a Diagonal
        
        
        //Segundo Retangulo
        System.out.print("Digite a Altura do Retangulo 2:-----");//Solicitação ao Usuario
        R2.setAltura(reader.nextInt());//Armazena a Altura
        System.out.print("Digite a Largura do Retangulo 2:----");//Solicitação ao Usuario
        R2.setLargura(reader.nextInt());//Armazena a Largura
        System.out.println("\n"+R2.toString());//Exibição em tela das medidas 
        if(R2.getLargura()==R2.getAltura()){//Apos Comparar.....
            //Se igual, informa ao Usuario
            System.out.println("Retangulo 2 tem Largura = Altura, entao...");
            System.out.println("Retangulo 2 se trata de um Quadrado!!!....");
        }
        System.out.println("\nArea-----: "+R2.getArea());//Exibe a Area
        System.out.println("Perimetro: "+R2.getPerimetro());//Exibe o Perimetro
        System.out.println("Diagonal-: "+R2.getDiagonal()+"\n");//Exibe a Diagonal
        
    }
    public static void MostraTriangulo(){//Procedimento para o Triangulo
       
        Triangulo T1= new Triangulo();//Instancia o objeto do tipo Triangulo
        
        //Objeto para coleta de dados do teclado
        Scanner reader= new Scanner(System.in);
        
        System.out.print("\nDigite a Altura do Triangulo 1:-----");//Solicitação ao Usuario
        T1.setAltura(reader.nextInt());//Armazena a Altura
        System.out.print("Digite a Largura do Triangulo 1:----");//Solicitação ao Usuario
        T1.setLargura(reader.nextDouble());//Armazena a Largura
        System.out.println("\n"+T1.toString());//Exibição em tela das medidas 
        System.out.println("Area------: "+T1.getArea());//Exibe a Area
        System.out.println("Perimetro-: "+T1.getPerimetro());//Exibe o Perimetro
        
        //Uso do Teorema de Pitagoras para achar a 3ª medida
        //System.out.println("Cateto C: "+T1.getDiagonal());
        
        System.out.println("\n");//Salta Linha
    }
    public static void MostraQuadrado(){//Procedimento para Quadrado
        
        //Instancia o objeto do tipo Quadrado
        Quadrado Q1= new Quadrado();
        
        //Objeto para coleta de dados do teclado
        Scanner reader= new Scanner(System.in);
        
        System.out.print("\nDigite a Altura do Quadrado 1:-----");//Solicitação ao Usuario
        Q1.setAltura(reader.nextDouble());//Armazena o Valor da Altura
        Q1.setLargura(Q1.getAltura());//Atribui a Largura o valor da Altura
        //Informa ao Usuario
        System.out.println("\nComo se trata de um Quadrado .......\n"
                         + "Largura = Altura, entao, Largura:--"+Q1.getLargura());//Exibe o Valor da Largura
        
        System.out.println("\n"+Q1.toString());//Exibição em tela das medidas 
        System.out.println("Area-----: "+Q1.getArea());//Exibe a Area
        System.out.println("Perimetro: "+Q1.getPerimetro());//Exibe o Perimetro
        System.out.println("Diagonal-: "+Q1.getDiagonal()+"\n");//Exibe a Diagonal
        
    }
}