package Aula_13;
import java.util.*;
public class Tree_List {
	
	public class Cell{
		Contato contato;
		Cell prox;
		public Cell() {
			this.contato=new Contato();
			this.prox=null;
		}
		public Cell(Contato C) {
			this.contato=C;
		}
	}
	
	public class Node{
		
		char letra;
		//Ponteiros
	    Node esq;//variavel para Esquerda
	    Node dir;//variavel para Direita

	    Node primeiro;//variavel para Inicio
	    Node ultimo;//variavel para Fim
		public Node() {
			this.letra=0;
		}
		public Node(char x) {
			this.letra=x;
		}
		
	}
	public class Tree{
		
		
	}
	public class Agenda{
		Node raiz;
		public Agenda() {
			
			
		}
		public void inserir(Contato c){}
		public void remover(String nome){}
		public void pesquisar(String nome){}
		public void pesquisar(int cpf){}
		private void criar_tree(){
			char arr[]=new char[26];
	    	char k='A';
	    	for(int i=0;i<arr.length;i++) {
	    		arr[i]=k++;
	    		System.out.println((i+1)+" "+arr[i]);
	    	}
	    	
		}
		
	}
}
