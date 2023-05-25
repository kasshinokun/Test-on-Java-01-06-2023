package TAF;

import java.util.*;//simplificação de Bibliotecas
public class No{
    public char c;//Variavel para caracteres
    public int i;//Variavel para inteiros
    //Nós ponteiros
    public No esq;
    public No dir;
    public No(){//Construtor default
        this.c=0;
        this.i=0;
        this.esq=null;
        this.dir=null;    
    }
    //Sobrecarga
    //Nó para caracters
    public No(char x){
        this.c=x;
        this.esq=null;
        this.dir=null;    
    }//Nó para inteiros
    public No(int x){
        this.i=x;
        this.esq=null;
        this.dir=null;    
    }
    //Nós Pai com Nós Filhos
    public No(int x,No esq,No dir){
        this.i=x;
        this.esq=esq;
        this.dir=dir;    
    }
    public No(char x,No esq,No dir){
        this.c=x;
        this.esq=esq;
        this.dir=dir;    
    }
}