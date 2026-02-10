/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.probarexcepciones;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Enrique
 */
public class ProbarExcepciones {

    public static void main(String[] args)  {
         
        int a=5;
        int b=0;
        int resultado=0;
       
        try {
             resultado= hacerDivision(a,b);
        } catch (ArithmeticException e){
             System.out.println("Captura division por cero");
        }catch (Exception ex) {
            Logger.getLogger(ProbarExcepciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /* try{
             resultado= hacerDivision(a,b);
        }catch (ArithmeticException e){
             System.out.println("Captura division por cero");
        }
        */
         System.out.println("Imprime resultado: "+ resultado);
        
    }

    private static int hacerDivision(int a, int b){
        int solucion=0;
         solucion=a/b;
       
        /*
         try{
             
           
        }catch(Exception e){
            
            System.out.println("La division no se puede hacer: division por cero");
            
        
        }
*/
        
            
            return solucion;

    }
}
