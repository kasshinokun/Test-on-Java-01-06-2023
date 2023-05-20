package TAF;
//Classe para Exercicio 8
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
    public class Lista{
        Site inicio;
        Site ultimo;
        
        public int n=0;//Variavel auxiliar de analise de tamanho
    
        public Lista(){
            this.inicio=new Site();
            this.ultimo=this.inicio;
        }
    
    }
}
