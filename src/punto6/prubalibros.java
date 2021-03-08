package punto6;

import java.util.Scanner;


public class prubalibros {
    public static void main(String[] args) {
        libro[] vect_libros= crearlibro();
        mostrardatos(vect_libros);
    }
    public static libro[] crearlibro(){
        libro[] vect_libros = new libro[1];
                   
        for (int i = 0; i <vect_libros.length; i++) {
            Scanner entrada = new Scanner(System.in);
            vect_libros[i]=new libro();
            System.out.printf("--------------------------------------------%n");
            System.out.printf("Digite el titulo: ");
            String titulo=entrada.next();
            vect_libros[i].setTitulo(titulo);            
            System.out.printf("Digite el primer nombre del autor: ");
            String primernombre=entrada.next();
            vect_libros[i].setPrimernombre(primernombre);
            System.out.printf("Digite el segundo nombre del autor: ");
            String segundonombre=entrada.next();
            vect_libros[i].setSegundonombre(segundonombre);            
            System.out.printf("Digite el primer apellido del autor: ");
            String primerapellido=entrada.next();
            vect_libros[i].setPrimerapellido(primerapellido); 
            System.out.printf("Digite el codigo isbn: ");
            String isbn=entrada.next();
            vect_libros[i].setIsbn(isbn);
            System.out.printf("Digite el numero de paginas: ");
            int paginas=entrada.nextInt();
            vect_libros[i].setPaginas(paginas);
            System.out.printf("Digite la editorial: ");
            String editorial=entrada.next();
            vect_libros[i].setEditorial(editorial); 
            System.out.printf("Digite la edicion del libro: ");
            int edicion=entrada.nextInt();
            vect_libros[i].setEdicion(edicion);
            System.out.printf("Digite la fecha de edicion del libro: ");
            String fecha=entrada.next();
            vect_libros[i].setFecha(fecha);
            System.out.printf("Digite el pais: ");
            String pais=entrada.next();
            vect_libros[i].setPais(pais);
            System.out.printf("Digite la ciudad: ");
            String ciudad=entrada.next();
            vect_libros[i].setCiudad(ciudad);          
            System.out.printf("%n-------------------------------------------");
        }
        return vect_libros;
    }
    public static libro[] mostrardatos(libro[] vect_libro){
        for (int i = 0; i <vect_libro.length; i++) {
            System.out.printf("%n--------------- Biblioteca, Libro %d ---------------%n",i+1);
            System.out.printf("Titulo: %s%n",vect_libro[i].getTitulo());
            System.out.printf("Autor: %s %s,%s%n",vect_libro[i].getPrimernombre(),vect_libro[i].getSegundonombre(),vect_libro[i].getPrimerapellido());
            System.out.printf("%sa. edicion%n",vect_libro[i].getEdicion());
            System.out.printf("ISBN: %s%n",vect_libro[i].getIsbn());
            System.out.printf("%s, %s, %s(%s)%n",vect_libro[i].getEditorial(),vect_libro[i].getCiudad(),vect_libro[i].getPais(),vect_libro[i].getFecha());
            System.out.println("---------------------------------------------------");
        }
        return vect_libro;
        
    }
}