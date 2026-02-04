# Buenas Prácticas: Documentación

## Importancia de la Documentación

Una buena documentación es esencial para:
- Facilitar el mantenimiento del código
- Onboarding de nuevos desarrolladores
- Reducir el tiempo de comprensión del código
- Crear referencias para decisiones de diseño

## Estándares de Documentación

### 1. Comentarios en Código (JSDoc/TypeDoc)

```typescript
/**
 * Crea un nuevo usuario en el sistema.
 * 
 * Esta función valida los datos de entrada y persiste el usuario
 * en la base de datos. Si el email ya existe, rechaza la operación.
 * 
 * @param userData - Los datos del usuario a crear
 * @param userData.name - Nombre completo (requerido, 2-100 caracteres)
 * @param userData.email - Email único (requerido, debe ser válido)
 * @param userData.role - Rol del usuario (opcional, default: 'user')
 * 
 * @returns Promise<User> - Usuario creado con ID asignado
 * 
 * @throws {ValidationError} Si los datos no cumplen requisitos
 * @throws {DuplicateEmailError} Si el email ya existe
 * @throws {DatabaseError} Si hay error al persistir
 * 
 * @example
 * // Crear un usuario administrador
 * const user = await createUser({
 *   name: 'Juan Torres',
 *   email: 'juan@example.com',
 *   role: 'admin'
 * });
 * console.log(user.id); // 12345
 */
async function createUser(userData: CreateUserDTO): Promise<User> {
  // Implementación...
}
```

### 2. README Documentación

Un README bien estructurado debe incluir:
- Descripción del proyecto
- Cómo instalar/configurar
- Cómo usar
- Estructura del proyecto
- Contribuciones

### 3. Inline Comments para Lógica Compleja

```typescript
// Calcular el precio final con descuentos escalonados
// Si cantidad > 100: 10% descuento
// Si cantidad > 50: 5% descuento
const discount = quantity > 100 ? 0.10 : quantity > 50 ? 0.05 : 0;
const finalPrice = basePrice * quantity * (1 - discount);
```

## Evitar Documentación Innecesaria

```typescript
// ❌ Malo: documentación obvia
/**
 * Obtiene el nombre
 * @return el nombre
 */
getName(): string {
  return this.name;
}

// ✅ Bueno: código que se documenta a sí mismo
getName(): string {
  return this.name;
}
```

---

**Conclusión:** La documentación clara y concisa mejora significativamente la calidad del proyecto.

