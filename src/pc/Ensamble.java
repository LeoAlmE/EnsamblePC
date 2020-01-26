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
public class Ensamble {
    
    public static void main(String[] args) {
        
        Monitor monitor = new Monitor();
        monitor.setMarca("HP");
        monitor.setPrecio(3000.00);
        monitor.setTamanio("35 pulgadas");
        monitor.setPixeles(1080);
        
        Teclado teclado = new Teclado();
        teclado.setMarca("Logitech");
        teclado.setPrecio(900.00);
        
        Mouse mouse = new Mouse();
        mouse.setMarca("Invent");
        mouse.setPrecio(250.00);
        
        CPU cpu = new CPU();
        cpu.setMarca("HP");
        cpu.setRam("8GB");
        cpu.setProcesador("Core");
        cpu.setPrecio(10500.00);
        cpu.setAlmacenamiento("1TB");
        cpu.setMonitor(monitor);
        cpu.setTeclado(teclado);
        cpu.setMouse(mouse);
        
        System.out.println(cpu.toString());
        
    }
    
}
