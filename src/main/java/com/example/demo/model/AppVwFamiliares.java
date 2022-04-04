package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APP_VW_FAMILIARES")
public class AppVwFamiliares {
	@Id
	private String id_empleado     ;
	
	@Column
	private String id_pais         ;
	@Column
	private String id_familiar     ;
	@Column
	private String apellido        ;
	@Column
	private String nombres         ;
	@Column
	private String nombre_global   ;
	@Column
	private String fecha_nacimiento;
	@Column
	private String edad            ;
	@Column
	private String genero          ;
	@Column
	private String genero_esp      ;
	@Column
	private String genero_eng      ;
	@Column
	private String genero_bra      ;
	@Column
	private String genero_ger      ;
	@Column
	private String id_tipo_dep     ;
	@Column
	private String id_tipo_dep_esp ;
	@Column
	private String id_tipo_dep_eng ;
	@Column
	private String id_tipo_dep_bra ;
	@Column
	private String id_tipo_dep_ger ;
	public AppVwFamiliares(String id_empleado, String id_pais, String id_familiar, String apellido, String nombres,
			String nombre_global, String fecha_nacimiento, String edad, String genero, String genero_esp,
			String genero_eng, String genero_bra, String genero_ger, String id_tipo_dep, String id_tipo_dep_esp,
			String id_tipo_dep_eng, String id_tipo_dep_bra, String id_tipo_dep_ger) {
		this.id_empleado = id_empleado;
		this.id_pais = id_pais;
		this.id_familiar = id_familiar;
		this.apellido = apellido;
		this.nombres = nombres;
		this.nombre_global = nombre_global;
		this.fecha_nacimiento = fecha_nacimiento;
		this.edad = edad;
		this.genero = genero;
		this.genero_esp = genero_esp;
		this.genero_eng = genero_eng;
		this.genero_bra = genero_bra;
		this.genero_ger = genero_ger;
		this.id_tipo_dep = id_tipo_dep;
		this.id_tipo_dep_esp = id_tipo_dep_esp;
		this.id_tipo_dep_eng = id_tipo_dep_eng;
		this.id_tipo_dep_bra = id_tipo_dep_bra;
		this.id_tipo_dep_ger = id_tipo_dep_ger;
	}
	public AppVwFamiliares() {
	}
	public String getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getId_pais() {
		return id_pais;
	}
	public void setId_pais(String id_pais) {
		this.id_pais = id_pais;
	}
	public String getId_familiar() {
		return id_familiar;
	}
	public void setId_familiar(String id_familiar) {
		this.id_familiar = id_familiar;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getNombre_global() {
		return nombre_global;
	}
	public void setNombre_global(String nombre_global) {
		this.nombre_global = nombre_global;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGenero_esp() {
		return genero_esp;
	}
	public void setGenero_esp(String genero_esp) {
		this.genero_esp = genero_esp;
	}
	public String getGenero_eng() {
		return genero_eng;
	}
	public void setGenero_eng(String genero_eng) {
		this.genero_eng = genero_eng;
	}
	public String getGenero_bra() {
		return genero_bra;
	}
	public void setGenero_bra(String genero_bra) {
		this.genero_bra = genero_bra;
	}
	public String getGenero_ger() {
		return genero_ger;
	}
	public void setGenero_ger(String genero_ger) {
		this.genero_ger = genero_ger;
	}
	public String getId_tipo_dep() {
		return id_tipo_dep;
	}
	public void setId_tipo_dep(String id_tipo_dep) {
		this.id_tipo_dep = id_tipo_dep;
	}
	public String getId_tipo_dep_esp() {
		return id_tipo_dep_esp;
	}
	public void setId_tipo_dep_esp(String id_tipo_dep_esp) {
		this.id_tipo_dep_esp = id_tipo_dep_esp;
	}
	public String getId_tipo_dep_eng() {
		return id_tipo_dep_eng;
	}
	public void setId_tipo_dep_eng(String id_tipo_dep_eng) {
		this.id_tipo_dep_eng = id_tipo_dep_eng;
	}
	public String getId_tipo_dep_bra() {
		return id_tipo_dep_bra;
	}
	public void setId_tipo_dep_bra(String id_tipo_dep_bra) {
		this.id_tipo_dep_bra = id_tipo_dep_bra;
	}
	public String getId_tipo_dep_ger() {
		return id_tipo_dep_ger;
	}
	public void setId_tipo_dep_ger(String id_tipo_dep_ger) {
		this.id_tipo_dep_ger = id_tipo_dep_ger;
	}
	@Override
	public String toString() {
		return "AppVwFamiliares [id_empleado=" + id_empleado + ", id_pais=" + id_pais + ", id_familiar=" + id_familiar
				+ ", apellido=" + apellido + ", nombres=" + nombres + ", nombre_global=" + nombre_global
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", edad=" + edad + ", genero=" + genero + ", genero_esp="
				+ genero_esp + ", genero_eng=" + genero_eng + ", genero_bra=" + genero_bra + ", genero_ger="
				+ genero_ger + ", id_tipo_dep=" + id_tipo_dep + ", id_tipo_dep_esp=" + id_tipo_dep_esp
				+ ", id_tipo_dep_eng=" + id_tipo_dep_eng + ", id_tipo_dep_bra=" + id_tipo_dep_bra + ", id_tipo_dep_ger="
				+ id_tipo_dep_ger + "]";
	}
	
	
	
	
}
