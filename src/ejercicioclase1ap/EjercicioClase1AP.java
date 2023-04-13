/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase1ap;

/**
 *
 * @author Exequiel Vizuara
 */
public class EjercicioClase1AP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;
        boolean parOImpar = true; //true = par. false = impar.

    //PROBLEMA 1
        /*
        //EJERCICIO A
        while (numeroInicio < numeroFin) {
            System.out.println(numeroInicio);
            numeroInicio = numeroInicio + 1;
        }
        System.out.println(numeroFin);
    }
         */
 /*
        //EJERCICIO B
        for (int i = numeroInicio; i <= numeroFin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
         */
        //EJERCICIO C
        /*
        if(parOImpar == true) {
            for (int i = numeroInicio; i <= numeroFin; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = numeroInicio; i <= numeroFin; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
         */
 /*
        //EJERCICIO D
        for (int i = numeroFin; i >= numeroInicio; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
         */
    //PROBLEMA 2
        //EJERCICIO D
        /*
        float ingresos = 0;
        int vehiculos = 0;
        int inmuebles = 0;
       
        if ((ingresos >= 489.083f) && (vehiculos >= 3) && (inmuebles >= 3)) {
            System.out.println("Clase I");
        } else if ((ingresos >= 489.083f) && (vehiculos <= 3) && (inmuebles <= 3)) {
            System.out.println("Clase II");
        } else System.out.println("Clase III");
        */
    }
}
