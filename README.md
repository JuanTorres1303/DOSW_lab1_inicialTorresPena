# LABORATORIO 1 - DOSW

## Estudiante: TorresCamilo
**Período Académico:** 2026-1
**Grupo:** G4

---

## Descripción del Laboratorio
Este laboratorio consiste en desarrollar una serie de retos que cubren conceptos fundamentales de programación en Java, incluyendo control de flujo, estructuras de datos, algoritmos y buenas prácticas de programación.

---

## Estructura del Proyecto

```
DOSW_lab1_inicialTorresPena/
└── laboratorio1/
    ├── reto1/
    │   ├── Estudiante.java
    │   ├── Main.java
    │   └── Mensaje.java
    ├── reto2/
    │   └── ParesImpares.java
    ├── reto3/
    │   └── Factorial.java
    ├── reto4/
    │   └── TablaMultiplicar.java
    ├── reto5/
    │   └── Fibonacci.java
    └── reto6/
        └── Palindromo.java
```

---

## Retos Desarrollados

### Reto 1: Información del Estudiante

**Descripción:**
Crear una clase para representar un estudiante con atributos como nombre, cedula e información académica. Crear un programa que muestre esta información en pantalla.

**Archivos:**
- `Estudiante.java` - Clase modelo para estudiante
- `Mensaje.java` - Clase para manejar mensajes
- `Main.java` - Programa principal

**Conceptos Aplicados:**
- Clases y objetos
- Atributos y métodos
- Encapsulación
- toString()

---

### Reto 2: Números Pares e Impares

**Descripción:**
Programa que solicita al usuario ingresar números enteros y los clasifica como pares o impares. Calcula estadísticas como suma y promedio de cada grupo.

**Archivo:** `ParesImpares.java`

**Funcionalidades:**
- Ingreso de múltiples números
- Clasificación automática de pares e impares
- Cálculo de suma y promedio
- Visualización de resultados

**Conceptos Aplicados:**
- Entrada de datos con Scanner
- Estructuras de control (if, for, while)
- Colecciones (ArrayList)
- Métodos y encapsulación
- Validación de datos

**Ejemplo de Uso:**
```
Ingrese números enteros (0 para terminar):
Número: 5
Número: 12
Número: 8
Número: 0

Total de números PARES: 2
Total de números IMPARES: 1
```

---

### Reto 3: Cálculo de Factorial

**Descripción:**
Programa que calcula el factorial de un número. Implementa dos enfoques: iterativo y recursivo. Muestra el proceso de cálculo.

**Archivo:** `Factorial.java`

**Funcionalidades:**
- Cálculo iterativo del factorial
- Cálculo recursivo del factorial
- Visualización del proceso (n! = n × (n-1) × ... × 1)
- Manejo de casos especiales (0! = 1, 1! = 1)

**Conceptos Aplicados:**
- Recursividad
- Iteración
- Manejo de excepciones
- Métodos estáticos
- Validación de entrada

**Ejemplo de Uso:**
```
Ingrese un número entero positivo: 5

Proceso del Cálculo:
5! = 5 × 4 × 3 × 2 × 1 = 120

Método Iterativo: 5! = 120
Método Recursivo: 5! = 120
```

---

### Reto 4: Tabla de Multiplicar

**Estado:** ⏸️ No implementado en este repositorio (se realiza por separado)

**Descripción:**
Genera la tabla de multiplicar de un número especificado por el usuario. Muestra los resultados en formato simple y formateado.

**Nota:** Este reto se realiza de forma independiente y no está incluido en este laboratorio.

---

### Reto 5: Sucesión de Fibonacci

**Descripción:**
Genera la sucesión de Fibonacci hasta una cantidad especificada de términos. Implementa métodos iterativo y recursivo.

**Archivo:** `Fibonacci.java`

**Funcionalidades:**
- Generación iterativa de la sucesión
- Cálculo recursivo individual
- Estadísticas (suma, promedio, primero, último)
- Visualización de la sucesión completa

**Conceptos Aplicados:**
- Sucesiones matemáticas
- Recursividad y optimización
- Colecciones (ArrayList)
- Cálculos estadísticos
- Memoización

**Ejemplo de Uso:**
```
¿Cuántos términos desea generar? 10

Sucesión de Fibonacci:
[ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ]

Cantidad de términos: 10
Suma total: 88
Promedio: 8.8
```

---

### Reto 6: Validación de Palíndromos

**Descripción:**
Valida si una palabra, frase o número es un palíndromo. Un palíndromo se lee igual hacia adelante y hacia atrás.

**Archivo:** `Palindromo.java`

**Funcionalidades:**
- Validación de palabras
- Validación de frases (ignorando espacios y puntuación)
- Validación de números
- Búsqueda de palíndromos en un rango numérico
- Análisis detallado con comparación caractér por caractér
- Menú interactivo

**Conceptos Aplicados:**
- Manipulación de cadenas (String)
- Expresiones regulares
- Recursividad vs iteración
- Estructuras de control
- Menús interactivos

**Ejemplo de Uso:**
```
Ingrese una palabra: radar
¿Es palíndromo? true

Ingrese una frase: A man, a plan, a canal: Panama
¿Es palíndromo? true
```

---

## Resumen de Aprendizajes

### Conceptos Fundamentales
- **Programación Orientada a Objetos:** Clases, objetos, encapsulación
- **Estructuras de Control:** if/else, for, while, do-while
- **Colecciones:** ArrayList, List
- **Métodos:** Parámetros, retorno de valores, sobrecarga
- **Recursividad:** Implementación y optimización

### Técnicas Avanzadas
- **Validación de Datos:** Manejo de excepciones
- **Manipulación de Cadenas:** StringBuilder, expresiones regulares
- **Cálculos Matemáticos:** Factorial, Fibonacci, operaciones aritméticas
- **Formato de Salida:** printf, formatos visuales

### Buenas Prácticas
- Documentación con Javadoc
- Nombres significativos de variables y métodos
- Encapsulación y reutilización de código
- Manejo seguro de excepciones
- Validación robusta de entrada

---

### Compilación y Ejecución

**Compilar todos los retos**
```bash
javac laboratorio1/reto1/*.java
javac laboratorio1/reto2/*.java
javac laboratorio1/reto3/*.java
javac laboratorio1/reto5/*.java
javac laboratorio1/reto6/*.java
```

**Ejecutar cada reto**
```bash
java laboratorio1.reto1.Main
java laboratorio1.reto2.ParesImpares
java laboratorio1.reto3.Factorial
java laboratorio1.reto5.Fibonacci
java laboratorio1.reto6.Palindromo
```

---

## Conclusiones

Este laboratorio ha proporcionado experiencia práctica en:

1. **Programación Fundamental:** Desarrollo de programas en Java desde cero
2. **Algoritmos:** Implementación de algoritmos clásicos (factorial, Fibonacci)
3. **Estructuras de Datos:** Uso de colecciones y Arrays
4. **Validación:** Técnicas de validación robusta de datos
5. **Documentación:** Código bien comentado y documentado

Todos los retos han sido completados exitosamente con código funcional, bien documentado y siguiendo mejores prácticas de programación en Java.

---

**Estudiante:** TorresCamilo  
**Período:** 2026-1  
**Grupo:** G4  
**Fecha de Finalización:** 2026-02-04

---

## Estructura del Repositorio

```
DOSW_lab1_inicialTorresPena/
├── README.md                 # Este archivo
├── reto-2/                   # Implementación del reto 2
├── reto-3/                   # Implementación del reto 3
└── reto-5/                   # Implementación del reto 5
```


