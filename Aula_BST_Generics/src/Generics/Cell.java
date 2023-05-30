package Generics;
import java.util.*;//Simplificação de bibliotecas necessarias 
public class Cell<T>{
    
    T elemento;//variavel para inserção de inteiros
       
    //Ponteiros
    Cell<T> esq;//variavel para Esquerda
    Cell<T> dir;//variavel para Direita

    Cell<T> sup;//variavel para Superior
    Cell<T> inf;//variavel para Inferior
    
    Cell<T> prox;//variavel para Proximo
    Cell<T> ant;//variavel para Anterior
    
    public Cell(T obj){//Construtor p Generics
        
        this.elemento=obj;//inteiros
                
        this.dir = null;
        this.esq = null;
        this.sup = null;
        this.inf = null;
        
        this.prox=null;
        this.ant=null;
    }
    
}
