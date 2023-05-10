package Aula_02;//Nome do Projeto
import java.util.*;//biblioteca padrões necessárias
public class Analise {//Nome da classe

	public static void main(String[] args) {//Classe Main do programa
            Aula_02.teste_if_ternario.main(args);
            int[]V= {1,3,1,8,6,7};//Valores para o Array
            Dados D1 = new Dados(V);//Instancia a variavel para o Array e atribui valores e tamanho
            D1.ImprimirArray();//Executa a impressão do Array
            System.out.println("A media equivale a "+D1.CalculaMedia());//Exibe a media do Array
            //D1.Ordenar();//Executa a ordenação do Array
            D1.Selection_sort();//Executa a ordenação do Array
            D1.ImprimirArray();  //Verifcação da ordenação
            System.out.println("A mediana equivale a "+D1.CalculaMediana());//Exibe a mediana do Array
	}

}
