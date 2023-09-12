package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;
    private String nombre;
    private String numeroCel;

    public Duenio(){};
    
    public Duenio(int id_duenio, String nombre, String numeroCel) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.numeroCel = numeroCel;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCel() {
        return numeroCel;
    }

    public void setNumeroCel(String numeroCel) {
        this.numeroCel = numeroCel;
    }
    
    
    
    
}
