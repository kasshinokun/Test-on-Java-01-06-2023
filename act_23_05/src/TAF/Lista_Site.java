package TAF;
//Classe para Exercicio 8
public class Lista_Site{
        Site inicio;
        Site ultimo;
        
        public int n=0;//Variavel auxiliar de analise de tamanho
    
        public Lista_Site(){
            this.inicio=new Site();
            this.ultimo=this.inicio;
        }
        public void inserirInicio(String x,String y){
            
            Site tmp=new Site(x,y);
            tmp.prox=inicio.prox;
            inicio.prox=tmp;
            if(inicio==ultimo){
                ultimo=tmp;
            }
            tmp=null;
            n++;
        }
        public void buscar(String x){
            
            Site i=this.inicio.prox;
            boolean j=false;
            if(x==i.nome){
               System.out.println("Site localizado");
               System.out.println(inicio.prox.toString()); 
            }else{
                while(i.prox!=null){
                    if(i.nome==x){
                        Site tmp=i.prox;
                        String x1=i.nome;
                        String x2=i.link;
                        i.prox=tmp.prox;
                        tmp.prox=null;
                        i=tmp=null;
                        n--;
                        j=true;
                        inserirInicio(x1,x2);
                        System.out.println("Site localizado");
                        System.out.println(inicio.prox.toString());
                        break;
                    }i=i.prox;
                }
                if(j==false){
                    System.out.println("Site nao localizado");
                }
            }
            
        }
        public void inserirFim(String x,String y){//Adição de Inteiros no fim do vetor
        
            if(inicio==ultimo){
                inserirInicio(x,y);
            }
            else{
                ultimo.prox=new Site(x,y);
                ultimo=ultimo.prox;
                n++;
            }
        }
        public void mostrar(){
            Site i = this.inicio.prox;

            for(;i!=null;i=i.prox){
                System.out.println(i.toString());

            }

        }
    }