package Aula_13;
import java.util.*;
public class Contato {
	String nome;
	String telefone;
	String email;
	String cpf;
	public Contato(){
		this.nome="";
		this.telefone="";
		this.email="";
		this.cpf="";
	}
	public Contato(String nome,String telefone,String email,String cpf) {
		this.nome=nome;
		this.telefone=telefone;
		this.email=email;
		this.cpf=cpf;
	}
	public String toString()
    {
        return"Nome:-------------"+this.nome
        		+"\nTelefone:---------"+this.telefone
		        +"\nEmail:------------"+this.email
				+"\nCPF:--------------"+this.cpf;
    }
    //Get e Set do Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        nome = nome;
    }
    //Get e Set do Telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
    	telefone = telefone;
    }
    //Get e Set do Nome
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
    	email = email;
    }
    //Get e Set do Telefone
    public String getCPF() {
        return cpf;
    }
    public void setCPF(String cpf) {
    	cpf = cpf;
    }
}
