package preview_aula_13;

import java.util.*;//simplificação de Bibliotecas 

public class Lista_Simples {
    
    private Celula primeiro,ultimo;
    
    int n=0;//Variavel auxiliar de analise de tamanho
    
    public Lista_Simples(){
        
        primeiro=new Celula();
        ultimo=primeiro;
    
    }
    public void InserirInicio(int x){
        
        Celula tmp=new Celula(x);
        tmp.Prox=primeiro;
        primeiro=tmp;
        
        n++;
        if(n==1){
            ultimo=primeiro;
        }
        tmp=null;
    
    }
    public void InserirFim(int x){//Adição de Inteiros no fim do vetor
        
        if(n==0){
            InserirInicio(x);
        }
        else{
            Celula tmp=new Celula(x);
            tmp.Prox=null;
            ultimo.Prox=tmp;
            ultimo=tmp;
            n++;
            tmp=null;
        }
    }
    public void InserirPos(int x, int pos){//Inserção de Inteiros na posição designada do vetor
    	
        if(pos<0||pos>n){
            //Se n igual ou maior que o tamanho da lista....
            //Ou também se pos menor que 0.... 
            //Ou pos maior que n..... 

            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("==========Parametros Invalidos !!===========\n");
        }else if(pos==0){
            InserirInicio(x);
        }else if(pos==n){
            InserirFim(x);
        }else{//senao....
            
            Celula i=this.primeiro;
            for(int j=0;j<pos;j++){
                
                
                if(j==pos-1){
                    
                    Celula tmp=new Celula(x);
                    tmp.Prox=i.Prox;
                    i.Prox=tmp;
                    n++;
                    tmp=i=null;
                    break;
                }
                
                i=i.Prox;
                
            } 

            
        }
    
    }
    public int removerInicio(){
        if (n==0){
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
            return -1;
        }
        else{
            
            int elemento = primeiro.elemento1;
            primeiro=primeiro.Prox;
            
            n--;
            return elemento;
        }
    }
    public int removerPos(int pos) {
    	//Remoção de inteiros na posição designada do vetor
    	
    	if(n==0||pos<0||pos>=n){
            //Se n igual a 0....
            //Ou também se pos menor que 0.... 
            //Ou pos maior ou igual a n..... 

            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Remover dados,================");
            System.out.println("==========Parametros Invalidos !!===========\n");
                                  
            return -1;
        }else{//senao....
            int resp=0;
            Celula i=this.primeiro;
            
            
            for(int k=0;k<n-1;k++){

                if(k==pos-1){
                    resp=i.elemento1;
                    i.elemento1=i.Prox.elemento1;
                    i=i.Prox;
                    while(i.Prox!=null){
                        i.elemento1=i.Prox.elemento1;
                        i=i.Prox;
                    }
                    n--;
                    
                    break;
                    
                }i=i.Prox;
                  
                }
                
                return resp;//Retorna a resp ao procedimento    
                
            }
            
     
    }
    public int removerFim(){
        if (n==0){
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
            return -1;
        }
        Celula i;
        for(i = primeiro; i.Prox != ultimo; i = i.Prox);
            int elemento = ultimo.elemento1;
            ultimo = i;
            i = ultimo.Prox = null;
            n--;
            return elemento;
        
        
    }
    public void mostrar(){
            
            //ponteiro para mover a Inferior
            Celula rPtr = this.primeiro;
            //loop será executado emquanto Celula.Dir não for null
            for(int i=0;i<n;i++){
                System.out.print(rPtr.elemento1+" ");
                rPtr = rPtr.Prox;
            }
    
    }
    
}
