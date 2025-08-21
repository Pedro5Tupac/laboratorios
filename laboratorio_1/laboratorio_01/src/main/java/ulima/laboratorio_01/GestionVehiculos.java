/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ulima.laboratorio_01;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Pedro
 */
public class GestionVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        List<Vehiculo> vehiculos = new ArrayList<>();
        
        vehiculos.add(new Auto(4,"Manual","Toyota","Corolla", 2020, 15.5));
        vehiculos.add(new Motocicleta(40,true, "Honda", "Navi", 2021, 5.5));
        vehiculos.add(new Tesla(true, 40.5,250, "Tesla", "Model S", 2024, 24.5));
        
        for (Vehiculo v:vehiculos){
            v.mostrarInfo();
            v.encender();
            System.out.println("//");
        }
    }
    
}
    