package TAF;
import TAF.*;
import java.util.*;//simplificação de Bibliotecas

public class Matriz {
	
    private Celula inicio;//Variavel para indica inicio e fim da matriz
    private int l, c;//Variaveis de dimensões da matriz
    Lista_Simples lista;
    public Matriz() {//construtor default
    	this.lista=new Lista_Simples();
        this.l=3;//para linhas
        this.c=3;//para colunas

    }
    public Matriz(int a, int b) {//sobrecarga

        this.l=a;
        this.c=b;

    }
    void inserir(int i, int j, int elemento) {
    //inserir elemento na lista na posição [i][j]
    	int cont=1;
    	if((i>=l||j>=c)||(i<0||j<0)){
    		System.out.println("Dimensoes Invalidas");
    	}else {
    		Celula tmp=this.inicio.dir;
    		while(cont<=i) {
    			while(cont<=j){
    				
    			}
    		}
    	}//nas colunas tmp=tmp.dir
    	//nas linhas tmp=tmp.inf
    }
    boolean pesquisar(int i, int j, int elemento) {
    //pesquisar elemento na lista na posição [i][j]
    	boolean resp=true;
    	
    	return resp;
    	
    }
    boolean pesquisar(int elemento){
    	//pesquisar elemento nas listas
    	//ate encontrar a primeira ocorrencia
    	boolean resp=true;
    	
    	return resp;
    	
    }
    void mostrar() {
    	
    }
}
