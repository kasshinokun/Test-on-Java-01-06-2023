package Aula_05_Natal;
//Conversão para Vetor
public class Duende {
    private String Nome;//Nome
    private int Idade;//Idade
    public Duende() {//Construtor default
    	
    }
    public Duende(String nome, int idade) {//Sobrecarga
    	this.Nome = nome;
    	this.Idade = idade;
    }
    //Exibir detalhes Duende no Main()
    public String toString()
    {
        return "Nome:----------"+this.Nome + "\nIdade:---------"+ this.Idade;
    }
    //Get e Set do Nome
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    //Get e Set da Idade
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }
}

