package tema03;

import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;

        System.out.println("Dime un numero");
        numero1 =in.nextDouble();

        System.out.println("Dime un numero");
        numero2 =in.nextDouble();

        System.out.println("Dime un numero");
        numero3 =in.nextDouble();

        if(numero1 >-100 && numero1 <100 && numero2 >-100 && numero2 <100 && numero3 >-100 && numero3 <100) {
            System.out.println("Los numeros son correctos");
        }else {
            System.out.println("Los numeros son incorrectos");
        }

        double resFinal = ((1/numero1) + (1/numero2) + (1/numero3));
        resFinal = Math.round(resFinal * 100000) / 100000d;
        System.out.println("La suma de los inversos es: " + resFinal);




    }



}