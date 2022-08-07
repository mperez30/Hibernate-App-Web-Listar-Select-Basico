package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name="id_persona")
    @Id
    private int idPersona;
    
    private String nombre;
    
    private String apellido;
    
    private String email;
    
    private String telefonp;
    
    public Persona(){}

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonp() {
        return telefonp;
    }

    public void setTelefonp(String telefonp) {
        this.telefonp = telefonp;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefonp + '}';
    }
    
}
