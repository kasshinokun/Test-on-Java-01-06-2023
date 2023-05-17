
package preview_aula_13;


public class Agenda {
    No raiz;
    public Agenda() {


    }
    public void inserir(Contato c){}
    public void remover(String nome){}
    public void pesquisar(String nome){}
    public void pesquisar(int cpf){}
    private void criar_tree(){
        char arr[]=new char[26];
        char k='A';
        for(int i=0;i<arr.length;i++){
            arr[i]=k++;
            System.out.println((i+1)+" "+arr[i]);
        }

    }
		
	
}
