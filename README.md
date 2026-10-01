# POO

Programacion Orientada a Objetos (POO) y ESPOO. Proyectos Java con NetBeans IDE,
Swing para la interfaz y MySQL para la persistencia.

Cada proyecto es un ejercicio de tarea independiente, organizado en el patron
`Modelo / Control / Vista` (MVC) que se usa en el curso.

> Nota: el contenido cuelga de la carpeta `Poo/`, por eso en GitHub aparece como
> subcarpeta del mismo nombre.

## Tecnologias

| Area | Herramienta |
|------|-------------|
| Lenguaje | Java |
| IDE | Apache NetBeans |
| Interfaz | Java Swing (`JFrame`, `JDialog`, `.form`) |
| Base de datos | MySQL + `mysql-connector-j-8.0.31` |
| Patrones | Modelo / Control / Vista, DAO, Arbol binario |

## Proyectos

### Tareas propias

| # | Carpeta | Proyecto | Clases principales | Que hace |
|---|---------|----------|--------------------|----------|
| 1 | `Mis_Tareas/Vilchez_Anaya_Tarea_06` | Ejercicio 01 - Hospedaje | `Hospedaje`, `Huesped`, `Habitacion` | Sistema de reservas de hotel |
| 2 | `Mis_Tareas/Vilchez_Anaya_Tarea_07` | Ejercicio 01 - Turistas | `Turistas` | Registro de turistas |
| 3 | `Mis_Tareas/Vilchez_Anaya_Tarea_07` | Ejercicio 02 - Edades | `Edades` | Clasificacion por rango de edad |
| 4 | `Mis_Tareas/Vilchez_Anaya_Tarea_07` | Ejercicio 03 - Tienda | `Tienda` | Modelado de una tienda |
| 5 | `Mis_Tareas/Vilchez_Anaya_Tarea_011` | Ejercicio 01 - Arquitectos | `Constructor`, `Ing_Civil`, `Arquitecto`, `ArregloIC` | Herencia: jerarquia de profesionales |
| 6 | `Mis_Tareas/Vilchez_Anaya_Tarea014` | Ejercicio 01 - Tipo de comida | `Usuario`, `Tipo_Comida`, `UsuarioDAO`, `Tipo_ComidaDAO`, `ConectaDB` | CRUD con DAO y MySQL |
| 7 | `Mis_Tareas/Sneaker` | SnakeGame | `Caminante`, `PanelSnake`, `PanelFondo`, `JFrame` | Juego de la serpiente con Swing |
| 8 | `Mis_Tareas/Probador` | Ventana de prueba | `NewJFrame` | Formulario de prueba |
| 9 | `Mis_Tareas/Grupo02_SinError` | Tarea 16 - Sistema de ventas | `Articulo`, `Categoria`, `Persona`, `Venta`, `Ingreso`, `Users` + 8 DAO | Sistema comercial completo: login, ventas, ingresos, stock, MySQL |
| 10 | `Mis_Tareas-II/Completo` | Tarea 16 - Sistema de predios | `Predio`, `Sitio`, `Arbol`, `Nodo`, `Contrato`, `Orden`, `Inventario` + 7 DAO | Version 2 con arbol binario (`Nodo`), inventario y ordenes |

### Evaluaciones

| # | Carpeta | Proyecto | Clases principales | Que hace |
|---|---------|----------|--------------------|----------|
| 11 | `Evaluaciones/Grupo_06_Tarea_04` | Ejercicio 02 - Prestamos | `Cliente`, `Operacion_Prestamo`, `Tipo_Prestamo`, `Arreglo_Objetos` | Prestamos por tipo de cliente |
| 12 | `Evaluaciones/Grupo_06_Tarea_04` | Ejercicio 03 - Estacionamiento | `Vehiculo`, `Zona_Estacionamiento`, `Registro_Estacionamiento` | Control de estacionamiento |
| 13 | `Evaluaciones/Grupo01_Tarea_08` | Ejercicio 01 - Arreglo | `Arreglo`, `JFrame_Principal` | Arreglo de objetos con Swing |
| 14 | `Evaluaciones/Grupo01_Tarea_08` | Ejercicio 02 - Alumnos | `Alumnos`, `JFrame_Principal` | Registro de alumnos |
| 15 | `Evaluaciones/Grupo01_Tarea_08` | Ejercicio 03 - Ventana principal | `VentanaPrincipal` | Ventana principal |

### Sesiones y ejemplos de clase

| # | Carpeta | Proyecto | Clases principales | Que hace |
|---|---------|----------|--------------------|----------|
| 16 | `Sesiones de ESPOO/Sesion02` | Sesion 02 - Ejemplo 01 | `Empleado`, `Departamento`, `Arreglo_Empleado`, `Arreglo_Departamento` | Relacion 1:N entre empleado y departamento |
| 17 | `Pdf_Sesiones_POO/Sesion14...` | Sesion 14 - Ejemplo 01 | `Curso`, `CursoDAO`, `ConectaDB` | CRUD de cursos con MySQL |
| 18 | `Pdf_Sesiones_POO/Sesion15...` | Sesion 15 - Ejemplo 01 | `Curso`, `Estudiante`, `CursoDAO`, `EstudianteDAO`, `Arreglo_Curso` | Cursos + estudiantes, dos versiones |

## Enunciados

Los PDF de las tareas (17 archivos) se conservan en el repo como referencia.
Los `.rar`, `.zip`, `.jar` y el codigo de `Conectores_Libreria` estan ignorados
en `.gitignore` porque son binarios o codigo de terceros.

## Compilar

Los proyectos se abren directamente en NetBeans (tienen `build.xml` y `.mwb`).
Desde linea de comandos:

```bash
ant            # compila
ant run        # compila y ejecuta
```
