package Main.Act_23_05;//Nome do Subprojeto

import java.util.*;//Simplificação de Bibliotecas necessárias

//Importação de outros subprojetos
import TAD.*;//Package contendo os TADs
import TAF.*;//Package contendo os TAFs

public class Exercises {
    public static Scanner reader=new Scanner(System.in);
    //Objeto Scanner para Entrada global do teclado
    

//==========Exercicio 1 precisou do proprio main======================
//==========Exercicio 2 precisou do proprio main======================
    public static void Exercise_3() {
        System.out.println("\n===08 - Gestao de Lista de Sites=============");//Enunciado
        Lista_Site Historico=new Lista_Site();
        System.out.println("\n==Insercao e Exibir Lista de Sites===========");//Enunciado
        Historico.inserirFim("Google", "www.google.com");
        Historico.inserirFim("Yahoo", "www.yahoo.com");
        Historico.inserirFim("Gmail", "www.gmail.com");
        Historico.inserirFim("Outlook", "www.outlook.com");
        Historico.inserirFim("Youtube", "www.youtube.com");
        Historico.mostrar();
        System.out.println("\n==Busca por (Yahoo) e Exibir Lista de Sites==");//Enunciado
        Historico.buscar("Yahoo");
        System.out.println("\n==Exibir Lista de Sites apos Busca===========");//Enunciado
        Historico.mostrar();
        System.out.println("\n==Busca por (GDrive)========================="); 
        Historico.buscar("GDrive");
        System.out.println("\n=============================================\n");//Enunciado
    }
//==========Exercicio 4 precisou do proprio main======================
//==========Exercicio 5 precisou do proprio main======================}
    public static void Exercise_6() {
        System.out.println("\n===11 - Remocao de Chaves Pares==============");//Enunciado
        Lista_Simples lista=new Lista_Simples();
        lista=lista.criarLista();     
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
        lista.removerKey();
        lista.mostrar();
        System.out.println("\n=============================================\n");//Enunciado
    }
    public static void Exercise_7() {
    System.out.println("===12 - Manipulacao de Caracteres em Listas==");//Enunciado
    Lista_Simples lista=new Lista_Simples();
    lista=lista.criarLista();     
    //lista.mostrar3();
    System.out.println("\n=============================================\n");//Enunciado
    lista.organizar_Letras_Numeros();
    //lista.mostrar3();
    System.out.println("\n=============================================\n");//Enunciado
    Lista_Dupla lista2=new Lista_Dupla();
    lista2=lista2.criarLista();     
    //lista2.mostrar3();
    System.out.println("\n=============================================\n");//Enunciado
    lista2.organizar_Letras_Numeros();
    //lista2.mostrar3();
    System.out.println("\n=============================================\n");//Enunciado
    }
        
}

