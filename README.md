# Sistema de Ventas por Departamentos

Este programa está desarrollado en **Java** y **Python**.  
Su objetivo es manejar un arreglo bidimensional (matriz) que guarda las ventas mensuales de tres departamentos:

- Ropa
- Deportes
- Juguetería

Cada fila del arreglo corresponde a un mes (Enero a Diciembre)  
y cada columna corresponde a un departamento.
Teniendo asi una matriz de 3x12.

El programa inicializa la matriz para despues insertar los datos de los 12 meses del año y los 3 departamentos que hay (Ropa, Deportes y Juguetería).

De igual manera este programa contiene un menu interactivo para poder ingresar datos o utilizar los metodos de manera mas sencilla en la terminal.

## Metodos

1. **Insertar venta**
   - Permite agregar o actualizar el monto de ventas de un departamento en un mes específico. Asigna el monto dependiendo del mes y departamento, en el menu se pregunta primeramente el mes y departamento para poder ingresar el monto.

2. **Buscar venta**
   - Muestra la venta registrada de un departamento en un mes específico. Regresa el valor de venta en acorde al mes y departamento que se solicite.

3. **Eliminar venta**
   - Borra una venta registrada, asignándole el valor de `0`. En el menu se pregunta mes y departamento para localizar a que valor le asignara 0.
