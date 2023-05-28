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
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
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
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Vazia !!===========\n");
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
    public boolean ListarCPF(String x, char c){
        Celula i = this.primeiro.prox;
        boolean resp=false;
        for(;i!=null;i=i.prox){
            if(i.contato.cpf.equalsIgnoreCase(x)){
                System.out.println("\nO CPF: "+x+" foi encontrado na Lista "+c);
                System.out.println(i.mostrarContato());
                resp=true;
                break;
            }
        }
        i=null;
        return resp;
    }
    public boolean removerContato(String x, char c){
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
            i=removerPos2(cont);
            System.out.print("O nome :"+i.contato.nome+" foi removido da Lista "+c);
            System.out.println(i.mostrarContato());
            
            
        }else{
            System.out.print("O nome :"+x+" nao foi encontrado na Lista "+c);
        }
        i=null;
        return resp;
    }
}
