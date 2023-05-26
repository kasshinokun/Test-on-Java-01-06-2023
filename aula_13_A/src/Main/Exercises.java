package Main;//Nome do Subprojeto
import java.util.*;//Simplificação de bibliotecas necessarias 
import TAF.*;//Package com as TAD Flexiveis
import BST.*;//Package com as Arvores Binarias

public class Exercises {
    public static Scanner reader=new Scanner(System.in);
    //Objeto Scanner para Entrada global do teclado
    
    public static void Exercise_1(){
        System.out.println("\n===01 - Gestao de Lista de Contatos==========");//Enunciado
        
        
        Lista_Simples Agenda=new Lista_Simples();
        System.out.println("\n==Insercao e Exibir Lista de Contatos========");//Enunciado
        
        //Inserção de Strings conforme desejo do usuario
        //Solicitação ao usuario das Strings
        int op=1;
        do{
            
            System.out.print("Digite um nome por favor:-------");//Nome
            String nome=reader.nextLine();//armazena o valor
            System.out.print("Digite um telefone por favor:---");//Telefone
            String telefone=reader.nextLine();//armazena o valor
            System.out.print("Digite um email por favor:------");//Email
            String email=reader.nextLine();//armazena o valor
            System.out.print("Digite um cpf por favor:--------");//CPF
            String cpf=reader.nextLine();//armazena o valor
            
            Contato c=new Contato(nome,telefone,email,cpf);//Envia para a classe
            System.out.println("=============================================");//Enunciado
            System.out.println(c.toString());//Exibe o objeto do tipo contato
            System.out.println("=============================================");//Enunciado
            Agenda.inserirFim2(new Celula(c));//Instancia Celula e envia a lista
            System.out.println("deseja continuar?\nSe sim, aperte 1;\nSenao aperte qualquer tecla.");
            op=Integer.parseInt(reader.nextLine());
        }while(op==1);
        System.out.println("\n==Insercao Predefinida na Lista de Contatos==");//Enunciado
        //Envio predefinido para a classe
        Contato c1=new Contato("Aroldo","(31)3674-7642","aroldo@gatonet.com","123.456.789-00");
        Contato c2=new Contato("Joao","(31)3674-7642","joao@gatonet.com","123.456.789-00");
        Contato c3=new Contato("Maria","(31)3674-7642","maria@gatonet.com","123.456.789-00");
        Contato c4=new Contato("Pedro","(31)3674-7642","pedro@gatonet.com","123.456.789-00");
        System.out.println(c1.toString());//Exibe o objeto do tipo contato
        System.out.println(c2.toString());//Exibe o objeto do tipo contato
        System.out.println(c3.toString());//Exibe o objeto do tipo contato
        System.out.println(c4.toString());//Exibe o objeto do tipo contato
        
        //inserção na lista
        Agenda.inserirFim2(new Celula(c1));//Instancia Celula e envia a lista
        Agenda.inserirFim2(new Celula(c2));//Instancia Celula e envia a lista
        Agenda.inserirFim2(new Celula(c3));//Instancia Celula e envia a lista
        Agenda.inserirFim2(new Celula(c4));//Instancia Celula e envia a lista
        //Instancia contato direto na celula e envia a lista
        Agenda.inserirFim2(new Celula("Joana","(31)3674-7642","joana@gatonet.com","123.456.789-00"));
        Agenda.mostrar();//Exibe a lista
        
        
        System.out.println("\n=============================================\n");//Enunciado
    
    
    }
    public static void Exercise_2(){}
    public static void Exercise_3(){}
    public static void Exercise_4(){}
    public static void Exercise_5(){}
    
}
