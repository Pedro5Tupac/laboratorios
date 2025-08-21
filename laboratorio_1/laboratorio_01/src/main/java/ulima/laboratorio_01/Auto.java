/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulima.laboratorio_01;

/**
 *
 * @author Pedro
 */
public class Auto extends Vehiculo {
    
    private int numeroPuertas;
    private String tipoTransmision;

    public Auto(int numeroPuertas, String tipoTransmision, String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.numeroPuertas = numeroPuertas;
        this.tipoTransmision = tipoTransmision;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Tipo de transmisión: " + tipoTransmision);
        System.out.println("Esto ha sido heredado");
    }
    public void activarAireAcondicionado(){
        System.out.println("Aire acondicionado activado.");
    }
    
    
}
