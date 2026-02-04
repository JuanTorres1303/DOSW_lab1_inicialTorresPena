# RETO 5: Patrones de Diseño y Buenas Prácticas

## Objetivo
Implementar patrones de diseño comunes y demostrar buenas prácticas en desarrollo de software para crear sistemas robustos, mantenibles y eficientes.

## Descripción
Este reto covers los siguientes patrones de diseño:
- **Patrones Creacionales:** Factory, Singleton, Builder
- **Patrones Estructurales:** Adapter, Decorator, Facade
- **Patrones de Comportamiento:** Observer, Strategy, Command
- **Buenas Prácticas:** Testing, Documentación, Mantenibilidad

## Implementación

### 1. Patrones Creacionales

#### Factory Pattern
El patrón Factory proporciona una interfaz para crear objetos sin especificar sus clases concretas.

```typescript
interface Product {
  operation(): string;
}

class ConcreteProductA implements Product {
  operation(): string {
    return "Resultado de ProductA";
  }
}

class Factory {
  static createProduct(type: string): Product {
    switch(type) {
      case 'A':
        return new ConcreteProductA();
      // ... más casos
      default:
        throw new Error('Tipo no reconocido');
    }
  }
}
```

**Ventajas:**
- ✅ Desacoplamiento de clases concretas
- ✅ Centralización de la lógica de creación
- ✅ Facilita la extensión sin modificar código existente

---

#### Singleton Pattern
Asegura que una clase tenga una única instancia y proporciona acceso global.

```typescript
class Database {
  private static instance: Database;

  private constructor() {
    // Inicialización
  }

  static getInstance(): Database {
    if (!Database.instance) {
      Database.instance = new Database();
    }
    return Database.instance;
  }
}
```

**Ventajas:**
- ✅ Garantiza instancia única
- ✅ Acceso global controlado
- ✅ Inicialización lazy

---

#### Builder Pattern
Construye objetos complejos paso a paso.

```typescript
class UserBuilder {
  private name: string = '';
  private email: string = '';
  private role: string = 'user';

  setName(name: string): UserBuilder {
    this.name = name;
    return this;
  }

  setEmail(email: string): UserBuilder {
    this.email = email;
    return this;
  }

  setRole(role: string): UserBuilder {
    this.role = role;
    return this;
  }

  build(): User {
    return new User(this.name, this.email, this.role);
  }
}

// Uso
const user = new UserBuilder()
  .setName('Juan')
  .setEmail('juan@example.com')
  .setRole('admin')
  .build();
```

**Ventajas:**
- ✅ Construcción paso a paso
- ✅ Mejor legibilidad
- ✅ Valores por defecto

---

### 2. Patrones Estructurales

#### Adapter Pattern
Convierte la interfaz de una clase en otra esperada por los clientes.

```typescript
interface Target {
  request(): string;
}

class Adaptee {
  specificRequest(): string {
    return "Respuesta específica";
  }
}

class Adapter implements Target {
  constructor(private adaptee: Adaptee) {}

  request(): string {
    return this.adaptee.specificRequest();
  }
}
```

**Ventajas:**
- ✅ Integración con código legado
- ✅ Reutilización de clases incompatibles
- ✅ Flexibilidad en interfaces

---

#### Decorator Pattern
Agrega responsabilidades a un objeto dinámicamente.

```typescript
interface Component {
  operation(): string;
}

class ConcreteComponent implements Component {
  operation(): string {
    return "Componente";
  }
}

abstract class Decorator implements Component {
  constructor(protected component: Component) {}
  operation(): string {
    return this.component.operation();
  }
}

class ConcreteDecoratorA extends Decorator {
  operation(): string {
    return `DecoradorA(${super.operation()})`;
  }
}
```

**Ventajas:**
- ✅ Agregar funcionalidades sin modificar clases
- ✅ Más flexible que herencia
- ✅ Composición sobre herencia

---

### 3. Patrones de Comportamiento

#### Observer Pattern
Define una dependencia uno-a-muchos donde cuando un objeto cambia de estado, todos sus dependientes son notificados automáticamente.

