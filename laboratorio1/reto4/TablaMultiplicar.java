package laboratorio1.reto4;

import java.util.Scanner;

/**
 * Reto 4: Tabla de Multiplicar
 * 
 * Descripción: Este programa genera la tabla de multiplicar de un número
 * entero del 1 al 10 (o más, según preferencia del usuario).
 * 
 * @author TorresCamilo
 * @version 1.0
 */
public class TablaMultiplicar {
    
    private int numero;
    private int limite;
    
    /**
     * Constructor que recibe el número y el límite
     */
    public TablaMultiplicar(int numero, int limite) {
        this.numero = numero;
        this.limite = limite;
    }
    
    /**
     * Genera y muestra la tabla de multiplicar
     */
    public void generarTabla() {
        System.out.println("=== TABLA DE MULTIPLICAR DEL " + numero + " ===\n");
        
        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.printf("%d × %d = %d\n", numero, i, resultado);
        }
    }
    
    /**
     * Muestra la tabla en formato visual
     */
    public void mostrarTablaFormato() {
        System.out.println("\n=== TABLA FORMATEADA ===\n");
        System.out.println("┌─────────────────────────┐");
        System.out.printf("│ Tabla del %d              │\n", numero);
        System.out.println("├─────────────────────────┤");
        
        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.printf("│ %d × %2d = %3d           │\n", numero, i, resultado);
        }
        
        System.out.println("└─────────────────────────┘");
    }
    
    /**
     * Calcula la suma de todos los resultados
     */
    public long calcularSuma() {
        long suma = 0;
        for (int i = 1; i <= limite; i++) {
            suma += numero * i;
        }
        return suma;
    }
    
    /**
     * Método principal
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== GENERADOR DE TABLA DE MULTIPLICAR ===\n");
            
            System.out.print("Ingrese el número: ");
            int numero = scanner.nextInt();
            
            System.out.print("Ingrese el límite (hasta qué número multiplicar): ");
            int limite = scanner.nextInt();
            
            if (numero < 0 || limite < 1) {
                System.out.println("Error: Ingrese números válidos");
                return;
            }
            
            TablaMultiplicar tabla = new TablaMultiplicar(numero, limite);
            
            tabla.generarTabla();
            tabla.mostrarTablaFormato();
            
            System.out.println("\nSuma de todos los resultados: " + tabla.calcularSuma());
            
        } catch (Exception e) {
            System.out.println("Error: Ingrese números enteros válidos");
        } finally {
            scanner.close();
        }
    }
}
