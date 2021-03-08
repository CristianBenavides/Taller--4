package punto7;

public class cuenta {
    //atributos
    private int noCuenta;
    private String nombreCliente;
    private double Saldo;
    
    //metodo constructor
    public cuenta() {
    }
    //setter
    public int getNoCuenta() {return noCuenta;}
    public String getNombreCliente() {return nombreCliente;}
    public double getSaldo() {return Saldo;}
    //getter
    public void setNoCuenta(int noCuenta) {this.noCuenta = noCuenta;}
    public void setNombreCliente(String nombreCliente) {this.nombreCliente = nombreCliente;}
    public void setSaldo(double Saldo) {this.Saldo = Saldo;}
    
    
}
