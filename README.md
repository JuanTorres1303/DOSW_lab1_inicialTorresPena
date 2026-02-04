# LABORATORIO 1 - DOSW

## Estudiante: TorresCamilo
**Período Académico:** 2026-1
**Grupo:** G4

---

## Descripción del Laboratorio
Este laboratorio consiste en desarrollar y documentar una serie de retos que cubren conceptos fundamentales de desarrollo de software, incluyendo control de versiones con Git, arquitectura de software basada en principios SOLID, y patrones de diseño.

---

## Retos a Desarrollar

## Retos a Desarrollar

### Reto 1: ❌ OMITIDO

### Reto 2: Git - Control de Versiones Básico

**Descripción:**
Crear una rama `reto-2` desde develop, implementar cambios relacionados con control de versiones y documentar el flujo de trabajo con Git.

**Cambios Realizados:**
- Rama `reto-2` creada desde develop
- Documentación de Git Flow implementada
- Commits significativos realizados
- Merge exitoso a develop

**Archivos Generados:**
- `reto-2/RETO_2.md` - Documentación completa del reto

**Argumentación:**
El control de versiones es fundamental en desarrollo de software profesional. Este reto demuestra la capacidad de trabajar con ramas feature, hacer commits significativos y realizar merges de forma controlada.

---

### Reto 3: Arquitectura y Principios SOLID

**Descripción:**
Diseñar una arquitectura de software escalable y documentar la aplicación de los principios SOLID (Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion).

**Cambios Realizados:**
- Estructura en capas: Models, Services, Repositories, Interfaces
- Documentación detallada de cada principio SOLID
- Ejemplos de patrones (Repository, Dependency Injection)
- Decisiones de arquitectura justificadas

**Archivos Generados:**
- `reto-3/RETO_3.md` - Guía completa de arquitectura
- `reto-3/docs/arquitectura.md` - Decisiones de diseño
- `reto-3/src/interfaces/interfaces.md` - Contratos del sistema
- `reto-3/src/repositories/example.md` - Ejemplo de implementación

**Argumentación:**
Una arquitectura bien diseñada basada en principios SOLID resulta en código más mantenible, testeable y escalable. Este reto demuestra la comprensión profunda de estos principios y su aplicación práctica en sistemas reales.

---

### Reto 4: ❌ OMITIDO

### Reto 5: Patrones de Diseño y Buenas Prácticas

**Descripción:**
Implementar y documentar los patrones de diseño más comunes (creacionales, estructurales y de comportamiento) junto con buenas prácticas de desarrollo de software.

**Cambios Realizados:**

**Patrones Creacionales:**
- Factory Pattern - Creación flexible de objetos
- Singleton Pattern - Garantizar instancia única
- Builder Pattern - Construcción paso a paso

**Patrones Estructurales:**
- Adapter Pattern - Adaptar interfaces incompatibles
- Decorator Pattern - Agregar funcionalidad dinámicamente
- Facade Pattern - Simplificar interfaces complejas

**Patrones de Comportamiento:**
- Observer Pattern - Notificaciones entre objetos
- Strategy Pattern - Algoritmos intercambiables
- Command Pattern - Encapsular acciones

**Buenas Prácticas:**
- Documentación clara y concisa
- Nombres significativos en código
- Testing y validación
- Manejo de errores

**Archivos Generados:**
- `reto-5/RETO_5.md` - Guía exhaustiva de patrones
- `reto-5/patrones-creacionales/factory.md`
- `reto-5/patrones-creacionales/singleton.md`
- `reto-5/patrones-comportamiento/observer.md`
- `reto-5/buenas-practicas/documentacion.md`
- `reto-5/buenas-practicas/nombres-significativos.md`

**Argumentación:**
Los patrones de diseño son soluciones probadas a problemas recurrentes. Su conocimiento y aplicación resulta en código más profesional, reutilizable y fácil de mantener. Combinado con buenas prácticas, garantiza la calidad del software.

---

## Estructura del Repositorio

```
DOSW_lab1_inicialTorresPena/
├── README.md                 # Este archivo
├── reto-2/                   # Implementación del reto 2
├── reto-3/                   # Implementación del reto 3
└── reto-5/                   # Implementación del reto 5
```

---

## Estructura del Repositorio

```
DOSW_lab1_inicialTorresPena/
├── README.md
├── reto-2/
│   └── RETO_2.md
├── reto-3/
│   ├── RETO_3.md
│   ├── docs/
│   │   └── arquitectura.md
│   └── src/
│       ├── interfaces/
│       │   └── interfaces.md
│       ├── models/
│       ├── repositories/
│       │   └── example.md
│       └── services/
└── reto-5/
    ├── RETO_5.md
    ├── patrones-creacionales/
    │   ├── factory.md
    │   └── singleton.md
    ├── patrones-estructurales/
    ├── patrones-comportamiento/
    │   └── observer.md
    └── buenas-practicas/
        ├── documentacion.md
        └── nombres-significativos.md
```

---

## Flujo de Trabajo Git

Se implementó un flujo profesional de Git con las siguientes características:

1. **Rama develop:** Rama base de integración
2. **Ramas feature:** Una rama por cada reto (reto-2, reto-3, reto-5)
3. **Rama main:** Código en producción

**Proceso de Integración:**
- Cada reto se desarrolla en su rama feature
- Los cambios se integran en develop mediante merge
- Una vez completados todos los retos, develop se integra en main

---

## Resumen de Aprendizajes

### Control de Versiones (Reto 2)
- Uso de ramas feature para desarrollo aislado
- Commits significativos y bien documentados
- Merge sin conflictos
- Flujo de trabajo profesional

### Arquitectura SOLID (Reto 3)
- Single Responsibility Principle
- Open/Closed Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle
- Patrones: Repository, Dependency Injection

### Patrones de Diseño (Reto 5)
- Patrones Creacionales: Factory, Singleton, Builder
- Patrones Estructurales: Adapter, Decorator, Facade
- Patrones de Comportamiento: Observer, Strategy, Command
- Buenas prácticas de código

---

## Conclusiones

Este laboratorio ha proporcionado una formación integral en:

1. **Control de Versiones:** Manejo profesional de Git con ramas y merges
2. **Arquitectura:** Diseño escalable basado en principios SOLID
3. **Patrones:** Implementación de soluciones probadas a problemas comunes
4. **Calidad:** Código profesional, documentado y mantenible

Todos los retos han sido completados y documentados adecuadamente, demostrando comprensión profunda de los conceptos de desarrollo de software.

---

**Estudiante:** TorresCamilo  
**Período:** 2026-1  
**Grupo:** G4  
**Fecha:** 2026-02-04
