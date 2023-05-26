package Main.Exercise;//Nome do Subprojeto
import java.util.*;//Simplificação de bibliotecas necessarias 
import TAF.*;//Package com as TAD Flexiveis

public class Exercise_1 {
    public static Scanner reader=new Scanner(System.in);
    //Objeto Scanner para Entrada global do teclado
    public static void main(String[] args){
        System.out.println("\n===01 - Gestao de Lista de Contatos==========");//Enunciado
        letra_A();
        //letra_B();
        System.out.println("Retornando ao Menu Inicial");//Enunciado
        System.out.println("=============================================\n");//Enunciado
    
    
    }
    private static void letra_A(){//Teste Arvore de Listas de Contato
        
        Agenda Arvore=new Agenda();
        
        System.out.println("\n===A) - Insercao e Exibir Lista de Contatos==");//Enunciado
        /*
        System.out.println("Caminho 1====================================");//Enunciado
        Arvore.caminharPre(Arvore.raiz);
        System.out.println("Caminho 2====================================");//Enunciado
        Arvore.caminharCentral(Arvore.raiz);
        System.out.println("Caminho 3====================================");//Enunciado
        Arvore.caminharPos(Arvore.raiz);
        System.out.println("=============================================");//Enunciado
        */
        
        
        System.out.println("=============================================\n");//Enunciado
    }
    private static void letra_B(){ //Teste Arvore de Inteiros
        int []arr={9,8,7,6,5,4,3,2,1};
        Tree Arvore=new Tree();
        for(int i=0;i<arr.length;i++){
            Arvore.inserir(arr[i]);
        }
        System.out.println();
        Arvore.caminharPre(Arvore.raiz);
        System.out.println();
        Arvore.caminharCentral(Arvore.raiz);
        System.out.println();
        Arvore.caminharPos(Arvore.raiz);
        System.out.println("\n");
    }
    private static void letra_C(){}
    private static void letra_D(){}
    
    private static void esboco(){
        //Esboço Exercicio 01
        
        //instancia os objetos
        No n=new No('A');
        Lista_Simples Agenda=new Lista_Simples();
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
        System.out.println("Retornando ao Menu do Exercicio 01");//Enunciado   
    
    }
}