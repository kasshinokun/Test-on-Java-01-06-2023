package Generics;

import java.util.*;//simplificação de Bibliotecas


public class No<T>{
   
    public T i;//Variavel para inteiros
   
    //Ponteiros
    public No<T> esq;//variavel para Esquerda
    public No<T> dir;//variavel para Direita

    public No<T> sup;//variavel para Superior
    public No<T> inf;//variavel para Inferior
    
   
    public No(T x){
        this.i=x;
        this.esq=null;
        this.dir=null;    
    }//Nós Pai com Nós Filhos
    public No(T x,No<T> esq,No<T> dir){
        this.i=x;
        this.esq=esq;
        this.dir=dir;    
    }
    
        
}