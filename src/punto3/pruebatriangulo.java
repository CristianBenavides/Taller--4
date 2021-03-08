package punto3;
import javax.swing.JOptionPane;
public class pruebatriangulo {
    public static void main(String[] args) {
        triangulos triangulo = crear();
        mostrar(triangulo);
    }
    
    
    public static triangulos crear(){
        triangulos triangulo= new triangulos();
        double h=Double.parseDouble(JOptionPane.showInputDialog("Digite la altura del triangulo"));
        triangulo.setaltura(h);
        double bas=Double.parseDouble(JOptionPane.showInputDialog("Digite la base del triangulo"));
        triangulo.setbase(bas);
        return triangulo;
    }
    public static void mostrar(triangulos triangulo){
        System.out.printf("El area es= %.2f%n",triangulo.getarea());
        System.out.printf("Los lados iguales= %.2f%n",triangulo.getlong());
        System.out.printf("El perimetro es= %.2f%n",triangulo.getper());
        System.out.printf("El angulo es= %.2fº%n",triangulo.getver());
    }
}
