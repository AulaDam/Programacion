/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafoexamen;

import Excepciones.ExcepcionFinDeJuego;
import Excepciones.ExcepcionObjetoRequerido;
import Vista.Vista;
import modelo.Grafo;

/**
 *
 * @author Enrique
 */
public class Maquina {
    
    Grafo grafo;
    Vista vista;
    String estadoInicial;
    String estadoFinal;
    String finalizar;
    int evento=0;
    
    boolean casco= false;

    public Maquina(Vista vista, Grafo grafo, String estadoInicial, String estadoFinal, String finalizar) {
        this.grafo = grafo;
        this. vista=vista;
        this.estadoInicial = estadoInicial;
        this.estadoFinal = estadoFinal;
        this.finalizar = finalizar;
    }

   
    
   public void run() throws ExcepcionFinDeJuego{
      
       String estadoActual=estadoInicial;
       
       
       while(true){
           
           evento=vista.mostrarOpciones(estadoActual);
           
           if (evento==6) throw new ExcepcionFinDeJuego();
           if(evento==2)casco=true;
           
           String estadoSiguiente = grafo.siguienteLugar(estadoActual,evento);
           
           if (estadoSiguiente.contentEquals("Galeria en ruinas")&& casco==false){
               
               try {
                   throw new ExcepcionObjetoRequerido();
               } catch (ExcepcionObjetoRequerido ex) {
                   System.out.println("Se necesita el casco. Encuentralo primero");
               }
           
           }
               else
                     estadoActual=estadoSiguiente;
           
           
       }
       
       
       
       
       
       
   }

   
}

