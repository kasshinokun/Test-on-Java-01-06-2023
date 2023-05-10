package Aula_06;//Nome do Projeto
//Aula de 20/03/2023 - Exercicio Pratico 6
import java.util.*;//Simplificação para importação de Bibliotecas necessárias
public class Quadrado extends Retangulo{//Declaração da Classe Filha
    double Largura;//Variavel para Largura
    double Altura;//Variavel para Altura
    public Quadrado() {//Construtor Default
        
        
    }
    public Quadrado(int x0,int y0, double l, double a) {//Sobrecarga

        Largura= l;
        Altura= a;
    }
    //Get e Set da Largura
    public double getLargura() {
        return Largura;
    }
    public void setLargura(double largura) {
        Largura = largura;
    }
    //Get e Set da Altura
    public double getAltura() {
        return Altura;
    }
    public void setAltura(double altura) {
        Altura = altura;
    }
    //Area
    public double  getArea() {//Calculo da Area do Quadrado
        return Largura*Altura;
    }
    //Perimetro
    public double getPerimetro() {//Calculo de Perimetro do Quadrado
        return 4*Largura;
    }
    //Teorema de Pitagoras para achar Diagonal
    public double getDiagonal() {
        
        double cateto_c;//Variavel para a Diagonal
        cateto_c=Math.pow(Altura, 2)+Math.pow(Largura,2);//Soma dos Quadrados
        
        //como c^2=a^2+b^2, então.....
        //Calculo Padrao de Hipotenusa(Triangulo Retangulo)    
        return Math.sqrt(cateto_c);//Raiz da Soma dos Quadrados
        
        
    }
    public String toString( ) {//Exibição em tela das medidas principais do Quadrado
        return "Quadrado(" + x0 + " : " + y0 +" : "+ Largura +" : "+Altura+")";
    }
}
