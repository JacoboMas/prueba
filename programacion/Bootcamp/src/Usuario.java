import java.util.Scanner;

public class Usuario {

    static void saludo(String nombre){
        System.out.println("hola "+nombre);
    }

    public static void main(String[] args) {

        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nombre de Usuario");
        nombre=sc.nextLine();
        saludo(nombre);
    }





}
