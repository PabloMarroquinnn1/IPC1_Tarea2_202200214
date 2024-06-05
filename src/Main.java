import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        ms("----Menu calculadora---- ");
        ms("Seleccione una opción: ");
        ms("1. Suma");
        ms("2. Resta");
        ms("3. Multiplicación");
        ms("4. División");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                ms("ingrese el primer digito: ");
                a = scanner.nextInt();
                ms("Ingrese el segundo digito: ");
                b = scanner.nextInt();
                ms("Este es el resultado de la suma: "+ (a+b));
                break;
            case 2:
                ms("ingrese el primer digito: ");
                a = scanner.nextInt();
                ms("Ingrese el segundo digito: ");
                b = scanner.nextInt();
                ms("Este es el resultado de la resta: "+ (a-b));
                break;
            case 3:
                ms("ingrese el primer digito: ");
                a = scanner.nextInt();
                ms("Ingrese el segundo digito: ");
                b = scanner.nextInt();
                ms("Este es el resultado de la multiplicación: "+ (a*b));
                break;
            case 4:
                ms("ingrese el primer digito de la división: ");
                a = scanner.nextInt();
                ms("Ingrese el segundo digito: ");
                b = scanner.nextInt();
                ms("Este es el resultado: "+ (a/b));
                break;
            default:
                ms("Opción no válida");
        }
    }
Public static void hl(String hola) {
System.out.println("hola");
}

    public static void ms(String mensaje) {
        System.out.println(mensaje);
    }
}
