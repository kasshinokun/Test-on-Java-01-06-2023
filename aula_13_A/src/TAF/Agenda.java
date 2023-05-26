package TAF;//Nome do subprojeto

import java.util.*;//Simplificação de bibliotecas necessarias 
import TAF.*;//Package com as TAD Flexiveis

public class Agenda {//Arvore de Listas de Contato
    public No raiz;
    public Agenda(){
        //char[] V=new char[26];
        char a='A';
        /*
        for(int i=0;i<V.length;i++) {
            V[i]=a++;
        }*/
        for(int i=0;i<26;i++) {
            inserir(a++);
        }
        //montar(V);
    }
    private void montar(char[] V){
        for(int i=0;i<V.length;i++) {
            inserir(V[i]);
        }
    }
    /*
    private void inserir(char x) {
        raiz = inserir(x, raiz);
    }
    *//*
    private void montar(No R,char[] V,int inicio,int fim){
        int pos=fim-inicio/2;
        if(inicio<fim){
            this.inserir(V[pos], R);
        }
        if(inicio<fim){
            montar(R,V,0,pos+1);
            montar(R,V,pos,fim-1);
        }
    }*/
    private void inserir(char x) {
        raiz = inserir(x, raiz);
    }
    private No inserir(char x, No n){
        if (n == null) {
            n = new No(x);
        } else if (x < n.c) {
            n.esq = inserir(x, n.esq);
        } else if (x > n.c) {
            n.dir = inserir(x, n.dir);
        } else {
            System.out.println("Erro!");
        }
            return n;
    }
    public void inserir(Contato c){ }
    public void pesquisar_Nome(){}
    public void Exibir_Letra(char c){
    
    }
    public void caminharCentral(No n) {
        
        if (n != null) {
            caminharCentral(n.esq);
            n.view();
            caminharCentral(n.dir);
        }
        
    }
    public void caminharPre(No n) {
        
        if (n != null) {
            n.view();
            caminharCentral(n.esq);
            caminharCentral(n.dir);
        }
        
    }
    public void caminharPos(No n) {
        if (n != null) {
            caminharCentral(n.esq);
            caminharCentral(n.dir);
            n.view();
        }
    }
    public boolean pesquisar(String x) {
        boolean resp=pesquisar(x.charAt(0), raiz);
        if(resp==true){
            raiz.view();
            //raiz.Lista.pesquisar(x);
        }
        return resp;
    }
    public boolean pesquisar(char x, No n) {
        boolean resp;
        if (n == null) {
            resp = false;
        } else if(x == n.c) {
            resp = true;
        } else if(x < n.c) {
            resp = pesquisar(x, n.esq);
        } else {
            resp = pesquisar(x, n.dir);
        }
        return resp;
    }
//===============================================================================
    public void inserirPai(char x){
        if(raiz == null) {
            raiz = new No(x);
        }else if (x < raiz.c) {
            inserirPai(x, raiz.esq, raiz);
        }else if (x > raiz.c) {
            inserirPai(x, raiz.dir, raiz);
        }else{
            System.out.println("Erro!");
        }
    }
    public void inserirPai(char x, No n, No pai){
        if(n == null) {
            if(x < pai.c){
                pai.esq = new No(x);
            }else {
                pai.dir = new No(x);
            }
        }else if(x < n.c) {
            inserirPai(x, n.esq, n);
        }else if (x > n.c) {
            inserirPai(x, n.dir, n);
        }else {
            System.out.println("Erro!");
        }
    }
//===============================================================================
    public void remover(char x){
        raiz = remover(x, raiz);
    }
    public No remover(char x, No n){
        if (n == null) { System.out.println("Erro!");
        }else if(x < n.c){ 
            n.esq = remover(x, n.esq);
        }else if(x > n.c){ 
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
    public No maiorEsq(No n, No j) {
       if(j.dir == null){ 
           n.i=j.i; j=j.esq; 
       }
       else{ 
           j.dir = maiorEsq(n, j.dir); 
       }
       return j;
   }
//========================================================================
    public void remover2(char x){
        
    }
    public No remover2(char x, No n){
        
        return n;
    }
}
