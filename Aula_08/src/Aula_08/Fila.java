package Aula_08;//Nome do Projeto

//Codigo para atividade 08_B

import java.util.*;//Simplificação de bibliotecas necessarias ao projeto

public class Fila {//declaração da classe
    String[] fila;//Vetor de Strings para a Fila
    int P=0;//Variavel para posição Inicial da Fila
    int U=0;//Variavel para posição Final da Fila
    public Fila() {//Construtor Default
        this(5);
    }
    public Fila(int tamanho) {//Sobrecarga
        fila=new String[tamanho+1];
    }
    public void Inserir(String s) {//Inseri uma String da Fila
            //Se modulo de U incrementado de 1 por tamanho da fila for igual a P......
            if(((U+1)%fila.length)==P) {
                    //Informa ao Usuario
            System.out.println("\n========Nao e possivel========");
            System.out.println("========inserir dados,========");
            System.out.println("==========Fila Cheia==========\n");
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
            System.out.println("\n========Nao e possivel========");
            System.out.println("========remover dados,========");
            System.out.println("==========Fila Vazia==========\n");
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
    public void Mostrar() {//Exibe a Fila

            System.out.print("\n[ ");//apenas indicar inicio da exibiçao da fila
            for(int i=P; i!= U;++i) {
                    //exibe os itens presentes na fila separados por espaços
                    System.out.print(fila[i] + " ");
                    i%=fila.length;//modulo de i pelo tamanho da fila
            }
            System.out.println("]");//apenas indicar fim da exibiçao da fila
    }
    //Codigos automaticos para Inserir e Apagar

    public void Adicionar(Fila F1) {//Adição de Strings até preencher o vetor

            Scanner reader = new Scanner(System.in);
    //Variavel para entrada do teclado

            for(int i=U; i<fila.length;i++) {//laço de repetição

                    System.out.print("Digite String 0"+(F1.U+1)+":......");//Solicita ao usuario
            String texto = reader.nextLine();//Armazena valor
            F1.Inserir(texto);//Adiciona String no Vetor no Inicio

            }
    }
    public void Apagar(Fila F1){//Remoção de Strings até esvaziar o vetor
            for(int i=P; i<=U;i++) {//laço de repetição
                    String texto=F1.Remover();//Remove e retorna String
                System.out.println("String Apagada:....: "+texto);//Exibe a String removida    	
                System.out.println("====Apos Remover da Fila======");//Enunciado
                F1.Mostrar();//Exibe vetor
            }
    }
    public static void main(String[] args) {
            System.out.println("\n=====Analise de Dados TAD=====");//Enunciado
            System.out.println("=========02 - Fila============\n");//Enunciado

            Scanner reader = new Scanner(System.in);
    //Variavel para entrada do teclado

            String texto;//Variavel receber as Strings

    Fila F1= new Fila(5);//Instancia um objeto do tipo Fila

            System.out.println("==Insercao de Dados na Fila===");//Enunciado
            //Inserção unica
            System.out.print("Digite String 0"+(F1.U+1)+":......");//Solicita ao usuario
    texto = reader.nextLine();//Armazena valor
    F1.Inserir(texto);//Adiciona String no Vetor no Inicio
    System.out.print("Digite String 0"+(F1.U+1)+":......");//Solicita ao usuario
    texto = reader.nextLine();//Armazena valor
    F1.Inserir(texto);//Adiciona String no Vetor no Inicio

    //F1.Adicionar(F1);//Adição de Strings até preencher o vetor

    F1.Mostrar();//Exibe o vetor

            System.out.println("\n===Remocao de Dados na Fila===");//Enunciado
            texto=F1.Remover();//Remove e retorna String
        System.out.println("String Apagada:....: "+texto);//Exibe a String removida    	
        System.out.println("====Apos Remover da Fila======");//Enunciado
        F1.Mostrar();//Exibe vetor
        texto=F1.Remover();//Remove e retorna String
        System.out.println("String Apagada:....: "+texto);//Exibe a String removida    	
        System.out.println("====Apos Remover da Fila======");//Enunciado
        F1.Mostrar();//Exibe vetor

        //F1.Apagar(F1);//Remoção de Strings até esvaziar o vetor

        System.out.println("\n=========Retornando===========");//  Informação
            System.out.println("======Ao  Menu Inicial========\n");//ao Usuario        
    }
	
}
