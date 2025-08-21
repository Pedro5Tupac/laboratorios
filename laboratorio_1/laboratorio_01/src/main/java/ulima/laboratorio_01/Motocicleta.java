/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulima.laboratorio_01;

/**
 *
 * @author Pedro
 */
public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private boolean tieneSideCar;

    public Motocicleta(int cilindrada, boolean tieneSideCar, String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.cilindrada = cilindrada;
        this.tieneSideCar = tieneSideCar;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Cilindrada:"+ cilindrada);
        System.out.println("Tiene sideCar: "+ tieneSideCar);
    }
    
    public void hacerCaballito(){
        System.out.println("¡Haciendo caballito!");
    }
    
    
    
}
