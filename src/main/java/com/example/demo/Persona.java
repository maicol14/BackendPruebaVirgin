package com.example.demo;

import javax.persistence.*;

@Entity 
@Table(name = "persona")
public class Persona {
@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column
private String nombres;
@Column
private String apellidos;
@Column
private int cedula;
@Column
private String tipo_documento;
@Column 
private String fecha_nacimineto;
@Column
private String direccion;
@Column
private String celular;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public int getCedula() {
	return cedula;
}
public void setCedula(int cedula) {
	this.cedula = cedula;
}
public String getTipo_documento() {
	return tipo_documento;
}
public void setTipo_documento(String tipo_documento) {
	this.tipo_documento = tipo_documento;
}
public String getFecha_nacimineto() {
	return fecha_nacimineto;
}
public void setFecha_nacimineto(String fecha_nacimineto) {
	this.fecha_nacimineto = fecha_nacimineto;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getCelular() {
	return celular;
}
public void setCelular(String celular) {
	this.celular = celular;
}


	
}
