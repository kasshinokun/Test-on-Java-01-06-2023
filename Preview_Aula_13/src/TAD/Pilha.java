package TAD;//Nome do Projeto

import java.util.*;//simplificação de Bibliotecas necessárias

public class Pilha {//declaração da classe
    String[] pilha;//Vetor de Strings para a Pilha
    int [] pilha2;//Vetor de Inteiros para a Pilha
    int n=0;//Variavel para analise da Pilha
   
    public Pilha(){//Construtor default
        
        pilha =new String[6];//Instancia uma Pilha de String de tamanho 6
        pilha2 =new int[6];//Instancia uma Pilha de Inteiros de tamanho 6
        
    }
    public Pilha(int tamanho){//Sobrecarga
        pilha =new String[tamanho];
        pilha2 =new int[tamanho];
        
    }
    public void Add(int value){//Adição de Inteiros ao vetor
    	
    	if(n>=pilha2.length){//Se n igual ou maior que o tamanho da pilha....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Pilha Cheia!! ===============\n");
        }else{//senao....
            pilha2[n]=value;//Atribui o valor de s a posição na pilha
            n++;//incrementa n               
        }
    }
    public int Desempilhar(){//Remoção de Inteiros ao vetor
        int resp;//Variavel de Retorno
        if(n==0){//Se n igual a zero....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============remover dados,================");
            System.out.println("===============Pilha Vazia!!================\n");
            return -1;//Retorna -1 em resp  
        }else{//senao....
            resp=pilha2[n-1];//resp recebe o valor da posição na pilha
            n--;//decrementa n
            return resp;//Retorna a resp ao procedimento
        }
    }
    public int Peek(){//Retorna o topo da Pilha
        
        if(n==0){//Se n igual a zero....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============remover dados,================");
            System.out.println("===============Pilha Vazia!!================\n");
            return -1;//Retorna -1 em resp  
        }else{//senao....  
            return pilha2[n-1];//Retorna o topo da pilha ao procedimento
        }
    }
    public void Exibir_Pilha(){//Procedimento para exibir Pilha de Inteiros

        for(int i=n-1;i>=0;i--){
            
            System.out.println("item 0"+(i+1)+":"+pilha2[i]);//Exibe a pilha
            
        }
    }
    
}