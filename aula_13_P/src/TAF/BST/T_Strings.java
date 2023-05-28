package TAF.BST;
import java.util.*;//Simplificação de bibliotecas necessarias 
import TAF.*;//Package com as TAD Flexiveis
import TAF.BST.*;//Package com as Arvores Binarias

public class T_Strings {//Arvore de Arvore de Lista de Strings
    public No raiz;
    
    public T_Strings(){
        this.raiz=null;
    
    }
    public void criarNo(String nome) {
        No n=raiz;
        String s=nome.substring(0,1);
        n = criarNo(s, n);
        
    }
    public No criarNo(String x, No n){
        if (n == null) {
            n = new No(x);
            
        } else if (x.compareToIgnoreCase(n.s)<0) {
            n.esq = criarNo(x, n.esq);
        } else if (x.compareToIgnoreCase(n.s)>0){
            n.dir = criarNo(x, n.dir);
        } else {
            System.out.println("Erro!");
        }
        return n;
    }
    public void inserir(String nome) {//Inserção de Contato
        No n=raiz;
        inserir(nome,nome.substring(0,1), n);
    }
    public void inserir(String nome, String x, No n) {//Inserção de Contato
        
        if (n == null) {
           criarNo(nome);
        } else if (x.compareToIgnoreCase(n.s)==0) {
            System.out.println("\nInserindo : "+nome+" na Lista "+x+"\n");
            n.Add(new Celula (nome));//Conversão para Simplificar codigo(Exercicio 2 usa o mesmo codigo)
            n.view3();
        } else if (x.compareToIgnoreCase(n.s)<0) {
            inserir(nome,x, n.esq);
        } else {
            inserir(nome,x, n.dir);
        }       
    }
    public void mostrar(){
        No n=this.raiz;
        int op;
        Scanner reader=new Scanner(System.in);
        System.out.println("\n========Caminho na Arvore Binaria============");//Enunciado
        System.out.println("Escolha uma opcao:");
        System.out.println("1) - Caminho Pre-Order=======================");//Enunciado
        System.out.println("2) - Caminho Central=========================");//Enunciado
        System.out.println("3) - Caminho Pos-Order=======================");//Enunciado
        op= Integer.parseInt(reader.nextLine());//armazena o valor
        if(op==1){
            System.out.println("Caminho Pre-Order============================");//Enunciado
            caminharPre(raiz);
        }
        else if(op==2){
            System.out.println("Caminho Central==============================");//Enunciado     
            caminharCentral(raiz);
        }
        else if(op==3){
            System.out.println("Caminho Pos-Order============================");//Enunciado
            caminharPos(raiz);
        }else{
            System.out.println("Ok nenhuma das opcoes, retornando ao Menu");
        }
        System.out.println("=============================================");//Enunciado
    
    }
    private void caminharCentral(No n) {
        
        if (n != null) {
            caminharCentral(n.esq);
            n.view3();
            caminharCentral(n.dir);
        }
        
    }
    private void caminharPre(No n) {
        
        if (n != null) {
            n.view3();
            caminharCentral(n.esq);
            caminharCentral(n.dir);
        }
        
    }
    private void caminharPos(No n) {
        if (n != null) {
            caminharCentral(n.esq);
            caminharCentral(n.dir);
            n.view3();
        }
    }
}
