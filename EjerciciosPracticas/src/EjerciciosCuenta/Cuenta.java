package EjerciciosCuenta;

public class Cuenta {


    //atributos
    private String titular;
    private double cantidad;

    //constructores
    public Cuenta(String titular) {
        this(titular, 0); //Sobrecarga
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    //metodos get y set
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        titular = titular;
    }

    public void setCantidad(double cantidad) {
        cantidad = cantidad;
    }

    // metodos
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }


    //Devuelve el estado del objeto


    public void mostrarOperacion() {
        System.out.println("El titular " + titular + " tiene un total de " + cantidad + " usd");
    }

}
