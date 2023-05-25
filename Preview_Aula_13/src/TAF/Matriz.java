package TAF;

import java.util.*;//simplificação de Bibliotecas
public class Matriz {
	
    private Celula inicio, fim;//Variavel para indica inicio e fim da matriz
    private int l, c;//Variaveis de dimensões da matriz

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
            this.inicio=new Celula(V[0]);
 
            j=this.inicio;

            for(int k1=0;k1<l;k1++) {

                i=j;

                for(int k2=0;k2<c-1;k2++) {

                    Celula tmp=new Celula(V[cont]);
                    cont++;
                    i.dir=tmp;
                    tmp.esq=i;
                    this.fim=i.dir;//Marcação para o Final
                    
                    if(k1>0) {

                        tmp.sup=tmp.esq.sup.dir;
                        tmp.esq.sup.dir.inf=tmp;

                    }

                    i.dir=tmp;
                    i=i.dir;
                    
                }
                if(k1<l-1) {

                    Celula tmp=new Celula(V[cont]);
                    cont++;
                    j.inf=tmp;
                    tmp.sup=j;
                    j=j.inf;
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
        Celula dPtr = this.inicio;

        //loop será executado emquanto Celula.Inf não for null
        while (dPtr != null) {

            rPtr = dPtr;

            //loop será executado emquanto Celula.Dir não for null
            while (rPtr!=null) {
                System.out.print(rPtr.elemento1+" ");
                rPtr = rPtr.dir;
            }

            System.out.print("\n");
            dPtr = dPtr.inf;
        }
    }
    public int DiagonalPrincipal( ){  

        int k=0;
        
        //ponteiro para mover a Direita
        Celula rPtr;

        //ponteiro para mover a Inferior
        Celula dPtr = this.inicio;

        //loop será executado emquanto Celula.Inf não for null
        for(int i=0;i<l;i++) {

            rPtr = dPtr;

            //loop será executado emquanto Celula.Dir não for null
            for(int j=0;j<c;j++) {
                if(j==i){
                    System.out.print(rPtr.elemento1+" ");
                    k+=rPtr.elemento1;
                }
                rPtr = rPtr.dir;
            }

            System.out.print("\n");
            dPtr = dPtr.inf;
        }

        return k;

    }
    public int DiagonalSecundaria( ){ 

        int k=0;
        //ponteiro para mover a Direita
        Celula rPtr;

        //ponteiro para mover a Inferior
        Celula dPtr = this.inicio;

        //loop será executado emquanto Celula.Inf não for null
        for(int i=0;i<l;i++) {

            rPtr = dPtr;

            //loop será executado emquanto Celula.Dir não for null
            for(int j=0;j<c;j++) {
                if(j==c-1-i){
                    
                    System.out.print(rPtr.elemento1+" ");
                    k+=rPtr.elemento1;
                }
                rPtr = rPtr.dir;
            }

            System.out.print("\n");
            dPtr = dPtr.inf;
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
        Celula dPtr = this.inicio;
        Celula dPtr2 = B.inicio;
        
        
        int i=0;
        
        //loop será executado emquanto Celula.Inf não for null
        while (dPtr != null) {

            rPtr = dPtr;
            rPtr2 = dPtr2;
            
            
            //loop será executado emquanto Celula.Dir não for null
            while (rPtr!=null) {
                
                arr[i]=rPtr.elemento1+rPtr2.elemento1;
                
                rPtr = rPtr.dir;
                rPtr2 = rPtr2.dir;
                i++;
            }

            
            dPtr = dPtr.inf;
            dPtr2 = dPtr2.inf;
            
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
        Celula dPtr = this.inicio;
        Celula dPtr2 = B.inicio;
        
        
        int i=0;
        
        //loop será executado emquanto Celula.Inf não for null
        while (dPtr != null) {

            rPtr = dPtr;
            rPtr2 = dPtr2;
            
            
            //loop será executado emquanto Celula.Dir não for null
            while (rPtr!=null) {
                
                arr[i]=rPtr.elemento1*rPtr2.elemento1;
                
                rPtr = rPtr.dir;
                rPtr2 = rPtr2.dir;
                i++;
            }

            
            dPtr = dPtr.inf;
            dPtr2 = dPtr2.inf;
            
        }
        
        C.Preencher(arr);
        
        return C;
    }
}