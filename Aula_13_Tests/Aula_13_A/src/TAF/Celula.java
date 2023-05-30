package TAF;

import java.util.*;//simplificação de Bibliotecas 
public class Celula{
    
    int elemento;//variavel para inserção de inteiros
    
    Lista_Simples lista;
    
    //Ponteiros
    Celula esq;//variavel para Esquerda
    Celula dir;//variavel para Direita

    Celula sup;//variavel para Superior
    Celula inf;//variavel para Inferior
    
    Celula prox;
    Celula ant;
    
    public Celula(){//Construtor default
        
        this.elemento=0;//inteiros
        this.lista=new Lista_Simples();
        
        this.dir = null;
        this.esq = null;
        this.sup = null;
        this.inf = null;
        
        this.prox=null;
        this.ant=null;
        
        
    }
    //Sobrecarga da classe
    public Celula(int x) {
        this.elemento=x;//inteiros
    }
    public Celula(Lista_Simples lista) {
        this.lista=lista;//inteiros
    }
}
