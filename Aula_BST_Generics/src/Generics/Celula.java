package Generics;

import java.util.*;//simplificação de Bibliotecas 
public class Celula<T>{
    
    T elemento;//variavel para inserção de inteiros
       
    //Ponteiros
    Celula<T> esq;//variavel para Esquerda
    Celula<T> dir;//variavel para Direita

    Celula<T> sup;//variavel para Superior
    Celula<T> inf;//variavel para Inferior
    
    Celula<T> prox;//variavel para Proximo
    Celula<T> ant;//variavel para Anterior
    
    public Celula(T obj){//Construtor p Generics
        
        this.elemento=obj;//inteiros
                
        this.dir = null;
        this.esq = null;
        this.sup = null;
        this.inf = null;
        
        this.prox=null;
        this.ant=null;
    }
    
    
    
    
}