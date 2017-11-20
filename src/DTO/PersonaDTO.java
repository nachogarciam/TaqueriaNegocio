/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author amaci
 */
public class PersonaDTO {

    public String nombre;
    public String telefono;

    public PersonaDTO() {

    }

    public PersonaDTO(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public PersonaDTO(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono;
    }
}
