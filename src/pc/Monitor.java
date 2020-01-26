/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc;

/**
 *
 * @author Leoncio Almaguer
 */
public class Monitor {
    
    private String tamanio;
    private String marca;
    private int pixeles;
    private double precio;
    
    public Monitor() {
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPixeles() {
        return pixeles;
    }

    public void setPixeles(int pixeles) {
        this.pixeles = pixeles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Monitor{" + "tamanio=" + tamanio + ", marca=" + marca + ", pixeles=" + pixeles + ", precio=" + precio + '}';
    }

}
