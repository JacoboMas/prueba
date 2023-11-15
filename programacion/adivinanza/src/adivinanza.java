// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
import java.util.Scanner;

public class adivinanza {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(100) + 1;//se le suma 1 para obtener un número aleatorio entre 1 y 100.
        int intentos = 0;
        Scanner input = new Scanner(System.in);
        boolean win = false;

        System.out.println("¡Que comienze el juego!");
        System.out.println("Estoy pensando en un número entre 1 y 100" );



        while (win == false) {
            System.out.print("¿Puedes adivinar cuál es?");
            int respuesta = input.nextInt();
            intentos++;
            if (respuesta == numero) {
                win = true;
            } else if (respuesta < numero) {
                System.out.println("El número que ingresaste es demasiado bajo. ¡Inténtalo de nuevo!");
            } else if (respuesta > numero) {
                System.out.println("El número que ingresaste es demasiado alto. ¡Inténtalo de nuevo!");
            }
            if (intentos == 10) {
                break;
            }
        }

        if (win) {
            System.out.println("¡Felicitaciones! Adivinaste el número en " + intentos + " intentos.");
        } else {
            System.out.println("Lo siento, no adivinaste el número en " + intentos + " intentos. El número era " + numero + ".");
        }
    }
}