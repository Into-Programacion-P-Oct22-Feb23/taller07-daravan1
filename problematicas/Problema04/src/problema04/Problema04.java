/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author darav
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 1;
        int denominador = 1;
        String mensaje = "";
        
        while(contador <= 8){
            
            if (contador%2 == 0){
                mensaje = mensaje + "-1/" + denominador;
            }
            else{
                mensaje = mensaje + "+1/" + denominador ;
                    }
            contador = contador + 1;
            denominador = denominador + 2;
        } 
         
        System.out.println(mensaje);
        }
               
    }
