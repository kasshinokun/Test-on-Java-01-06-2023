package Aula_05_rev_2;

//Bibliotecas para execução
import java.util.*;//Simplificação das bibliotecas necessarias

public class Time {//declaração da classe
    private Duende Lider;//Duende Lider
    private Duende Entregador;//Duende Entregador;
    private Duende Piloto;//Duende Piloto
    public Time() {//Construtor Default
    
    }
    public Time(Duende Lider, Duende Entregador, Duende Piloto) {//Sobrecarga
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

    public void setLider(Duende Lider) {
        this.Lider = Lider;
    }

    public Duende getEntregador() {
        return Entregador;
    }

    public void setEntregador(Duende Entregador) {
        this.Entregador = Entregador;
    }

    public Duende getPiloto() {
        return Piloto;
    }

    public void setPiloto(Duende Piloto) {
        this.Piloto = Piloto;
    }
    
}
