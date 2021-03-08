/*
Crea una clase Libro que modele la información que se mantiene en una biblioteca sobre cada libro: título, primer
nombre, segundo nombre, primer apellido, ISBN, páginas, edición, editorial, ciudad, país y fecha de edición (String). La
clase debe proporcionar los siguientes servicios: getters y setters. Implementar una clase principal, en la cual, además
del método main, se debe implementar método para leer la información del Libro y método para mostrar su información.
Este último método mostrará la información del libro con este formato:
 */
package punto6;

public class libro {
    //atributos
    private String titulo;
    private String primernombre;
    private String segundonombre;
    private String primerapellido;
    private String isbn;
    private int paginas;
    private int edicion;
    private String editorial;
    private String ciudad;
    private String pais;
    private String fecha;
    //contructor
    public libro(){
        
    }
    //setter
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setPrimernombre(String first_name) {this.primernombre = first_name;}
    public void setSegundonombre(String second_name) {this.segundonombre = second_name;}
    public void setPrimerapellido(String first_lastname) {this.primerapellido = first_lastname;}
    public void setIsbn(String is_bn) {this.isbn = is_bn;}
    public void setPaginas(int pages) {this.paginas = pages;}
    public void setEdicion(int Edici_on) {this.edicion = Edici_on;}
    public void setEditorial(String edit) {this.editorial = edit;}
    public void setCiudad(String city) {this.ciudad = city;}
    public void setPais(String country) {this.pais = country;}
    public void setFecha(String fecha) {this.fecha = fecha;}
    
    //getter
    public String getTitulo() {return titulo;}
    public String getPrimernombre() {return primernombre;}
    public String getSegundonombre() {return segundonombre;}
    public String getPrimerapellido() {return primerapellido;}
    public String getIsbn() {return isbn;}
    public int getPaginas() {return paginas;}
    public int getEdicion() {return edicion;}
    public String getEditorial() {return editorial;}
    public String getCiudad() {return ciudad;}
    public String getPais() {return pais;}
    public String getFecha() {return fecha;}
    


    
    
    
}
