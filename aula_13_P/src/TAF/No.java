package TAF;

import java.util.*;//simplificação de Bibliotecas
import TAF.BST.*;

public class No{
    public char c;//Variavel para caracteres
    public int i;//Variavel para inteiros
    public String s;//Variavel para Strings
    public Lista_Simples Lista;
    public Strings_T Tree;
    //Adaptação para Matriz
    //Ponteiros
    public No esq;//variavel para Esquerda
    public No dir;//variavel para Direita

    public No sup;//variavel para Superior
    public No inf;//variavel para Inferior
    
    public No(){//Construtor default
        this.c=0;
        this.i=0;
        this.s="";
        this.esq=null;
        this.dir=null;    
    }
    //Sobrecarga
    //Nó para caracters
    public No(char x){
        this.c=x;
        this.esq=null;
        this.dir=null;  
        this.Lista=new Lista_Simples();
    }//Nó para inteiros
    public No(int x){
        this.i=x;
        this.esq=null;
        this.dir=null;    
    }//Nó para Strings
    public No(String s){
        this.s=s;
        this.esq=null;
        this.dir=null;  
        this.Lista=new Lista_Simples();
    }
    public No(String s, char c){
        this.c=s.charAt(0);
        this.esq=null;
        this.dir=null;  
        this.Tree=new Strings_T(s.substring(0, 3));
    
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
    public No(String s,No esq,No dir){
        this.s=s;
        this.esq=null;
        this.dir=null;  
    }
    public void Add(Celula x){
        Lista.inserirInicio2(x);
    }
    public void Add2(Celula x,int z){
        Lista.inserirPos2(x,z);
    }
    public void Add3(Celula x){
        Lista.inserirFim2(x);
    }
    
    public void view(){//Contatos
        System.out.println("\n=============================================");//Enunciado
        System.out.print("No :"+this.c);//Enunciado
        Lista.mostrar();
    }
    public void view2(){//Contatos
        System.out.println("\n=============================================");//Enunciado
        System.out.println("No :"+this.c);//Enunciado
        Lista.mostrar3();
    }
    public void view3(){//Contatos
        System.out.println("\n=============================================");//Enunciado
        System.out.println("No :"+this.s);//Enunciado
        Lista.mostrar2();
    }
    public void view4(){//Contatos
        System.out.println("\n=============================================");//Enunciado
        System.out.println("No :"+this.s);//Enunciado
        Tree.mostrar();
    }
}