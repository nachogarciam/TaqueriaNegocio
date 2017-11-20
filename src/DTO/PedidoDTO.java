/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author *
 */
public class PedidoDTO {
    public String idPedido;
    public String orden;
    public ClienteDTO cliente;
    public RepartidorDTO repartidor;
    
    public PedidoDTO() {
        
    }
    
    public PedidoDTO(String orden, ClienteDTO cliente, RepartidorDTO repartidor) {
        this.orden = orden;
        this.cliente = cliente;
        this.repartidor = repartidor;
    }

    public String getIdPedido() {
        return idPedido;
    }

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

    @Override
    public String toString() {
        return "Pedido{" + "orden=" + orden + ", cliente=" + cliente + ", repartidor=" + repartidor + '}';
    }
    
    
}
