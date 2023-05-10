public class Circunferencia extends Figura{
    private double raio;


    public Circunferencia(){
        super();
        raio = 0;
    }

    public Circunferencia(int r,int x,int y){
        super(x, y);
        raio = r;
    }

    @Override
    public double GetArea() {
        return Math.PI*Math.pow(raio,2);
    }

    @Override
    public double GetPerimetro() {
        return 2*raio*Math.PI;
    }

    public String toString() {
        return "Circunferencia( x0= " + x0+" : y0= "+ y0 +" : Raio= " + raio +" : Area+ "+GetArea()+" : Perimetro= " + GetPerimetro()+ ")";
    }


    public double GetAreaMonteCarlo(int D){
        double Pi;
        Pi = CalculaPi(D);
        return Pi*Math.pow(raio,2);
    }

    public double GetPerimetroMonteCarlo(int D) {
        double Pi;
        Pi = CalculaPi(D);
        return 2*raio*Pi;
    }

    public double CalculaPi(int D){
        double pi,aux=0;
        for(int i=0;i<=D;i++){
            double x1,x2;
            x1 = Math.random();
            x2 = Math.random();
            if(Math.pow(x1,2)+Math.pow(x2,2) < 1){
                aux++;
            }

        }
        pi = aux/D*4;
        return pi;
    }
}
