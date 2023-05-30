package TAF;

import java.util.*;//simplificação de Bibliotecas
public class No{
		
    char letra;
    //Ponteiros
    No esq;//variavel para Esquerda
    No dir;//variavel para Direita

    public No() {
        this.letra=0;
        
    }
    public No(char x) {
        this.letra=x;
    }
		
}