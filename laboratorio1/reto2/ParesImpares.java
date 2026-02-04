package laboratorio1.reto2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Reto 2: Números Pares e Impares
 * 
 * Descripción: Este programa solicita al usuario ingresar números enteros
 * y los clasifica como pares o impares. Muestra la cantidad total de cada tipo
 * y proporciona un resumen estadístico.
 * 
 * @author TorresCamilo
 * @version 1.0
 */
public class ParesImpares {
    
    private List<Integer> numeros;
    private List<Integer> pares;
    private List<Integer> impares;
    
    /**
     * Constructor que inicializa las listas
     */
    public ParesImpares() {
        this.numeros = new ArrayList<>();
        this.pares = new ArrayList<>();
        this.impares = new ArrayList<>();
    }
    
    /**
     * Ingresa números del usuario hasta que ingrese 0
     */
    public void ingresarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== CLASIFICADOR DE NÚMEROS PARES E IMPARES ===\n");
        System.out.println("Ingrese números enteros (0 para terminar):");
        
        int numero;
        do {
            try {
                System.out.print("Número: ");
                numero = scanner.nextInt();
                
                if (numero != 0) {
                    numeros.add(numero);
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese un número entero válido");
                scanner.nextLine();
                numero = -1;
            }
        } while (numero != 0);
    }
    
    /**
     * Clasifica los números en pares e impares
     */
    public void clasificarNumeros() {
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
    }
    
    /**
     * Muestra los resultados de la clasificación
     */
    public void mostrarResultados() {
        System.out.println("\n=== RESULTADOS ===\n");
        
        System.out.println("Total de números ingresados: " + numeros.size());
        System.out.println("Total de números PARES: " + pares.size());
        System.out.println("Total de números IMPARES: " + impares.size());
        
        System.out.println("\nNúmeros PARES: ");
        if (pares.isEmpty()) {
            System.out.println("  No hay números pares");
        } else {
            System.out.println("  " + pares);
            System.out.println("  Suma: " + calcularSuma(pares));
            System.out.println("  Promedio: " + calcularPromedio(pares));
        }
        
        System.out.println("\nNúmeros IMPARES: ");
        if (impares.isEmpty()) {
            System.out.println("  No hay números impares");
        } else {
            System.out.println("  " + impares);
            System.out.println("  Suma: " + calcularSuma(impares));
            System.out.println("  Promedio: " + calcularPromedio(impares));
        }
    }
    
    /**
     * Calcula la suma de una lista de números
     */
    private int calcularSuma(List<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }
    
    /**
     * Calcula el promedio de una lista de números
     */
    private double calcularPromedio(List<Integer> lista) {
        if (lista.isEmpty()) return 0;
        return (double) calcularSuma(lista) / lista.size();
    }
    
    /**
     * Método principal
     */
    public static void main(String[] args) {
        ParesImpares programa = new ParesImpares();
        programa.ingresarNumeros();
        programa.clasificarNumeros();
        programa.mostrarResultados();
    }
}
