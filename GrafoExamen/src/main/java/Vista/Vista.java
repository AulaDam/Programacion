/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;
import modelo.Grafo;
import modelo.Transicion;

/**
 *
 * @author Enrique
 */
public class Vista {
    
    Grafo grafo;
    
    public Vista (Grafo grafo){
        this.grafo=grafo;
    }
    
    
     public int  mostrarOpciones(String estadoActual) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Estamos en: "+ estadoActual+ " Que quieres hacer?");
       for (Transicion tr: grafo.mapa.get(estadoActual) ){
            System.out.println(tr.evento.id+":  "+tr.evento.texto);
       }
        System.out.println("6: Salir ");
     
       return sc.nextInt();
        
        
    }
    
    
}
