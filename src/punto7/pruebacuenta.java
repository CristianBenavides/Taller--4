package punto7;

import java.util.Scanner;

public class pruebacuenta {
    public static void main(String[] args) {
        cuenta Cuenta=new cuenta();
        Scanner entrada=new Scanner (System.in); 
        System.out.println("Digite el numero de cuenta: ");
        int noCuenta= entrada.nextInt();
        Cuenta.setNoCuenta(noCuenta);
        System.out.println("Digite el nombre del usuario: ");
        String nombre= entrada.next();
        Cuenta.setNombreCliente(nombre);
        System.out.println("Digite el saldo de la cuenta: ");
        double saldo= entrada.nextDouble();
        Cuenta.setSaldo(saldo);
        
        System.out.println("-----Acciones-----");
        System.out.println("1. retirar");
        System.out.println("2. consignar");
        int op=entrada.nextInt();
        if (op==2) {
            consignar(Cuenta);
            }
        else if (op==1){
            retirar(Cuenta);
            } 
        }
    public static void consignar(cuenta Cuenta) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite la cantidad a consignar");
        double monto=entrada.nextDouble();
        Cuenta.setSaldo(Cuenta.getSaldo()+monto);
        System.out.printf("El nuevo saldo es %.2f%n",Cuenta.getSaldo());
    }
    public static void retirar(cuenta Cuenta) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("Digite la cantidad a retirar");
        double monto=entrada.nextDouble();
        Cuenta.setSaldo(Cuenta.getSaldo()-monto);
        System.out.printf("El nuevo saldo es %.2f%n",Cuenta.getSaldo());
    }
}
