/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaop
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Double> alturas = new ArrayList<>();
        
        alturas.add(1.78);
        alturas.add(1.87);
        alturas.add(1.70);
        
        Double altura = null;
        
        for (int i =0; i < alturas.size(); i++) {
            alturas.get(i);
            if (altura == null || altura < alturas.get(i)) {
                altura = alturas.get(i);
            }
        }
        
        System.out.println("Maior altura é: " + altura);
        
    }
    
}
