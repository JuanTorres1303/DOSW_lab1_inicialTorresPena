# Buenas Prácticas: Nombres Significativos

## Importancia de los Nombres

Los nombres son importantes porque:
- El código se lee más de lo que se escribe
- Los nombres claros reducen la necesidad de documentación
- Mejoran la comprensión del código
- Facilitan el mantenimiento

## Reglas para Nombres Significativos

### 1. Variables y Funciones

```typescript
// ❌ Malo: nombres no descriptivos
const d = new Date();
const hl = [];
function calc(x) {
  return x * 0.15;
}

// ✅ Bueno: nombres claros y descriptivos
const currentDate = new Date();
const highlightedLines = [];
function calculateTax(amount: number): number {
  return amount * 0.15;
}
```

### 2. Evitar Información Redundante

```typescript
// ❌ Malo: redundancia
class UserData {
  userDataName: string;
  userData_email: string;
  userData_phone: string;
}

// ✅ Bueno: nombre claro del contexto
class User {
  name: string;
  email: string;
  phone: string;
}
```

### 3. Usar Palabras Pronunciables

```typescript
// ❌ Malo: difícil de pronunciar
const yyyymmdstr = moment().format('YYYY/MM/DD');

// ✅ Bueno: claro y pronunciable
const formattedDate = moment().format('YYYY/MM/DD');
```

### 4. Nombres de Funciones Descriptivos

```typescript
// ❌ Malo: no indica qué hace
function process(data) {
  // ...
}

// ✅ Bueno: nombre descriptivo
function validateAndFormatUserEmail(rawEmail: string): string {
  // ...
}
```

### 5. Evitar Comentarios Innecesarios

```typescript
// ❌ Malo: código + comentarios redundantes
// incrementar contador
counter++;

// ✅ Bueno: código auto-explicativo
incrementRequestCounter();
```

## Contexto y Longitud

```typescript
// Nombres cortos OK en contextos claros
array.map((user) => user.name);

// Nombres largos cuando es necesario
function getUserWithRelationsAndPermissions(userId: string): Promise<UserWithMetadata> {
  // ...
}
```

---

**Conclusión:** Invertir tiempo en nombres significativos mejora enormemente la legibilidad y mantenibilidad del código.

