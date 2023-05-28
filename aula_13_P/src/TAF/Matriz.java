package TAF;

import java.util.*;//simplificação de Bibliotecas
public class Matriz {
	
    private No inicio;//Variavel para indica inicio da matriz
    private int l, c;//Variaveis de dimensões da matriz
    
    public Matriz() {//construtor default
        this.inicio=new No();
        this.l=3;//para linhas
        this.c=3;//para colunas
        Preencher();//Preenche os Nós instanciando as listas
        
    }
    public Matriz(int a, int b) {//sobrecarga
        
        this.l=a;
        this.c=b;
        Preencher();//Preenche os Nós instanciando as listas
        
    }
    private void Preencher() {
        char letra='A';
        No i, j;
        int cont=1;
        this.inicio=new No(letra);

        j=this.inicio;

        for(int k1=0;k1<l;k1++) {

            i=j;

            for(int k2=0;k2<c-1;k2++) {
                letra++;
                No tmp=new No(letra);

                i.dir=tmp;
                tmp.esq=i;


                if(k1>0) {

                    tmp.sup=tmp.esq.sup.dir;
                    tmp.esq.sup.dir.inf=tmp;

                }

                i.dir=tmp;
                i=i.dir;

            }
            if(k1<l-1) {
                letra++;
                No tmp=new No(letra);

                j.inf=tmp;
                tmp.sup=j;
                j=j.inf;
                i=j;
                tmp=null;

            }
        }        
    }
    public void mostrar(){//Exibe todas as listas
        //ponteiro para mover a Direita
        No rPtr;

        //ponteiro para mover a Inferior
        No dPtr = this.inicio;

        //loop será executado emquanto Celula.Inf não for null
        while (dPtr != null) {

            rPtr = dPtr;

            //loop será executado emquanto Celula.Dir não for null
            while (rPtr!=null) {
                rPtr.view2();
                rPtr = rPtr.dir;
            }

            //System.out.print("\n");
            dPtr = dPtr.inf;
        }
        System.out.print("\n=============================================");//Enunciado
        
    }
    public void inserir(int i,int j, int elemento){
    //Inserção na lista da matriz na posição informada
        if(dimensoes(i,j)==false){
            System.out.println("Parametros invalidos!!");
            
        }
        else{
            int k=0;
            No z=this.inicio;
            while(k<i){
                z=z.dir;
            }
            k=0;
            z=this.inicio;
            while(k<j){
                z=z.inf;
            }
            z.Add3(new Celula(elemento));
        }
    
    }
    public boolean pesquisar(int elemento){
    //Pesquisa nas listas da matriz até a primeira ocorrencia
        //ponteiro para mover a Direita
        No rPtr;

        //ponteiro para mover a Inferior
        No dPtr = this.inicio;
        
        boolean resp=false;
        
        //loop será executado emquanto Celula.Inf não for null
        while (dPtr != null&&resp!=true) {

            rPtr = dPtr;

            //loop será executado emquanto Celula.Dir não for null
            while (rPtr!=null&&resp!=true) {
                resp=rPtr.Lista.pesquisar(elemento);
                rPtr = rPtr.dir;
            }

            System.out.print("\n");
            dPtr = dPtr.inf;
        }
        return resp;
    }
    public boolean pesquisar(int i, int j, int elemento){
    //Pesquisa na lista da matriz na posição informada
        if(dimensoes(i,j)==false){
            System.out.println("Parametros invalidos!!");
            return false;
        }
        else{
            int k=0;
            No z=this.inicio;
            while(k<i){
                z=z.dir;
            }
            k=0;
            z=this.inicio;
            while(k<j){
                z=z.inf;
            }
            return z.Lista.pesquisar(elemento);
        }
    }
    private boolean dimensoes(int i, int j){
        if(i<=l&&j<=c){
            return true;
        }else{
            return false;
        }
    }
}
