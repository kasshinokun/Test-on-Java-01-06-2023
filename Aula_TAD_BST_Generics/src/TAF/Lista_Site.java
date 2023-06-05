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
    public void inserirInicio(String x,String y){

        Site tmp=new Site(x,y);
        tmp.prox=inicio.prox;
        inicio.prox=tmp;
        if(inicio==ultimo){
            ultimo=tmp;
        }
        tmp=null;
        n++;
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
    public void inserirFim(String x,String y){//Adição de Inteiros no fim do vetor

        if(inicio==ultimo){
            inserirInicio(x,y);
        }
        else{
            ultimo.prox=new Site(x,y);
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
                       
           
            
            
            
        }
    }
}