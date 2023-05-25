package TAF;

import java.util.*;//simplificação de Bibliotecas
public class Matriz {
	
    private Celula inicio;//Variavel para indica inicio e fim da matriz
    private int l, c;//Variaveis de dimensões da matriz

    public Matriz() {//construtor default

        this.l=3;//para linhas
        this.c=3;//para colunas

    }
    public Matriz(int a, int b) {//sobrecarga

        this.l=a;
        this.c=b;

    }
//==============================================================================
//Revisão de código
    public void preencher(/*int[] arr*/){
        
            
    
    }
    public void mostrar(){//Inteiros
        
        
        
    }
//==============================================================================
//Codigo da atividade pratica    
    public void inserir(int i,int j, int elemento){
    //Inserção na lista da matriz na posição informada
    
    
    }
    public boolean pesquisar(int elemento){
    //Pesquisa nas listas da matriz até a primeira ocorrencia
        return true;
    }
    public boolean pesquisar(int i, int j, int elemento){
    //Pesquisa na lista da matriz na posição informada
        return true;
    }
}
