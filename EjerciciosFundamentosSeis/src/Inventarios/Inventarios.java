package Inventarios;

import java.security.PublicKey;

public class Inventarios {

    public String nombre;
    public int cantidad = 0;
    public double precio = 0;
    public double numeroElemento = 0;

    public Inventarios(String nombre, int cantidad, double precio, double numeroElemento) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.numeroElemento = numeroElemento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getNumeroElemento() {
        return numeroElemento;
    }

    public void setNumeroElemento(double numeroElemento) {
        this.numeroElemento = numeroElemento;
    }
}
