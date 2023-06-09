package TAF;

import java.util.*;//simplificação de Bibliotecas
public class Lista_Dupla {
    
    private Celula primeiro, ultimo;
    int n=0;
    
    public Lista_Dupla(){
        primeiro=new Celula();
        ultimo=primeiro;
    }
    public void inserirInicio(int x){
        
        Celula tmp=new Celula(x);
        tmp.ant=primeiro;
        tmp.prox=primeiro.prox;
        primeiro.prox=tmp;
        
        if(primeiro==ultimo){
            ultimo=tmp;
        }
        tmp=null;
        n++;
    
    }
    public void inserirFim(int x){
        if(primeiro==ultimo){
            inserirInicio(x);
        }
        else{
            
            ultimo.prox=new Celula(x);
            ultimo.prox.ant=ultimo;
            ultimo=ultimo.prox;
            n++;
            
        }
    
    }
    public void inserirPos(int x, int pos){
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
            tmp.ant=i;
            tmp.prox=i.prox;
            tmp.ant.prox=tmp.prox.ant=tmp;
            tmp=i=null;
            n++;
            
        }
    
    }
    
    public int removerInicio(){
        if(primeiro==ultimo){
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
            return -1;
        }else{
            Celula tmp=primeiro;
            primeiro=primeiro.prox;
            int y=primeiro.elemento1;
            tmp.prox=primeiro.ant=null;
            tmp=null;
            n--;
            return y;
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
            int y=ultimo.elemento1;
            ultimo=ultimo.ant;
            ultimo.prox.ant=null;
            ultimo.prox=null;
            n--;
            return y;
        }
    }
    
    public int removerPos(int pos){
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
        }
        else{//senao....
            Celula i=this.primeiro.prox;
            for(int j=0;j<pos;j++,i=i.prox);
            i.ant.prox=i.prox;
            i.prox.ant=i.ant;
            int y=i.elemento1;
            i.prox=i.ant=null;
            i=null;
            n--;
            return y;
        }
    }
    
    public void mostrar(){
        
        Celula i = this.primeiro;
        
        for(i=i.prox;i!=null;i=i.prox){
            System.out.print(i.elemento1+" ");
        }
    }
    
    
}
