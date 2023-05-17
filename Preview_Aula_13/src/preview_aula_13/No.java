
package preview_aula_13;

public class No{
		
    char letra;
    //Ponteiros
    No esq;//variavel para Esquerda
    No dir;//variavel para Direita

    No primeiro;//variavel para Inicio
    No ultimo;//variavel para Fim
    public No() {
        this.letra=0;
    }
    public No(char x) {
        this.letra=x;
    }
		
}