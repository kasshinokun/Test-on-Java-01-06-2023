public class Triangulo extends Figura{
    public  int base;
    public  int altura;

    public  Triangulo(){
        super();
        base = 0;
        altura = 0;
    }

    public  Triangulo(int b,int a,int x,int y){
        super(x,y);
        base = b;
        altura = a;
    }

    @Override
    public double GetArea() {
        return (base*altura)/2;
    }

    @Override
    public double GetPerimetro() {
        return ((Math.sqrt(Math.pow(base,2)+Math.pow(altura,2)))*2)+base;
    }

    public String toString() {
        return "Triangulo(" + x0+" : "+ y0 +" : " + base + " : " + altura + " : "+GetArea()+" : " + GetPerimetro()+ ")";
    }
}

