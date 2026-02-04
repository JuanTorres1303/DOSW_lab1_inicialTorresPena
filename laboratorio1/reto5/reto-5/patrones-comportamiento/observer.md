# Observer Pattern - Ejemplo Implementado

## Descripción
El Observer Pattern define una dependencia uno-a-muchos entre objetos. Cuando el estado de un objeto cambia, todos sus observadores son notificados automáticamente.

## Ejemplo: Sistema de Notificaciones de Eventos

```typescript
// Interfaz del observador
interface EventListener {
  update(event: Event): void;
}

// Interfaz del evento
interface Event {
  type: string;
  data: any;
  timestamp: Date;
}

// Sujeto que notifica cambios
class EventDispatcher {
  private listeners: Map<string, EventListener[]> = new Map();

  // Agregar observador para un tipo de evento
  on(eventType: string, listener: EventListener): void {
    if (!this.listeners.has(eventType)) {
      this.listeners.set(eventType, []);
    }
    this.listeners.get(eventType)!.push(listener);
  }

  // Remover observador
  off(eventType: string, listener: EventListener): void {
    if (this.listeners.has(eventType)) {
      const listeners = this.listeners.get(eventType)!;
      const index = listeners.indexOf(listener);
      if (index > -1) {
        listeners.splice(index, 1);
      }
    }
  }

  // Notificar a todos los observadores
  emit(event: Event): void {
    if (this.listeners.has(event.type)) {
      this.listeners.get(event.type)!.forEach(listener => {
        listener.update(event);
      });
    }
  }
}

// Observadores concretos
class EmailNotificationListener implements EventListener {
  update(event: Event): void {
    console.log(`📧 Email enviado por evento: ${event.type}`);
  }
}

class LogListener implements EventListener {
  update(event: Event): void {
    console.log(`📝 Evento registrado: [${event.timestamp}] ${event.type}`);
  }
}

class AlertListener implements EventListener {
  update(event: Event): void {
    console.log(`🚨 Alerta: ${event.type} - ${event.data.message}`);
  }
}
```

## Uso
```typescript
const dispatcher = new EventDispatcher();

// Registrar observadores
const emailListener = new EmailNotificationListener();
const logListener = new LogListener();
const alertListener = new AlertListener();

dispatcher.on('user.created', emailListener);
dispatcher.on('user.created', logListener);
dispatcher.on('error', alertListener);

// Emitir eventos
dispatcher.emit({
  type: 'user.created',
  data: { userId: 123, name: 'Juan' },
  timestamp: new Date()
});

// Salida:
// 📧 Email enviado por evento: user.created
// 📝 Evento registrado: [2026-02-04...] user.created
```

## Ventajas Demostradas
- ✅ **Desacoplamiento:** Objetos no necesitan conocerse entre sí
- ✅ **Flexibilidad:** Agregar/remover observadores en tiempo de ejecución
- ✅ **Reactividad:** Cambios propagados automáticamente
- ✅ **Escalabilidad:** Múltiples observadores para el mismo evento

## Casos de Uso
- Sistemas de eventos
- MVC (Notificación a Vistas cuando Modelo cambia)
- Real-time updates
- Sistema de notificaciones

---

**Patrón:** Comportamiento  
**Propósito:** Desacoplar notificaciones de cambios

