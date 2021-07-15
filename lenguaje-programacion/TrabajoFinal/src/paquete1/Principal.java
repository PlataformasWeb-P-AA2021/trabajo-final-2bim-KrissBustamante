/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        boolean salida = true;
        int opcionIngreso;
        int ingresarMostrar;
        do {
            System.out.println("====EMPRESA TELEFONIA CELULAR====");
            System.out.printf("Eliga la opcion que desea:\n"
                    + "1.Ingresar Planes\n"
                    + "2.Mostrar Planes\n"
                    + "3.Salir\n ");
            ingresarMostrar = sc.nextInt();
            
            
            if (ingresarMostrar == 1) {
                System.out.println("Seleccione el plan que desea ingresar:");
                System.out.printf("1. Si desea ingresar un "
                        + "Plan Post Pago Minutos \n"
                        + "2. Si desea ingresar un Plan Post Pago Megas\n"
                        + "3. Si desea ingresar un "
                        + "Plan Post Pago Minutos Megas\n"
                        + "4. Si desea ingresar un "
                        + "Plan Post Pago Minutos Megas Economico\n"
                        );
                sc.nextLine();
                opcionIngreso = sc.nextInt();
                
                //PLAN CELULAR
                
        
                switch (opcionIngreso) {
                    case 1:
                        //

                        break;
                    case 2:
                        //
                        break;
                    case 3:
                        //
                        break;
                    case 4:
                        //
                        break;
                  
                    default:
                        System.err.println("Eligio una opcion fuera del "
                                + "rango(1-4)");
                }
            } else {
                if (ingresarMostrar == 2) {
                    System.out.println("Que lista desea mostrar:");
                    System.out.printf("1.Mostrar lista de "
                            + "Plan Post Pago Minutos\n"
                            + "2.Mostrar lista de Plan Post Pago Megas\n"
                            + "3.Mostrar lista de Plan Post "
                            + "Pago Minutos Megas\n"
                            + "4.Mostrar lista de Plan Post "
                            + "Pago Minutos Megas Economico\n"
                            +"5.Mostrar lista de Todos Los Planes\n");
                    opcionIngreso = sc.nextInt();
                    switch (opcionIngreso) {
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break;
                        case 4:
                            //
                            break;
                        case 5:
                            //
                            break;
                       
                        default:
                            System.err.println("Eligio una opcion fuera del "
                                    + "rango(1-5)");
                    }
                }
                if (ingresarMostrar == 3) {
 
                    salida = false;
                    System.out.println("\u001B[34mGracias por registrarce");
                }
               else{
                    System.err.println("Eligio una opcion fuera del "
                            + "rango(1-3)");

                }
            }
        } while (salida);
    }
    }
    

