package List;
import java.util.*;
public class Lista<T extends Comparable<T>>{
    private Celula<T> primeiro;
    private Celula<T> ultimo;
    int n=0;

    public Lista(){
        this.primeiro=new Celula();
        this.ultimo=this.primeiro;
    }
    public void inserirInicio(T x){
        
        Celula<T> tmp=new Celula<T>(x);
        tmp.ant=primeiro;
        tmp.prox=primeiro.prox;
        primeiro.prox=tmp;
        
        if(primeiro==ultimo){
            ultimo=tmp;
        }
        tmp=null;
        n++;
    
    }
    public void inserirFim(T x){
        if(primeiro==ultimo){
            inserirInicio(x);
        }
        else{
            
            ultimo.prox=new Celula<T>(x);
            ultimo.prox.ant=ultimo;
            ultimo=ultimo.prox;
            n++;
            
        }
    
    }
    public void inserirPos(T x, int pos){
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
            
            Celula<T> i=this.primeiro;
            for(int j=0;j<pos;j++,i=i.prox);
            Celula<T> tmp=new Celula<T>(x);
            tmp.ant=i;
            tmp.prox=i.prox;
            tmp.ant.prox=tmp.prox.ant=tmp;
            tmp=i=null;
            n++;
            
        }
    
    }
    public T removerInicio(){
        if(primeiro==ultimo){
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
            return null;
        }else{
            Celula<T> tmp=primeiro;
            primeiro=primeiro.prox;
            T y=primeiro.elemento;
            tmp.prox=primeiro.ant=null;
            tmp=null;
            n--;
            return y;
        }
    }
    
    public T removerFim(){
        if(primeiro==ultimo){
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
            return null;
        }else{
            T y=ultimo.elemento;
            ultimo=ultimo.ant;
            ultimo.prox.ant=null;
            ultimo.prox=null;
            n--;
            return y;
        }
    }
    
    public T removerPos(int pos){
        if(primeiro==ultimo||pos<0||pos>=n){
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
        }
        else{//senao....
            Celula<T> i=this.primeiro.prox;
            for(int j=0;j<pos;j++,i=i.prox);
            i.ant.prox=i.prox;
            i.prox.ant=i.ant;
            T y=i.elemento;
            i.prox=i.ant=null;
            i=null;
            n--;
            return y;
        }
    }
    public void mostrar(){
        
        Celula<T> i = this.primeiro;
        
        for(i=i.prox;i!=null;i=i.prox){
            System.out.println(i.elemento);
        }
    }
}
