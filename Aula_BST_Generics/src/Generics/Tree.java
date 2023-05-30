package Generics;
import java.util.*;//Simplificação de bibliotecas necessarias 

public class Tree<T>{//Arvore de Inteiros
	Node<T> raiz;
	public void inserir(T obj) {
		this.raiz=inserir(obj,raiz);
	}
	public Node<T> inserir(T obj, Node<T> n) {
		if (n == null) {
            n=new Node<T>(obj);
        } else if (obj < n.elemento) {
            n.esq = inserir(obj, n.esq);
        } else if (obj>n.elemento) {
            n.dir = inserir(obj, n.dir);
        } else {
            System.out.println("Erro!");
        }
		return n;
	}
}
