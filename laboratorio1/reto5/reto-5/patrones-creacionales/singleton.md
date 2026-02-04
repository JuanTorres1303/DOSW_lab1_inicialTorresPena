# Singleton Pattern - Ejemplo Implementado

## Descripción
El Singleton Pattern asegura que una clase tenga una única instancia y proporciona un punto de acceso global a ella.

## Ejemplo: Gestor de Configuración

```typescript
class ConfigurationManager {
  private static instance: ConfigurationManager;
  private config: Map<string, string> = new Map();
  private initialized: boolean = false;

  // Constructor privado previene instanciación
  private constructor() {}

  // Método estático para obtener la instancia
  static getInstance(): ConfigurationManager {
    if (!ConfigurationManager.instance) {
      ConfigurationManager.instance = new ConfigurationManager();
    }
    return ConfigurationManager.instance;
  }

  // Métodos de configuración
  set(key: string, value: string): void {
    if (this.initialized) {
      throw new Error("Configuración ya inicializada, no puede ser modificada");
    }
    this.config.set(key, value);
  }

  get(key: string): string | undefined {
    return this.config.get(key);
  }

  initialize(): void {
    this.initialized = true;
  }

  isInitialized(): boolean {
    return this.initialized;
  }
}
```

## Uso
```typescript
// Uso seguro
const config1 = ConfigurationManager.getInstance();
const config2 = ConfigurationManager.getInstance();

// Ambas referencias apuntan a la misma instancia
console.log(config1 === config2); // true

config1.set('database_url', 'localhost:5432');
console.log(config2.get('database_url')); // localhost:5432
```

## Ventajas Demostradas
- ✅ **Instancia Única:** Garantiza una sola instancia
- ✅ **Acceso Global:** Fácil de acceder desde cualquier lugar
- ✅ **Lazy Initialization:** Se crea solo cuando se necesita
- ✅ **Control de Estado:** Gestión centralizada

## Cuidados
- ⚠️ Puede hacer el testing más difícil (necesita reset entre tests)
- ⚠️ Problemas en aplicaciones multihilo (requiere sincronización)
- ⚠️ Ocultador de dependencias

---

**Patrón:** Creacional  
**Propósito:** Garantizar una única instancia

