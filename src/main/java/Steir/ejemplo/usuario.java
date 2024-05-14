package Steir.ejemplo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    private String rol;
    private String clave;
    
 // Constructor con parámetros
    public usuario(String rol, String clave) {
        super();
        this.rol = rol;
        this.clave = clave;
    }

    // Constructor vacío
    public usuario() {
        super();
    }
    
    // Métodos getter y setter para idUsuario
    public Integer getIdusuario() {
        return this.idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

 // Métodos getter y setter para rol
    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Métodos getter y setter para clave
    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
 // Método hashCode() para generar un código hash único basado en el idUsuario
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idusuario == null) ? 0 : idusuario.hashCode());
        return result;
    }

    // Método equals() para comparar objetos de tipo Usuario basado en el idUsuario
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        usuario other = (usuario) obj;
        if (idusuario == null) {
            if (other.idusuario != null)
                return false;
        } else if (!idusuario.equals(other.idusuario))
            return false;
        return true;
    }

    // Método toString() para devolver una representación en forma de cadena del objeto Usuario
    @Override
    public String toString() {
        return "usuario [idusuario=" + idusuario + ", rol=" + rol + ", clave=" + clave + "]";
    }
} 
