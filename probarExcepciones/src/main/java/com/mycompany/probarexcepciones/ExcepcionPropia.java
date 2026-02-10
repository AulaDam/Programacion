/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.probarexcepciones;

import java.util.logging.Level;
import java.util.logging.Logger;



public class ExcepcionPropia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        int n=-3;
       //  imprimirValoresPositivos();
       
       int[] vector1= {1,2,3};
       int[] vector2= {1,2};
       /*
        try {
            int r= operadorVectores (vector1, vector2);
        } catch (MiException ex) {
            System.out.println(ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Los vectores no son iguales");
        }
       */
        
    }
/*
    private static void imprimirValoresPositivos()throws Exception {
        int n=-3;
        if(n<0) 
            throw new Exception("Valor negativo no puede ser");
        
            
        System.out.println(n);
    }
*/
    private static int operadorVectores(int[] vector1, int[] vector2) throws MiException {
            int valor=0;
        if (vector1.length!=vector2.length)throw new MiException("Los vectores no son igual longitud");
        for (int i=0; i<vector1.length; i++) valor+=vector1[i]-vector2[i];
        if (valor<0) throw new MiException("Valor negativo en el resultado");
        return valor;
    }
    

}
