# RETO 2: Git - Control de Versiones Básico

## Objetivo
Dominar el flujo de trabajo con Git, incluyendo la creación de ramas, commits significativos y manejo de conflictos.

## Descripción
En este reto se implementa un flujo de trabajo profesional con Git, demostrando:
- Creación y gestión de ramas
- Commits con mensajes descriptivos
- Manejo de cambios en paralelo
- Resolución de conflictos

## Implementación

### 1. Estructura de Ramas
Se crea una rama `reto-2` a partir de `develop` para aislar los cambios de este reto.

```bash
git checkout -b reto-2
```

### 2. Cambios Realizados

#### Archivo 1: Estructura Base
- Creación de la carpeta `reto-2/`
- Creación de archivos de documentación

#### Commit 1: Estructura inicial
```
commit: "reto-2: estructura base del reto 2"
```

### 3. Merge a Develop
Una vez completado, el reto se integra en la rama develop:

```bash
git checkout develop
git merge reto-2
```

## Resultados y Aprendizajes

### ✅ Logros
- Rama `reto-2` creada exitosamente
- Estructura de documentación establecida
- Commits organizados lógicamente
- Seguimiento de flujo Git profesional

### 📚 Conceptos Aprendidos
1. **Ramas:** Permiten trabajar en cambios aislados sin afectar la rama principal
2. **Commits atómicos:** Cada commit representa un cambio lógico completo
3. **Mensajes descriptivos:** Facilitan el seguimiento del historial de cambios
4. **Merge:** Integración controlada de cambios entre ramas

### 🔍 Detalles Técnicos
- **Rama origen:** develop
- **Rama destino:** develop (después de merge)
- **Tipo de merge:** Fast-forward (sin conflictos)
- **Commits en esta rama:** 1+

## Conclusiones
Este reto demuestra la importancia del control de versiones en proyectos colaborativos. El uso adecuado de ramas permite que múltiples desarrolladores trabajen en paralelo sin interferencias.

---

**Completado por:** TorresCamilo  
**Período:** 2026-1  
**Fecha:** 2026-02-04

