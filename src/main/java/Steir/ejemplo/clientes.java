package Steir.ejemplo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: clientes
 *
 */
@Entity

public class clientes implements Serializable {

	   
	@Id
	private Integer id_cliente;
	private String nombre_apellido;
	private String documento_i;
	private String direccion;
	private String telefono;
	private String email;
	private String nombre_cofradia;
	private Integer idusuario;
	private Integer id_Producto;
	private static final long serialVersionUID = 1L;

	public clientes() {
		super();
	}   
	public Integer getId_cliente() {
		return this.id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}   
	public String getNombre_apellido() {
		return this.nombre_apellido;
	}

	public void setNombre_apellido(String nombre_apellido) {
		this.nombre_apellido = nombre_apellido;
	}   
	public String getDocumento_i() {
		return this.documento_i;
	}

	public void setDocumento_i(String documento_i) {
		this.documento_i = documento_i;
	}   
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}   
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getNombre_cofradia() {
		return this.nombre_cofradia;
	}

	public void setNombre_cofradia(String nombre_cofradia) {
		this.nombre_cofradia = nombre_cofradia;
	}   
	public Integer getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}   
	public Integer getId_Producto() {
		return this.id_Producto;
	}

	public void setId_Producto(Integer id_Producto) {
		this.id_Producto = id_Producto;
	}
   
}
