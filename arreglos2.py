ventas = [[0.0 for _ in range(3)] for _ in range(12)]

meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
         "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
departamentos = ["Ropa", "Deportes", "Juguetería"]


def insertar_venta(mes, depto, monto):
    ventas[mes][depto] = monto


def buscar_venta(mes, depto):
    return ventas[mes][depto]


def eliminar_venta(mes, depto):
    ventas[mes][depto] = 0.0


def mostrar_tabla():
    print("\nTabla de Ventas (Meses x Departamentos):")
    print(f"{'Mes':<12}{'Ropa':<12}{'Deportes':<12}{'Juguetería':<12}")
    for i in range(12):
        print(f"{meses[i]:<12}{ventas[i][0]:<12.2f}{ventas[i][1]:<12.2f}{ventas[i][2]:<12.2f}")
    print()


def menu():
    while True:
        print("\n--- SISTEMA DE VENTAS ---")
        print("1. Insertar venta")
        print("2. Buscar venta")
        print("3. Eliminar venta")
        print("4. Mostrar tabla completa")
        print("5. Salir")
        
        opcion = input("Elige una opción: ")

        if opcion == "1":
            print("\n--- Insertar Venta ---")
            mes = int(input("Ingresa el número de mes (1-12): ")) - 1
            depto = int(input("Departamento (0=Ropa, 1=Deportes, 2=Juguetería): "))
            monto = float(input("Monto de la venta: "))
            insertar_venta(mes, depto, monto)
            print(" Venta registrada con éxito.")

        elif opcion == "2":
            print("\n--- Buscar Venta ---")
            mes = int(input("Ingresa el número de mes (1-12): ")) - 1
            depto = int(input("Departamento (0=Ropa, 1=Deportes, 2=Juguetería): "))
            print(f"🔎 Venta encontrada: {buscar_venta(mes, depto):.2f}")

        elif opcion == "3":
            print("\n--- Eliminar Venta ---")
            mes = int(input("Ingresa el número de mes (1-12): ")) - 1
            depto = int(input("Departamento (0=Ropa, 1=Deportes, 2=Juguetería): "))
            eliminar_venta(mes, depto)
            print(" Venta eliminada con éxito.")

        elif opcion == "4":
            mostrar_tabla()

        elif opcion == "5":
            print(" Saliendo del sistema...")
            break

        else:
            print( "Opción no válida, intenta de nuevo.")


if __name__ == "__main__":
    menu()
