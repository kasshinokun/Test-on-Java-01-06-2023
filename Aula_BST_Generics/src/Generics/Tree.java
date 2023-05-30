package Generics;
import java.util.*;//Simplificação de bibliotecas necessarias 

public class Tree<T>{//Arvore de Inteiros
    public No<T> raiz;
    public Tree(){
        raiz=null;
        
    }
    public void inserir(T x) {
        raiz = inserir(x, raiz);
    }
    public No<T> inserir(T x, No<T> n){
        if (n == null) {
            n = new No<T>(x);
        } else if (x<n.i) {
            n.esq = inserir(x, n.esq);
        } else if (x > n.i) {
            n.dir = inserir(x, n.dir);
        } else {
            System.out.println("Erro!");
        }
            return n;
    }
    public void inserirPai(T x){
        if(raiz == null) {
            raiz = new No<T>(x);
        }else if (x < raiz.i) {
            inserirPai(x, raiz.esq, raiz);
        }else if (x > raiz.i) {
            inserirPai(x, raiz.dir, raiz);
        }else{
            System.out.println("Erro!");
        }
    }
    public void inserirPai(T x, No<T> n, No<T> pai){
        if(n == null) {
            if(x < pai.i){
                pai.esq = new No<T>(x);
            }else {
                pai.dir = new No<T>(x);
            }
        }else if(x < n.i) {
            inserirPai(x, n.esq, n);
        }else if (x > n.i) {
            inserirPai(x, n.dir, n);
        }else {
            System.out.println("Erro!");
        }
    }
    public boolean pesquisar(T x) {
        No<T> n=raiz;
        boolean resp=pesquisar(x, n);
        return resp;
    }
    public boolean pesquisar(T x, No<T> n) {
        boolean resp;
        if (n == null) {
            resp = false;
        } else if(x == n.i) {
            resp = true;
        } else if(x < n.i) {
            resp = pesquisar(x, n.esq);
        } else {
            resp = pesquisar(x, n.dir);
        }
        if(resp==true&&n.i==x){
            System.out.println(n.i);
        }
        return resp;
    }

    public void caminharCentral(No<T> n) {
        
        if (n != null) {
            caminharCentral(n.esq);
            System.out.print(n.i + " ");
            caminharCentral(n.dir);
        }
        
    }
    public void caminharPre(No<T> n) {
        
        if (n != null) {
            System.out.print(n.i + " ");
            caminharCentral(n.esq);
            caminharCentral(n.dir);
        }
        
    }
    public void caminharPos(No<T> n) {
        if (n != null) {
            caminharCentral(n.esq);
            caminharCentral(n.dir);
            System.out.print(n.i + "");
        }
    }
    public void remover(T x){
        raiz = remover(x, raiz);
    }
    public No remover(T x, No<T> n){
        if (n == null) { System.out.println("Erro!");
        }else if(x < n.i){ 
            n.esq = remover(x, n.esq);
        }else if(x > n.i){ 
            n.dir = remover(x, n.dir);
        }else if(n.dir == null) { 
            n = n.esq;
        }else if(n.esq == null) { 
            n = n.dir;
        }else{ 
            n.esq = maiorEsq(n, n.esq); 
        }
        return n;
    }
    public No<T> maiorEsq(No<T> n, No<T> j) {
       if(j.dir == null){ 
           n.i=j.i; j=j.esq; 
       }
       else{ 
           j.dir = maiorEsq(n, j.dir); 
       }
       return j;
   }
//========================================================================
    public void remover2(T x){
        
    }
    public No<T> remover2(T x, No<T> n){
        
        return n;
    }
    
}
