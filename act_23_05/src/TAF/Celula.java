package TAF;

import java.util.*;//simplificação de Bibliotecas 
public class Celula{
    
    int elemento1;//variavel para inserção de inteiros
    String elemento2;//variavel para inserção de Strings
    char elemento3;//variavel para inserção de caracteres

    //Ponteiros
    Celula esq;//variavel para Esquerda
    Celula dir;//variavel para Direita

    Celula sup;//variavel para Superior
    Celula inf;//variavel para Inferior
    
    Celula prox;//variavel para Proximo
    Celula ant;//variavel para Anterior
    
    public Celula(){//Construtor default
        
        this.elemento1=0;//inteiros
        this.elemento2=" ";//Strings
        this.elemento3=0;//caracteres
        
        
        this.dir = null;
        this.esq = null;
        this.sup = null;
        this.inf = null;
        
        this.prox=null;
        this.ant=null;
    }
    //Sobrecarga da classe
    public Celula(int x) {
        this.elemento1=x;//inteiros
    }
    public Celula(String x) {
        this.elemento2=x;//Strings
    }
    public Celula(char x) {
        this.elemento3=x;//caracteres
    }
    
}