package Call;//Nome do Subprojeto

import java.util.*;//Simplificação de bibliotecas necessarias 
import java.io.*;//Simplificação de bibliotecas necessarias para arquivos

import List.*;//Pagkage para Lista Duplamente Encadeada de Generics
import File.*;//Pagkage para File Manager via Terminal



public class Principal {//Classe de chamada
    public static void main(String[] args){//declaração do main do trabalho
        Manager teste=new Manager();
        System.out.println(teste.buscar());
        //teste_lista();
    
    }
    public static void teste_lista(){
        System.out.println("Lista de Strings:");
        Lista<String> lista=new Lista<>();
        String[] arr={"Arroz","Batata","Couve","Doce","Erva-doce","Flor","Goiaba","Hortela","Iogurte"};//Vetor base
        for(int i=0;i<arr.length;i++){
            lista.inserirFim(arr[i]);
        }
        lista.mostrar();
        System.out.println("Lista de Integer:");
        Lista<Integer> lista2=new Lista<>();
        Integer[] arr2={1,3,5,7,9,11,13,15,17};//Vetor base
        for(int i=0;i<arr2.length;i++){
            lista2.inserirFim(arr2[i]);
        }
        lista2.mostrar();
    
    }
}
