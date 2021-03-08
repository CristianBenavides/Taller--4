/*Diseñe e implemente una clase para trabajar con triángulos isósceles. Defina atributos para la base y la altura,
proporcione un método constructor, métodos getter y setter e implemente métodos para calcular: el área, la longitud de
sus lados iguales, el perímetro, el valor del ángulo vértice. */
package punto3;

public class triangulos {
    //atributos
    private double base;
    private double altura;
    
    //metodo constructor
    
    public triangulos(){
    }
   //setter y getter    
    public void setbase(Double bas  ){
        this.base= bas;
    }
    public void setaltura(Double h){
        this.altura=h;
    }
    //metodos
    public double getarea(){
        return (this.base*this.altura)/2;
    }
    public double getlong(){
        return Math.sqrt((Math.pow(this.altura,2)+((Math.pow(this.base,2))/4)));
    }
    public double getper(){
        return 2*getlong()+this.base;
    }
    public double getver(){
        return Math.toDegrees(2*(Math.asin((this.base/2)/this.altura)));
    }
    
}
