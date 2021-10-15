import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
            int numero1 = 0;
            int numero2 = 0;
            int resultado = 0;
	
        System.out.println("Introduce el primer número:");			
        numero1 = lectura.nextInt();
                    
        System.out.println("Introduce el segundo número:");
        numero2 = lectura.nextInt();

        resultado = numero1+numero2;
        System.out.println( numero1 + " + " + numero2 + " = " + resultado);

        resultado = numero1-numero2;
        System.out.println( numero1 + " - " + numero2 + " = " + resultado);

        resultado = numero1*numero2;
        System.out.println( numero1 + " * " + numero2 + " = " + resultado);

        resultado = numero1/numero2;
        System.out.println( numero1 + " / " + numero2 + " = " + resultado);

        resultado = numero1%numero2;
        System.out.println( numero1 + " % " + numero2 + " = " + resultado);
    }
    
}
    
