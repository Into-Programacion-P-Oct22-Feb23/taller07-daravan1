/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author darav
 */


public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String listadoEdades = "";
        String nombreJugador;
        String posicionCampo;
        
        int edad;
        double estatura;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;
        double  sumaEstaturas = 0;
        int contadorIteraciones = 0;
        double promedioEdad;
        double promedioEstatura;
        
        cadenaReporte = String.format("%s%s\n", cadenaReporte, 
                "Listado de Jugadores");
        
        do{
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
                       
            // sumo la edad a sumaEdades
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            
            // agrego una iteración
            contadorIteraciones = contadorIteraciones + 1; // primera(0+1=1)
            
            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad);
            
            listadoEdades = String.format("%s%d\n", listadoEdades,
                    edad); 
            
            entrada.nextLine(); 
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
                } 
            } while(bandera);
        
        promedioEdad = (double)sumaEdades/contadorIteraciones;
        promedioEstatura = (double)sumaEstaturas/contadorIteraciones;
        
        // presentación de cadena final
        System.out.printf("%s", cadenaReporte);
                // Promedio de edades: 
        System.out.printf("Listado De Edades\n%s", listadoEdades);
        System.out.printf("Promedio de edades: %.2f\n",
                promedioEdad);
        System.out.printf("Promedio de estaturas: %.2f\n",
                promedioEstatura);
    }
    
}
