
package punto5;
import java.util.Scanner;
public class pruebaproductos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Productos[] vect_productos= new Productos[1]; 
        
        for (int i = 0; i <vect_productos.length; i++) {
            vect_productos[i]=new Productos();
            System.out.printf("Digite el nombre del producto %d%n",i+1);
            String name=entrada.next();
            vect_productos[i].setName(name);
            System.out.printf("Digite el codigo del producto %d%n",i+1);
            String code=entrada.next();
            vect_productos[i].setCode(code);
            System.out.printf("Digite el precio  del producto %d%n",i+1);
            double price=entrada.nextDouble();
            vect_productos[i].setpur_price(price);
            System.out.printf("Digite el porcentaje de utilidad del producto %d%n",i+1);
            double u=entrada.nextDouble();
            vect_productos[i].setUtility(u);
            
        }
        for (int i = 0; i < vect_productos.length; i++) {
                System.out.printf("------------------%s------------------%n",vect_productos[i].getName());
                System.out.printf("Codigo: %s%n",vect_productos[i].getCode());
                System.out.printf("Precio de compra: %.2f%n",vect_productos[i].getpur_price());
                System.out.printf("precio de venta: %.2f%n",(vect_productos[i].getpur_price()*(1+(vect_productos[i].getUtility())/100)));
                System.out.printf("--------------------------------------%n");
        }
    }
}
