# 🧠 Actividad Formativa Semana 4 – Desarrollo Orientado a Objetos I

**Proyecto LlanquihueTourApp**

## 👤 Autor del proyecto

- **Nombre completo:** Daniel Flores Elizondo
- **Sección:** 2026_204_OL_PRY2202_24684769_PCT
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus Online

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la actividad formativa de la semana 4 de la asignatura Desarrollo Orientado a Objetos I. Es el catálogo de tours de la agencia Llanquihue Tour, ubicada en la Región de Los Lagos.

El programa lee los tours desde un archivo de texto, los guarda en una lista de objetos y los muestra por pantalla. Después filtra la lista y muestra solo los tours con precio de 25.000 pesos o más.

Cada línea del archivo es un tour, con sus datos separados por punto y coma (nombre, tipo, precio, horas y cupos). Por ejemplo:

```
Paseo Lago Llanquihue;Lacustre;25000;3;15
```

---

## 🧱 Estructura del proyecto

```
📁 LlanquihueTourApp
├── src/
│   ├── cl/llanquihuetourapp/
│   │   ├── data/
│   │   │   └── GestorDatos.java   # Lee el archivo y crea los objetos
│   │   ├── model/
│   │   │   └── Tour.java          # Clase que representa un tour
│   │   └── ui/
│   │       └── Main.java          # Clase principal
│   └── resources/
│       └── tours.txt              # Datos de los tours
└── README.md
```

---

## ⚙️ Instrucciones para ejecutar la clase Main

1. Clona el repositorio desde GitHub:

```
git clone https://github.com/Apsulon/llanquihue-tour-app.git
```

2. Abre el proyecto en IntelliJ IDEA (necesitas JDK 11 o superior).
3. Abre la clase `Main`, que está en `cl/llanquihuetourapp/ui/Main.java`, y ejecútala.
4. El programa muestra en la consola todos los tours y, más abajo, los de precio 25.000 o más.

El programa busca el archivo en `src/resources/tours.txt`, así que debe ejecutarse desde la carpeta del proyecto. IntelliJ lo hace así por defecto.

---

- **Repositorio GitHub:** https://github.com/Apsulon/llanquihue-tour-app
- **Fecha de entrega:** [16/11/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Actividad Formativa Semana 4