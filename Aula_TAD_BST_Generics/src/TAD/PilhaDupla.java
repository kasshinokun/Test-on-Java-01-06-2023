package TAD;//Nome do Projeto

import java.util.*;//simplificação de Bibliotecas necessárias

public class PilhaDupla {//Classe para pilha dupla em um unico array
    
    int []Array;//Array para alocação de pilhas
    
    int i=0;//para analise da pilha 1
    int j=0;//para analise da pilha 2

    PilhaDupla(){//Construtor default
        this(12);//Instancia uma Pilha de Inteiros de tamanho 12
    }
    PilhaDupla(int tamanho){//Sobrecarga
        
        Array =new int[2*tamanho];//Instancia um Array para Alocação das 2 pilhas
        //(2*tamanho= Medida para lidar com valores desiguais, o que gera erro no código)  
    }
    //Variavel global para entrada do teclado
    public static Scanner reader = new Scanner(System.in);
    
    public void Empilhar1(int p1){//Adição de Inteiros ao vetor(Pilha 1)
        if(i>=Array.length/2){//Se i igual ou maior que o tamanho da pilha....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("=============Pilha P1-A Cheia!!=============\n");
        }else{//senao....
            Array[(Array.length/2-1)-i]=p1;//Atribui o valor de p1 a posição na pilha
            i++;//incrementa i
        }
    }
     public int Desempilhar1(){//Remoção de Inteiros ao vetor(Pilha 1)
        int resp;//Variavel de Retorno
        if(i==0){//Se n igual a zero....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============remover dados,================");
            System.out.println("=============Pilha P1-A Vazia!!=============\n");
            return -1;//Retorna -1 em resp 
        }else{//senao....
            resp=Array[Array.length/2-i];//resp recebe o valor da posição na pilha
            i--;//decrementa i
            return resp;//Retorna a resp ao procedimento
        }
    }
    public void Empilhar2(int p2){//Adição de Inteiros ao vetor(Pilha 2)
        if(Array.length/2+j>=Array.length){//Se j igual ou maior que o tamanho da pilha....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============Inserir dados,================");
            System.out.println("=============Pilha P1-B Cheia!!=============\n");
        }else{//senao....
            Array[Array.length/2+j]=p2;//Atribui o valor de p2 a posição na pilha
            j++;//incrementa j
        }    
    }
     public int Desempilhar2(){//Remoção de Inteiros ao vetor(Pilha 2)
        int resp;//Variavel de Retorno
        if(j==0){//Se j igual a zero....
            //Informa ao Usuario
            System.out.println("\n=============Nao e possivel ================");
            System.out.println("==============remover dados,================");
            System.out.println("=============Pilha P1-B Vazia!!=============\n");
            return -1;//Retorna -1 em resp  
        }else{//senao....
            resp=Array[(Array.length/2-1)+j];//resp recebe o valor da posição na pilha
            j--;//decrementa j
            return resp;//Retorna a resp ao procedimento
        }
    }
    public void Mostrar1(){//Mostra a pilha do topo a base(Pilha 1)
        for(int k=Array.length/2-i;k<=Array.length/2-1;k++){
            System.out.println(Array[k]);//Exibe a Pilha 1
        }
    }
    public void Mostrar2(){//Mostra a pilha do topo a base(Pilha 2)
        for(int k=(Array.length/2-1)+j;k>=Array.length/2;k--){
            System.out.println(Array[k]);//Exibe a Pilha 2
        }
    }
    public static void main(PilhaDupla P1){//main para a classe
        
        System.out.println("\n==04 - Gestao de Pilha Dupla em um Array====\n");//Enunciado
        
        //0- Inicializar Pilhas(Está no Main do Codigo Principal)
        IsEmpty(P1);//Verificação se Pilhas estão vazias
        Add(P1);//2-Inserção nas Plihas
        RemoveDual(P1);//3-Remoção nas Pilhas 
        PrintDual(P1);//4-Impressão das Pilhas 
        System.out.println("\n=========Retornando ao Menu Inicial=========\n");//Enunciado
        
    }
    public static void IsEmpty(PilhaDupla P1){//Procedimento de Verificar se Pilhas estão vazias
        System.out.println("===========Verificacao das Pilhas===========");//Enunciado
        if(P1.i==0){//Se j igual a zero....
            //Informa ao Usuario
            System.out.println("=========Pilha Dupla P1-A esta vazia========");
            System.out.println("=========Retornando ao Menu Anterior========\n");//Enunciado
        }else{//senao....
            //Informa ao Usuario
            System.out.println("=========Pilha Dupla P1-A tem 0"+(P1.i)+" itens======");
            System.out.println("=========Retornando ao Menu Anterior========\n");//Enunciado
        }
        if(P1.i==0){//Se j igual a zero....
            //Informa ao Usuario
            System.out.println("=========Pilha Dupla P1-B esta vazia========");
            System.out.println("=========Retornando ao Menu Anterior========\n");//Enunciado
        }else{//senao....
            //Informa ao Usuario
            System.out.println("=========Pilha Dupla P1-B tem 0"+(P1.j)+" itens======");
            System.out.println("=========Retornando ao Menu Anterior========\n");//Enunciado
        }
    }
    public static void Add(PilhaDupla P1){//Procedimento para Inserção nas Plihas
        System.out.println("=============Insercao nas Plihas============");//Enunciado
        
        int value;//Variavel para armazena o valor e envia a pilha
        int op=1;//Variavel de escolha
        
        System.out.println("==================Pilha 1-A=================");//Enunciado
        for(int k=0;k<P1.Array.length/2&&op==1;k++){
            System.out.println("Insira um valor para 0"+(P1.i+1)+":...........");//Enunciado
            value= Integer.parseInt(reader.nextLine());//Armazena o valor
            P1.Empilhar1(value);//envia a pilha 1
            System.out.println("Deseja continuar:...........");//Enunciado
            op=Integer.parseInt(reader.nextLine());//Armazena a escolha
        }
        op=1;//volta a 1 para executar o codigo seguinte
        System.out.println("==================Pilha 1-B=================");//Enunciado
        for(int k=P1.Array.length/2-1;k<P1.Array.length&&op==1;k++){
            System.out.println("Insira um valor para 0"+(P1.j+1)+":...........");//Enunciado
            value= Integer.parseInt(reader.nextLine());//Armazena o valor
            P1.Empilhar2(value);//envia a pilha 2
            System.out.println("Deseja continuar:...........");//Enunciado
            op=Integer.parseInt(reader.nextLine());//Armazena a escolha
        }
        
    }
    public static void RemoveDual(PilhaDupla P1){//Procedimento para Remoção nas Plihas 
        System.out.println("=============Remocao nas Pilhas=============");//Enunciado
        int op=1;//Variavel de escolha
        int resp;//Varivel para Retorno
        for(int k=0;k<P1.Array.length/2&&op==1;k++){
            resp=P1.Desempilhar1();//Remove e retorna Inteiro
            System.out.println("Item Apagado:............: "+resp);//Exibe o Inteiro removido
            System.out.println("Deseja continuar:...........");//Enunciado
            op=Integer.parseInt(reader.nextLine());//Armazena a escolha
        }
        System.out.println("==========Apos Remocao na  Pilha-A==========");//Enunciado
        P1.Mostrar1();//Impressão da Pilha 1 
        op=1;//volta a 1 para executar o codigo seguinte
        for(int k=P1.Array.length/2;k<P1.Array.length&&op==1;k++){
            resp=P1.Desempilhar2();//Remove e retorna Inteiro
            System.out.println("Item Apagado:............: "+resp);//Exibe o Inteiro removido
            System.out.println("Deseja continuar:...........");//Enunciado
            op=Integer.parseInt(reader.nextLine());//Armazena a escolha
        }
        System.out.println("==========Apos Remocao na  Pilha-B==========");//Enunciado
        P1.Mostrar2();//Impressão da Pilha 2
    }
    public static void PrintDual(PilhaDupla P1){//Procedimento para Impressão das Pilhas 
        
        System.out.println("==============Print de Pilhas===============");//Enunciado
        
        System.out.println("=================Pilha 1-A==================");//Enunciado
        P1.Mostrar1();//Impressão da Pilha 1 
        System.out.println("=================Pilha 1-B==================");//Enunciado
        P1.Mostrar2();//Impressão da Pilha 2
    }
    
    
}
