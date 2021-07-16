/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.PlanCelular;
import paquete1.Propietario;

/**
 *
 * @author USUARIO
 */
public class PlanPostPagoMinutosMegas extends PlanCelular {

    private double min;
    private double costoMin;
    private double megasGigas;
    private double costoGigas;

    public PlanPostPagoMinutosMegas(Propietario prptr, String s1, String s2,
            String s3, String s4, double m, double cos, double meg, double cosGi) {
        super(prptr, s1, s2, s3, s4);
        min = m;
        costoMin = cos;
        megasGigas = meg;
        costoGigas = cosGi;
    }

    public void establecerMin(double x) {
        min = x;
    }

    public void establecerCostoMin(double x) {
        costoMin = x;
    }

    public void establecerMegasGigas(double x) {
        megasGigas = x;
    }

    public void establecerCostoGigas(double x) {
        costoGigas = x;
    }

    @Override
    public void establecerPagoMensual() {

      pagMen = (min*costoMin)+(megasGigas+costoGigas);    
    }

    public double obtenerMin() {
        return min;
    }

    public double obtenerCostoMin() {
        return costoMin;
    }

    public double obtenerMegasGigas() {
        return megasGigas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n====Plan Post Pago Minutos Megas====\n"
                + "Minutos: %.2f\nCosto Minutos: %.2f\nGigas: %.2f\n"
                + "Costo Gigas: %.2f\n", super.toString(),min, 
                costoMin, megasGigas, costoGigas);

        return cadena;
    }
}
