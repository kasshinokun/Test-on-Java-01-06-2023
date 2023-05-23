package TAF;

import java.util.*;//simplificação de Bibliotecas
public class Lista_Dupla {
    
    private Celula primeiro, ultimo;
    //String Nome;
    int n=0;
    
    public Lista_Dupla(){
        this.primeiro=new Celula();
        this.ultimo=this.primeiro;
        //this.Nome=primeiro.elemento2;
        
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
    public void inserirFim2(Celula x){
        if(primeiro==ultimo){
            x.ant=primeiro;
            x.prox=primeiro.prox;
            primeiro.prox=x;

            if(primeiro==ultimo){
                ultimo=x;
            }
            x=null;
            n++;
        }
        else{
            
            ultimo.prox=x;
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
    public void mostrar2(){
        Celula i = this.primeiro;
        
        while(i!=null){
            System.out.println(i.toString());
            i=i.prox;
        }
        
    }
//=================================================================================
//Exercicio 09
    public Lista_Dupla criarLista(){
        Lista_Dupla lista=new Lista_Dupla();
        String[] arr={"Arroz","Batata","Couve","Doce","Erva-doce","Flor","Goiaba","Hortelã","Iogurte"};//Vetor base
        for(int i=0;i<arr.length;i++){
            Celula tmp=new Celula(arr[i],(i+1));
            //System.out.println(tmp.toString());
            lista.inserirFim2(tmp);
        }
        return lista;
        
    }
    public void buscarNome(int x){
        Celula i = this.primeiro.prox;
        boolean resp=false;
        while(i!=null){
            if(i.elemento1==x){
                resp=true;
                break;
            }
            i=i.prox;
        }
        
        if(resp==false){
            System.out.println("\nO numero: "+x+" nao foi localizado");
            i=null;
        }else{
            System.out.println("\nO numero: "+i.elemento1+" foi localizado na lista");
            System.out.println(i.toString());
            i=null;
        }
        
    }
    /*//Precisa de Conversão para Lista Dupla
    public void inserirOrdenado(int x){
        Celula i = this.primeiro.prox;
        int cont=0;
        while(i!=null){
            if(i.elemento1>=x){
                break;
            }
            i=i.prox;
            cont++;
        }
               
        Celula tmp=new Celula(x);
        tmp.prox=i.prox;
        i.prox=tmp;
        tmp=i=null;
        n++;
    
    }
    public int removerElemento(int x){
        Celula i = this.primeiro.prox;
        boolean resp=false;
        int cont=0;
        while(i!=null){
            if(i.elemento1==x){
                resp=true;
                break;
            }
            cont++;
            i=i.prox;
        }
        if(resp==false){
            System.out.println("O numero: "+x+" nao foi localizado");
            return -1;
        }else{
            int elemento=i.elemento1;
            System.out.println("O numero: "+elemento+" foi removido da lista");
            removerPos(cont);
            i=null;
            return elemento;
        }
    
    }
  
    public Lista_Simples copiarLista(Lista_Simples lista){
        Celula i = this.primeiro.prox;
        while(i!=null){
            lista.ultimo.prox=new Celula(i.elemento1);
            lista.ultimo=lista.ultimo.prox;
            i=i.prox;
        }
        i=null;
        
        return lista;
    }
    public Lista_Simples concatenarLista(Lista_Simples lista){
        Celula i = this.ultimo;
        Celula j = lista.primeiro.prox;
        i.prox=j;
        this.n+=lista.n;
        i=null;
        j=null;
        return this;
    }
    public Lista_Simples intercalarLista(Lista_Simples lista){
        Celula i = this.primeiro.prox;
        Celula j = lista.primeiro.prox;
        Lista_Simples lista2=new Lista_Simples();
        if(this.n==lista.n){
            while(j!=null){
                lista2.ultimo.prox=new Celula(i.elemento1);
                lista2.ultimo=lista2.ultimo.prox;
                lista2.ultimo.prox=new Celula(j.elemento1);
                lista2.ultimo=lista2.ultimo.prox;
                lista2.n+=2;
                i=i.prox; 
                j=j.prox; 
            }
            i=null;
            j=null;

            return lista2;
        }else{
            System.out.println("Tamanhos diferentes,");
            System.out.println("não foi possivel unir as listas");
            return null;
        }
    }
    
    
    */
}
