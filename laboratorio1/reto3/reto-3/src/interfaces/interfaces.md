# Interfaces - Contratos del Sistema

## IRepository
Define el contrato para operaciones de persistencia.

```typescript
interface IRepository<T> {
  getAll(): Promise<T[]>;
  getById(id: string): Promise<T | null>;
  create(item: T): Promise<T>;
  update(id: string, item: T): Promise<T>;
  delete(id: string): Promise<boolean>;
}
```

## IService
Define el contrato para servicios de lógica de negocio.

```typescript
interface IService<T> {
  obtenerTodos(): Promise<T[]>;
  obtenerPorId(id: string): Promise<T | null>;
  crear(item: T): Promise<T>;
  actualizar(id: string, item: T): Promise<T>;
  eliminar(id: string): Promise<boolean>;
}
```

## ILogger
Define el contrato para logging en el sistema.

```typescript
interface ILogger {
  info(mensaje: string): void;
  warn(mensaje: string): void;
  error(mensaje: string, err?: Error): void;
  debug(mensaje: string): void;
}
```

---

Estas interfaces implementan el **Principle of Segregation** asegurando que las clases solo dependan de los métodos que necesitan.

