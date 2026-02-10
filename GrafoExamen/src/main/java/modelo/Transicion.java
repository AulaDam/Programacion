/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Enrique
 */
public class Transicion {
    
    public Evento evento;
    public String lugar;

    public Transicion(Evento evento, String  lugar) {
        this.evento = evento;
        this.lugar = lugar;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.evento);
        hash = 13 * hash + Objects.hashCode(this.lugar);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transicion other = (Transicion) obj;
        if (!Objects.equals(this.evento, other.evento)) {
            return false;
        }
        return Objects.equals(this.lugar, other.lugar);
    }
    
   
    
}
