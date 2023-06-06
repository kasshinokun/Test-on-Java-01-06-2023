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
            System.out.println("==============Remover dados,================");
            System.out.println("============== Lista Vazia !!===============\n");
            return -1;
        }
        else{
            Celula tmp=primeiro;
            primeiro=primeiro.prox;
            int elemento = primeiro.elemento1;
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
            int resp=tmp.elemento1;
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
            System.out.println("==============Remover dados,================");
            System.out.println("============== Lista Vazia !!===============\n");
            return -1;
        }else{
                       
           Celula i = this.primeiro;
        
            for(;i.prox!=ultimo;i=i.prox);
            int y=ultimo.elemento1;
            
            ultimo=i;
            i=ultimo.prox=null;
            n--;
            return y;
        }
    }
//================================================================================
//Metodos para Contato
    public void inserirInicio2(Celula x){//inseri a celula completa no inicio
        x.prox=primeiro.prox;
        primeiro.prox=x;
        if(primeiro==ultimo){
            ultimo=x;
        }
        x=null;
        n++;
    }
    public void inserirFim2(Celula x){//inseri a celula completa no fim
        if(primeiro==ultimo){
            inserirInicio2(x);
        }
        else{
            
            ultimo.prox=x;
            ultimo=ultimo.prox;
            n++;
            
        }
    
    }
    public void inserirPos2(Celula x, int pos){//inseri a celula completa na posição
        
        if(pos<=0){
            if(pos<0){
                System.out.println("===Parametro Invalido, adaptando ....=======\n");
            }
            System.out.println("==========Adicionando no Inicio ============\n");
            inserirInicio2(x);
        }else if(pos>=n){
            if(pos>n){
                System.out.println("===Parametro Invalido, adaptando ....=======\n");
            }
            System.out.println("==========Adicionando no Fim ===============\n");
            inserirFim2(x);
        }else{//senao....
            Celula i=this.primeiro;
            for(int j=0;j<pos;j++,i=i.prox);
            x.prox=i.prox;
            i.prox=x;
            x=i=null;
            n++;
        }
    }
    public Celula removerInicio2(){
        if (primeiro==ultimo){
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
            return null;
        }
        else{
            Celula tmp=primeiro;
            primeiro=primeiro.prox;
            Celula elemento = new Celula(primeiro.contato);
            tmp.prox=null;
            tmp=null;
            n--;
            return elemento;
        }
    }
    public Celula removerPos2(int pos) {
    	//Remoção de inteiros na posição designada do vetor
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
            return removerInicio2();
        }
        else if(pos==n-1){
            return removerFim2();
        }else{//senao....
           
            Celula i=this.primeiro;
            for(int j=0;j<pos;j++,i=i.prox);
            Celula tmp=i.prox;
            Celula resp=new Celula(tmp.contato);
            i.prox=tmp.prox;
            tmp.prox=null;
            i=tmp=null;
            n--;
            return resp;
        }
            
     
    }
    public Celula removerFim2(){
        if(primeiro==ultimo){
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
            return null;
        }else{
                       
           Celula i = this.primeiro;
        
            for(;i.prox!=ultimo;i=i.prox);
            Celula y=new Celula(ultimo.contato);
            
            ultimo=i;
            i=ultimo.prox=null;
            n--;
            return y;
        }
    }
    public void buscar(String x){
            
        Celula i=this.primeiro.prox;
        boolean j=false;
        int cont=0;
        while(i.prox!=null){
            if(i.site.nome==x){
                System.out.println("Site localizado");
                System.out.println(i.site.toString());
                String x1=i.site.nome;
                String x2=i.site.link;
                removerPos2(cont);
                inserirInicio2(new Celula(x1,x2));
                j=true;
                break;
            }
            i=i.prox;
            cont++;
        }
        if(j==false){
            System.out.println("Site nao localizado");
        }


    }
    
    public void mostrar(){
        Celula i = this.primeiro.prox;
        System.out.println("\nContatos\n=============================================");//Enunciado
        for(;i!=null;i=i.prox){
            System.out.println(i.mostrarContato());
            System.out.println("=============================================");//Enunciado
            
        }
    
    }
    public void mostrar2(){
        Celula i = this.primeiro.prox;
        
        for(;i!=null;i=i.prox){
            System.out.print(i.elemento2+" ");
        }
    }
    public void mostrar3(){
        Celula i = this.primeiro.prox;
   
        for(;i!=null;i=i.prox){
            System.out.print(i.elemento1+" ");
            
        }
    }
    public void mostrarSite(){
            Celula i = this.primeiro.prox;

            for(;i!=null;i=i.prox){
                System.out.println(i.mostrarSite());

            }

        }
