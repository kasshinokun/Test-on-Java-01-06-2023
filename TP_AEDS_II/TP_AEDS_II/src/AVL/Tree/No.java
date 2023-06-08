package AVL.Tree;//Nome do Subprojeto

import java.util.*;//Simplificação de bibliotecas necessarias 

public class No<T extends Comparable<T>>{//Declaração Classe Nó baseada em Generics

    T elemento;//variavel para inserção de Generics
       
    //Ponteiros
    No<T> esq;//variavel para Esquerda
    No<T> dir;//variavel para Direita

    No<T> sup;//variavel para Superior
    No<T> inf;//variavel para Inferior
    
    No<T> prox;//variavel para Proximo
    No<T> ant;//variavel para Anterior
    
    public No(T obj){//Construtor p Generics
        
        this.elemento=obj;//Generics
        
        //Ponteiros
        this.dir = null;
        this.esq = null;
        this.sup = null;
        this.inf = null;
        this.prox=null;
        this.ant=null;
    }
    public No(T x,No<T> esq,No<T> dir){//Sobrecarga do metodo
        this.elemento=x;/*Atribuição ao objeto recebido
        
        Atribuição dos ponteiros 
        baseado no objeto recebido*/
        this.esq=esq;
        this.dir=dir;    
    }
    
}
