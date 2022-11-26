/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author darav
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 2;
        int contador = 3;
        String cadena = "";
        
         do{
             
            cadena = cadena+ + numero + "\n" ;
            numero =  numero + contador;
            contador = contador + 2;
        
         }while (contador <= 13);
        
         System.out.printf("%s\n", cadena);
    }
    
}
