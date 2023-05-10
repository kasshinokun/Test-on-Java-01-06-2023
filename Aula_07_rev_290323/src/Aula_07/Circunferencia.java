package Aula_07;//Nome do projeto

//Aula de 27/03/2023 - Exercicio Pratico 7

//Simplificação para importação de Bibliotecas necessárias
import java.util.*;
public class Circunferencia extends Figura{//Declaração da Classe Filha
  double R;//Variavel para Raio
  
  public Circunferencia() {//Construtor Default

  }
  public Circunferencia(int x0,int y0, double r) {//Sobrecarga
      super(x0,y0);//Atributos da Classe Mae
      //Atribuição de Variaveis
      R= r;
      
  }
  //Get e Set do Raio
  public double getRaio() {
      return R;
  }
  public void setRaio(double r) {
      R = r;
  }
  
  //Calculo pelo Metodo de Monte-Carlo
  //calculo do valor de Pi(Monte Carlo)
  public double CalculaPI(int L) {
  	double cont=0;//Variavel de retorno instanciada em Zero
        double x,y;//Variavel randomicas de analise
  	for(int i=1;i<=L;i++) {//laço de repetição
            //gera os valores aleatorios entre 0 e 1
            x = Math.random();
            y = Math.random();
            //se x^2+y^2 for menor que 1.....
            if(Math.pow(x,2)+Math.pow(y,2) < 1){
               cont++;//Incrementa Variavel em 1 
            }
        }
        cont/=L;//Divide pelo numero de interações no laço FOR
        cont*=4;//multiplica por 4
  	return cont;//Retorna o Valor de Pi(Monte Carlo) a Funcao Solicitante
  }
  //Area(Monte Carlo)
  public double GetAreaMonteCarlo(int L){
  	double PI=CalculaPI(L);//Instancia a variavel e envia a Funcao
        System.out.print("\nO valor de PI-Monte Carlo: "+PI);//Exibe o valor de Pi(Monte Carlo)
  	return 2*PI*R;//Retorna o valor da Area
  }
  //Perimetro(Monte Carlo)
  public double GetPerimetroMonteCarlo(int L){
        double z=CalculaPI(L);//Instancia a variavel e envia a Funcao
        System.out.print("\nO valor de PI-Monte Carlo: "+z);//Exibe o valor de Pi(Monte Carlo)
        return z*Math.pow(R, 2);//Retorna o valor do perimetro
  }
  
  //Calculos Padrao
  //Area
  public double  getArea() {//Calculo da Area da Circunferencia
      
  	return Math.PI*Math.pow(R, 2);//Retorna o valor da Area
  }
  //Perimetro
  public double getPerimetro() {//Calculo de Perimetro da Circunferencia
      
  	return 2*Math.PI*R;//Retorna o valor do perimetro
  }
  
  public String toString( ) {//Exibição em tela das medidas principais do Retangulo
      return "Circunferencia(" + x0 + " : " + y0 +" : "+ R +")";
  }
}
