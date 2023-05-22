package javaapplication3;
import java.util.*;
public class Programa{
	/*public static void preenche (int[][] valores){
               Scanner entrada = new Scanner(System.in);
               for (int ln=0; ln < valores.length; ln++)
 		 {
			for (int col=0; col < valores.length; col++)
			{
				System.out.print("Digite: ");
				valores[ln][col] = entrada.nextInt();
			}
		}
	}
	
        public static int[] somaLinhas (int[][] mat)
	{
		int[] vet = new int[mat.length];	
		for (int i=0; i < mat.length; i++)
		{
			vet[i] = 0;
			for (int j = 0; j < mat[i].length; j++)
			{
				vet[i] += mat[i][j];
			}
		}
                return vet;
	}
	public static void exibe(int[] v){
		for (int pos=0; pos < v.length; pos++)
		{
			System.out.print(v[pos] + " ");
		}
		System.out.println();
	}*/
	public static void main(String[] args){
            /*
            Scanner entrada = new Scanner(System.in);
            int[][] matriz = new int[3][4];
            preenche(matriz);
            exibe(somaLinhas(matriz));
            entrada.close();
            */  
               
            int a=3;
            int b=6;
            int c=2;
            if(a>=b){
                System.out.println("Teste1");
                a=b;
            }
            if(b>=a){
                System.out.println("Teste2");
                b=a;
            }
            if(b==a){
                System.out.println("Teste3");

            }
            if(b<c){
                System.out.println("Teste4");
            }
            System.out.println("Usando else if");
            condicional2();
	}
        public static void condicional2(){
            int a=3;
            int b=6;
            int c=2;
            if(a>=b){
                System.out.println("Teste1");
                a=b;
            }
            else if(b>=a){
                System.out.println("Teste2");
                b=a;
            }
            else if(b==a){
                System.out.println("Teste3");

            }
            else if(b<c){
                System.out.println("Teste4");
            }
        
        }
   }
 

