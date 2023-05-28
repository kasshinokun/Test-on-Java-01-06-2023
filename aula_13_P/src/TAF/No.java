package TAF;

import java.util.*;//simplificação de Bibliotecas
public class No{
    public char c;//Variavel para caracteres
    public int i;//Variavel para inteiros
    public String s;//Variavel para Strings
    public Lista_Simples Lista;
    
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
}