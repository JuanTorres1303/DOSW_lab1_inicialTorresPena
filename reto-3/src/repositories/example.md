# Ejemplo de Implementación - Repositorio de Usuarios

Este archivo demuestra la aplicación práctica de los principios SOLID.

## Interfaz (IRepository)
```typescript
interface IUserRepository {
  getAll(): Promise<User[]>;
  getById(id: string): Promise<User | null>;
  create(user: User): Promise<User>;
  update(id: string, user: User): Promise<User>;
  delete(id: string): Promise<boolean>;
}
```

## Implementación Concreta
```typescript
class UserRepository implements IUserRepository {
  constructor(private db: Database) {}

  async getAll(): Promise<User[]> {
    return this.db.query('SELECT * FROM users');
  }

  async getById(id: string): Promise<User | null> {
    return this.db.query('SELECT * FROM users WHERE id = ?', [id]);
  }

  async create(user: User): Promise<User> {
    const result = await this.db.execute(
      'INSERT INTO users (name, email) VALUES (?, ?)',
      [user.name, user.email]
    );
    return { ...user, id: result.insertId };
  }

  async update(id: string, user: User): Promise<User> {
    await this.db.execute(
      'UPDATE users SET name = ?, email = ? WHERE id = ?',
      [user.name, user.email, id]
    );
    return { ...user, id };
  }

  async delete(id: string): Promise<boolean> {
    const result = await this.db.execute(
      'DELETE FROM users WHERE id = ?',
      [id]
    );
    return result.affectedRows > 0;
  }
}
```

## Ventajas de este Diseño

1. **DIP - Dependency Inversion:** El código cliente depende de la interfaz, no de la implementación
2. **SRP - Single Responsibility:** UserRepository solo maneja acceso a datos de usuarios
3. **OCP - Open/Closed:** Se puede crear nuevas implementaciones sin modificar la existente
4. **LSP - Liskov Substitution:** Se puede usar cualquier implementación de IUserRepository
5. **ISP - Interface Segregation:** La interfaz solo expone métodos necesarios

## Inyección de Dependencias

```typescript
// Sin inyección (acoplado)
class UserService {
  private repo = new UserRepository(new Database());
}

// Con inyección (desacoplado)
class UserService {
  constructor(private repo: IUserRepository) {}
}
```

---

**Principio:** Un buen diseño hace el código flexible, testeable y mantenible.

