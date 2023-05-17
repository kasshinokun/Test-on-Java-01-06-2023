
package Sort;

import java.util.*;
public class Dados {
    public int Array[];//Instancia a variavel para o Array
    public int N;//Tamanho do Array

    public Dados() {//constructor default
        this.Array= new int[10];//tipo e tamanho do Array
        this.N=Array.length;//Variavel para análise de tamanho
    }
    public void ImprimirArray() {//Impressão dos componentes do Array
        for(int i=0;i<N;i++) {//laço para percorrer o Array
            System.out.println("Posicao "+i+": "+Array[i]);//executa a impressão do Array
        }
    }
    
}