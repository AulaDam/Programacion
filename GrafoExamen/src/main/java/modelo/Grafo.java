/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Enrique
 */
public class Grafo {
    
    public HashMap<String, ArrayList<Transicion>> mapa;

    public Grafo() {
        
        mapa=new HashMap<>();
    }
    
    
    
    public void crearNodo(String lugar){
        
       mapa.put(lugar, new ArrayList<>());
    }
    
    public void crearTransicion(String lugar, Transicion transicion){
        
        if (mapa.get(lugar)!=null){
            mapa.get(lugar).add(transicion);
        }
    }
    
    public String siguienteLugar(String lugar, int idEvent){
        
        
        for (Transicion t: mapa.get(lugar) ){
            if(t.evento.id==idEvent){
                return t.lugar;
            }
        }
        return lugar;
    }

    
    
    
}
