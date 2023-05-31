package TAF;
//Classe para Exercicio 8
import java.util.*;
public class Site {
    String nome;
    String link;
    Site prox;
    Site(){
        this.nome="";
        this.link="";
        this.prox=null;
    }
    Site(String nome, String link){
        this.nome=nome;
        this.link=link;
    }
    public String toString(){
        return"Nome:-------------"+this.nome
            +"\nLink:-------------"+this.link;    
    }
    
}
