/*
Se desea crear una aplicación en java para el registro del inventario de productos de una tienda. Para ello, se solicita
diseñar e implementar la clase Producto, con atributos de instancia para el Código, nombre, precio de compra,
porcentaje de utilidad. La clase debe implementar método constructor, getters y setters para sus atributos y el método
precioVenta, que retornara el precio de venta al público (a partir del % de utilidad del producto). Implementar una clase
principal, en la que se defina un arreglo de Productos, se registren datos de diferentes productos y luego se impriman
incluyendo el precio de venta.
 */
package punto5;

public class Productos {
    //atributos
    private String nombre;
    private String codigo;
    private double precio_de_compra;
    private double P_utilidad;
    //metodo constructor
    public Productos(){
        
    }
    //setter y getter
    public void setCode(String code){this.codigo=code;}
    public void setName(String name){this.nombre=name;}
    public void setpur_price(double price){this.precio_de_compra=price;}
    public void setUtility(Double u){this.P_utilidad=u;}
    
    public String getCode(){return codigo;}
    public String getName(){return nombre;}
    public double getUtility(){return P_utilidad;}
    public double getpur_price(){return precio_de_compra;}
}
