public class Main {
    public static void main(String[] args) {
        Retangulo R1 = new Retangulo(2,3,10,20);
        Triangulo T1 = new Triangulo(3,4,45,50);
        Circunferencia C1 = new Circunferencia(1,1,2);
        double A1, A2,B1,B2,B3,B4;

        A1 = C1.GetArea();
        B1 = C1.GetAreaMonteCarlo(50);
        B2 = C1.GetAreaMonteCarlo(500);
        B3 = C1.GetAreaMonteCarlo(1000);
        B4 = C1.GetAreaMonteCarlo(100000);



        System.out.println("area: " + A1);
        System.out.println("area: " + B1);
        System.out.println("area: " + B2);
        System.out.println("area: " + B3);
        System.out.println("area: " + B4);
      //  System.out.println("Perimetro: "+C1.GetPerimetro());

       // System.out.println(C1.toString());



    }
}