package BST;

import java.util.*;//simplificação de Bibliotecas


public class No{
   
    public int i;//Variavel para inteiros
   
    //Ponteiros
    public No esq;//variavel para Esquerda
    public No dir;//variavel para Direita

    public No sup;//variavel para Superior
    public No inf;//variavel para Inferior
    
    public No(){//Construtor default
        this.i=0;
        this.esq=null;
        this.dir=null;    
    }
    //Sobrecarga
    //Nó para inteiros
    public No(int x){
        this.i=x;
        this.esq=null;
        this.dir=null;    
    }//Nós Pai com Nós Filhos
    public No(int x,No esq,No dir){
        this.i=x;
        this.esq=esq;
        this.dir=dir;    
    }
    
        
}