# 🧠 Actividad Sumativa Semana 5 – Desarrollo Orientado a Objetos I

**Proyecto LlanquihueTourApp – Organización modular y creación de una librería personalizada**

## 👤 Autor del proyecto

- **Nombre completo:** Daniel Flores Elizondo
- **Sección:** 2026_204_OL_PRY2202_24684769_PCT
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus Online
---

## 📘 Descripción general del sistema

Este proyecto corresponde a la actividad sumativa de la semana 5 de la asignatura Desarrollo Orientado a Objetos I, y continúa el trabajo de la semana anterior. Es el sistema de la agencia de turismo Llanquihue Tour, ubicada en la Región de Los Lagos.

El programa lee los tours desde un archivo de texto y los guarda en una lista de objetos. Cada tour tiene un guía y un transporte asociados, que son clases aparte (composición entre `Tour`, `Guia` y `Transporte`). Después muestra todos los tours por consola y aplica tres operaciones sobre ellos:

- Un historial de tours consultados, con una pila (`Stack`).
- Una búsqueda de un tour por su nombre, con un mapa (`HashMap`).
- Un filtro que muestra solo los tours con precio mayor a 25.000 pesos.
  Cada línea del archivo es un tour, con sus datos separados por punto y coma: nombre, tipo, precio, horas y cupos, seguidos de los datos del guía (nombre, años de experiencia y especialidad) y del transporte (tipo, capacidad y empresa). Por ejemplo:

```
Paseo Lago Llanquihue;Lacustre;25000;3;15;Carlos Soto;8;Navegacion lacustre;Bote;Lagos del Sur;20
```

Las líneas con datos inválidos (campos faltantes, números mal escritos o valores negativos) se omiten y se avisa por consola.
 
---

## 🧱 Paquetes y clases

| Paquete | Clase | Para qué sirve |
|---|---|---|
| `app` | `Main` | Clase principal: carga los datos y muestra los resultados |
| `data` | `GestorDatos` | Lee el archivo y crea los objetos `Tour` |
| `model` | `Tour` | Representa un tour, e incluye un `Guia` y un `Transporte` |
| `model` | `Guia` | Representa al guía de un tour |
| `model` | `Transporte` | Representa el transporte de un tour |
| `service` | `GestorColecciones` | Historial con `Stack` y búsqueda por nombre con `HashMap` |
 
---

## 📁 Estructura del proyecto

```
📁 LlanquihueTourApp
├── src/
│   ├── cl/llanquihuetourapp/
│   │   ├── app/
│   │   │   └── Main.java               # Clase principal
│   │   ├── data/
│   │   │   └── GestorDatos.java        # Lee el archivo y crea los objetos
│   │   ├── model/
│   │   │   ├── Guia.java               # Clase que representa un guía
│   │   │   ├── Tour.java               # Clase que representa un tour
│   │   │   └── Transporte.java         # Clase que representa un transporte
│   │   └── service/
│   │       └── GestorColecciones.java  # Stack y HashMap
│   └── resources/
│       └── tours.txt                   # Datos de los tours
└── README.md
```
 
---

## ⚙️ Instrucciones para ejecutar la clase Main

1. Clona el repositorio desde GitHub:
```
git clone https://github.com/Apsulon/llanquihue-tour-app.git
```

2. Abre el proyecto en IntelliJ IDEA (necesitas JDK 11 o superior).
3. Abre la clase `Main`, que está en `cl/llanquihuetourapp/app/Main.java`, y ejecútala.
4. En la consola aparecen, en este orden: todos los tours, el guía y el transporte de cada uno, el historial, la búsqueda por nombre y los tours con precio mayor a 25.000.
   El programa busca el archivo en `src/resources/tours.txt`, así que debe ejecutarse desde la carpeta del proyecto. IntelliJ lo hace así por defecto.

---

- **Repositorio GitHub:** https://github.com/Apsulon/llanquihue-tour-app
- **Fecha de entrega:** [23/11/2026]
---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Actividad Sumativa Semana 5