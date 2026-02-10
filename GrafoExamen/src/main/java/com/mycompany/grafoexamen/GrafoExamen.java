/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grafoexamen;

import Excepciones.ExcepcionFinDeJuego;
import Vista.Vista;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Evento;
import modelo.Grafo;
import modelo.Transicion;


/**
 *
 * @author Enrique
 */
public class GrafoExamen {

    public static void main(String[] args) {
        System.out.println("BIENVENIDOS A LA AVENTURA SUBTERRANEA");
        
        Grafo grafo =new Grafo();
                     
        grafo.crearNodo("Tunel");
        grafo.crearNodo("Sala de maquinas");
        grafo.crearNodo("Pasillo subterraneo");
        grafo.crearNodo("Galeria en ruinas");
        grafo.crearNodo("Galeria en ruinas");
        grafo.crearNodo("Camara del tesoro");
        
        grafo.crearTransicion("Tunel", new Transicion (new Evento(0,"Izquierda"), "Sala de maquinas"));
        grafo.crearTransicion("Tunel", new Transicion (new Evento(1,"baja"), "Pasillo subterraneo"));
        grafo.crearTransicion("Sala de maquinas", new Transicion (new Evento(2,"coger casco"), "Sala de maquinas")); 
        grafo.crearTransicion("Sala de maquinas", new Transicion (new Evento(3,"baja"), "Pasillo subterraneo")); 
        grafo.crearTransicion("Pasillo subterraneo", new Transicion (new Evento(4,"sube"), "Sala de maquinas")); 
        grafo.crearTransicion("Pasillo subterraneo", new Transicion (new Evento(5,"avanza"), "Galeria en ruinas")); 
        grafo.crearTransicion("Galeria en ruinas", new Transicion (new Evento(6,"accede al tesoro"), "Camara del tesoro")); 

        Vista vista=new Vista(grafo);
        Maquina maquina = new Maquina(vista, grafo,"Tunel", "Camara del tesoro", "salir");
        try {
            maquina.run();
        } catch (ExcepcionFinDeJuego ex) {
            System.out.println("Juego terminado");
        }
        
        
        
    }
}
