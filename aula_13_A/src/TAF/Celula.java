package TAF;

import java.util.*;//simplificação de Bibliotecas 
public class Celula{
    Contato contato;
    int elemento1;//variavel para inserção de inteiros
    String elemento2;//variavel para inserção de Strings
    char elemento3;//variavel para inserção de caracteres

    //Ponteiros
    Celula esq;//variavel para Esquerda
    Celula dir;//variavel para Direita

    Celula sup;//variavel para Superior
    Celula inf;//variavel para Inferior
    
    Celula prox;//variavel para Proximo
    Celula ant;//variavel para Anterior
    
    public Celula(){//Construtor default
        
        this.elemento1=0;//inteiros
        this.elemento2=" ";//Strings
        this.elemento3=0;//caracteres
        this.contato=new Contato();//Contato
        
        this.dir = null;
        this.esq = null;
        this.sup = null;
        this.inf = null;
        
        this.prox=null;
        this.ant=null;
    }
    //Sobrecarga da classe
    public Celula(int x) {
        this.elemento1=x;//inteiros
    }
    public Celula(String x) {
        this.elemento2=x;//Strings
    }
    public Celula(String x,int z) {//Strings e inteiros
        this.elemento2=x;//Strings
        this.elemento1=z;
    }
    public Celula(char x) {
        this.elemento3=x;//caracteres
    }
    public String toString(){
        return"Chave:-------------"+this.elemento1
            +"\nNome:-------------"+this.elemento2;    
    } 
    public Celula(Contato C) {
	this.contato=C;//Contato
    }//outra opção para instanciar objeto do tipo Contato
    public Celula(String nome,String telefone,String email,String cpf) {
	//Instancia com as strings direto na classe
        this.contato=new Contato(nome,telefone,email,cpf);
    }
    public String mostrarContato(){
        return this.contato.toString();
    }
}