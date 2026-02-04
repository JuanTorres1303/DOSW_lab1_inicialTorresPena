package laboratorio1.reto5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Reto 5: Sucesión de Fibonacci
 * 
 * Descripción: Este programa genera la sucesión de Fibonacci hasta una cantidad
 * especificada de términos. La sucesión de Fibonacci es una serie de números
 * donde cada número es la suma de los dos números anteriores: 0, 1, 1, 2, 3, 5, 8...
 * 
 * @author TorresCamilo
 * @version 1.0
 */
public class Fibonacci {
    
    private List<Long> sucesion;
    
    /**
     * Constructor que inicializa la lista
     */
    public Fibonacci() {
        this.sucesion = new ArrayList<>();
    }
    
    /**
     * Genera la sucesión de Fibonacci hasta n términos (iterativo)
     * 
     * @param n la cantidad de términos a generar
     */
    public void generarFibonacciIterativo(int n) {
        if (n <= 0) return;
        
        sucesion.clear();
        
        if (n >= 1) sucesion.add(0L);
        if (n >= 2) sucesion.add(1L);
        
        for (int i = 2; i < n; i++) {
            long siguiente = sucesion.get(i - 1) + sucesion.get(i - 2);
            sucesion.add(siguiente);
        }
    }
    
    /**
     * Obtiene el n-ésimo número de Fibonacci (recursivo)
     * 
     * @param n la posición en la sucesión
     * @return el n-ésimo número de Fibonacci
     */
    public static long fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    /**
     * Obtiene el n-ésimo número de Fibonacci (optimizado con memoización)
     * 
     * @param n la posición en la sucesión
     * @param memo arreglo para almacenar resultados calculados
     * @return el n-ésimo número de Fibonacci
     */
    public static long fibonacciMemo(int n, long[] memo) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        
        if (memo[n] != -1) {
            return memo[n];
        }
        
        memo[n] = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
        return memo[n];
    }
    
    /**
     * Muestra la sucesión generada
     */
    public void mostrarSucesion() {
        System.out.println("\nSucesión de Fibonacci: ");
        System.out.print("[ ");
        for (int i = 0; i < sucesion.size(); i++) {
            System.out.print(sucesion.get(i));
            if (i < sucesion.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
    
    /**
     * Calcula estadísticas de la sucesión
     */
    public void mostrarEstadisticas() {
        if (sucesion.isEmpty()) return;
        
        System.out.println("\n--- Estadísticas ---");
        System.out.println("Cantidad de términos: " + sucesion.size());
        System.out.println("Primer término: " + sucesion.get(0));
        System.out.println("Último término: " + sucesion.get(sucesion.size() - 1));
        System.out.println("Suma total: " + calcularSuma());
        System.out.println("Promedio: " + (double) calcularSuma() / sucesion.size());
    }
    
    /**
     * Calcula la suma de la sucesión
     */
    private long calcularSuma() {
        long suma = 0;
        for (long numero : sucesion) {
            suma += numero;
        }
        return suma;
    }
    
    /**
     * Método principal
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== GENERADOR DE SUCESIÓN DE FIBONACCI ===\n");
            
            System.out.print("¿Cuántos términos desea generar? ");
            int n = scanner.nextInt();
            
            if (n < 1) {
                System.out.println("Error: Ingrese un número positivo");
                return;
            }
            
            Fibonacci fib = new Fibonacci();
            fib.generarFibonacciIterativo(n);
            
            fib.mostrarSucesion();
            fib.mostrarEstadisticas();
            
            System.out.println("\n--- Método Recursivo (primeros 10 términos) ---");
            for (int i = 0; i < Math.min(n, 10); i++) {
                System.out.println("F(" + i + ") = " + fibonacci(i));
            }
            
        } catch (Exception e) {
            System.out.println("Error: Ingrese un número entero válido");
        } finally {
            scanner.close();
        }
    }
}
