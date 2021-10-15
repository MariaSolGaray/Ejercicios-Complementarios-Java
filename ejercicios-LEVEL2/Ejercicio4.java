import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();
        alumnos.add("Sofia Lopez");
        alumnos.add("Valentin Dominguez");
        alumnos.add("Santiago Vallejos");
        alumnos.add("Luciana Gonzales");
        alumnos.add("Maria Luz Garay");
        alumnos.add("Rodolfo Rodriguez");
        alumnos.add("Norma Garcia");
        alumnos.add("Julieta Venegas");
        alumnos.add("Ramiro Gonzales");
        alumnos.add("Matias Fernandez");
        alumnos.add("Juliana Ortiz");
        alumnos.add("Ana Garcia");

            List<String> curso1 = alumnos.subList(0, 4);
            List<String> curso2 = alumnos.subList(5, 8);
            List<String> curso3 = alumnos.subList(9, 12);

        System.out.println("Alumnos del primer curso:" + "\n");
        for(int i = 0; i < curso1.size(); i++) 
            System.out.println(curso1.get(i));
        
        System.out.println("\n" + "Alumnos del segundo curso:" + "\n");
        for(int i = 0; i < curso2.size(); i++) 
            System.out.println(curso2.get(i));
        
        System.out.println("\n" + "Alumnos del tercer curso:" + "\n");
        for(int i = 0; i < curso3.size(); i++) 
            System.out.println(curso3.get(i));
    }
}
