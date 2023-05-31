package BST;

import java.util.*;//simplificação de Bibliotecas 
public class Celula{
    
    int elemento;//variavel para inserção de inteiros
       
    //Ponteiros
    Celula esq;//variavel para Esquerda
    Celula dir;//variavel para Direita

    Celula sup;//variavel para Superior
    Celula inf;//variavel para Inferior
    
    Celula prox;//variavel para Proximo
    Celula ant;//variavel para Anterior
    
    public Celula(){//Construtor default
        
        this.elemento=0;//inteiros
                
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
    
    
    
}