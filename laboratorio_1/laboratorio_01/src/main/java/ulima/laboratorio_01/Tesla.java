/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulima.laboratorio_01;

/**
 *
 * @author Pedro
 */
public class Tesla extends VehiculoElectrico {
    private boolean autopilot;

    public Tesla(boolean autopilot, double capacidadBateria, double anatomia, String marca, String modelo, int año, double precio) {
        super(capacidadBateria, anatomia, marca, modelo, año, precio);
        this.autopilot = autopilot;
    }

    @Override
    public void cargarBateria() {
        System.out.println("CargAndo bateria.");
    }

    @Override
    public void modoEcoActivar() {
        System.out.println("Modo eco activado");
    }
    public void activarAutopilot(){
        System.out.println("Piloto automatico activado.");
    }
    
    
}
