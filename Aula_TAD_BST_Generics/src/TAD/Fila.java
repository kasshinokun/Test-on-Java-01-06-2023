package TAD;
import java.util.*;
public class Fila {
    String[] fila;//Vetor de Strings para a Fila
    int[] fila2;//Vetor de Inteiros para a Fila
    int P=0;//Variavel para posição Inicial da Fila
    int U=0;//Variavel para posição Final da Fila
    public Fila() {//Construtor Default
        fila=new String[5];//Para Strings
        fila2=new int[5];//Para Inteiros
    }
    public Fila(int tamanho) {//Sobrecarga
        fila=new String[tamanho+1];//Para Strings
        fila2=new int[tamanho+1];//Para Inteiros
    }
    
    
    public void Add(int num) {//Inseri um inteiro da Fila
        //Se modulo de U incrementado de 1 por tamanho da fila for igual a P......
        if(((U+1)%fila2.length)==P) {
            //Informa ao Usuario
           
            System.out.println("\n=============Nao e possivel==================");
            System.out.println("==============Inserir dados,=================");
            System.out.println("================Fila Cheia===================\n");
        }else {//senao....
            fila2[U]=num;//Atribui o valor de s a posição U
            //U recebe modulo de U 
            //incrementado de 1 
            //por tamanho da fila
            U+=1%fila2.length;
        }
    }
    public int Erase() {//Remove um inteiro da Fila
        int resp;//Variavel de Retorno

        if(P==U) {//Se P igual a U.....
            //Informa ao Usuario
           
            System.out.println("\n=============Nao e possivel==================");
            System.out.println("==============remover dados,=================");
            System.out.println("================Fila Vazia===================\n");
            return -1;//Retorna -1 ao Main
        }else{//senao....

            //Atribui o valor da String na posição P a resp
            resp=fila2[P];

            //P recebe modulo de P 
            //incrementado de 1 
            //por tamanho da fila
            P+=1%fila2.length;

            return resp;//Retorna a resp ao Main
        }
    }
    
    public void Inserir(String s) {//Inseri uma String da Fila
        //Se modulo de U incrementado de 1 por tamanho da fila for igual a P......
        if(((U+1)%fila.length)==P) {
            //Informa ao Usuario
           
            System.out.println("\n=============Nao e possivel==================");
            System.out.println("==============Inserir dados,=================");
            System.out.println("================Fila Cheia===================\n");
        }else {//senao....
            fila[U]=s;//Atribui o valor de s a posição U
            /*U recebe modulo de U 
            incrementado de 1 
            por tamanho da fila*/
            U+=1%fila.length;
        }
    }
    public String Remover() {//Remove uma String da Fila
        String resp;//Variavel de Retorno

        if(P==U) {//Se P igual a U.....
            //Informa ao Usuario
           
            System.out.println("\n=============Nao e possivel==================");
            System.out.println("==============remover dados,=================");
            System.out.println("================Fila Vazia===================\n");
            
            return "Vazio";//Retorna a resp a String "Vazio"
        }else{//senao....

            //Atribui o valor da String na posição P a resp
            resp=fila[P];

                        /*P recebe modulo de P 
            incrementado de 1 
            por tamanho da fila*/
            P+=1%fila.length;

            return resp;//Retorna a resp ao Main
        }
    }
    
    public void Mostrar1() {//Exibe a Fila de Strings

        System.out.print("\n[ ");//apenas indicar inicio da exibiçao da fila
        for(int i=P; i!= U;++i) {
            //exibe os itens presentes na fila separados por espaços
            System.out.print(fila[i] + " ");
            i%=fila.length;//modulo de i pelo tamanho da fila
        }
        System.out.println("]");//apenas indicar fim da exibiçao da fila
    }
    public void Mostrar2() {//Exibe a Fila de inteiros
		
        System.out.print("\n[ ");//apenas indicar inicio da exibiçao da fila
        for(int i=P; i!= U;++i) {
            //exibe os itens presentes na fila separados por espaços
            System.out.print(fila2[i] + " ");
            i%=fila2.length;//modulo de i pelo tamanho da fila
        }
        System.out.println("]");//apenas indicar fim da exibiçao da fila
    }
    public void Exibir_Filas(Fila fila1, Fila fila2, Fila fila3){
        System.out.print("\n============== Fila F========================");
        fila1.Mostrar2();
        System.out.print("\n=========== Fila F Pares=====================");
        fila2.Mostrar2();
        System.out.print("\n===========Fila F Impares====================");
        fila3.Mostrar2();
        
    }
    
}
