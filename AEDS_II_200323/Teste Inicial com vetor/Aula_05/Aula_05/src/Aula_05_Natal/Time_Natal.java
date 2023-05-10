package Aula_05_Natal;

//Bibliotecas para execução
import java.util.*;//Simplificação das bibliotecas necessarias

import Aula_05_Natal.Duende;
//Conversão para Vetor
public class Time_Natal {//declaração da classe
	private Duende Lider;//Duende Lider
	private Duende Entregador;//Duende Entregador;
	private Duende Piloto;//Duende Piloto
	
	public Time_Natal() {//Construtor Default
		 
	}
	public Time_Natal(Duende Lider, Duende Entregador, Duende Piloto) {//Sobrecarga
        Lider = new Duende();
        Entregador = new Duende();
        Piloto = new Duende();
	}
	public String toString()
    {
        return "Lider:-----------"+Lider.getNome()+"\tIdade:--"+Lider.getIdade()+
                "\nEntregador:------"+Entregador.getNome()+"\tIdade:--"+Entregador.getIdade()+
                "\nPiloto:----------"+Piloto.getNome()+"\tIdade:--"+Piloto.getIdade();
               
    } 
	public Duende getLider() {
		return Lider;
	}
	
	public void setLider(Duende lider) {
		Lider = lider;
	}
	
	public Duende getEntregador() {
		return Entregador;
	}
	
	public void setEntregador(Duende entregador) {
		Entregador = entregador;
	}
	
	public Duende getPiloto() {
		return Piloto;
	}
	
	public void setPiloto(Duende piloto) {
		Piloto = piloto;
	}
	
	
 
}
