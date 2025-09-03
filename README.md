# JAVA0078_M4_EmpresaConEmpleados

Este proyecto implementa un sistema simple en Java para gestionar diferentes tipos de empleados dentro de una empresa, aplicando **herencia**.

## Descripción
El sistema define una jerarquía de empleados con las siguientes clases principales:

- **Empleado**: Clase base que contiene atributos comunes como nombre, ID y salario base.
- **Gerente**: Hereda de Empleado y añade un bono.
- **Director**: Hereda de Gerente y añade acciones.

Cada clase redefine el cálculo de salario total y tiene métodos para mostrar su información.

---
## Estructura del Proyecto
```
JAVA0078_M4_EmpresaConEmpleados/
│── src/
│   ├── com/
│   │   ├── Aplicacion.java
│   │   └── clases/
│   │       ├── Empleado.java
│   │       ├── Gerente.java
│   │       └── Director.java
│── README.md
```

---
## Requisitos
- **Java JDK 8** o superior.
- IDE recomendado: **Spring Tool Suite (STS)** o **Visual Studio Code**.

---
## Ejecución
1. Compilar los archivos desde la carpeta raiz del proyecto:
   ```bash
   javac src/com/clases/*.java src/com/Aplicacion.java -d bin
   ```

2. Ejecutar la aplicación principal:
   ```bash
   java -cp bin com.Aplicacion
   ```
---
## Generar Javadoc

```bash
javadoc -d javadoc src/com/Aplicacion.java src/com/clases/*.java
```

---
## Ejemplo de salida
```
Nombre: Ana Aravena
ID: AA0001
Salario base: 600000
Salario total: 600000
--------------
Nombre: Bastian Barrientos
ID: BB0002
Salario base: 2400000
Bono: 600000
Salario total: 3000000
--------------
Nombre: Camila Castillo
ID: CC0003
Salario base: 3800000
Bono: 800000
Acciones: 1000000
Salario total: 5600000
```

---
## Autor
- Laura Duhalde
