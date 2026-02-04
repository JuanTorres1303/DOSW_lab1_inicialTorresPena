package laboratorio1.reto6;

import java.util.Scanner;

/**
 * Reto 6: Validación de Palíndromos
 * 
 * Descripción: Este programa verifica si una palabra o frase es un palíndromo.
 * Un palíndromo es una palabra, frase o número que se lee igual hacia adelante
 * que hacia atrás, ignorando espacios, puntuación y mayúsculas/minúsculas.
 * 
 * Ejemplos:
 * - "radar" es un palíndromo
 * - "A man, a plan, a canal: Panama" es un palíndromo
 * - "hello" no es un palíndromo
 * 
 * @author TorresCamilo
 * @version 1.0
 */
public class Palindromo {
    
    /**
     * Limpia una cadena removiendo espacios y caracteres especiales
     * 
     * @param texto el texto a limpiar
     * @return el texto limpiado
     */
    public static String limpiarTexto(String texto) {
        return texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
    
    /**
     * Verifica si una cadena es palíndromo
     * 
     * @param texto el texto a verificar
     * @return true si es palíndromo, false en caso contrario
     */
    public static boolean esPalindromo(String texto) {
        String limpio = limpiarTexto(texto);
        
        if (limpio.isEmpty()) {
            return false;
        }
        
        String invertido = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(invertido);
    }
    
    /**
     * Verifica si un número es palíndromo
     * 
     * @param numero el número a verificar
     * @return true si es palíndromo, false en caso contrario
     */
    public static boolean esPalindromoNumerico(int numero) {
        String texto = String.valueOf(Math.abs(numero));
        String invertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(invertido);
    }
    
    /**
     * Muestra el análisis detallado de un palíndromo
     * 
     * @param texto el texto a analizar
     */
    public static void mostrarAnalisis(String texto) {
        String limpio = limpiarTexto(texto);
        String invertido = new StringBuilder(limpio).reverse().toString();
        
        System.out.println("\n=== ANÁLISIS DETALLADO ===");
        System.out.println("Texto original: " + texto);
        System.out.println("Texto limpio: " + limpio);
        System.out.println("Texto invertido: " + invertido);
        System.out.println("¿Es palíndromo? " + esPalindromo(texto));
        
        // Mostrar posiciones
        System.out.println("\n--- Comparación de caracteres ---");
        for (int i = 0; i < limpio.length() / 2; i++) {
            char inicio = limpio.charAt(i);
            char fin = limpio.charAt(limpio.length() - 1 - i);
            String match = inicio == fin ? "✓" : "✗";
            System.out.printf("Posición %d: '%c' vs '%c' %s\n", i, inicio, fin, match);
        }
    }
    
    /**
     * Encuentra todos los palíndromos en un rango de números
     * 
     * @param inicio el número inicial
     * @param fin el número final
     */
    public static void encontrarPalindromosNumericos(int inicio, int fin) {
        System.out.println("\n=== PALÍNDROMOS NUMÉRICOS ===");
        System.out.println("Rango: " + inicio + " a " + fin);
        System.out.print("Palíndromos encontrados: ");
        
        boolean encontrado = false;
        for (int i = Math.min(inicio, fin); i <= Math.max(inicio, fin); i++) {
            if (esPalindromoNumerico(i)) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.print("Ninguno");
        }
        System.out.println();
    }
    
    /**
     * Método principal
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== VALIDADOR DE PALÍNDROMOS ===\n");
        
        int opcion;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Verificar si una palabra es palíndromo");
            System.out.println("2. Verificar si una frase es palíndromo");
            System.out.println("3. Verificar si un número es palíndromo");
            System.out.println("4. Encontrar palíndromos en un rango");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese una palabra: ");
                        String palabra = scanner.nextLine();
                        System.out.println("¿Es palíndromo? " + esPalindromo(palabra));
                        mostrarAnalisis(palabra);
                        break;
                        
                    case 2:
                        System.out.print("Ingrese una frase: ");
                        String frase = scanner.nextLine();
                        System.out.println("¿Es palíndromo? " + esPalindromo(frase));
                        mostrarAnalisis(frase);
                        break;
                        
                    case 3:
                        System.out.print("Ingrese un número: ");
                        int numero = scanner.nextInt();
                        System.out.println("¿Es palíndromo? " + esPalindromoNumerico(numero));
                        break;
                        
                    case 4:
                        System.out.print("Ingrese el inicio del rango: ");
                        int inicio = scanner.nextInt();
                        System.out.print("Ingrese el fin del rango: ");
                        int fin = scanner.nextInt();
                        encontrarPalindromosNumericos(inicio, fin);
                        break;
                        
                    case 5:
                        System.out.println("¡Hasta luego!");
                        break;
                        
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese datos válidos");
                scanner.nextLine();
                opcion = 0;
            }
        } while (opcion != 5);
        
        scanner.close();
    }
}
