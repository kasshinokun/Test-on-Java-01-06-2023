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
    public void inserir(Celula x) {//Inserção de Contato
        No n=raiz;
        inserir(x,x.contato.nome.charAt(0), n);
    }
    public void inserir(Celula y, char x, No n) {//Inserção de Contato
        
        if (n == null) {
            
        } else if(x==n.c){
            System.out.println("Inserindo : "+y.contato.nome+" na Lista "+x+"\n");
            n.Add(y);
        } else if(x < n.c) {
            inserir(y,x, n.esq);
        } else {
            inserir(y,x, n.dir);
        }       
    }
    public boolean pesquisar(String x) {//Pesquisa de Nome
      
        No n=raiz;
        boolean resp=pesquisar(x,x.charAt(0), n);
        return resp;
    }
    public boolean pesquisar(String y, char x, No n) {//Pesquisa de Nome
        boolean resp;
        if (n == null) {
            resp = false;
        } else if(x == n.c) {
            resp = true;
        } else if(x < n.c) {
            resp = pesquisar(y,x, n.esq);
        } else {
            resp = pesquisar(y,x, n.dir);
        }
        if(resp==true&&x==n.c){
            System.out.println("Buscando : "+y+" na Lista "+x+"\n");
            resp=n.Lista.pesquisar(y);
        }
        return resp;
    }
    //Em desenvolvimento
    public void pesquisarCPF(String cpf) {//Busca pelo CPF
        No n=raiz;
        pesquisarCPF(cpf, n.c, n);
        //Analisar ao final e comparar com Pesquisar nome    
        
        
    }
    public void pesquisarCPF(String y, char x, No n){//Busca pelo CPF
        
    //Analisar ao final e comparar com Pesquisar nome    
    
        
    }
//===============================================================================
    //Codigos-padrao da arvore baseados na arvore de inteiros
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
    public void remover2(char x){//Teste
        
    }
    public No remover2(char x, No n){//Teste
        
        return n;
    }
//========================================================================
    //Erro de Lógica
}
    
    /*
    //Analisar codigo Pesquisar
    public void pesquisarCPF(String x) {
        No n=raiz;
        boolean resp=pesquisarCPF(x,n);
        if(resp==false){
            System.out.print("O CPF :"+x+" nao foi encontrado nas Listas");
        }
        return resp;
    }
    public boolean pesquisarCPF(String x, No n){
        boolean resp=false;
        while(n != null) {
            resp=n.Lista.pesquisarCPF(x,n.c);
            if(resp==false){
                resp=pesquisarCPF(x,n.esq);
            }
            if(resp==false){
                resp=pesquisarCPF(x,n.dir);
            }else{
                break;
            }
        }
        //Analise do codigo comentado
        return resp;
        
    }    
    */