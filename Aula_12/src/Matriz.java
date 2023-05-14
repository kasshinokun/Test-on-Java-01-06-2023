

import java.util.*;//simplificação de Bibliotecas 
public class Matriz {
	
    Celula Inicio, Fim;//Variavel para indica inicio e fim da matriz
    int l, c;//Variaveis de dimensões da matriz

    public Matriz() {//construtor default

        this.l=3;//para linhas
        this.c=3;//para colunas

    }
    public Matriz(int a, int b) {//sobrecarga

        this.l=a;
        this.c=b;

    }
    
    public void Preencher(int[] V) {

        if(V.length!=l*c) {

            System.out.println("Parametros invalidos!!");

        }else {

            Celula i, j;
            int cont=1;
            this.Inicio=new Celula(V[0]);
            j=this.Inicio;

            for(int k1=0;k1<l;k1++) {

                i=j;

                for(int k2=0;k2<c-1;k2++) {

                    Celula tmp=new Celula(V[cont]);
                    cont++;
                    i.Dir=tmp;
                    tmp.Esq=i;
                    this.Fim=i.Dir;//Marcação para o Final
                    
                    if(k1>0) {

                        tmp.Sup=tmp.Esq.Sup.Dir;
                        tmp.Esq.Sup.Dir.Inf=tmp;

                    }

                    i.Dir=tmp;
                    i=i.Dir;
                    
                }
                if(k1<l-1) {

                    Celula tmp=new Celula(V[cont]);
                    cont++;
                    j.Inf=tmp;
                    tmp.Sup=j;
                    j=j.Inf;
                    i=j;
                    tmp=null;

                }
            }
            
        }
    }
    public void Imprimir(){
        
        //ponteiro para mover a Direita
        Celula rPtr;

        //ponteiro para mover a Inferior
        Celula dPtr = this.Inicio;

        //loop será executado emquanto Celula.Inf não for null
        while (dPtr != null) {

            rPtr = dPtr;

            //loop será executado emquanto Celula.Dir não for null
            while (rPtr!=null) {
                System.out.print(rPtr.elemento1+" ");
                rPtr = rPtr.Dir;
            }

            System.out.print("\n");
            dPtr = dPtr.Inf;
        }
    }
    public int DiagonalPrincipal( ){  

        int k=0;
        
        //ponteiro para mover a Direita
        Celula rPtr;

        //ponteiro para mover a Inferior
        Celula dPtr = this.Inicio;

        //loop será executado emquanto Celula.Inf não for null
        for(int i=0;i<l;i++) {

            rPtr = dPtr;

            //loop será executado emquanto Celula.Dir não for null
            for(int j=0;j<c;j++) {
                if(j==i){
                    System.out.print(rPtr.elemento1+" ");
                    k+=rPtr.elemento1;
                }
                rPtr = rPtr.Dir;
            }

            System.out.print("\n");
            dPtr = dPtr.Inf;
        }

        return k;

    }
    public int DiagonalSecundaria( ){ 

        int k=0;
        //ponteiro para mover a Direita
        Celula rPtr;

        //ponteiro para mover a Inferior
        Celula dPtr = this.Inicio;

        //loop será executado emquanto Celula.Inf não for null
        for(int i=0;i<l;i++) {

            rPtr = dPtr;

            //loop será executado emquanto Celula.Dir não for null
            for(int j=0;j<c;j++) {
                if(j==c-1-i){
                    
                    System.out.print(rPtr.elemento1+" ");
                    k+=rPtr.elemento1;
                }
                rPtr = rPtr.Dir;
            }

            System.out.print("\n");
            dPtr = dPtr.Inf;
        }

        
        return k;

    }

    public Matriz soma(Matriz B) {

        Matriz C=new Matriz(this.l,this.c);
        int[] arr=new int[this.l*this.c];
        //ponteiro para mover a Direita
        Celula rPtr;
        Celula rPtr2;
        
        //ponteiro para mover a Inferior
        Celula dPtr = this.Inicio;
        Celula dPtr2 = B.Inicio;
        
        
        int i=0;
        
        //loop será executado emquanto Celula.Inf não for null
        while (dPtr != null) {

            rPtr = dPtr;
            rPtr2 = dPtr2;
            
            
            //loop será executado emquanto Celula.Dir não for null
            while (rPtr!=null) {
                
                arr[i]=rPtr.elemento1+rPtr2.elemento1;
                
                rPtr = rPtr.Dir;
                rPtr2 = rPtr2.Dir;
                i++;
            }

            
            dPtr = dPtr.Inf;
            dPtr2 = dPtr2.Inf;
            
        }
        
        C.Preencher(arr);
        
        return C;
    }
    public Matriz Multiplicação(Matriz B) {

        
        Matriz C=new Matriz(this.l,this.c);
        int[] arr=new int[this.l*this.c];
        //ponteiro para mover a Direita
        Celula rPtr;
        Celula rPtr2;
        
        //ponteiro para mover a Inferior
        Celula dPtr = this.Inicio;
        Celula dPtr2 = B.Inicio;
        
        
        int i=0;
        
        //loop será executado emquanto Celula.Inf não for null
        while (dPtr != null) {

            rPtr = dPtr;
            rPtr2 = dPtr2;
            
            
            //loop será executado emquanto Celula.Dir não for null
            while (rPtr!=null) {
                
                arr[i]=rPtr.elemento1*rPtr2.elemento1;
                
                rPtr = rPtr.Dir;
                rPtr2 = rPtr2.Dir;
                i++;
            }

            
            dPtr = dPtr.Inf;
            dPtr2 = dPtr2.Inf;
            
        }
        
        C.Preencher(arr);
        
        return C;
    }
}
