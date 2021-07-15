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
 * @author xavierchavez
 */
public class PlanPostPagoMinutos extends PlanCelular{

    private double minNacionales;
    private double costoMin;
    private double tarifaBase;

    public PlanPostPagoMinutos(Propietario p, String m, String c, String mod, 
            String num, double mn, double cm, double ta) {
        super(p, m, c, mod, num);
        minNacionales = mn;
        costoMin = cm;
        tarifaBase = ta;
    }

    
    public void establecerMinNacionales(double x) {
        minNacionales = x;
    }

    public void establecerCostoMin(double x) {
        costoMin = x;
    }

    public void establecerTarifaBase(double x) {
        tarifaBase = x;
    }

    @Override
    public void establecerPagoMensual() {

        // pagoMensual = (preBase + seguroPa + seguroCa);
    }

    public double obtenerMinNacionales() {
        return minNacionales;
    }

    public double obtenerCostoMin() {
        return costoMin;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        String cadena = String.format("");

        return cadena;
    }

   
}
