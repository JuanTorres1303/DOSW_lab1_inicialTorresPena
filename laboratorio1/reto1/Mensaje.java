import java.util.List;
import java.util.stream.Collectors;

// Clase Mensaje
public class Mensaje {
    public String generarSaludo(List<Estudiante> estudiantes) {
        // Obtener los nombres usando stream y map
        String nombres = estudiantes.stream()
                .map(Estudiante::getNombre)
                .collect(Collectors.joining(", "));

        // Obtener información de los estudiantes
        Estudiante primero = estudiantes.get(0);
        Estudiante segundo = estudiantes.get(1);
        
        // Obtener los correos
        String correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y "));

        // Construir el mensaje
        String saludo = String.format(
            "¡Hola, bienvenidos! Nosotros somos la pareja conformada por %s, " +
            "estudiante de la escuela de %d.° semestre de %d años, y %s, " +
            "estudiante de la escuela de %d.° semestre de %d años. Nuestros correos " +
            "institucionales son %s.",
            primero.getNombre(),
            primero.getSemestre(),
            primero.getEdad(),
            segundo.getNombre(),
            segundo.getSemestre(),
            segundo.getEdad(),
            correos
        );

        return saludo;
    }
}
