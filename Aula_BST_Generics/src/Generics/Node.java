package Generics;
import java.util.*;//Simplificação de bibliotecas necessarias 
public class Node<T>{

	T elemento;//variavel para inserção de inteiros
       
    //Ponteiros
    Node<T> esq;//variavel para Esquerda
    Node<T> dir;//variavel para Direita

    Node<T> sup;//variavel para Superior
    Node<T> inf;//variavel para Inferior
    
    Node<T> prox;//variavel para Proximo
    Node<T> ant;//variavel para Anterior
    
    public Node(T obj){//Construtor p Generics
        
        this.elemento=obj;//inteiros
                
        this.dir = null;
        this.esq = null;
        this.sup = null;
        this.inf = null;
        
        this.prox=null;
        this.ant=null;
    }
    public Node(T x,Node<T> esq,Node<T> dir){
        this.elemento=x;
        this.esq=esq;
        this.dir=dir;    
    }
    
}
