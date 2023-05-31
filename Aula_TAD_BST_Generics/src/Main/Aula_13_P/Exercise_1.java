package Main.Aula_13_P;//Nome do Subprojeto
import java.util.*;//Simplificação de bibliotecas necessarias 
import TAF.*;//Package com as TAD Flexiveis
import TAF.BST.Agenda;//Package com as Arvores Binarias
public class Exercise_1 {
    public static Scanner reader=new Scanner(System.in);
    //Objeto Scanner para Entrada global do teclado
    public static void main(String[] args){
        
        Agenda Arvore=new Agenda();
        
        int opcao;//Variavel de escolha
        do{
            
            System.out.println("\n===01 - Gestao de Lista de Contatos==========");//Enunciado
            System.out.println("=============Menu de Exercicos===============");//Enunciado

            System.out.println("===A) - Insercao e Exibir Lista de Contatos==");//Enunciado
            System.out.println("===B) - Pesquisa na Lista de Contatos========");//Enunciado
            System.out.println("===C) - Pesquisa por cpf na Arvore===========");//Enunciado
            System.out.println("===D) - Remocao na Arvore Binaria============");//Enunciado
            System.out.println("===E) - Caminho na Arvore Binaria============");//Enunciado
            System.out.println("\n==========Digite 0 para Encerrar=============");//Enunciado

            System.out.println("\n======Por favor escolha uma opcao: ==========");//Enunciado
            opcao = Integer.parseInt(reader.nextLine());//armazena o valor
            switch(opcao){//Analise do que foi digitado

                case 1://Chama o procedimento
                    letra_A(Arvore);
                    break;//Condição de parada
                case 2://Chama o procedimento
                    letra_B(Arvore);
                    break;//Condição de parada
                case 3://Chama o procedimento
                    letra_C(Arvore);
                    break;//Condição de parada
                case 4://Chama o procedimento
                    letra_D(Arvore);
                    break;//Condição de parada
                case 5://Chama o procedimento
                    letra_E(Arvore);
                    break;//Condição de parada
                default:
                    if(opcao==0){//despedida do usuario e agradecimento
                        System.out.println("Retornando ao Menu Inicial");//Enunciado
                        System.out.println("=============================================\n");//Enunciado
                    }
                    else{//Se não estiver no intervalo, informa ao usuario
                        //e reapresenta o menu
                        System.out.println("\n============Opcao Invalida.==================");
                        System.out.println("======Tente novamente por gentileza!=========\n");
                    } 
            }      
        }while(opcao!=0);//Se repetira enquanto não for zero
    }
        
    private static void letra_A(Agenda Arvore){//Arvore de Listas de Contato
               
        System.out.println("\n===A) - Insercao e Exibir Lista de Contatos==");//Enunciado
        
        System.out.println("\n==Insercao Predefinida na Lista de Contatos==");//Enunciado
        Arvore.inserir(new Contato("Aroldo","(12)3456-7890","aroldo@gatonet.com","123.456.789-00"));
        Arvore.inserir(new Contato("Ana","(12)3456-7890","ana@gatonet.com","456.123.789-00"));
        Arvore.inserir(new Contato("Beatriz","(12)3456-7890","beatriz@gatonet.com","789.123.456-00"));
        Arvore.inserir(new Contato("Carlos","(12)3456-7890","carlos@gatonet.com","321.456.789-00"));
        Arvore.inserir(new Contato("Celson","(12)3456-7890","celson@gatonet.com","231.456.789-00"));
        Arvore.inserir(new Contato("Zoroastro","(12)3456-7890","zoroastro@gatonet.com","111.111.111-11"));
        
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
            
            Arvore.inserir(new Contato(nome,telefone,email,cpf));//Envia para a classe
        }while(op!=0);//Se repetira enquanto não for zero
        System.out.println("=============================================");//Enunciado        
    }
    private static void letra_B(Agenda Arvore){
        
        System.out.println("\n===B) - Pesquisa na Lista de Contatos========");//Enunciado
        System.out.println(Arvore.pesquisar("Aroldo"));
        System.out.println(Arvore.pesquisar("Ana"));
        System.out.println(Arvore.pesquisar("Beatriz"));
        System.out.println(Arvore.pesquisar("Carlos"));
        System.out.println(Arvore.pesquisar("Celson"));
        System.out.println(Arvore.pesquisar("Zoroastro"));
        System.out.print("Digite um nome para pesquisar:--");
        System.out.println(Arvore.pesquisar(reader.nextLine()));//armazena o valor
        System.out.println("=============================================");//Enunciado
    
    }
    private static void letra_C(Agenda Arvore){//Adaptação
        System.out.println("\n===C) - Pesquisa por cpf na Arvore===========");//Enunciado
        Arvore.pesquisarCPF("111.111.111-11");//Predefinido(Classe Lista fara a busca e impressão em tela)
        //System.out.println(Arvore.pesquisarCPF("111.111.111-11"));//Ainda que verdadeiro apresenta false)
        System.out.print("Digite um nome para pesquisar:--");
        Arvore.pesquisarCPF(reader.nextLine());//armazena o valor da entrada
        System.out.println("\n=============================================");//Enunciado
        
    }
    private static void letra_D(Agenda Arvore){
        System.out.println("\n===D) - Remocao na Arvore Binaria============");//Enunciado
        System.out.println(Arvore.remover("Zoroastro"));
        System.out.print("Digite um nome para pesquisar:--");
        System.out.println(Arvore.remover(reader.nextLine()));//armazena o valor
        System.out.println("=============================================");//Enunciado    
    }
    private static void letra_E(Agenda Arvore){
        int op;
        System.out.println("\n===E) - Caminho na Arvore Binaria============");//Enunciado
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
}