//=========================================================================================
    public boolean pesquisar(int x){
        Celula i = this.primeiro.prox;
        boolean resp=false;
        while(i!=null){
            if(i.elemento1==x){
                resp=true;
                break;
            }
            i=i.prox;
        }
        if(resp==true){
            System.out.print("\no numero: "+i.elemento1+" foi encontrado");
        }
        i=null;
        return resp;
    }
    public boolean pesquisar(String x){
        Celula i = this.primeiro.prox;
        boolean resp=false;
        while(i!=null){
            if(i.contato.nome.equalsIgnoreCase(x)){
                resp=true;
                break;
            }
            i=i.prox;
        }
        if(resp==true){
            System.out.println(i.mostrarContato());
        }
        
        i=null;
        return resp; 
    }
    public boolean ListarCPF(String x, char c){//Busca de CPF(BST)
        Celula i = this.primeiro.prox;
        boolean resp=false;
        while(i!=null){
            if(i.contato.cpf.equalsIgnoreCase(x)){
                resp=true;
                break;
            }
            i=i.prox;
        }
        if(resp==true){
            System.out.println("\nO CPF: "+x+" foi encontrado na Lista "+c);
            System.out.println(i.mostrarContato());
            i=null;
            return resp;
        }
        System.out.println("\nO CPF: "+x+" foi nao encontrado na Lista "+c);
        return resp;
        
        
    }
    public boolean removerPessoa(String x, char c){
        Celula i = this.primeiro.prox;
        boolean resp=false;
        int cont=0;
        while(i!=null){
            if(i.contato.nome.equalsIgnoreCase(x)){
                resp=true;
                break;
            }
            i=i.prox;
            cont++;
        }
        if(resp==true){
            Celula j=this.removerPos2(cont);
            System.out.println("O nome :"+j.contato.nome+" foi removido da Lista "+c);
            System.out.println(j.mostrarContato());
            j=null;
        }
        
        i=null;
        return resp;
    }
    //Exercicio 06    
    public Lista_Simples add_LA(Lista_Simples B){
        Celula i = this.primeiro.prox.prox;
        int elemento=0;
        for(;i!=null;i=i.prox){
            B.inserirFim(i.elemento1);
        }
        B.inserirFim(this.primeiro.prox.elemento1);
        i=null;
        
        return B;
    }
    public Lista_Simples add_LB(Lista_Simples B){
        Celula i = this.primeiro;
        
        while (i.prox!= null) {
            i=i.prox;
            B.inserirInicio(i.elemento1);
        }
        i=null;
        return B;
    }
    public Lista_Simples add_LC(Lista_Simples B){
        Celula i = this.primeiro.prox;
        Celula j;
        for(int k=0;k<=n/2;k++,i=i.prox){
            j=i;
            for(int l=k;j!=null;j=j.prox,l++){
                if(l+1==n-k){
                    //System.out.println(j.elemento1+" "+i.elemento1);
                    B.inserirFim(j.elemento1+i.elemento1);
                }
                
            }
        }
        i=null;
        j=null;
        return B;
    }
//=================================================================================
//Exercicio 07
    public Lista_Simples criarLista(){
        int arr[]={1,2,3,4,5,6,7,8,9};//Vetor base
        Lista_Simples lista=new Lista_Simples();
        for(int i=0;i<arr.length;i++){
            lista.inserirFim(arr[i]);
        }
        
        return lista;
    }
    public void buscarNumero(int x){
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
            System.out.println("\nO numero: "+x+" foi localizado na lista");
            i=null;
        }
       
    }
    public void inserirOrdenado(int x){
        Celula i = this.primeiro.prox;
        int cont=0;
        for(;i!=null&&i.elemento1<x;cont++,i=i.prox); 
        if(cont==0||n==0){
            inserirInicio(x);
        }
        else if(cont==n&&n!=0){
            inserirFim(x);
        }
        else if(cont<n){
            System.out.println("O numero: "+cont);
            inserirPos(x,cont);
        }
        
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
                lista2.inserirFim(i.elemento1);
                
                lista2.inserirFim(j.elemento1);
                
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
    
    //exercicio 08
    public void removerKey(){
    //remover chaves pares
    
    
    }
    //Exercicio 12
    public void organizar_Letras_Numeros(){
    /*
    Entrada: A 1 E 5 T 7 W 8 G → Saída: A E T W G 8 7 5 1
    Entrada: 3 C 9 H 4 Q 6 → Saída: C H Q 6 4 9 3    
    */
    
    }
}
