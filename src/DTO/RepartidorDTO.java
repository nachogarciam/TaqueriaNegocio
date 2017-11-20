/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Objects;

/**
 *
 * @author *
 */
public class RepartidorDTO extends PersonaDTO {
    public String idRepartidor;
    public int cantPedidos;
    
    public RepartidorDTO() {
        
    }
    
    public RepartidorDTO(String nombre, String telefono, int cantPedidos) {
        super(nombre, telefono);
        this.cantPedidos = cantPedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    

    public String getIdRepartidor() {
        return idRepartidor;
    }

    public int getCantPedidos() {
        return cantPedidos;
    }

    public void setCantPedidos(int cantPedidos) {
        this.cantPedidos = cantPedidos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.idRepartidor);
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
        final RepartidorDTO other = (RepartidorDTO) obj;
        if (!Objects.equals(this.idRepartidor, other.idRepartidor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "cantPedidos=" + cantPedidos + '}';
    }
    
}
