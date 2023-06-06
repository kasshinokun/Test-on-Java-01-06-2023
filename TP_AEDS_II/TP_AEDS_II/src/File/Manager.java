package File;

import java.util.*;//Simplificação de bibliotecas necessarias 
import java.io.*;//Simplificação de bibliotecas necessarias para arquivos

public class Manager {
    public Scanner reader = new Scanner(System.in);
    public Manager(){}
    
    public String buscar(){
        //Enunciado e Informação ao Usuario
        System.out.println("IMPORTANTE:\nO programa somente listara arquivos (.txt)");
        System.out.println("na Pasta Documentos Padrao deste Computador.");
        System.out.println("\nPesquisando e Listando.....\n");
        
        //Instancia String com PATH default da pasta Documentos
        String folderPath=(System.getProperty("user.home").concat("\\Documents"));
        
        File folder=new File(folderPath);//Instancia objeto do tipo File
        
        File[] files=folder.listFiles();//Instacia vetor do tipo File
        
        for(int i=0;i<files.length;i++){//Laço de repetição para analise de arquivos
            
            if(files[i].isFile()&&files[i].getName().endsWith(".txt")==true){
                //se for arquivo do tipo .txt exibira o nome em tela
                System.out.println("Arquivo Encontrado 0"+(i)+"): "+files[i].getName());//Nome do arquivo encontrado
            }
            
        }
        if(files.length!=0){//senão estiver vazio.....
            int op=0;
            do{
              System.out.println("\nDigite o numero do arquivo(.txt) desejado:");//Solicitação ao Usuario
              op=Integer.parseInt(reader.nextLine());
            }while(op<0||op>files.length||(files[op].getName().endsWith(".txt")==false));
            System.out.println("\nArquivo Escolhido 0"+(op)+"): "+files[op].getName());//Nome do arquivo escolhido
            return files[op].getName();//retorna o nome do arquivo
        }else{
            return "Vazio";//Retorna vazio
        }
    }
    
}
