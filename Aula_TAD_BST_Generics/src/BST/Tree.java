package BST;
import java.util.*;//Simplificação de bibliotecas necessarias 

public class Tree{//Arvore de Inteiros
    public No raiz;
    public Tree(){
        raiz=null;
        
    }
    public void inserir(int x) {
        raiz = inserir(x, raiz);
    }
    private No inserir(int x, No n){
        if (n == null) {
            n = new No(x);
        } else if (x < n.i) {
            n.esq = inserir(x, n.esq);
        } else if (x > n.i) {
            n.dir = inserir(x, n.dir);
        } else {
            System.out.println("Erro!");
        }
            return n;
    }
    public void inserirPai(int x){
        if(raiz == null) {
            raiz = new No(x);
        }else if (x < raiz.i) {
            inserirPai(x, raiz.esq, raiz);
        }else if (x > raiz.i) {
            inserirPai(x, raiz.dir, raiz);
        }else{
            System.out.println("Erro!");
        }
    }
    private void inserirPai(int x, No n, No pai){
        if(n == null) {
            if(x < pai.i){
                pai.esq = new No(x);
            }else {
                pai.dir = new No(x);
            }
        }else if(x < n.i) {
            inserirPai(x, n.esq, n);
        }else if (x > n.i) {
            inserirPai(x, n.dir, n);
        }else {
            System.out.println("Erro!");
        }
    }
    public boolean pesquisar(int x) {
        No n=raiz;
        boolean resp=pesquisar(x, n);
        return resp;
    }
    private boolean pesquisar(int x, No n) {
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

    public void caminharCentral(No n) {
        
        if (n != null) {
            caminharCentral(n.esq);
            System.out.print(n.i + " ");
            caminharCentral(n.dir);
        }
        
    }
    public void caminharPre(No n) {
        
        if (n != null) {
            System.out.print(n.i + " ");
            caminharCentral(n.esq);
            caminharCentral(n.dir);
        }
        
    }
    public void caminharPos(No n) {
        if (n != null) {
            caminharCentral(n.esq);
            caminharCentral(n.dir);
            System.out.print(n.i + "");
        }
    }
    public void remover(int x){
        raiz = remover(x, raiz);
    }
    private No remover(int x, No n){
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
    private No maiorEsq(No n, No j) {
       if(j.dir == null){ 
           n.i=j.i; j=j.esq; 
       }
       else{ 
           j.dir = maiorEsq(n, j.dir); 
       }
       return j;
   }
//========================================================================
    public void remover2(int x){
        
    }
    private No remover2(int x, No n){
        
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

    public void swapEsq(No no){

        no = rotacionarEsq(no);

    }
    private No rotacionarEsq(No no) {
        No noDir = no.dir;
        No noDirEsq = noDir.esq;
        noDir.esq = no;
        no.dir = noDirEsq;
        return noDir;
    }
    public void swapDir(No no){

        no = rotacionarDir(no);

    }
    private No rotacionarDir(No no) {
        No noEsq = no.esq;
        No noEsqDir = noEsq.dir;
        noEsq.dir = no;
        no.esq = noEsqDir;
        return noEsq;
    }
    private No swapEsqDir(No no) {
        no.esq = rotacionarEsq(no.esq);
        return rotacionarDir(no);
    }
    private No swapDirEsq(No no) {
        no.dir = rotacionarDir(no.dir);
        return rotacionarEsq(no);
    }
}


