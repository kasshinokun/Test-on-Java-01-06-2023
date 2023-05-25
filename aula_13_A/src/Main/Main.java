
package Main;//Nome do Subprojeto
import java.util.*;//Simplificação de bibliotecas necessarias 
import TAF.*;//Package com as TAD Flexiveis
import BST.*;
public class Main {
    static Scanner reader = new Scanner(System.in);
    //Variavel global para entrada do teclado na classe
    public static void main(String[] args){
        System.out.println("\n===13 - Gestao de Lista de Contatos==========");//Enunciado
        /*
        Lista_Simples Agenda=new Lista_Simples();
        System.out.println("\n==Insercao e Exibir Lista de Contatos========");//Enunciado
        
        *//*
        //Inserção de Strings conforme desejo do usuario
        
        //Solicitação ao usuario das Strings
        System.out.print("Digite um nome por favor:---------------");//Nome
        String nome=reader.nextLine();//armazena o valor
        System.out.print("Digite um telefone por favor:---------------");//Telefone
        String telefone=reader.nextLine();//armazena o valor
        System.out.print("Digite um email por favor:---------------");//Email
        String email=reader.nextLine();//armazena o valor
        System.out.print("Digite um cpf por favor:---------------");//CPF
        String cpf=reader.nextLine();//armazena o valor
        
        Contato c1=new Contato(nome,telefone,email,cpf);//Envia para a classe
        *//*
        ////Envio predefinido para a classe
        Contato c1=new Contato("Aroldo","(31)3674-7642","aroldo@gatonet.com","123.456.789-00");
        Contato c2=new Contato("Joao","(31)3674-7642","joao@gatonet.com","123.456.789-00");
        Contato c3=new Contato("Maria","(31)3674-7642","maria@gatonet.com","123.456.789-00");
        Contato c4=new Contato("Pedro","(31)3674-7642","pedro@gatonet.com","123.456.789-00");
        System.out.println(c1.toString());//Exibe o objeto do tipo contato
        System.out.println(c2.toString());//Exibe o objeto do tipo contato
        System.out.println(c3.toString());//Exibe o objeto do tipo contato
        System.out.println(c4.toString());//Exibe o objeto do tipo contato
        *//*
        //inserção na lista
        Agenda.inserirFim2(new Celula(c1));//Instancia Celula e envia a lista
        Agenda.inserirFim2(new Celula(c2));//Instancia Celula e envia a lista
        Agenda.inserirFim2(new Celula(c3));//Instancia Celula e envia a lista
        Agenda.inserirFim2(new Celula(c4));//Instancia Celula e envia a lista
        Agenda.mostrar();//Exibe a lista
        */
        
        System.out.println("\n=============================================\n");//Enunciado
    
    }
}
