package Main.Exercise;//Nome do Subprojeto
import java.util.*;//Simplificação de bibliotecas necessarias 
import TAF.*;//Package com as TAD Flexiveis

public class Exercise_1 {
    public static Scanner reader=new Scanner(System.in);
    //Objeto Scanner para Entrada global do teclado
    public static void main(String[] args){
        System.out.println("\n===01 - Gestao de Lista de Contatos==========");//Enunciado
        letra_A();
        System.out.println("Retornando ao Menu Inicial");//Enunciado
        System.out.println("=============================================\n");//Enunciado
    
    
    }
    private static void letra_A(){//Arvore de Listas de Contato
        
        Agenda Arvore=new Agenda();
        
        System.out.println("\n===A) - Insercao e Exibir Lista de Contatos==");//Enunciado
        
        System.out.println("\n==Insercao Predefinida na Lista de Contatos==");//Enunciado
        Arvore.inserir(new Celula("Aroldo","(31)3674-7642","aroldo@gatonet.com","123.456.789-00"));
        Arvore.inserir(new Celula("Ana","(31)3674-7642","ana@gatonet.com","123.456.789-00"));
        Arvore.inserir(new Celula("Beatriz","(31)3674-7642","beatriz@gatonet.com","123.456.789-00"));
        Arvore.inserir(new Celula("Carlos","(31)3674-7642","carlos@gatonet.com","123.456.789-00"));
        Arvore.inserir(new Celula("Celson","(31)3674-7642","celson@gatonet.com","123.456.789-00"));
        
        int op;
        //Inserção de Strings conforme desejo do usuario
        System.out.println("\n==Insercao de Contatos a criterio do Usuario=");//Enunciado
        do{
            //Solicitação ao usuario das Strings
            System.out.println("deseja continuar?\nSe sim, aperte 1;\nSenao aperte 0.");
            op= Integer.parseInt(reader.nextLine());//armazena o valor
            if(op==0){
                break;//Tratativa de erro no buffer do teclado
            }
            System.out.print("Digite um nome por favor:-------");//Nome
            String nome=reader.nextLine();//armazena o valor
            System.out.print("Digite um telefone por favor:---");//Telefone
            String telefone=reader.nextLine();//armazena o valor
            System.out.print("Digite um email por favor:------");//Email
            String email=reader.nextLine();//armazena o valor
            System.out.print("Digite um cpf por favor:--------");//CPF
            String cpf=reader.nextLine();//armazena o valor
            
            Arvore.inserir(new Celula(nome,telefone,email,cpf));//Envia para a classe
        }while(op!=0);//Se repetira enquanto não for zero
        
        System.out.println("==Pesquisa na Lista de Contatos==============");//Enunciado
        System.out.println(Arvore.pesquisar("Aroldo"));
        System.out.println(Arvore.pesquisar("Ana"));
        System.out.println(Arvore.pesquisar("Beatriz"));
        System.out.println(Arvore.pesquisar("Carlos"));
        System.out.println(Arvore.pesquisar("Celson"));
        System.out.print("Digite um nome para pesquisar:--");
        System.out.println(Arvore.pesquisar(reader.nextLine()));//armazena o valor
        
        System.out.println("Escolha uma opcao:");
        System.out.println("1) - Caminho Pre-Order=======================");//Enunciado
        System.out.println("2) - Caminho Central=========================");//Enunciado
        System.out.println("3) - Caminho Pos-Order=======================");//Enunciado
        op= Integer.parseInt(reader.nextLine());//armazena o valor
        if(op==1){
            System.out.println("Caminho Pre-Order============================");//Enunciado
            Arvore.caminharPre(Arvore.raiz);
        }
        else if(op==2){
            System.out.println("Caminho Central==============================");//Enunciado     
            Arvore.caminharCentral(Arvore.raiz);
        }
        else if(op==3){
            System.out.println("Caminho Pos-Order============================");//Enunciado
            Arvore.caminharPos(Arvore.raiz);
        }else{
            System.out.println("Ok nenhuma das opcoes, retornando ao Menu");
        }
        System.out.println("=============================================");//Enunciado
    }
    private static void letra_B(){}
    private static void letra_C(){}
    private static void letra_D(){}
}