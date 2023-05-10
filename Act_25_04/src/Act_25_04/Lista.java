package Act_25_04;//Nome do Projeto

import java.util.*;//simplificação de Bibliotecas necessárias

public class Lista {//declaração da classe
    int[] lista;//Vetor de Inteiros para a Lista
    int n=0;//Variavel para analise da Lista
    public Lista(){//Construtor default
        this(5);//Instancia uma Lista de Inteiros de tamanho 5
    }
    public Lista(int tamanho){//Sobrecarga
    	lista =new int[tamanho];
    }
    //Metodos colocados como private para visiveis apenas para a classe
    public void ImprimirArray() {
    	for(int i=0;i<n;i++) {
            System.out.println("item 0"+(i+1)+":"+lista[i]);//exibe a lista
    	}
    }
    private void InserirInicio(int k){//Adição de Inteiros no inicio do vetor
        if(n>=lista.length){//Se n igual ou maior que o tamanho da lista....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Cheia!! ===============\n");
        }else{//senao....
            for(int i=n;i>0;i--) {
                lista[i]=lista[i-1];//Move os Inteiros para o fim
            }
            lista[0]=k;//Atribui o valor de k a posição 0
            n++;//incrementa N
        }
    
    }
    private void InserirFim(int k){//Adição de Inteiros no fim do vetor
        if(n>=lista.length){//Se n igual ou maior que o tamanho da lista....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("============== Lista Cheia!! ===============\n");
        }else{//senao....
            lista[n]=k;//Atribui o valor de k a posição na lista
            n++;//incrementa N
        }
    
    }
    private void InserirPosicao(int k,int pos) {
    	//Inserção de Inteiros na posição designada do vetor
    	
    	if(n>=lista.length||pos<0||pos>n){
            //Se n igual ou maior que o tamanho da lista....
            //Ou também se pos menor que 0.... 
            //Ou pos maior que n..... 

            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("==========Parametros Invalidos !!===========\n");
        }else{//senao....
            for(int i=n;i>pos;i--) {
                lista[i]=lista[i-1];
                //Move os Inteiros para o fim
                //(Baseado na posição designada)
            }
            lista[pos]=k;//Atribui o valor de k a posição 0
            n++;//incrementa N
        }
    }
    public void adicionar(int j, int k, int l) {
        if(j==1) {//Inserção no Inicio da Lista
            InserirInicio(k);//Envia ao procedimento
            InserirInicio(l);//Envia ao procedimento
        }
        if(j==2) {//Inserção no Fim da Lista
            InserirFim(k);//Envia ao procedimento
            InserirFim(l);//Envia ao procedimento
        }
    }
    public void adicionar2(int k, int l, int pos) {//Inserção em Posição designada na Lista
    	InserirPosicao(k,pos);//Envia ao procedimento
    	InserirPosicao(l,pos+1);//Envia ao procedimento
    }
    private int RemoverPosicao(int pos) {
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
            int resp=lista[pos];//Atribui inteiro na posição designada a resp
            n--;//decrementa N
            for(int i=pos;i<n;i++) {
                lista[i]=lista[i+1];
                //Move os inteiros para o inicio
                //(Baseado na posição designada)
            }
            return resp;//Retorna a resp ao procedimento
        }
    }
    public Lista retorna_Lista(Lista L1,int nodo){
    
        int resp=RemoverPosicao(nodo);//Remove inteiro na posição designada e retorna em resp
        
        System.out.println("Valor removido:............."+resp);//Exibe o valor de resp
        
        return L1;//retorna lista ao procedimento
    }
    public void L_Inverter(Lista L1){//Procedimento para iverter itens da Lista
        
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            //i equivale ao inicio da lista
            //e j ao fim da lista
            int temp = lista[i];//atribui o valor de lista[i] a temp
            lista[i] = lista[j];//atribui o valor de lista[j] a lista[i]
            lista[j] = temp;//atribui o valor de temp a lista[j]
        }
    }
    
}
