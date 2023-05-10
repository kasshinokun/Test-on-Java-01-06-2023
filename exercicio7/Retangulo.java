public  class Retangulo extends Figura {
    public  int base;
    public  int altura;

    public  Retangulo(){
        super();
        base = 0;
        altura = 0;
    }

    public  Retangulo(int b,int a,int x,int y){
        super(x,y);
        base = b;
        altura = a;
    }

    @Override
    public double GetArea() {
        return base*altura;
    }

    @Override
    public double GetPerimetro() {
        return  (base + altura)*2;
    }

    public double GetDiagonal(){
        return Math.sqrt(altura*altura+base*base);
    }

    @Override
    public String toString() {
        return "Retangulo(" + x0+" : "+ y0 +" : " + base + " : " + altura +")";
    }
}
