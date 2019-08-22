package com.hibernatepractica1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")

public class Producto {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int idProducto;
	@Column
	private String nombreProducto;
	@Column
	private Double precioProducto;
	@Column
	private int existenciasProducto;
	
	
	public Producto() {
		
	}
	public Producto(String nombreProducto, Double precioProducto, int existenciasProducto) {
		super();
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.existenciasProducto = existenciasProducto;
	}
	
	public Producto(int idProducto, String nombreProducto, Double precioProducto, int existenciasProducto) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.existenciasProducto = existenciasProducto;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public int getExistenciasProducto() {
		return existenciasProducto;
	}
	public void setExistenciasProducto(int existenciasProducto) {
		this.existenciasProducto = existenciasProducto;
	}
	
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + ", existenciasProducto=" + existenciasProducto + "]";
	}
	
	
	
}
