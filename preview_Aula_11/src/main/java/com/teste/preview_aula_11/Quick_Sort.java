package com.teste.preview_aula_11;
import java.util.*;
public class Quick_Sort{ //declaração da classe Dados
	int Array[];//Instancia a variavel para o Array
	private int N;//Tamanho do Array
	//public int cont=0;//Exibe as contagens
	
	public Quick_Sort() {//constructor default
        Array= new int[10];//tipo e tamanho do Array
        N=Array.length;//Variavel para análise de tamanho
	}
	
	public Quick_Sort(int[] array) {//construtor com atribuições
        Array=array;//Instancia a nova variavel para o Array baseada no constructor default
        N=Array.length;//Variavel para análise de tamanho
	}
	
	public void ImprimirArray() {//Impressão dos componentes do Array
        for(int i=0;i<N;i++) {//laço para percorrer o Array
            System.out.println("Posicao "+i+": "+Array[i]);//executa a impressão do Array
        }
	}
	
	public void quicksort(int esq, int dir) {//Procedimento para execução do Quick Sort
		
		int i = esq;
		int j = dir;
		int pivo = Array[(esq+dir)/2];
		
		while (i <= j){
			
			while (Array[i] < pivo) {
				i++;
			}
			while (Array[j] > pivo) {
					j--;
			}
			if (i <= j){ 
				swap(i, j); i++; j--; 
			}
		}
		if (esq < j) {
			quicksort(esq, j);
		}
		if (i < dir) {
			quicksort(i, dir);
		}
					
	}
	public void swap(int a, int b) {//declaração do procedimento de troca de posições
        int temp = Array[a];//Atribuição de valor de Array[a] a temp
        Array[a] = Array[b];//Atribuição de valor de Array[b] a Array[a] 
        Array[b] = temp;//Atribuição de valor de Array[b] a temp
    }
	public static void main(String[] args) {
		System.out.println("=======02 - Quick Sort========");//Enunciado
	}
}
