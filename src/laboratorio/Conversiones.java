/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio;

/**
 *
 * @author user
 */
public class Conversiones {
    public double kgToLb(double kg) {
        return kg * 2.20462;
    }

    public double lbToKg(double lb) {
        return lb / 2.20462;
    }

    public double solToDolar(double sol, double tasaCambio) {
        return sol / tasaCambio;
    }

    public double dolarToSol(double dolar, double tasaCambio) {
        return dolar * tasaCambio;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double feetToMeters(double feet) {
        return feet / 3.28084;
    }

    public double metersToFeet(double meters) {
        return meters * 3.28084;
    }
}
