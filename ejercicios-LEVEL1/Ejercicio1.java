import java.util.Scanner;


public class Ejercicio1 {
    public static void main (String [] args) {
        Scanner saludo = new Scanner (System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String NombreUsuario = saludo.nextLine();
        System.out.println("Hola " + NombreUsuario);
    }
}