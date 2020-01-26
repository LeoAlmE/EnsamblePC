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
public class Mouse {
    
    private String marca;
    private double precio;

    public Mouse() {
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "teclado{" + "marca=" + marca + ", precio=" + precio + '}';
    }
    
}
