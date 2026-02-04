package laboratorio1.reto3;

import java.util.Scanner;

/**
 * Reto 3: Cálculo de Factorial
 * 
 * Descripción: Este programa calcula el factorial de un número entero positivo.
 * El factorial de n (n!) es el producto de todos los números enteros positivos
 * menores o iguales a n.
 * 
 * Ejemplo: 5! = 5 × 4 × 3 × 2 × 1 = 120
 * 
 * @author TorresCamilo
 * @version 1.0
 */
public class Factorial {
    
    /**
     * Calcula el factorial de forma iterativa
     * 
     * @param numero el número del cual calcular el factorial
     * @return el factorial del número
     * @throws IllegalArgumentException si el número es negativo
     */
    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        
        if (numero == 0 || numero == 1) {
            return 1;
        }
        
        long factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    /**
     * Calcula el factorial de forma recursiva
     * 
     * @param numero el número del cual calcular el factorial
     * @return el factorial del número
     * @throws IllegalArgumentException si el número es negativo
     */
    public static long calcularFactorialRecursivo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        
        if (numero == 0 || numero == 1) {
            return 1;
        }
        
        return numero * calcularFactorialRecursivo(numero - 1);
    }
    
    /**
     * Muestra el proceso de cálculo del factorial
     * 
     * @param numero el número del cual mostrar el factorial
     */
    public static void mostrarProceso(int numero) {
        if (numero < 0) {
            System.out.println("Error: El número no puede ser negativo");
            return;
        }
        
        System.out.print(numero + "! = ");
        
        if (numero == 0 || numero == 1) {
            System.out.println("1");
            return;
        }
        
        for (int i = numero; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" × ");
            }
        }
        System.out.println(" = " + calcularFactorial(numero));
    }
    
    /**
     * Método principal
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA DE FACTORIAL ===\n");
        
        try {
            System.out.print("Ingrese un número entero positivo: ");
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                System.out.println("Error: El número debe ser positivo");
                return;
            }
            
            System.out.println("\n--- Proceso del Cálculo ---");
            mostrarProceso(numero);
            
            System.out.println("\n--- Resultados ---");
            System.out.println("Método Iterativo: " + numero + "! = " + calcularFactorial(numero));
            System.out.println("Método Recursivo: " + numero + "! = " + calcularFactorialRecursivo(numero));
            
        } catch (Exception e) {
            System.out.println("Error: Ingrese un número entero válido");
        } finally {
            scanner.close();
        }
    }
}
