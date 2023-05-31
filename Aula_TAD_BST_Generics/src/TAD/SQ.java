package TAD;//Nome do Projeto
/*

OBS.: Codigo criado por meio de adaptações
Atualmente em processo de otimização


*/
import java.util.*;//Simplificaçao de Bibliotecas necessárias
public class SQ {
    //Classe SQ responsavel por pilha de filas,
    //fila de pilhas e pilha de pilhas
    
    Pilha P;//Objeto Pilha para exibir
    Fila F;//Objeto Fila para exibir
    SQ[] SQ;//Pilha de Filas
    SQ[] QS;//Fila de Pilhas
    SQ[] PP;//Pilha de Pilhas
    
    int n=0;//contador de SQ e PP
    
    //Contadores de QS
    int Pr=0;//Posição inicial da Fila
    int Ul=0;//Posição Final da Fila
    
    public SQ(){//Construtor Default
        SQ=new SQ[6];//Pilha de Filas  
        QS=new SQ[7];//Fila de Pilhas
        PP=new SQ[6];//Pilha de Pilhas
        P=new Pilha();//Pilha instanciada com valor default da classe
        F=new Fila();//Fila instanciada com valor default da classe
    }
    public SQ(int tamanho){//Sobrecarga para vetores
      SQ=new SQ[tamanho];//Pilha de Filas 
      QS=new SQ[tamanho+1];//Fila de Pilhas
      PP=new SQ[tamanho];//Pilha de Pilhas
    }
    public SQ(Fila F){//Sobrecarga para Fila
        this.F=new Fila(F.fila2.length);
        this.F=F;
    }
    public SQ(Pilha P){//Sobrecarga para Pilha
        this.P=new Pilha(P.pilha2.length);
        this.P=P; 
    }
    //Pilha de Filas
    public void Add_SQ(Fila F1){//Adiciona Pilha a Fila
        
        if(n>=SQ.length){//Se n igual ou maior que o tamanho da pilha....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Pilha Cheia!! ===============\n");
        }else{//senao....
            SQ[n]=new SQ(F1);//Atribui o valor de F1 a posição na pilha
            n++;//incrementa n               
        }
    }
    public Fila Remove_SQ(){//Remoção de Fila da Pilha
        Fila resp;//Variavel de Retorno
        if(n==0){//Se n igual a zero....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============remover dados,================");
            System.out.println("===============Pilha Vazia!!================\n");
            return null;//Retorna null em resp  
        }else{//senao....
            resp=SQ[n-1].F;//resp recebe o valor da posição na pilha
            n--;//decrementa n
            return resp;//Retorna a resp ao procedimento
        }  
    }
    public void To_Stack(){//Procedimento para exibir Pilha de Objetos
        
        for(int i=n-1;i>=0;i--){
            System.out.print("Fila 0"+i+" ");//apenas indicar a fila em exibiçao
            SQ[i].F.Mostrar2();//Chama o procedimento da classe
        }
    
    }
    //Fila de Pilhas
    public void Enqueue(Pilha P7){//Adiciona Fila a Pilha 
        //Se modulo de Ul incrementado de 1 por tamanho da fila for igual a Pr......
        if(((Ul+1)%QS.length)==Pr) {
            //Informa ao Usuario
           
            System.out.println("\n===========Nao e possivel==================");
            System.out.println("============inserir dados,=================");
            System.out.println("==============Fila Cheia===================\n");
        }else {//senao....
            QS[Ul]=new SQ(P7);//Atribui o valor de P7 a posição Ul
            /*Ul recebe modulo de Ul 
            incrementado de 1 
            por tamanho da fila*/
            Ul+=1%QS.length;
        }
        
    }
    public Pilha Dequeue(){//Remoção de Pilha da Fila
        Pilha resp;//Intancia um objeto Fila de Retorno

        if(Pr==Ul) {//Se Pr igual a Ul.....
            //Informa ao Usuario
           
            System.out.println("\n===========Nao e possivel==================");
            System.out.println("============remover dados,=================");
            System.out.println("==============Fila Vazia===================\n");
            return null;//Atribui null e retorna resp 
        }else{//senao....

            //Atribui o valor da Pilha na posição Pr a resp
            resp=new Pilha(QS[Pr].P.n);
            resp=QS[Pr].P;

            /*Pr recebe modulo de Pr 
            incrementado de 1 
            por tamanho da fila*/
            Pr+=1%QS.length;

            return resp;//Retorna a resp ao Main
        }
    }
    public void To_Queue(){//Procedimento para exibir Fila de Objetos
        
        System.out.print("\n[\n");//apenas indicar inicio da exibiçao da fila
        for(int i=Pr; i!= Ul;++i) {
            System.out.print("Pilha 0"+i+"\n");//apenas indicar inicio da exibiçao da pilha
            QS[i].P.Exibir_Pilha();//Chama o procedimento da classe
            i%=QS.length;//modulo de i pelo tamanho da fila
        }
        System.out.print("]\n");//apenas indicar fim da exibiçao da fila
    }
    //Pilha de Pilhas
    public void Add_PP(Pilha P1){//Adiciona Pilha a Pilha
        
        if(n>=PP.length){//Se n igual ou maior que o tamanho da pilha....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Pilha Cheia!! ===============\n");
        }else{//senao....
            PP[n]=new SQ(P1);//Atribui o valor de P1 a posição na pilha
            n++;//incrementa n               
        }
    }
    public Pilha Remove_PP(){//Remoção de Pilha da Pilha
        Pilha resp;//Variavel de Retorno
        if(n==0){//Se n igual a zero....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============remover dados,================");
            System.out.println("===============Pilha Vazia!!================\n");
            return null;//Retorna null em resp  
        }else{//senao....
            resp=PP[n-1].P;//resp recebe o valor da posição na pilha
            n--;//decrementa n
            return resp;//Retorna a resp ao procedimento
        }  
    }
    public int Peek_PP(){//Retorna o topo da Pilha do topo
        
        if(n==0){//Se n igual a zero....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============remover dados,================");
            //Evidencia a Pilha de Pilhas devido ao procedimento seguinte poder 
            //repetir a mesma frase
            System.out.println("===========Pilha de Pilhas Vazia!!==========\n");
            return -1;//Retorna -1 em resp  
        }else{//senao....
            return PP[n-1].P.Peek();//retorna o topo da pilha do topo
        }
    }
    public void To_Stack_PP(){//Procedimento para exibir Pilha de Objetos
        
        for(int i=n-1;i>=0;i--){
            System.out.print("Pilha 0"+i+"\n");//apenas indicar a fila em exibiçao
            PP[i].P.Exibir_Pilha();//Chama o procedimento da classe
        }
    
    }
    
    
    
}
