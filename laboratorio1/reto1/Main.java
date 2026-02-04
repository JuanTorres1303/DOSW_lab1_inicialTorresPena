import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        
        List<Estudiante> estudiantes = new ArrayList<>();
        
        
        estudiantes.add(new Estudiante("Camilo Torres", 19, "ju.torres@mail.escueling.edu.co", 7));
        estudiantes.add(new Estudiante("Hildebrando Peña", 20, "hildebrando.pena-q@mail.escuelaing.edu.coo", 7));

        
        Mensaje mensaje = new Mensaje();
        String saludo = mensaje.generarSaludo(estudiantes);

        // Imprimir el saludo
        System.out.println(saludo);
    }
}
