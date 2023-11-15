import java.util.Scanner;

public class CambioDinero {

    public static final double CAMBIOEaD = 1.05;
    public static Scanner sc;

    public static double eurosADolares(double e) {
        double d;
        d = CAMBIOEaD * e;
        return d;
    }

    public static double dolaresAEuros(double d) {
        double e;
        e = d / CAMBIOEaD;
        return e;
    }
    public static double obtenerCantidad(string mensaje) {
        double can;
        System.out.println(mensaje);
        can = sc.nextDouble();
        return can;
    }


    public static void main(String[] args) {
        double cantidad;
        boolean seguir = true;
        sc = new Scanner(System.in);

        do {
            System.out.println("1 Euro a Dolar");
            System.out.println("2 Dolar a Euro");
            System.out.println("3 SALIR");
            int res = sc.nextInt();

            switch (res) {
                case 1:
                    cantidad = obtenerCantidad("introduce euros");
                    System.out.println("en dolares es: " + eurosADolares(cantidad));
                    break;
                case 2:
                    cantidad = obtenerCantidad("introduce dolares");
                    System.out.println("en euros es: " + dolaresAEuros(cantidad));
                    break;
                case 3:
                    System.out.println();
                    seguir = false;
                    break;
                default:
                    System.out.println("Valor no valido");
            }

        } while (seguir);
        System.out.println("Cerrando programa...");
    }
}