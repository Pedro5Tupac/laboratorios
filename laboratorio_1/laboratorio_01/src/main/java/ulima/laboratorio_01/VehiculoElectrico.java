/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulima.laboratorio_01;

/**
 *
 * @author Pedro
 */
public abstract class VehiculoElectrico extends Vehiculo {
    protected double capacidadBateria; //kWh
    protected double anatomia; //Km
    
    
    
    public VehiculoElectrico(double capacidadBateria, double anatomia, String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.capacidadBateria = capacidadBateria;
        this.anatomia = anatomia;
    }
    
    public abstract void cargarBateria();
    public abstract void modoEcoActivar();    
    
}
