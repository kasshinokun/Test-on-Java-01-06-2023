package List;
import java.lang.*;//Simplificação de bibliotecas necessarias 
import java.io.*;//Simplificação de bibliotecas necessarias 
import java.util.*;//Simplificação de bibliotecas necessarias 

public class Celula<T extends Comparable<T>> {
    
    T elemento;//variavel para inserção de Generrics
     
    //Ponteiros
    public Celula<T> prox;//variavel para Proximo
    public Celula<T> ant;//variavel para Anterior
    public Celula(){
        
        this.elemento=null;
        //Ponteiros              
        this.prox=null;
        this.ant=null;
    }
    public Celula(T obj){//Construtor p Generics
        
        this.elemento=obj;//Generrics
        //Ponteiros              
        this.prox=null;
        this.ant=null;
    }
    
}
