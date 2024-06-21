package com.springboot.pruebaapis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrdenCompra")
public class OrdenCompra {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idOrden;
    private int idCliente;
    private String numOrden;
    private int idProducto;
    private String imagen;
    private String nombre;
    private String estado;
    private int cantidad;

    // Constructor
    public OrdenCompra() {
    }

    // Getters y Setters
    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(String numOrden) {
        this.numOrden = numOrden;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

	@Override
	public String toString() {
		return "OrdenCompra [idOrden=" + idOrden + ", idCliente=" + idCliente + ", numOrden=" + numOrden
				+ ", idProducto=" + idProducto + ", imagen=" + imagen + ", nombre=" + nombre + ", estado=" + estado
				+ ", cantidad=" + cantidad + "]";
	}   
    
    
}