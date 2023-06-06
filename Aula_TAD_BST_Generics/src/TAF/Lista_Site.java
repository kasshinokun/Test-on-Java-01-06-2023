package TAF;
//Classe para Exercicio 8
public class Lista_Site{
    Site inicio;
    Site ultimo;

    public int n=0;//Variavel auxiliar de analise de tamanho

    public Lista_Site(){
        this.inicio=new Site();
        this.ultimo=this.inicio;
    }
    
    public void buscar(String x){
            
        Site i=this.inicio.prox;
        boolean j=false;
        int cont=0;
        while(i.prox!=null){
            if(i.nome==x){
                System.out.println("Site localizado");
                System.out.println(i.toString());
                String x1=i.nome;
                String x2=i.link;
                removerPos(cont);
                inserirInicio(x1,x2);
                j=true;
                break;
            }
            i=i.prox;
            cont++;
        }
        if(j==false){
            System.out.println("Site nao localizado");
        }


    }
    
    public void inserirInicio(String y,String z){//inseri a celula completa no inicio
        Site x=new Site(y,z);
        x.prox=inicio.prox;
        inicio.prox=x;
        if(inicio==ultimo){
            ultimo=x;
        }
        x=null;
        n++;
    }
    public void inserirFim(String y,String z){//inseri a celula completa no fim
        Site x=new Site(y,z);
        if(inicio==ultimo){
            inserirInicio(y,z);
        }
        else{
            
            ultimo.prox=x;
            ultimo=ultimo.prox;
            n++;
            
        }
    
    }
    public void mostrar(){
        Site i = this.inicio.prox;

        for(;i!=null;i=i.prox){
            System.out.println(i.toString());

        }

    }
    public Site removerInicio(){
        if (inicio==ultimo){
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
            return null;
        }
        else{
            Site tmp=inicio;
            inicio=inicio.prox;
            Site elemento = new Site(inicio.nome,inicio.link);
            tmp.prox=null;
            tmp=null;
            n--;
            return elemento;
        }
    }
    public Site removerPos(int pos) {
    	//Remoção de inteiros na posição designada do vetor
    	if(inicio==ultimo||pos<0||pos>=n){
            //Se n igual a 0....
            //Ou também se pos menor que 0.... 
            //Ou pos maior ou igual a n..... 

            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Remover dados,================");
            System.out.println("==========Parametros Invalidos !!===========\n");
                                  
            return null;
        }else if(pos==0){
            return removerInicio();
        }
        else if(pos==n-1){
            return removerFim();
        }else{//senao....
           
            Site i=this.inicio;
            for(int j=0;j<pos;j++,i=i.prox);
            Site tmp=i.prox;
            Site resp=new Site(tmp.nome,tmp.link);
            i.prox=tmp.prox;
            tmp.prox=null;
            i=tmp=null;
            n--;
            return resp;
        }
            
     
    }
    public Site removerFim(){
        if(inicio==ultimo){
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
            return null;
        }else{
                       
           Site i = this.inicio;
        
            for(;i.prox!=ultimo;i=i.prox);
            Site y=new Site(ultimo.nome,ultimo.link);
            
            ultimo=i;
            i=ultimo.prox=null;
            n--;
            return y;
        }
    }
    
}