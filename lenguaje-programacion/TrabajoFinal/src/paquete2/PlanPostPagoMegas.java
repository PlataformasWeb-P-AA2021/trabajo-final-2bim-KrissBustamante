/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author USUARIO
 */
public class PlanPostPagoMegas {

    private double megasGigas;
    private double costoGigas;
    private double tarifaBase;

    public PlanPostPagoMegas() {
        super();
        megasGigas = mg;
        costoGigas = cj;
        tarifaBase = tb;

    }

    public void establecerMegasGigas(double x) {
        megasGigas = x;
    }

    public void establecerCostoGigas(double x) {
        costoGigas = x;
    }

    public void establecerTarifaBase(double x) {
        tarifaBase = x;
    }

    @Override
    public void establecerPagomensual() {

        pagoMensual = (preBase + seguroPa + seguroCa);
    }

    public double obtenerMegasGigas() {
        return megasGigas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        String cadena = String.format();

        return cadena;
    }
}