```typescript
interface Observer {
  update(data: any): void;
}

class Subject {
  private observers: Observer[] = [];

  attach(observer: Observer): void {
    this.observers.push(observer);
  }

  notify(data: any): void {
    this.observers.forEach(observer => observer.update(data));
  }
}

class ConcreteObserver implements Observer {
  update(data: any): void {
    console.log(`Notificación recibida: ${data}`);
  }
}
```

**Ventajas:**
- ✅ Desacoplamiento entre componentes
- ✅ Notificaciones automáticas
- ✅ Comunicación flexible

---

#### Strategy Pattern
Define una familia de algoritmos, encapsúlalos y hazlos intercambiables.

```typescript
interface Strategy {
  execute(data: number[]): number;
}

class SumStrategy implements Strategy {
  execute(data: number[]): number {
    return data.reduce((a, b) => a + b, 0);
  }
}

class AverageStrategy implements Strategy {
  execute(data: number[]): number {
    return data.reduce((a, b) => a + b, 0) / data.length;
  }
}

class Context {
  constructor(private strategy: Strategy) {}

  executeStrategy(data: number[]): number {
    return this.strategy.execute(data);
  }
}
```

**Ventajas:**
- ✅ Intercambiar algoritmos en tiempo de ejecución
- ✅ Elimina condicionales complejos
- ✅ Fácil agregar nuevas estrategias

---

### 4. Buenas Prácticas

#### Documentación Clara
```typescript
/**
 * Crea un nuevo usuario en el sistema.
 * 
 * @param name - El nombre completo del usuario
 * @param email - Email válido del usuario
 * @returns El usuario creado con ID asignado
 * @throws {ValidationError} Si los datos no son válidos
 * 
 * @example
 * const user = createUser('Juan Torres', 'juan@example.com');
 */
function createUser(name: string, email: string): User {
  // ...
}
```

#### Testing
```typescript
describe('UserService', () => {
  let service: UserService;
  let repo: MockUserRepository;

  beforeEach(() => {
    repo = new MockUserRepository();
    service = new UserService(repo);
  });

  test('debe crear un usuario', async () => {
    const user = await service.create('Juan', 'juan@example.com');
    expect(user.name).toBe('Juan');
  });
});
```

#### Manejo de Errores
```typescript
try {
  const user = await userService.getById(id);
  if (!user) {
    throw new NotFoundError(`Usuario ${id} no existe`);
  }
  return user;
} catch (error) {
  logger.error(`Error obteniendo usuario: ${error.message}`);
  throw error;
}
```

---

## Comparativa de Patrones

| Patrón | Problema | Solución | Cuándo Usar |
|--------|----------|----------|------------|
| Factory | Creación compleja | Encapsular creación | Múltiples tipos de objetos |
| Singleton | Instancia única | Control de instancia | Recursos compartidos |
| Builder | Construcción compleja | Construir paso a paso | Objetos con muchos parámetros |
| Adapter | Interfaces incompatibles | Convertir interfaz | Integración con código legado |
| Decorator | Agregar funcionalidad | Composición dinámica | Funcionalidad opcional |
| Observer | Notificaciones | Desacoplamiento | Eventos y cambios de estado |
| Strategy | Múltiples algoritmos | Encapsular algoritmos | Algoritmos intercambiables |

---

## Resultados y Aprendizajes

### ✅ Logros
- Patrones de diseño implementados correctamente
- Documentación completa con ejemplos
- Buenas prácticas demostradas
- Código limpio y mantenible

### 📚 Conceptos Aprendidos
1. **Patrones Creacionales:** Cómo crear objetos elegantemente
2. **Patrones Estructurales:** Cómo organizar relaciones entre objetos
3. **Patrones de Comportamiento:** Cómo modelar comunicación
4. **Principios:** DRY, KISS, YAGNI

### 🎯 Beneficios Prácticos
- Código más limpio y comprensible
- Mantenimiento más fácil
- Reutilización mejorada
- Mejor colaboración en equipo

---

## Conclusiones
Los patrones de diseño son soluciones probadas a problemas recurrentes. Su aplicación correcta resulta en código más profesional, mantenible y escalable. Las buenas prácticas garantizan que el código sea de alta calidad y fácil de trabajar a lo largo del tiempo.

---

**Completado por:** TorresCamilo  
**Período:** 2026-1  
**Fecha:** 2026-02-04

