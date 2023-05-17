package preview_aula_13;


import java.util.*;//simplificação de Bibliotecas 
public class Celula{
    Contato contato;
    int elemento1;//variavel para inserção de inteiros
    String elemento2;//variavel para inserção de Strings
    char elemento3;//variavel para inserção de caracteres

    //Ponteiros
    Celula Esq;//variavel para Esquerda
    Celula Dir;//variavel para Direita

    Celula Sup;//variavel para Superior
    Celula Inf;//variavel para Inferior
    
    Celula Prox;//variavel para Proximo
    Celula Ant;//variavel para Anterior
    
    public Celula(){//Construtor default
        
        this.elemento1=0;//inteiros
        this.elemento2=" ";//Strings
        this.elemento3=0;//caracteres
        this.contato=new Contato();//Contato
        
        this.Dir = null;
        this.Esq = null;
        this.Sup = null;
        this.Inf = null;
        
        this.Prox=null;
        this.Ant=null;
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
    public Celula(Contato C) {
	this.contato=C;//Contato
    }
}