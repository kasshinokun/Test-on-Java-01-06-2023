package Main;//Nome do Subprojeto
import java.util.*;//Simplificação de bibliotecas necessarias 
import TAF.*;//Package com as TAD Flexiveis

public class Exercises {
    public static Scanner reader=new Scanner(System.in);
    //Objeto Scanner para Entrada global do teclado
    
    public static void Exercise_1(){
        System.out.println("\n===01 - Gestao de Lista de Contatos==========");//Enunciado
        //instancia os objetos
        No n=new No('A');
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
            
            Agenda.inserirFim2(new Celula(c));//Instancia Celula e envia a lista
            
            if(c.nome.charAt(0)==(n.c)){//Se o char inicial for igual....
                n.Add3(new Celula(c));//Adiciona na lista do Nó
            }
            
            System.out.println("deseja continuar?\nSe sim, aperte 1;\nSenao aperte 0.");
            op=Integer.parseInt(reader.nextLine());
        }while(op==1);
        
        System.out.println("\n==Insercao Predefinida na Lista de Contatos==");//Enunciado
        //Envio predefinido para a classe
        Contato c1=new Contato("Aroldo","(31)3674-7642","aroldo@gatonet.com","123.456.789-00");
        Contato c2=new Contato("Ana","(31)3674-7642","ana@gatonet.com","123.456.789-00");
        Contato c3=new Contato("Beatriz","(31)3674-7642","beatriz@gatonet.com","123.456.789-00");
        Contato c4=new Contato("Carlos","(31)3674-7642","carlos@gatonet.com","123.456.789-00");
        Contato c5=new Contato("Celson","(31)3674-7642","celson@gatonet.com","123.456.789-00");
        Contato c6=new Contato("Aroldo","(31)3674-7642","aroldo@gatonet.com","123.456.789-00");
        //Instancia contato direto na celula e envia a lista
        Agenda.inserirFim2(new Celula("Joana","(31)3674-7642","joana@gatonet.com","123.456.789-00"));
        
        //inserção na lista
        Agenda.inserirFim2(new Celula(c1));//Instancia Celula e envia a lista
        Agenda.inserirFim2(new Celula(c2));//Instancia Celula e envia a lista
        Agenda.inserirFim2(new Celula(c3));//Instancia Celula e envia a lista
        Agenda.inserirFim2(new Celula(c4));//Instancia Celula e envia a lista
        Agenda.inserirFim2(new Celula(c5));//Instancia Celula e envia a lista
        Agenda.inserirFim2(new Celula(c6));//Instancia Celula e envia a lista
        
        //inserção na lista do Nó se nome conter caracter do Nó
        
        if(c1.nome.charAt(0)==(n.c)){//Se o char inicial for igual....
            n.Add3(new Celula(c1));//Adiciona na lista do Nó
        }
        if(c2.nome.charAt(0)==(n.c)){//Se o char inicial for igual....
            n.Add3(new Celula(c2));//Adiciona na lista do Nó
        }
        if(c3.nome.charAt(0)==(n.c)){//Se o char inicial for igual....
            n.Add3(new Celula(c3));//Adiciona na lista do Nó
        }
        if(c4.nome.charAt(0)==(n.c)){//Se o char inicial for igual....
            n.Add3(new Celula(c4));//Adiciona na lista do Nó
        }
        if(c5.nome.charAt(0)==(n.c)){//Se o char inicial for igual....
            n.Add3(new Celula(c5));//Adiciona na lista do Nó
        }
        if(c6.nome.charAt(0)==(n.c)){//Se o char inicial for igual....
            n.Add3(new Celula(c6));//Adiciona na lista do Nó
        }
        
        Agenda.mostrar();//Exibe a lista
        n.view();//Exibe a lista presente no 
        
        System.out.println("\n=============================================\n");//Enunciado
    
    
    }
    public static void Exercise_2(){
        
    }
    public static void Exercise_3(){}
    public static void Exercise_4(){}
    public static void Exercise_5(){
        System.out.println("\n===05 - Gestao de Matriz de Inteiros=========");//Enunciado
        Matriz Matriz=new Matriz();//Instancia e Prepara a Matriz com listas
        Matriz.inserir(0, 0, 5);//Adiciona  o numero desejado na posição
        Matriz.mostrar();//Exibe a Matriz
        System.out.println(Matriz.pesquisar(5));//Pesquisa até a 1ª ocoreencia do numero desejado
        System.out.println(Matriz.pesquisar(0, 0, 5));//Pesquisa o numero desejado na posição
        System.out.println("\n=============================================\n");//Enunciado
    }
    
}
