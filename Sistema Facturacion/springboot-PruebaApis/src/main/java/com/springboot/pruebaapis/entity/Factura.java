package com.springboot.pruebaapis.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Factura")
public class Factura implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFactura;

    private String num_Orden;
    private String fecha_Factura;
    private BigDecimal total_Factura;

    // Constructor por defecto
    public Factura() {
    }

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getNum_Orden() {
		return num_Orden;
	}

	public void setNum_Orden(String num_Orden) {
		this.num_Orden = num_Orden;
	}

	public String getFecha_Factura() {
		return fecha_Factura;
	}

	public void setFecha_Factura(String fecha_Factura) {
		this.fecha_Factura = fecha_Factura;
	}

	public BigDecimal getTotal_Factura() {
		return total_Factura;
	}

	public void setTotal_Factura(BigDecimal total_Factura) {
		this.total_Factura = total_Factura;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", num_Orden=" + num_Orden + ", fecha_Factura=" + fecha_Factura
				+ ", total_Factura=" + total_Factura + "]";
	}

    
}