package AVL.Isidro;
import AVL.*;
import AVL.Programiz.*;
/*

Developed code by Professor Isidro

http://www.professorisidro.com
*/
public class AppQueUsaArvore{
    public static void main(String args[]){
        //Arvore Binaria
        teste1();
        
    
    }public static void teste1(){
        System.out.println("Arvore Binaria");
        System.out.println("\nInserindo Itens....\n");
        Elemento elem = new Elemento(0);
        Arvore arvore = new Arvore(new Elemento(20));
        arvore.inserir(new Elemento(10));
        arvore.inserir(new Elemento(5));
        arvore.inserir(new Elemento(2));
        arvore.inserir(new Elemento(8));
        arvore.inserir(new Elemento(15));
        arvore.inserir(new Elemento(12));
        arvore.inserir(new Elemento(18));
        arvore.inserir(new Elemento(30));
        arvore.inserir(new Elemento(25));
        arvore.inserir(new Elemento(22));
        arvore.inserir(new Elemento(28));
        arvore.inserir(new Elemento(35));
        arvore.inserir(new Elemento(32));
        arvore.inserir(new Elemento(38));
        
        System.out.println("Arvore Binaria");
        System.out.println("Apos insercao, In Order");
        arvore.imprimirInOrdem();
        System.out.println("\n");

        elem.setValor(38);
        arvore = arvore.remover(elem);
        
        System.out.println("Apos remover 38, In Order");
        System.out.println("Arvore Binaria");
        arvore.imprimirInOrdem();
        System.out.println("\n");

        elem.setValor(35);
        arvore = arvore.remover(elem);
        System.out.println("Apos remover 35, In Order");
        System.out.println("Arvore Binaria");
        arvore.imprimirInOrdem();
        System.out.println("\n");

        elem.setValor(20);
        arvore = arvore.remover(elem);
        System.out.println("Apos remover 20, In Order");
        System.out.println("Arvore Binaria");
        arvore.imprimirInOrdem();
        System.out.println();
        
    }
    public static void teste2(){
        
        System.out.println("Arvore AVL");
        System.out.println();
        Elemento elem = new Elemento(0);
        Arvore arvore = new Arvore(new Elemento(20));
        arvore.inserir(new Elemento(10));
        arvore.inserir(new Elemento(5));
        arvore.inserir(new Elemento(2));
        arvore.inserir(new Elemento(8));
        arvore.inserir(new Elemento(15));
        arvore.inserir(new Elemento(12));
        arvore.inserir(new Elemento(18));
        arvore.inserir(new Elemento(30));
        arvore.inserir(new Elemento(25));
        arvore.inserir(new Elemento(22));
        arvore.inserir(new Elemento(28));
        arvore.inserir(new Elemento(35));
        arvore.inserir(new Elemento(32));
        arvore.inserir(new Elemento(38));
        
        System.out.println("Arvore Binaria");
        System.out.println("Apos insercao, In Order");
        arvore.imprimirInOrdem();
        System.out.println("\n");

        elem.setValor(38);
        arvore = arvore.remover(elem);
        
        System.out.println("Apos remover 38, In Order");
        System.out.println("Arvore Binaria");
        arvore.imprimirInOrdem();
        System.out.println("\n");

        elem.setValor(35);
        arvore = arvore.remover(elem);
        System.out.println("Apos remover 35, In Order");
        System.out.println("Arvore Binaria");
        arvore.imprimirInOrdem();
        System.out.println("\n");

        elem.setValor(20);
        arvore = arvore.remover(elem);
        System.out.println("Apos remover 20, In Order");
        System.out.println("Arvore Binaria");
        arvore.imprimirInOrdem();
        System.out.println("\n");
    }
    
}


