package TAF;

import java.util.*;//simplificação de Bibliotecas
public class No{
    public char c;//Variavel para caracteres
    int i;//Variavel para inteiros
    Lista_Simples Lista;
    
    //Adaptação para Matriz
    //Ponteiros
    No esq;//variavel para Esquerda
    No dir;//variavel para Direita

    No sup;//variavel para Superior
    No inf;//variavel para Inferior
    
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
        this.Lista=new Lista_Simples();
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
}