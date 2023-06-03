package Generics;//Nome do Subprojeto

//Adaptação da Classe Tree de BST para Generics

import java.lang.*;//Simplificação de bibliotecas necessarias 
import java.io.*;//Simplificação de bibliotecas necessarias 
import java.util.*;//Simplificação de bibliotecas necessarias 

public class Tree<T extends Comparable<T>>{//Arvore de Inteiros
    public Node<T> raiz;
    public void inserir(T obj) {
            this.raiz=inserir(obj,raiz);
    }
    public Node<T> inserir(T obj, Node<T> n) {
            if (n == null) {
        n=new Node<T>(obj);
    } else if (obj.compareTo(n.elemento)<0) {
        n.esq = inserir(obj, n.esq);
    } else if (obj.compareTo(n.elemento)>0) {
        n.dir = inserir(obj, n.dir);
    } else {
        System.out.println("Erro!");
    }
        return n;
    }
    public void inserirPai(T x){
        if(raiz == null) {
            raiz = new Node<T>(x);
        }else if (x.compareTo(raiz.elemento)<0) {
            inserirPai(x, raiz.esq, raiz);
        }else if (x.compareTo(raiz.elemento)>0) {
            inserirPai(x, raiz.dir, raiz);
        }else{
            System.out.println("Erro!");
        }
    }
    public void inserirPai(T x, Node<T> n, Node<T> pai){
        if(n == null) {
            if(x.compareTo(pai.elemento)<0) {
                pai.esq = new Node<T>(x);
            }else {
                pai.dir = new Node<T>(x);
            }
        }else if(x.compareTo(n.elemento)<0) {
            inserirPai(x, n.esq, n);
        }else if (x.compareTo(n.elemento)>0) {
            inserirPai(x, n.dir, n);
        }else {
            System.out.println("Erro!");
        }
    }
    public boolean pesquisar(T x) {
        Node<T> n=raiz;
        boolean resp=pesquisar(x, n);
        return resp;
    }
    public boolean pesquisar(T x, Node<T> n) {
        boolean resp;
        if (n == null) {
            resp = false;
        } else if(x.compareTo(n.elemento)==0) {
            resp = true;
        }else if(x.compareTo(n.elemento)<0) {
            resp = pesquisar(x, n.esq);
        } else {
            resp = pesquisar(x, n.dir);
        }
        if(resp==true&&n.elemento==x){
            System.out.println(n.elemento);
        }
        return resp;
    }

    public void caminharCentral(Node<T> n) {
        
        if (n != null) {
            caminharCentral(n.esq);
            System.out.print(n.elemento + " ");
            caminharCentral(n.dir);
        }
        
    }
    public void caminharPre(Node<T> n) {
        
        if (n != null) {
            System.out.print(n.elemento + " ");
            caminharCentral(n.esq);
            caminharCentral(n.dir);
        }
        
    }
    public void caminharPos(Node<T> n) {
        if (n != null) {
            caminharCentral(n.esq);
            caminharCentral(n.dir);
            System.out.print(n.elemento + "");
        }
    }
    public void remover(T x){
        raiz = remover(x, raiz);
    }
    public Node<T> remover(T x, Node<T> n){
        if (n == null) { System.out.println("Erro!");
        }else if(x.compareTo(n.elemento)<0) {
            n.esq = remover(x, n.esq);
        }else if(x.compareTo(n.elemento)>0) {
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
    public Node maiorEsq(Node<T> n, Node<T> j) {
       if(j.dir == null){ 
           n.elemento=j.elemento; j=j.esq; 
       }
       else{ 
           j.dir = maiorEsq(n, j.dir); 
       }
       return j;
   }
   //========================================================================
    public void remover2(T x){
        
    }
    public Node<T> remover2(T x, Node<T> n){
        
        return n;
    }
    public void balancear(){//Adaptação da apostila
        if(raiz.esq != null && raiz.dir != null){ 
            System.out.println("Árvore balanceada");
        } else if (raiz.dir != null){
            if (raiz.dir.dir != null){ 
                raiz = rotacionarEsq(raiz);
            } else {
                raiz = swapDirEsq(raiz);
            }
        } else { 
            if (raiz.esq.dir != null){ 
                raiz = swapEsqDir(raiz);
            }else{ 
                raiz = rotacionarDir(raiz);
            }
        }
    }

    public void swapEsq(Node<T> no){

        no = rotacionarEsq(no);

    }
    private Node<T> rotacionarEsq(Node<T> no) {
        Node<T> noDir = no.dir;
        Node<T> noDirEsq = noDir.esq;
        noDir.esq = no;
        no.dir = noDirEsq;
        return noDir;
    }
    public void swapDir(Node<T> no){

        no = rotacionarDir(no);

    }
    private Node<T> rotacionarDir(Node<T> no) {
        Node<T> noEsq = no.esq;
        Node<T> noEsqDir = noEsq.dir;
        noEsq.dir = no;
        no.esq = noEsqDir;
        return noEsq;
    }
    private Node<T> swapEsqDir(Node<T> no) {
        no.esq = rotacionarEsq(no.esq);
        return rotacionarDir(no);
    }
    private Node<T> swapDirEsq(Node<T> no) {
        no.dir = rotacionarDir(no.dir);
        return rotacionarEsq(no);
    }
}
