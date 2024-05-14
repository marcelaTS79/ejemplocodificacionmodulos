package Steir.ejemplo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: registro
 *
 */
@Entity

public class registro implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idusuario;
	private String Nombres_apellidos;
	private String Tipo_documento;
	private String Número;
	private String Email;
	private String Teléfono;
	private String Clave;
	private static final long serialVersionUID = 1L;
	
	

	public registro(String Nombres_apellidos, String Tipo_documento, String Número, String Email, String Teléfono,
			String Clave) {
		super();
		this.Nombres_apellidos = Nombres_apellidos;
		this.Tipo_documento = Tipo_documento;
		this.Número = Número;
		this.Email = Email;
		this.Teléfono = Teléfono;
		this.Clave = Clave;
	}
	public registro() {
		super();
	}   
	public Integer getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}   
	public String getNombres_apellidos() {
		return this.Nombres_apellidos;
	}

	public void setNombres_apellidos(String Nombres_apellidos) {
		this.Nombres_apellidos = Nombres_apellidos;
	}   
	public String getTipo_documento() {
		return this.Tipo_documento;
	}

	public void setTipo_documento(String Tipo_documento) {
		this.Tipo_documento = Tipo_documento;
	}   
	public String getNúmero() {
		return this.Número;
	}

	public void setNúmero(String Número) {
		this.Número = Número;
	}   
	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}   
	public String getTeléfono() {
		return this.Teléfono;
	}

	public void setTeléfono(String Teléfono) {
		this.Teléfono = Teléfono;
	}   
	public String getClave() {
		return this.Clave;
	}

	public void setClave(String Clave) {
		this.Clave = Clave;
	}
   
}
