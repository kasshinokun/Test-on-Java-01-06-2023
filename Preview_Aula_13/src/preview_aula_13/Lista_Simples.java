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
        tmp.Dir=primeiro;
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
            tmp.Dir=null;
            ultimo.Dir=tmp;
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
            Celula i=primeiro;
            for(int j=0;j<pos;j++,i=i.Dir){
                Celula tmp=new Celula(x);
                tmp.Dir=i.Dir;
                i.Dir=tmp;
                tmp=null;
            }
        }
    
    }
    public void remover(int pos){
    
    
    }
    public void removerFim(){
    
    
    }
    public void mostrar(){
            
            //ponteiro para mover a Inferior
            Celula rPtr = this.primeiro;
            //loop será executado emquanto Celula.Dir não for null
            for(int i=0;i<n;i++){
                System.out.print(rPtr.elemento1+" ");
                rPtr = rPtr.Dir;
            }
    
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};//Vetor base
        Lista_Simples lista=new Lista_Simples();
        for(int i=0;i<arr.length;i++){
            lista.InserirFim(arr[i]);
        }
        lista.mostrar();
        System.out.println();
    }
}
