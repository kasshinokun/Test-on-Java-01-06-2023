package Aula_05_Vetor;
//Codigo mantido igual a Aula_5_rev_2
//Bibliotecas para execução
import java.util.*;//Simplificação das bibliotecas necessarias

public class Time {//declaração da classe
    private Duende Lider = new Duende();//Duende Lider
    private Duende Entregador  = new Duende();//Duende Entregador;
    private Duende Piloto = new Duende();//Duende Piloto
    public Time() {//Construtor Default

    }
    public String toString()
    {
        return "Lider:-----------"+Lider.getNome()+"\tIdade:--"+Lider.getIdade()+" Anos"+
                "\nEntregador:------"+Entregador.getNome()+"\tIdade:--"+Entregador.getIdade()+" Anos"+
                "\nPiloto:----------"+Piloto.getNome()+"\tIdade:--"+Piloto.getIdade()+" Anos";

    }
    public void setLider(Duende Lider) {
        this.Lider = Lider;
    }
    public void setEntregador(Duende Entregador) {
        this.Entregador = Entregador;
    }
    public void setPiloto(Duende Piloto) {
        this.Piloto = Piloto;
    }
}