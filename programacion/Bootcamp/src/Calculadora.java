import java.util.Scanner;

public class Calculadora {

    void calSuma(){
        int num1=0 , num2=0;
        int calSuma = num1 + num2;
        System.out.println("la suma es "+calSuma);
    }

    void calResta(){
        int num1=0 , num2=0;
        int calResta = num1 - num2;
        System.out.println("la resta es "+calResta);
    }
    void calMultiplicacion(){
        int num1=0 , num2=0;
        int calMultiplicacion = num1 * num2;
        System.out.println("la multplicacio es "+calMultiplicacion);
    }
    void calDivision(){
        int num1=0 , num2=0;
        int caliDivision = num1 / num2;
        System.out.println("la division es "+caliDivision);
    }

    public static void main(String[] args) {
        int num1,num2;
        char res=' ';
        boolean seguir= true;
        Scanner sc = new Scanner(System.in);
        Calculadora cal = new Calculadora();

        do { System.out.println("Dame un numero: ");
            num1 = sc.nextInt();
            System.out.println("Dame otro : ");
            num2= sc.nextInt();
            System.out.println("sumar pulsa S, restar pulsa R, multiplicar M, dividir D salir pulsa Q");
            res = sc.next().charAt(0);
            //decidir entre varias opciones //
            //SWITCH
            switch(res) {
                case 'S':
                    cal.calSuma();
                    break;
                case 'R':
                    cal.calResta();
                    break;
                case 'M':
                    cal.calMultiplicacion();
                    break;
                case 'D':
                    cal.calDivision();
                    break;
                case 'Q':
                    System.out.println("Adios");
                    seguir= false;
                    break;
                default: System.out.println("Caracter no valido");
            }
        }while(seguir);







    }



}
