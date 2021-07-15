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
public class PlanPostPagoMinutosMegas {

    private double min;
    private double costoMin;
    private double megasGigas;
    private double costoGigas;

    public PlanPostPagoMinutosMegas() {
        super();
        min = m;
        costoMin = cn;
        megasGigas = mj;
        costoGigas = cg;

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
    public void establecerPagomensual() {

        pagoMensual = (preBase + seguroPa + seguroCa);
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
        String cadena = String.format();

        return cadena;
    }
}
