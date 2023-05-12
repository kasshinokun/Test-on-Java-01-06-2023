

import java.util.*;//simplificação de Bibliotecas 
public class Matriz {
	Celula Inicio;//Variavel para indica inicio da matriz
	int l, c;//Variaveis de dimensões da matriz
	public Matriz() {//construtor default
		this.l=3;//para linhas
		this.c=3;//para colunas
	}
	public Matriz(int a, int b) {//sobrecarga
		this.l=a;
		this.c=b;

	}
	public void Preencher(int[] arr) {
	/*void Prencher Matriz(int[ ] V) 
	 Recebe um vetor de inteiros e 
	preenche a matriz declarada 
	com os valores de V*/
		if(arr.length!=l*c) {
			System.out.println("Parametros invalidos!!");
		}else {
			Celula i, j,tmp;
			i=j=new Celula(arr[0]);
			int cont=1;
			for(int l1=0;l1<l;l1++) {
				for(int c1=0;c1<c-1;c1++) {
					tmp=new Celula(arr[cont]);
					tmp.Esq=i;
					if(l1!=0) {
						tmp.Sup=tmp.Esq.Sup.Dir;
						tmp.Esq.Sup.Dir.Esq=tmp;
					}
					i.Dir=tmp;
					i=i.Dir;
					tmp=null;
					cont++;
				}if(l1<l-1) {
					tmp=new Celula(arr[cont]);
					cont++;
					j.Inf=tmp;
					tmp.Sup=j;
					j=j.Inf;
					i=j;
					tmp=null;
				}
			}
		}
		
	}
	public void Imprimir() {
		//void Imprimir( )  // Imprime a matriz	
	}
	public Matriz soma(Matriz a, Matriz b) {
	/*Matriz Soma(Matriz B) // Seja a matriz A  
	 * o objeto instanciado da classe Matriz, 
	 * o método deve receber uma matriz B 
	 * e retornar a soma C = A + B*/	
		Matriz c=new Matriz();
		
		
		return c;
	}
	


	public int DiagonalPrincipal( ){  
	/*Calcula a diagonal principal 
	 * da matriz (se existir)*/
		int k=0;
		
		
		
		
		return k;
	}
	public int DiagonalSecundária( ){ 
	/*Calcula a diagonal secundária 
	da matriz (se existir)*/
		int k=0;
		
		
		
		
		return k;
	}
	public Matriz Multiplicação(Matriz B) {
	/*Seja a matriz A  o objeto instanciado 
	 * da classe Matriz, o método deve receber 
	 * uma matriz B e retornar a multiplicação C = A x B*/
		Matriz c=new Matriz();
		
		return c;
	}
}
