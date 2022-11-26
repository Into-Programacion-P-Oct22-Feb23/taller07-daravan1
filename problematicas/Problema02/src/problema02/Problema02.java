/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author darav
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 4;
        int numero = 2;
        String cadena = "";
        
        while (contador <= 22){
            cadena = cadena+ + numero + "\n" ;
            numero =  numero + contador;
            contador = contador + 2;
        }
     
        System.out.printf("%s\n", cadena);
    }
    
}
