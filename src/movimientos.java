import java.util.Scanner;

public class movimientos {
    static cliente usuario1= new cliente(1000);
    public static void depositar () {
        Scanner sc= new Scanner(System.in);
        System.out.println("Cantidad a Depositar:");
        int cantidad = sc.nextInt();
        usuario1.setDeposito(cantidad);
        usuario1.depositar();
        System.out.print("Saldo Actualizado: ");
        System.out.println(usuario1.getSaldo());
    }

    public static void retirar (){
        Scanner sc= new Scanner(System.in);
        System.out.println("Cantidad a retirar: ");
        int cantidad = sc.nextInt();
        usuario1.setRetiro(cantidad);
        usuario1.retirar();
        System.out.print("Saldo Actualizado : ");
        System.out.println(usuario1.getSaldo());
    }

    public static void consultar(){
        System.out.print("Saldo Actual: $");
        System.out.println(usuario1.getSaldo());
    }
}
