package laboratorio1.reto4;

import java.util.*;

/**
 * Reto 4: El tesoro de las llaves duplicadas
 * 
 * Descripcion:
 * Este programa trabaja con estructuras de datos Map en Java,
 * especificamente HashMap y Hashtable. El objetivo es almacenar
 * pares clave valor ignorando claves duplicadas, combinar ambos
 * mapas priorizando los valores del Hashtable en caso de conflicto,
 * convertir las claves a mayusculas y mostrar el resultado ordenado
 * de forma ascendente.
 * 
 * Se hace uso de programacion funcional mediante lambdas y streams
 * para procesar, ordenar e imprimir la informacion de manera eficiente.
 * 
 * @author PenaHildebrando
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class reto4 {
    
    static class Par {
        String clave;
        Integer valor;
        
        public Par(String clave, Integer valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }
    
    public static HashMap<String, Integer> crearHashMap(List<Par> listaPares) {
        HashMap<String, Integer> mapa = new HashMap<>();
        
        for (Par par : listaPares) {
            if (!mapa.containsKey(par.clave)) {
                mapa.put(par.clave, par.valor);
            }
        }
        
        return mapa;
    }
    
    public static Hashtable<String, Integer> crearHashtable(List<Par> listaPares) {
        Hashtable<String, Integer> tabla = new Hashtable<>();
        
        for (Par par : listaPares) {
            if (!tabla.containsKey(par.clave)) {
                tabla.put(par.clave, par.valor);
            }
        }
        
        return tabla;
    }
    
    public static HashMap<String, Integer> combinarMapas(HashMap<String, Integer> hashMap, Hashtable<String, Integer> hashTable) {
        HashMap<String, Integer> resultado = new HashMap<>(hashMap);
        hashTable.forEach((clave, valor) -> resultado.put(clave, valor));
        return resultado;
    }
    
    public static void imprimirMayusculas(HashMap<String, Integer> mapa) {
        mapa.forEach((clave, valor) -> {
            System.out.println("Clave: " + clave.toUpperCase() + " | Valor: " + valor);
        });
    }
    
    public static void imprimirOrdenado(HashMap<String, Integer> mapa) {
        mapa.entrySet().stream()
            .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
            .forEach(entry -> {
                System.out.println("Clave: " + entry.getKey() + " | Valor: " + entry.getValue());
            });
    }
    
    public static void procesarTesoro(HashMap<String, Integer> hashMap, Hashtable<String, Integer> hashTable) {
        Map<String, Integer> resultado = hashMap.entrySet().stream()
            .collect(Collectors.toMap(
                entry -> entry.getKey(),
                entry -> entry.getValue()
            ));
        
        hashTable.forEach((clave, valor) -> resultado.put(clave, valor));
        
        resultado.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> {
                System.out.println("Clave: " + entry.getKey().toUpperCase() + " | Valor: " + entry.getValue());
            });
    }
} 
