import java.util.*;//simplificação de Bibliotecas 
public class Principal {

    public static void main(String[] args) {
        
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

}
