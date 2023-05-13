

import java.util.*;//simplificação de Bibliotecas 
public class Matriz {
	
    Celula Inicio;//Variavel para indica inicio da matriz
    int l, c;//Variaveis de dimensões da matriz

    public Matriz() {//construtor default

        this.l=3;//para linhas
        this.c=3;//para colunas

    }
    public Matriz(int a, int b) {//sobrecarga

        this.l=a;
        this.c=b;

    }
    public void Preencher(int[] arr) {

        if(arr.length!=l*c) {

            System.out.println("Parametros invalidos!!");

        }else {

            Celula i, j;
            int cont=1;
            this.Inicio=new Celula(arr[0]);
            j=this.Inicio;

            for(int k1=0;k1<l;k1++) {

                i=j;

                for(int k2=0;k2<c-1;k2++) {

                    Celula tmp=new Celula(arr[cont]);
                    i.Dir=tmp;
                    tmp.Esq=i;

                    if(k1>0) {

                        tmp.Sup=tmp.Esq.Sup.Dir;
                        tmp.Esq.Sup.Dir.Inf=tmp;

                    }

                    i.Dir=tmp;
                    i=i.Dir;

                }
                if(k1<l-1) {

                    Celula tmp=new Celula(arr[cont]);
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
    public void Imprimir() {

        Celula tmp=new Celula();
        tmp=this.Inicio;

        for(int i=0;i<l;i++){

            //tmp=tmp.Inf;

            for(int j=0;j<c;j++){

                //if(tmp!=null){
                    //System.out.print(tmp.Dir.elemento1);
                //}

            }

        }

    }
    public int DiagonalPrincipal( ){  

        int k=0;
        Celula tmp=new Celula();
        tmp=this.Inicio;

        for(int i=0;i<l;i++){
            for(int j=i+1;j<c;j++){

                tmp=tmp.Inf;

                if(tmp!=null){

                    k+=tmp.Dir.elemento1;

                }
            }
        }

        return k;

    }
    public int DiagonalSecundária( ){ 

        int k=0;
        Celula tmp=new Celula();
        tmp=this.Inicio;

        for(int i=l-1;i>=0;i--){

            tmp=tmp.Sup;

            for(int j=i-1;j>=0;j--){

                if(tmp!=null){

                    k+=tmp.Esq.elemento1;

                }
            }

        }

        return k;

    }

    public Matriz soma(Matriz B) {

        Matriz C=new Matriz(this.l,this.c);
        int arr[]=new int[B.c*B.l];
        C.Preencher(arr);
        Celula iA,iB,jA,jB,iC,jC;
        jA=this.Inicio;
        jB=B.Inicio;
        jC=C.Inicio;
        for(int k1=0;k1<l;k1++){
            iA=jA;
            iB=jB;
            iC=jC;
            for(int k2=0;k2<c;k2++){
                iC.elemento1=iA.elemento1+iB.elemento1;
                iA=iA.Dir;
                iB=iB.Dir;
                iC=iC.Dir;
            }
            jA=jA.Inf;
            jB=jB.Inf;
            jC=jC.Inf;    
        }
        return C;
    }
    public Matriz Multiplicação(Matriz B) {

        Matriz C=new Matriz(this.l,this.c);
        int arr[]=new int[B.c*B.l];
        C.Preencher(arr);
        Celula iA,iB,jA,jB,iC,jC;
        jA=this.Inicio;
        jB=B.Inicio;
        jC=C.Inicio;

        for(int k1=0;k1<l;k1++){

            iA=jA;
            iB=jB;
            iC=jC;

            for(int k2=0;k2<c;k2++){

                iC.elemento1=iA.elemento1*iB.elemento1;
                iA=iA.Dir;
                iB=iB.Dir;
                iC=iC.Dir;

            }

            jA=jA.Inf;
            jB=jB.Inf;
            jC=jC.Inf;    

        }

        return C;

    }
}
