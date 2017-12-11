/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author *
 */
public class PedidoDTO {
//    public String idPedido;
public int id;
    public String orden = "";
    public double total = 0.0;
    public ClienteDTO cliente;
    public RepartidorDTO repartidor;
//    public Date fecha;
    Timestamp fecha;
    public boolean entregado = false;
    public String telefono;
    int tacosH;
    int tacosM;
    int lorenzas;
    int toritos;
    int papaC;
    int papaSC;
    int quesadillasG;
    int quesadillasCH;
    int gorditas;
    int bebidas;
    int bebidasLitro;
    int postres;

    public PedidoDTO() {

    }

    public PedidoDTO(String orden, ClienteDTO cliente, Timestamp fecha, String Telefono) {
        this.orden = orden;
        this.cliente = cliente;
        this.fecha = fecha;
        this.telefono = telefono;
    }
    public PedidoDTO(String telefono){
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

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
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

    public int getTacosH() {
        return tacosH;
    }

    public void setTacosH(int tacosH) {
        this.tacosH = tacosH;

    }

    public int getTacosM() {
        return tacosM;
    }

    public void setTacosM(int tacosM) {
        this.tacosM = tacosM;
    }

    public int getLorenzas() {
        return lorenzas;
    }

    public void setLorenzas(int lorenzas) {
        this.lorenzas = lorenzas;
    }

    public int getToritos() {
        return toritos;
    }

    public void setToritos(int toritos) {
        this.toritos = toritos;
    }

    public int getPapaC() {
        return papaC;
    }

    public void setPapaC(int papaC) {
        this.papaC = papaC;
    }

    public int getPapaSC() {
        return papaSC;
    }

    public void setPapaSC(int papaSC) {
        this.papaSC = papaSC;
    }

    public int getQuesadillasG() {
        return quesadillasG;
    }

    public void setQuesadillasG(int quesadillasG) {
        this.quesadillasG = quesadillasG;
    }

    public int getQuesadillasCH() {
        return quesadillasCH;
    }

    public void setQuesadillasCH(int quesadillasCH) {
        this.quesadillasCH = quesadillasCH;
    }

    public int getGorditas() {
        return gorditas;
    }

    public void setGorditas(int gorditas) {
        this.gorditas = gorditas;
    }

    public int getBebidas() {
        return bebidas;
    }

    public void setBebidas(int bebidas) {
        this.bebidas = bebidas;
    }

    public int getBebidasLitro() {
        return bebidasLitro;
    }

    public void setBebidasLitro(int bebidasLitro) {
        this.bebidasLitro = bebidasLitro;
    }

    public int getPostres() {
        return postres;
    }

    public void setPostres(int postres) {
        this.postres = postres;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    public void armarPedido() {
        if (tacosH != 0) {
            orden += "Tacos Harina: " + tacosH + "\n";
            total += tacosH * 25;
        }
        if (tacosM != 0) {
            orden += "Tacos Maiz: " + tacosM + "\n";
            total += tacosM * 25;
        }
        if (lorenzas != 0) {
            orden += "Lorenzas: " + lorenzas + "\n";
            total += lorenzas * 35;
        }
        if (toritos != 0) {
            orden += "Toritos: " + toritos + "\n";
            total += toritos * 55;
        }
        if (papaC != 0) {
            orden += "Papas con Carne: " + papaC + "\n";
            total += papaC * 100;
        }
        if (papaSC != 0) {
            orden += "Papas sin Carne: " + papaSC + "\n";
            total += papaSC * 50;
        }
        if (quesadillasG != 0) {
            orden += "Quesadillas Grandes: " + quesadillasG + "\n";
            total += quesadillasG * 50;
        }
        if (quesadillasCH != 0) {
            orden += "Quesadillas Chicas: " + quesadillasCH + "\n";
            total += quesadillasCH * 35;
        }
        if (gorditas != 0) {
            orden += "Gorditas: " + gorditas + "\n";
            total += gorditas * 40;
        }
        if (bebidas != 0) {
            orden += "Bebidas: " + bebidas + "\n";
            total += bebidas * 15;
        }
        if (bebidasLitro != 0) {
            orden += "Bebidas de Litro: " + bebidasLitro + "\n";
            total += bebidasLitro * 30;
        }
        if (postres != 0) {
            orden += "Postres: " + postres + "\n";
            total += postres * 25;
        }

    }

    
    @Override
    public String toString() {
        return "Pedido{" + "orden=" + orden + ", cliente=" + cliente + ", repartidor=" + repartidor + '}';
    }

}
