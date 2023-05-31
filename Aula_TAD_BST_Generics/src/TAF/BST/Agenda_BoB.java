package TAF.BST;//Nome do Subprojeto
/*

OBS.IMPORTANTE:
Apenas Logica aplicada, não testei esta parte

OBS.FINAL: Me confundi e comecei a criar uma arvore de arvore de lista de contatos
O correto era só uma arvore de arvore de lista de Strings
*/
import java.util.*;//Simplificação de bibliotecas necessarias 
import TAF.*;//Package com as TAD Flexiveis
import TAF.BST.*;//Package com as Arvores Binarias

public class Agenda_BoB {//BoB==>BST of BST
    No raiz;
    Agenda_BoB(){
        raiz=null;
    }
    private void inserir(String x) {//Cria o Nó 
        raiz = inserir(x, raiz);
        
    }
    private No inserir(String x, No n){//Cria o Nó
        if (n == null) {
            n = new No(x);
        } else if (x.compareTo(n.s)<0) {
            n.esq = inserir(x, n.esq);
        } else if (x.compareTo(n.s)>0) {
            n.dir = inserir(x, n.dir);
        } else {
            System.out.println("Erro!");
        }
        return n;
    }
    public void inserir(Contato x) {//Inserção de Contato
        No n=raiz;
        String y=nStrings(n,x.nome);
        inserir(x,y, n);
    }
    private void inserir(Contato y, String x, No n) {//Inserção de Contato
        
        if (n == null) {
           inserir(x);
        } else if(x.compareTo(n.s)==0){
            System.out.println("Inserindo : "+y.nome+" na Lista "+x+"\n");
            n.Add(new Celula(y));
        } else if(x.compareTo(n.s)<0){
            if(n.esq==null){
                inserir(x);
            }
            inserir(y,x, n.esq);
        } else{
            if(n.dir==null){
                inserir(x);
            }
            inserir(y,x, n.dir);
        }       
    }
    private String nStrings(No n,String x) {//gerar String do Nó
        String y=x.substring(0,3);
        boolean resp=false;
        while(n != null) {
            nStrings(n.esq,x);
            resp=y.equalsIgnoreCase(n.s);
            if(resp==true){
                return x=gStrings(y,n.s);
            }
            nStrings(n.dir,x);
        }
        if(x.charAt(2)==('A')||
            x.charAt(2)!=('E')||
            x.charAt(2)!=('I')||
            x.charAt(2)!=('O')||
            x.charAt(2)!=('U')){
            y=x.substring(0, 2);
        }
        else{
            y=x.substring(0, 3);
        }
        return y;
    }
    private String gStrings(String x, String y){//gerar String do Nó
        String z;
        if((x.charAt(2)!=('A')||
            x.charAt(2)!=('E')||
            x.charAt(2)!=('I')||
            x.charAt(2)!=('O')||
            x.charAt(2)!=('U'))&&(x.substring(0,2).compareTo(y)!=0)){
            z=x.substring(0, 2);
        }
        else{
            z=x.substring(0, 3);
        }
        return z;
    }
    public void mostrar(){
    
    
    }
//======================================================================================================
//Testes
    public static void teste(){
        String teste="Jose Arnaldo de Oliveira";
        System.out.println(letra_A2(teste));
    }
    private static String letra_A2(String teste){
        String teste2="Jo";
        if((teste.charAt(2)!=('A')||
            teste.charAt(2)!=('E')||
            teste.charAt(2)!=('I')||
            teste.charAt(2)!=('O')||
            teste.charAt(2)!=('U'))&&(teste.substring(0,2).compareTo(teste2)!=0)){
            teste=teste.substring(0, 2);
        }
        else{
            teste=teste.substring(0, 3);
        }
        return teste;
    }
}
