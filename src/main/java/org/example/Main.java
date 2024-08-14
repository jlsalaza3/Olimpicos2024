package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Necesito hacer un listado de los paises suramericanos
        // Para cada país necesito almacenar el numero de:
        // Medallas Oro
        // Medallas Plata
        // Medallas Bronce
        // Sumar el numero de medallas de cada país
        // Informar cual es el país con mas medallas
        // Informar el país con menos medallas
        // Termnar sumando el total de medallas de los países suramericanos


        Scanner leerTeclado = new Scanner(System.in);
        ArrayList<String> paises=new ArrayList<>();
        ArrayList<Integer> medallas=new ArrayList<>();// como es un int pero esta dentro de un arreglo hay que llamarlo como una emboltura INTEGRER
        System.out.println("********OLIMPICOS 2024******");

        for (int i=0; i<5; i++){
            System.out.print("ingrese el nombre del País: ");
            String pais;
            int sumatoriaMedallas=0;
            pais=leerTeclado.nextLine();
            paises.add(pais);

            // PIDIENDO LOS DATOS DE MEDALLAS DE CADA PAIS
            System.out.println("Digita el numero de medallas de oro de "+pais+":");
            int medallasOro=leerTeclado.nextInt();
            System.out.println("Digita el numero de medallas de plata de "+pais+":");
            int medallasPlata=leerTeclado.nextInt();
            System.out.println("Digita el numero de medallas de bronce de "+pais+":");
            int medallasBronce=leerTeclado.nextInt();
            sumatoriaMedallas=medallasOro+medallasPlata+medallasBronce;
            System.out.println(pais+" obtuvo en total: "+sumatoriaMedallas+" Medallas en Paris");
            leerTeclado.nextLine(); // esto es para limpiar el boofer y no se salte

            medallas.add(sumatoriaMedallas);


        }
        //recorriendo un arreglo con un FOR EACH, requiere una variable auxiliar en singular,
        // como esta pais dentro de otra llave se puede repetir el nombre pais
                int paisMayor=medallas.get(0); //para comparar empezamos con a posición cero y se le asigna el mayor para empezar a comparar
                int paisMenor=medallas.get(0);
                for (Integer medalla:medallas){
                    if (medalla>paisMayor){
                        paisMayor=medalla;
                    }
                    if (medalla<paisMenor){
                        paisMenor=medalla;
                    }
                   // System.out.println(medalla);
                }
                System.out.println("el pais con mas medallas obtuvo un total de: "+ paisMayor);
                System.out.println("el pais con menos medallas obtuvo un total de: "+ paisMenor);

                // quiero preguntar cual es el cajon indice donde se guardo la cantidad mayor de medallas
                int indiceganador= medallas.indexOf(paisMayor);
                int indiceperdedor= medallas.indexOf(paisMenor);
        System.out.println("el indice ganador es el: "+indiceganador);
        System.out.println("el indice perdedor es el: "+indiceperdedor);
                // quiero obtener el valor que hay dentro de un cajon
        System.out.println("asi pues el pais ganador:"+paises.get(indiceganador));

        // cual es el pais que quedo de ultimo
        System.out.println("asi pues el pais perdedor:"+paises.get(indiceperdedor));






    }
}