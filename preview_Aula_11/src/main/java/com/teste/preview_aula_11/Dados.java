package com.teste.preview_aula_11;

import java.util.*;//Simplificação das bibliotecas necessárias

//Codigo da classe Dados das atividades 02 e 03 
//adapatado para atividade 11 previa

public class Dados {//declaração da classe Dados
    int Array[];//Instancia a variavel para o Array
    private int N;//Tamanho do Array
    public int cont=0;//Exibe as contagens
    public Dados() {//constructor default
            Array= new int[10];//tipo e tamanho do Array
            N=Array.length;//Variavel para análise de tamanho
    }
    public Dados(int[] array) {//construtor com atribuições
            Array=array;//Instancia a nova variavel para o Array baseada no constructor default
            N=Array.length;//Variavel para análise de tamanho
    }
    public void ImprimirArray() {//Impressão dos componentes do Array
            for(int i=0;i<N;i++) {//laço para percorrer o Array
                System.out.println("Posicao "+i+": "+Array[i]);//executa a impressão do Array
            }
    }
    public void GerarArray(int x){
    //declaração do procedimento para preencher vetor
    	
    	for(int i=0;i<x;i++){//laço de repetição
    		
    		Random x1 = new Random();//Instancia um objeto random
    		
            Array[i]=1 +x1.nextInt(x/2);//atribui a posição o valor aleatorio
        }
    }
    public void Merge_sort() {//Procedimento para o Merge sort
        
    	sendArray(0, N-1);//Envia com valores predefinidos
    	System.out.println("\nMovimentacoes : "+ cont);//exibe o contador
    }
    private void sendArray(int esq, int dir) {//recebe o array e executa o merge sort
    	
    	if (esq < dir){//Compara esquerda e direita
            //se esquerda menor....
            
            int meio = (esq + dir) / 2;//Atribui a meio o resultado da divisão da soma
            
            sendArray(esq, meio);//Envia ao procedimento via recurssão

            sendArray(meio + 1, dir);//Envia ao procedimento via recurssão

            Intercalar(esq, meio, dir);//Envia ao procedimento para intercalar
        }
    	
    }
    public void Intercalar(int esq, int meio, int dir) {
    //Procedimento para intercalação do array
    	
    	int nEsq = (meio+1)-esq;//Instancia e atribuir valor atraves
        //da subtração de meio incrementado pelo valor de esquerda
        
    	int nDir = dir - meio;//Instancia e atribuir valor atraves 
        //da subtração de direita pelo valor de meio
    	
    	int iEsq, iDir, i;//Instancia variaveis para analise dos subarrays
    	
    	//Instancia os 2 subarrays
    	int[] arrayEsq = new int[nEsq+1];//Tamanho incrementado baseado na variavel nEsq
    	int[] arrayDir = new int[nDir+1];//Tamanho incrementado baseado na variavel nDir
    	
    	arrayEsq[nEsq] = arrayDir[nDir] = 0x7FFFFFFF;//Sentinela no final dos dois arrays

    	//Inicializa primeiro subarray
    	for (iEsq = 0; iEsq < nEsq; iEsq++){//Executa comparação
            //se iEsq menor....
            arrayEsq[iEsq] = Array[esq+iEsq];
    	}
    	//Inicializa segundo subarray
    	for (iDir = 0; iDir < nDir; iDir++){//Executa comparação
            //se iDir menor....
            arrayDir[iDir] = Array[(meio+1)+iDir];
    	}
    	
    	//Intercalacao dos vetores
    	for (iEsq = iDir = 0, i = esq; i <= dir; i++){//Executa comparações para intercalar

            //Uso do if ternario para analise
            Array[i] = (arrayEsq[iEsq] <= arrayDir[iDir]) ? arrayEsq[iEsq++] : arrayDir[iDir++];
            cont++;//Incrementa o contador
    	}
    	
    }
    public Dados Soma(Dados a){//Função para criação de vetores, execução do Merge sort 500 vezes
        //e armazenamento de valores em vetor
	    
    	int[] Soma=new int[a.N];//Instancia vetor de inteiros de tamanho 500
        
        //System.out.println("Valor de N:"+a.N);//Aferição do tamanho
        
        for(int i=0;i<Soma.length;i++) {//laço até 500

            GerarArray(100);//gera os array's

            cont=0;//Zera o contador

            sendArray(0, 99);//Envia com valores predefinidos

            Soma[i]=cont;//Armazena  valor do contador na posição.

            //exibe o contador e valor do vetor na posição
            //System.out.println("Valor "+(i+1)+": "+cont+" Vetor"+(i)+": "+Soma[i]);
        }
        a.InsertArray(Soma);//Copiar o vetor de inteiros para o vetor do tipo Dados
        
        return a;//retorna o vetor
    }
    private void InsertArray(int[] Soma){//declaração do procedimento para preencher vetor
        
        for(int i=0;i<Soma.length;i++){//laço de repetição
            
            Array[i]=Soma[i];//atribui a posição o valor de i no vetor Soma
        }
    }
    public double Calcula_Media() {//Media dos componentes do Array
        
        int Soma=0;//Variavel para a soma de componentes do Array
        
        for(int i=0;i<N;i++) {//laço para percorrer o Array
            Soma+=Array[i];//soma de componentes do Array
        }
                
        return Soma/N;//retorna a media(divide soma pelo tamanho) 
    }    
    
}