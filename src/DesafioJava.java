import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre="Luis Lopez";
        String tipoCuenta="Ahorros";
        double saldo=1500;
        int opcion=0;
        System.out.println("***************");
        System.out.println("\nNombre del cliente: "+nombre);
        System.out.println("Tipo de cuenta: "+tipoCuenta);
        System.out.println("Saldo disponible: $"+saldo);
        System.out.println("\n****************");

        String menu = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        while (opcion != 9){
            System.out.println();
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: $" + saldo);
                    break;
                case 2:
                    System.out.println("Cuál es el valor que deseas retirar?");
                    double retiro = teclado.nextDouble();
                    if (retiro > saldo){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - retiro;
                        System.out.println("Saldo: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cuál es el valor que vas a depositar?");
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.println("El saldo actualizado es: $" + saldo);
                    break;
                case 9:
                    System.out.println("Muchas gracias por preferirnos");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese una opcion correcta");
                    break;
            }
        }


    }
}
