
import java.util.*;//simplificação de Bibliotecas 
public class Celula{
	int elemento1;//variavel para inserção de inteiros
	String elemento2;//variavel para inserção de Strings
	char elemento3;//variavel para inserção de caracteres
	
	Celula Inicio;//Inicio
	
	//Ponteiros
	Celula Esq;//variavel para Anterior e Esquerda
	Celula Dir;//variavel para Proximo e Direita
	
	Celula Sup;//variavel para Superior
	Celula Inf;//variavel para Inferior
	
	public Celula(){//Construtor default
		this.elemento1=0;//inteiros
		this.elemento2=" ";//Strings
		this.elemento3=0;//caracteres
                //Ponteiros
                this.Dir=null;//Proximo e Direita
                this.Esq=null;//Anterior e Esquerda
                this.Inf=null;//Inferior
                this.Sup=null;//Superior
	}
	//Sobrecarga da classe
	public Celula(int x) {
		this.elemento1=x;//inteiros
	}
	public Celula(String x) {
		this.elemento2=x;//Strings
	}
	public Celula(char x) {
		this.elemento3=x;//caracteres
	}
}
