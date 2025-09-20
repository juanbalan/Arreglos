import java.util.Scanner;

public class VentasDepartamentos {
    private static double[][] ventas = new double[12][3]; 

    private static String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    private static String[] departamentos = {"Ropa", "Deportes", "Juguetería"};

    public static void insertarVenta(int mes, int depto, double monto) {
        ventas[mes][depto] = monto;
    }

    public static double buscarVenta(int mes, int depto) {
        return ventas[mes][depto];
    }

    public static void eliminarVenta(int mes, int depto) {
        ventas[mes][depto] = 0;
    }

    public static void mostrarTabla() {
        System.out.printf("%-12s%-12s%-12s%-12s\n", "Mes", "Ropa", "Deportes", "Juguetería");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-12s%-12.2f%-12.2f%-12.2f\n", 
                meses[i], ventas[i][0], ventas[i][1], ventas[i][2]);
        }
    }


    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE VENTAS ---");
            System.out.println("1. Insertar venta");
            System.out.println("2. Buscar venta");
            System.out.println("3. Eliminar venta");
            System.out.println("4. Mostrar tabla completa");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Insertar Venta ---");
                    System.out.print("Ingresa el número de mes (1-12): ");
                    int mesIns = sc.nextInt() - 1;
                    System.out.print("Departamento (0=Ropa, 1=Deportes, 2=Juguetería): ");
                    int deptoIns = sc.nextInt();
                    System.out.print("Monto de la venta: ");
                    double monto = sc.nextDouble();
                    insertarVenta(mesIns, deptoIns, monto);
                    System.out.println(" Venta registrada con éxito.");
                    break;

                case 2:
                    System.out.println("\n--- Buscar Venta ---");
                    System.out.print("Ingresa el número de mes (1-12): ");
                    int mesBus = sc.nextInt() - 1;
                    System.out.print("Departamento (0=Ropa, 1=Deportes, 2=Juguetería): ");
                    int deptoBus = sc.nextInt();
                    System.out.println(" Venta encontrada: " + buscarVenta(mesBus, deptoBus));
                    break;

                case 3:
                    System.out.println("\n--- Eliminar Venta ---");
                    System.out.print("Ingresa el número de mes (1-12): ");
                    int mesDel = sc.nextInt() - 1;
                    System.out.print("Departamento (0=Ropa, 1=Deportes, 2=Juguetería): ");
                    int deptoDel = sc.nextInt();
                    eliminarVenta(mesDel, deptoDel);
                    System.out.println(" Venta eliminada con éxito.");
                    break;

                case 4:
                    System.out.println("\n--- Tabla de Ventas ---");
                    mostrarTabla();
                    break;

                case 5:
                    System.out.println(" Saliendo del sistema...");
                    break;

                default:
                    System.out.println(" Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 5);

        sc.close();
    }

    public static void main(String[] args) {
        menu();
    }
}
