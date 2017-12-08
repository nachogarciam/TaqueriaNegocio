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
public class ClienteDTO extends PersonaDTO {

    public String idCliente;
    public String direccion;
    public int historialPedidos;

    public ClienteDTO() {

    }

    public ClienteDTO(String nombre, String telefono, String direccion) {
        super(nombre, telefono);
        this.direccion = direccion;
    }

    public ClienteDTO(String idCliente, String nombre, String telefono, String direccion) {
        super(nombre, telefono);
        this.idCliente=idCliente;
        this.direccion = direccion;
    }
    public ClienteDTO(String nombre, String telefono, String direccion, int historialPedidos) {
        super(nombre, telefono);
        this.direccion = direccion;
        this.historialPedidos = historialPedidos;
    }

    public ClienteDTO(ClienteDTO cliente) {
        super(cliente.getNombre(), cliente.getTelefono());
        this.idCliente = cliente.getIdCliente();
        this.direccion = cliente.getDireccion();
    }

    public ClienteDTO(String telefono) {
        super(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHistorialPedidos(int historialPedidos) {
        this.historialPedidos = historialPedidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getHistorialPedidos() {
        return historialPedidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idCliente);
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
        final ClienteDTO other = (ClienteDTO) obj;
        if (!Objects.equals(this.idCliente, other.idCliente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "idCliente=" + idCliente + ", direccion=" + direccion + ", historialPedidos=" + historialPedidos + '}';
    }

}
