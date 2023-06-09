package TAF;

import java.util.*;//simplificação de Bibliotecas
public class Lista_Simples {
    
    private Celula primeiro,ultimo;
    
    public int n=0;//Variavel auxiliar de analise de tamanho
    
    public Lista_Simples(){
        
        primeiro=new Celula();
        ultimo=primeiro;
    
    }
    public void inserirInicio(int x){
        
        Celula tmp=new Celula(x);
        tmp.prox=primeiro.prox;
        primeiro.prox=tmp;
        if(primeiro==ultimo){
            ultimo=tmp;
        }
        tmp=null;
        n++;
    }
    public void inserirFim(int x){//Adição de Inteiros no fim do vetor
        
        if(primeiro==ultimo){
            inserirInicio(x);
        }
        else{
            
            ultimo.prox=new Celula(x);
            ultimo=ultimo.prox;
            n++;
            
        }
    }
    public void inserirPos(int x, int pos){//Inserção de Inteiros na posição designada do vetor
    	
        if(pos<=0){
            if(pos<0){
                System.out.println("===Parametro Invalido, adaptando ....=======\n");
            }
            System.out.println("==========Adicionando no Inicio ============\n");
            inserirInicio(x);
        }else if(pos>=n){
            if(pos>n){
                System.out.println("===Parametro Invalido, adaptando ....=======\n");
            }
            System.out.println("==========Adicionando no Fim ===============\n");
            inserirFim(x);
        }else{//senao....
            
            Celula i=this.primeiro;
            for(int j=0;j<pos;j++,i=i.prox);
            Celula tmp=new Celula(x);
            tmp.prox=i.prox;
            i.prox=tmp;
            tmp=i=null;
            n++;
        }
    
    }
    public int removerInicio(){
        if (primeiro==ultimo){
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
            return -1;
        }
        else{
            Celula tmp=primeiro;
            primeiro=primeiro.prox;
            int elemento = primeiro.elemento;
            tmp.prox=null;
            tmp=null;
            n--;
            return elemento;
        }
    }
    public int removerPos(int pos) {
    	//Remoção de inteiros na posição designada do vetor
    	if(primeiro==ultimo||pos<0||pos>=n){
            //Se n igual a 0....
            //Ou também se pos menor que 0.... 
            //Ou pos maior ou igual a n..... 

            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Remover dados,================");
            System.out.println("==========Parametros Invalidos !!===========\n");
                                  
            return -1;
        }else if(pos==0){
            return removerInicio();
        }
        else if(pos==n-1){
            return removerFim();
        }else{//senao....
           
            Celula i=this.primeiro;
            for(int j=0;j<pos;j++,i=i.prox);
            Celula tmp=i.prox;
            int resp=tmp.elemento;
            i.prox=tmp.prox;
            tmp.prox=null;
            i=tmp=null;
            n--;
            return resp;
        }
            
     
    }
    public int removerFim(){
        if(primeiro==ultimo){
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
            return -1;
        }else{
                       
           Celula i = this.primeiro;
        
            for(;i.prox!=ultimo;i=i.prox);
            int y=ultimo.elemento;
            
            ultimo=i;
            i=ultimo.prox=null;
            n--;
            return y;
        }
    }
    public void mostrar(){
        Celula i = this.primeiro;
        
        for(i=i.prox;i!=null;i=i.prox){
            System.out.print(i.elemento+" ");
            
        }
    
    }
    
}