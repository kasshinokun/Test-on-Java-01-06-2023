package Main.Exercise;//Nome do Subprojeto
import java.util.*;//Simplificação de bibliotecas necessarias 
import TAF.*;//Package com as TAD Flexiveis

public class Exercise_5 {
    public static Scanner reader=new Scanner(System.in);
    //Objeto Scanner para Entrada global do teclado
    public static void main(String[] args){
        System.out.println("\n===05 - Gestao de Matriz de Inteiros=========");//Enunciado
        Matriz Matriz=new Matriz();//Instancia e Prepara a Matriz com listas
        letra_A(Matriz);//Inserção na posição desejada
        letra_B(Matriz);//Exibe a Matriz
        letra_C(Matriz);//Pesquisa pela 1ª ocorrencia
        letra_D(Matriz);//Pesquisa na posição desejada
        System.out.println("=============================================");//Enunciado
    }
    private static void letra_A(Matriz Matriz){
        //Adiciona  o numero desejado na posição
        Matriz.inserir(0, 0, 5);
    }
    private static void letra_B(Matriz Matriz){
        //Exibe a Matriz
        Matriz.mostrar();
    }
    private static void letra_C(Matriz Matriz){
        //Pesquisa até a 1ª ocorrencia do numero desejado
        System.out.println(Matriz.pesquisar(5));
    }
    private static void letra_D(Matriz Matriz){
        //Pesquisa o numero desejado na posição
        System.out.println(Matriz.pesquisar(0, 0, 5));
    
    }
}
