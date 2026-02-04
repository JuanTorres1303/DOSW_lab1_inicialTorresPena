# Factory Pattern - Ejemplo Implementado

## Descripción
El Factory Pattern proporciona una forma de crear objetos sin especificar exactamente qué clase instanciar.

## Ejemplo: Generador de Reportes

```typescript
// Interfaz común
interface Report {
  generate(): string;
  getFormat(): string;
}

// Implementaciones concretas
class PDFReport implements Report {
  generate(): string {
    return "[PDF] Reporte generado";
  }
  getFormat(): string {
    return "PDF";
  }
}

class ExcelReport implements Report {
  generate(): string {
    return "[EXCEL] Reporte generado";
  }
  getFormat(): string {
    return "EXCEL";
  }
}

class HTMLReport implements Report {
  generate(): string {
    return "[HTML] Reporte generado";
  }
  getFormat(): string {
    return "HTML";
  }
}

// Factory
class ReportFactory {
  static createReport(format: string): Report {
    switch(format.toUpperCase()) {
      case 'PDF':
        return new PDFReport();
      case 'EXCEL':
        return new ExcelReport();
      case 'HTML':
        return new HTMLReport();
      default:
        throw new Error(`Formato no soportado: ${format}`);
    }
  }
}
```

## Uso
```typescript
// Sin Factory (problemático)
let report: Report;
if (format === 'PDF') {
  report = new PDFReport();
} else if (format === 'EXCEL') {
  report = new ExcelReport();
} else if (format === 'HTML') {
  report = new HTMLReport();
}
// Código disperso, difícil de mantener

// Con Factory (mejor)
const report = ReportFactory.createReport(format);
const output = report.generate();
```

## Ventajas Demostradas
- ✅ **Encapsulación:** Lógica de creación centralizada
- ✅ **Mantenibilidad:** Agregar nuevos tipos es simple
- ✅ **Flexibilidad:** Cambiar implementaciones sin afectar cliente
- ✅ **Escalabilidad:** Fácil agregar más formatos

---

**Patrón:** Creacional  
**Propósito:** Desacoplar la creación de objetos

