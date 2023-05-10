package Act_25_04;//Nome do Projeto

import java.util.*;//simplificação de Bibliotecas necessárias

public class Exercises {//Classe para Execução dos Exercícios

    //Variavel global para entrada do teclado
    public static Scanner reader = new Scanner(System.in);
  
    public static void Exercise_1(Lista L1) {//Inserção de valores consecutivos em Lista

        System.out.println("\n===01 - Insercao de valores em Lista=========\n");//Enunciado
        System.out.print("\nInsira um valor para 0"+(L1.n+1)+":...........");//Enunciado
        int n1 = Integer.parseInt(reader.nextLine());//Armazena o valor
        System.out.print("\nInsira um valor para 0"+(L1.n+2)+":...........");//Enunciado
        int n2= Integer.parseInt(reader.nextLine());//Armazena o valor
        System.out.println("\nVoce digitou: "+n1+" e "+n2);
        System.out.println("\nAgora escolha abaixo uma opcao de Insercao:\n");//Enunciado
        int op=0;
        do {
            System.out.println("\n1) Insercao no Inicio\n");//Enunciado
            System.out.println("\n2) Insercao no Fim\n");//Enunciado
            System.out.println("\n3) Insercao na Posicao\n");//Enunciado
            op=Integer.parseInt(reader.nextLine());//Armazena o valor
            switch(op){//Analise do que foi digitado
                //Chama o procedimento
                case 1:
                    L1.adicionar(op, n1, n2);//Envia ao procedimento
                    break;//Condição de parada
                case 2:
                    L1.adicionar(op, n1, n2);//Envia ao procedimento
                    break;//Condição de parada
                case 3:
                    System.out.println("\nEscolha a posicao desejada:........");//Enunciado
                    int value= Integer.parseInt(reader.nextLine());//armazena o valor
                    L1.adicionar2(n1, n2, value);//Envia ao procedimento
                    break;//Condição de parada
                default://tratamento de exceções no switch-case

            }

        }while(op<1||op>3);//Exibe enquanto as condições forem invalidas
        L1.ImprimirArray();//Exibe a Lista
        
        System.out.println("\n=========Retornando ao Menu Inicial==========\n");//Enunciado
    }
    public static void Exercise_2(Lista L1) {//Exercicio 02
        System.out.println("\n===02 - Remocao de valor em Lista e Retorno==\n");//Enunciado
        
        System.out.print("Insira um valor desejado:...........");//Enunciado
        int nodo=Integer.parseInt(reader.nextLine());//armazena o valor
        System.out.println("\nVoce digitou: "+nodo+" e equivale ao item 0"+(nodo+1));//enunciado
        L1.retorna_Lista(L1,nodo);//Envia a Lista e o valor a função
        
        System.out.println("\n=========Lista apos Remocao de Valor=========\n");//Enunciado
        L1.ImprimirArray();//Exibe a Lista
        System.out.println("\n=========Retornando ao Menu Inicial==========\n");//Enunciado
    }
    public static void Exercise_3(Lista L1) {//Procedimento para inverter a Lista
        System.out.println("\n===03 - Valores em Posicao Inversa na Lista==\n");//Enunciado
        
        System.out.println("Antes de Inverter a Lista");//Enunciado
        L1.ImprimirArray();//Exibe a Lista
        L1.L_Inverter(L1);//Envia ao Procedimento
        System.out.println("Apos de Inverter a Lista");//Enunciado
        L1.ImprimirArray();//Exibe a Lista
        System.out.println("\n=========Retornando ao Menu Inicial==========\n");//Enunciado
        
    }
    public static void Exercise_4(PilhaDupla P1) {//Procedimento para gestão em Pilha Dupla
        PilhaDupla.main(P1);//Envia ao Main da classe para gerenciamento da Pilha Dupla
        
    }
    public static void Exercise_5(Pilha P1,Pilha P2) {//Inserção de valores positivos e negativos em pilhas   
            
        System.out.println("\n===05 - Insercao de valores em Pilhas========\n");//Enunciado
        
        System.out.print("Insira valores para Pilhas:...........");//Enunciado
        int value= Integer.parseInt(reader.nextLine());//Armazena os valores
        if(value>=0){//se for maior que zero
            //Procedimento de Inserção
            P1.Add(value);//Envia ao procedimento
            System.out.println("\n======== Pilha de Numeros Positivos:=========");//Enunciado
            
            P1.Exibir_Pilha();//Positivos
        }else{
            //Procedimento de Inserção
            P2.Add(value);//Envia ao procedimento
            System.out.println("\n======== Pilha de Numeros Negativos:=========");//Enunciado
            
            P2.Exibir_Pilha();//Negativos
        }
        System.out.println("\n=========Retornando ao Menu Inicial==========\n");//Enunciado

}
    public static void Exercise_6(Fila F,Fila F_Impares, Fila F_Pares) {
        System.out.println("\n===06 - Gestao e Insercao de valores em Filas\n");//Enunciado
        
        int op=1;//variavel de opção
        for(int k=(F.U+1);(k%F.fila2.length)!=F.P&&op==1;k++){    
            System.out.println("Insira os valores para F:...........");//Enunciado
            int value= Integer.parseInt(reader.nextLine());//Armazena os valores
            //Procedimento de Inserção
            F.Add(value);
            if(value%2==0){
                //Procedimento de Inserção
                F_Pares.Add(value);//Valores Pares
            }else{
                //Procedimento de Inserção
                F_Impares.Add(value);//Valores Impares
            }
            
            System.out.println("Deseja continuar:...........");//Enunciado
            op=Integer.parseInt(reader.nextLine());
        }
        F.Exibir_Filas(F, F_Pares, F_Impares);//Exibe as Filas
        System.out.println("\n=========Retornando ao Menu Inicial==========\n");//Enunciado
        
    }
    public static void Exercise_7(Fila F8,SQ Act7) {
        
        System.out.println("===07 - Pilha de Filas=======================");//Enunciado
        System.out.println("=========Retornando ao Menu Inicial==========");//Enunciado
        if(F8.U==F8.P){//se a fila etiver vazia, preenche
            for(int i=(F8.U+1);(i%F8.fila2.length)!=F8.P;i++){
                F8.Add(i+3);//Fila para teste
            }
        }
        F8.Mostrar2();//Exibe Fila
        //Inserção de Fila na Pilha
        Act7.Add_SQ(F8);//Adiciona Fila
        System.out.println("=========Fila Adicionada na Pilha============");//Enunciado
        Act7.Add_SQ(F8);//Adiciona Fila
        System.out.println("=========Fila Adicionada na Pilha============");//Enunciado
        System.out.println("=========Pilha apos adicionar Filas==========");//Enunciado
        Act7.To_Stack();//Exibe Pilha
        System.out.println("==========Removendo Fila da Pilha============");//Enunciado
        //Remoção de Fila da Pilha
        F8=Act7.Remove_SQ();//retorna a fila
        System.out.println("===========Fila Removida da Pilha============");//Enunciado
        F8.Mostrar2();//Exibe Fila
        System.out.println("\n=========Retornando ao Menu Inicial==========\n");//Enunciado
        
    }
    public static void Exercise_8(Pilha P3,SQ Act8) {
        
        System.out.println("===08 - Fila de Pilhas=======================");//Enunciado
        
        if(P3.n==0){//se a pilha etiver vazia, preenche
            for(int i=0;i<P3.pilha2.length;i++){
                P3.Add(3);//Pilha para teste
            }
        }
        P3.Exibir_Pilha();//Exibe a Pilha

        //Inserção de Pilha na Fila
        System.out.println("=========Pilha Adicionada na Fila============");//Enunciado
        Act8.Enqueue(P3);//Adiciona Pilha
        System.out.println("=========Pilha Adicionada na Fila============");//Enunciado
        Act8.Enqueue(P3);//Adiciona Pilha
        System.out.println("=========Fila apos adicionar Pilhas==========");//Enunciado
        Act8.To_Queue();//Exibe Fila de Pilhas
        System.out.println("==========Removendo Pilha da Fila============");//Enunciado
        P3=Act8.Dequeue();//P3 recebe retorno da remoção da Fila
        System.out.println("===========Pilha Removida da Fila============");//Enunciado
        P3.Exibir_Pilha();//Exibe a Pilha
        System.out.println("\n=========Retornando ao Menu Inicial==========\n");//Enunciado
    }
    public static void Exercise_9() {
        //Mantido apenas para analise se desejar, em desenvolvimento
        System.out.println("===09 - Gestao de Fila com Pilhas Auxiliares=");//Enunciado
        
       
        Fila F9=new Fila(6);
        Pilha P9_1=new Pilha(6);
        Pilha P9_2=new Pilha(6);
        
        //Adicionando valores predefinidos
        F9.Add(12);
        F9.Add( 11);
        F9.Add(13);
        F9.Add(5);
        F9.Add(6);
        F9.Add(7);
        F9.Mostrar2();//Mostra a Fila
        for(int i=0;i<P9_1.pilha2.length;i++){
           P9_1.Add(F9.Erase());
        }
        for(int i=0;i<P9_2.pilha2.length;i++){
            P9_2.Add(P9_1.pilha2[i]);
        }
        P9_1.Exibir_Pilha();
        System.out.println("=============================================");//Enunciado
        P9_2.Exibir_Pilha();
        F9.U=F9.P=0;//Zera e reinicia a Fila
        F9.Mostrar2();//Mostra a Fila
        F9.Add(12);
        F9.Add( 11);
        F9.Add(13);
        F9.Add(5);
        F9.Add(6);
        F9.Add(7);
        F9.Mostrar2();//Mostra a Fila
        /*
        //adição conforme desejo do usuario
        int op=1;//variavel de opção
        for(int k=(F9.U+1);(k%F9.fila2.length)!=F9.P&&op==1;k++){
            System.out.println("Insira os valores para F9:...........");//Enunciado
            int value= Integer.parseInt(reader.nextLine());//Armazena os valores
            //Procedimento de Inserção
            F9.Add(value);
            
            System.out.println("Deseja continuar:...........");//Enunciado
            op=Integer.parseInt(reader.nextLine());
        }
        F9.Mostrar2();//Mostra a Fila
        */
        System.out.println("=============================================");//Enunciado

        System.out.println("=============================================");//Enunciado
        
        System.out.println("=============================================");//Enunciado
        
        System.out.println("=============================================");//Enunciado
        
        System.out.println("\n=========Retornando ao Menu Inicial==========\n");//Enunciado
    }
    public static void Exercise_10(SQ PP_10) {
        //Apenas logica aplicada, não foi testado
        System.out.println("===10 - Sistema de Gestao de Deposito========");//Enunciado
        
        Pilha B=new Pilha();//Pilha de 5 toneladas
        Pilha C=new Pilha();//Pilha de 3 toneladas
        
        System.out.println("=============Adicionar Itens=================");//Enunciado
        
        int caixa;//Variavel para valor da caixa
        System.out.print("\nInsira um valor a pesagem da Caixa:...........");//Enunciado
        caixa= Integer.parseInt(reader.nextLine());//Armazena o valor
        System.out.println("============Gerenciando Pilhas===============");//Enunciado
        
        //Deposito vazio
        if(caixa==PP_10.Peek_PP()||PP_10.n==0){
            PP_10.PP[0].P.Add(caixa);
        }//Caixas de 7 e 3 toneladas
        else if(caixa==7&&PP_10.Peek_PP()==5){
            for(int i=0;i<B.pilha2.length;i++){
                B.Add(PP_10.PP[0].P.Desempilhar());
            }
            PP_10.PP[0].P.Add(caixa);
            for(int i=0;i<PP_10.PP[1].P.pilha2.length;i++){
                PP_10.PP[1].P.Add(B.Desempilhar());
            }
        }//Caixas de 7 e 3 toneladas
        else if(caixa==7&&PP_10.Peek_PP()==3){
            for(int i=0;i<B.pilha2.length;i++){
                C.Add(PP_10.PP[0].P.Desempilhar());
            }
            PP_10.PP[0].P.Add(caixa);
            for(int i=0;i<PP_10.PP[1].P.pilha2.length;i++){
                PP_10.PP[1].P.Add(C.Desempilhar());
            }
        }//Caixas de 7 e 5 toneladas
        else if(caixa==5&&PP_10.Peek_PP()==7){
            PP_10.PP[1].P.Add(caixa);
        }//Caixas de 5 e 3 toneladas
        else if(caixa==5&&PP_10.Peek_PP()==3){
            for(int i=0;i<B.pilha2.length;i++){
                C.Add(PP_10.PP[0].P.Desempilhar());
            }
            PP_10.PP[0].P.Add(caixa);
            for(int i=0;i<PP_10.PP[1].P.pilha2.length;i++){
                PP_10.PP[1].P.Add(C.Desempilhar());
            }
        }else if(caixa==3){//Para 3 toneladas
            if(PP_10.Peek_PP()==5){
                PP_10.PP[1].P.Add(caixa);
            }
            if(PP_10.Peek_PP()==7&&PP_10.n==1){
                PP_10.PP[1].P.Add(caixa);
            }
            if(PP_10.Peek_PP()==7&&PP_10.n>1){
                PP_10.PP[2].P.Add(caixa);
            }
        }
        System.out.println("==========Apos Gerenciamento de Pilhas=======");//Enunciad0
        PP_10.To_Stack_PP();//Exibe a Pilha
        System.out.println("\n=========Retornando ao Menu Inicial==========\n");//Enunciado
    }
    
}
