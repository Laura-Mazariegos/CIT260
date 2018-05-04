/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiustofarenheit.java;

/**
 *
 * @author laura
 */
import java.util.Scanner;

public class CelsiusToFarenheitJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fahrenheitTemp,celsiusTemp;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the temperature in degrees Celsius");
        celsiusTemp = keyboard.nextDouble();
        
        fahrenheitTemp = (9.0/5.0)* celsiusTemp + 32;
        System.out.println("The fahrenheit temperature conversion is: "
        + fahrenheitTemp + "\u00b0 fahrenheit");
    }
    
}
