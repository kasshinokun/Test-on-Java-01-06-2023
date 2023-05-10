public class Quadrado extends Retangulo {

    public  Quadrado(){
        super();
    }

    public  Quadrado(int b,int a,int x,int y){
        super(b,a,x,y);
    }

    @Override
    public String toString() {
        return "Quadrado(" + x0+" : "+ y0 +" : " + base + " : " + altura +")";
    }


}

