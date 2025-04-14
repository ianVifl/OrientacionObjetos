import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        while (opc != 4) {
            System.out.println(".::Bienvenido al Sistema::.");
            System.out.println("\t==Consultas==");
            System.out.println("""
                    1.- Depositar
                    2.- Retirar
                    3.- Consultar Saldo
                    4.- Salir
                    """);
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Depositar");
                    movimientos.depositar();
                    break;
                case 2:
                    System.out.println("Retirar");
                    movimientos.retirar();
                    break;
                case 3:
                    System.out.println("Consultar");
                    movimientos.consultar();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }
}