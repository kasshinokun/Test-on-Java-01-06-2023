package TAF;

import java.util.*;//simplificação de Bibliotecas
public class Contato {
    String nome;
    String telefone;
    String email;
    String cpf;
    //Contato como Nós de uma Arvore
    //Contato esq
    //Contato dir
    public Contato(){
        this.nome="";
        this.telefone="";
        this.email="";
        this.cpf="";
        //this.esq=null;
        //this.dir=null;
    }
    public Contato(String nome,String telefone,String email,String cpf) {
        this.nome=nome;
        this.telefone=telefone;
        this.email=email;
        this.cpf=cpf;
        
    }
    /*
    public Contato(String nome,String telefone,String email,String cpf) {
        this.nome=nome;
        this.telefone=telefone;
        this.email=email;
        this.cpf=cpf;
        this.esq=null;
        this.dir=null;
    }
    public Contato(String nome,String telefone,String email,String cpf,Contato esq,Contato dir) {
        this.nome=nome;
        this.telefone=telefone;
        this.email=email;
        this.cpf=cpf;
        this.esq=esq;
        this.dir=dir;
    }
    */
    public String toString(){
        return"Nome:-------------"+this.nome
            +"\nTelefone:---------"+this.telefone
            +"\nEmail:------------"+this.email
            +"\nCPF:--------------"+this.cpf;
    }
    
}
