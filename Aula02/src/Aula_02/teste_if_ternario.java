
package Aula_02;
import java.util.*;
public class teste_if_ternario {
    public static void main(String[] args){

        double salario = 1000; 
        double bonus = 0.0;

        if (salario > 1000) { bonus = salario * 0.10; }
        else { bonus = salario * 0.15; }

        System.out.println(bonus); 
        
        
        double bonus2 = salario * (salario > 1000 ? 0.10 : 0.15); 
        System.out.println(bonus2);
    }
}
