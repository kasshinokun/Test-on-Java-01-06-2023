package preview_aula_13;
import java.util.*;//Simplificação de Bibliotecas necessárias

//Importação deoutros projetos
import TAD.*;//Carrega as classes do outro package
import Sort.*;//Carrega as classes do outro package

public class Exercises {
	public static void gestao_lista(){//Operações com lista simples
        int arr[]={1,2,3,4,5,6,7,8,9};//Vetor base
        Lista_Simples lista=new Lista_Simples();
        for(int i=0;i<arr.length;i++){
            lista.InserirFim(arr[i]);
        }
        System.out.println("\n==Insercao===================================");//Enunciado
        lista.mostrar();
        System.out.println("\n==No Inicio==================================");//Enunciado
        lista.InserirInicio(arr[4]);
        lista.mostrar();
        System.out.println("\n==Na Posicao=================================");//Enunciado
        lista.InserirPos(arr[4], 4);
        lista.mostrar();
        System.out.println("\n==Remocao====================================");//Enunciado
        int x=lista.removerInicio();
        System.out.println("Deletado no Inicio: "+x);
        lista.mostrar();
        System.out.println("\n=============================================");//Enunciado
        int y=lista.removerFim();
        System.out.println("Deletado no Fim: "+y);
        lista.mostrar();
        System.out.println("\n=============================================");//Enunciado
        int z=lista.removerPos(4);
        System.out.println("Deletado na Posicao: "+z);
        lista.mostrar();
        System.out.println("\n=============================================");//Enunciado
    }
	public static void gestao_matriz(){
        
        int v[]={1,2,3,4,5,6,7,8,9};//Vetor base
        
        Matriz m=new Matriz(3,3);//Dimensionando e Instanciando Matriz
        
        System.out.println("\n====Adicionando itens na Matriz====");
        m.Preencher(v);//Preencher
        
        System.out.print("\n========Impressao da Matriz========\n\n");
        m.Imprimir();//Imprimir
        
        System.out.print("\n==========Soma de Matrizes=========\n\n");
        m=m.soma(m);//Soma de Matrizes
        m.Imprimir();//Imprimir
        
        System.out.print("\n=====Multiplicacao de Matrizes=====\n\n");
        m=m.Multiplicação(m);//Multiplicação de matrizes
        m.Imprimir();//Imprimir
        System.out.print("\n====Diagonal Pricipal da Matriz====\n\n");
        int k=m.DiagonalPrincipal();
        
        System.out.println("\nSoma da Diagonal Pricipal: "+k);
        System.out.print("\n====Diagonal Secundaria da Matriz==\n\n");
        int l=m.DiagonalSecundaria();
        System.out.println("\nSoma da Diagonal Secundaria: "+l);
        System.out.print("\n");
        
        
    }
	//Exercicios Atividade teorica 2 TAF
	public static void Exercise_1() {
		System.out.println("Analise Lexicografica de metodos de Ordenacao");//Enunciado
		int []arr= {3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1};
		System.out.println("=Impressao do Vetor Base=====================");//Enunciado
		Another vector=new Another(arr);
		vector.ImprimirArray();
		System.out.println("=No Selection Sort===========================");//Enunciado
        System.out.println("Pior Caso");//Enunciado
        vector.Selection_sort1();//Pior caso
        System.out.println("Melhor Caso");//Enunciado
        vector.Selection_sort1();//Pior caso       
		System.out.println("\n=No Insertion Sort===========================");//Enunciado
		System.out.println("=No Merge Sort===============================");//Enunciado
		System.out.println("=No Quick Sort===============================");//Enunciado
		System.out.println("=No Heap Sort================================");//Enunciado
		System.out.println("=============================================");//Enunciado
		System.out.println("=============================================");//Enunciado
		System.out.println("=============================================\n");//Enunciado
	}
	public static void Exercise_2() {}
	public static void Exercise_3() {}
	public static void Exercise_4() {}
	public static void Exercise_5() {}
	public static void Exercise_6() {}
	public static void Exercise_7() {}
	public static void Exercise_8() {}
	public static void Exercise_9() {}
	public static void Exercise_10() {}
	public static void Exercise_11() {}
	public static void Exercise_12() {}
	
	//Exercicios Aula 13
	public static void Exercise_Tree() {}
}

