package Aula_07;

//Aula de 27/03/2023 - Exercicio Pratico 7

import java.util.*;//Simplificação para importação de Bibliotecas necessárias
public abstract class Figura{//Declaração da Classe Abstrata
  public int x0 ;//Variavel de Referencia 1
  public int y0 ;//Variavel de Referencia 2
  public Figura () {//Construtor Default
  	x0 = 0; y0 = 0;//Atribuição de valores as variaveis
  }
  public Figura ( int x , int y ) {//Sobrecarga
  	x0 = x ; y0 = y ;//Relacionando variaveis
  }
  public String toString () {//Exibição em tela das medidas principais da Classe
      return " Figura ("+ x0 +" : "+ y0 +")";
  }
  //Metodos para Adicionar nas Classes Filhas
  public abstract double getArea();//Metodo para Area
  public abstract double getPerimetro();//Metodo para Perimetro
}
