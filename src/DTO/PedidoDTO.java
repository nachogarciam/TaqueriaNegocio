/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author *
 */
public class PedidoDTO {
//    public String idPedido;
    public String orden;
    public ClienteDTO cliente;
    public RepartidorDTO repartidor;
    public Date fecha;
    public boolean entregado=false;
    public String telefono;
    
    public PedidoDTO() {
        
    }
    
    public PedidoDTO(String orden, ClienteDTO cliente, Date fecha, String Telefono) {
        this.orden = orden;
        this.cliente = cliente;
        this.fecha=fecha;
        this.telefono=telefono;
    }

//    public String getIdPedido() {
//        return idPedido;
//    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public RepartidorDTO getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(RepartidorDTO repartidor) {
        this.repartidor = repartidor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Pedido{" + "orden=" + orden + ", cliente=" + cliente + ", repartidor=" + repartidor + '}';
    }
    
    
}
