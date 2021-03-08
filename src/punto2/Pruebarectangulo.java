package punto2;


public class Pruebarectangulo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo rectangulo1; // defino la vaiable del objeto
        rectangulo1 = new Rectangulo(); // instancio el objeto
        
        //cambia de estado 
        rectangulo1.setAltura(10);
        rectangulo1.setBase(30);
        
        System.out.println("Base: " + rectangulo1.getBase());
        System.out.println("Altura: " + rectangulo1.getAltura());
        System.out.println("Area de rectangulo: " + rectangulo1.calcularArea());
        
        
    }
    
}
