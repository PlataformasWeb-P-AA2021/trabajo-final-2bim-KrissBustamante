/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete1.PlanCelular;
import paquete1.Propietario;
import paquete2.PlanPostPagoMegas;
import paquete2.PlanPostPagoMinutos;
import paquete2.PlanPostPagoMinutosMegas;
import paquete2.PlanPostPagoMinutosMegasEconomico;

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
       ArrayList<PlanCelular> lista = new ArrayList();
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
                System.out.println("----- Propietario ------");
                System.out.println("Ingrese el nombre");
                String nombre = sc.nextLine();
                System.out.println("Ingres el apellido");
                String apell = sc.nextLine();
                System.out.println("Ingrese la identificacion");
                String iden = sc.nextLine();
                System.out.println("Ingrese la ciudad del propietario");
                String ciu = sc.nextLine();
                System.out.println("Ingrese la marca del celular");
                String mar = sc.nextLine();
                System.out.println("Ingrese el número del celular");
                String num = sc.nextLine();
                
                
        
                switch (opcionIngreso) {
                    case 1:
                        System.out.println("====Plan Post Pago Minutos====");
                        System.out.println("Ingrese los minutos nacionales");
                        

                        break;
                    case 2:
                        //
                        break;
                    case 3:
                        System.out.println("Ingrese el numero de minutos"
                                + "que consume");
                        double min = sc.nextDouble();
                        System.out.println("Ingrese el costo de minutos de "
                                + "su Plan");
                        double costoMin = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Ingrese el numero megas que desea");
                        double megas = sc.nextDouble();
                        
                        System.out.println("Ingrese el Costo por cada Gigas");
                        double costo = sc.nextDouble();
                       
                 
                        break;
                    case 4:
                        System.out.println("Ingrese el numero de minutos"
                                + "que consume");
                        double min2 = sc.nextDouble();
                        System.out.println("Ingrese el costo de minutos de "
                                + "su Plan");
                        double costoMin2 = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Ingrese el numero megas que desea");
                        double megas2 = sc.nextDouble();
                        
                        System.out.println("Ingrese el Costo por cada Gigas");
                        double costo2 = sc.nextDouble();
                        
                      
                        
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
    

