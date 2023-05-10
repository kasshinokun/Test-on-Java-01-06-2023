package Aula_05_Natal;

public class Duende {
	private String Nome;
	private int Idade;
	public Duende() {
		Nome="";
		Idade=0;
	}
	public Duende(String nome, int idade) {
		Nome=nome;
		Idade=idade;
	}
	public String GetNome(){
        return Nome;
    }
    public void setNa(String nome) {
        Nome = nome;
    }
    public int GetIdade(){
        return Idade;
    }
    public void setNa(int idade) {
        Idade = idade;
    }
}

