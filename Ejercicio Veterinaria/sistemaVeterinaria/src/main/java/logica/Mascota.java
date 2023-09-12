package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Mascota implements Serializable 
{
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private int num_cliente;
   private String Nombre;
   private String raza;
   private String Color;
   private String alergico ;
   private String tratEspecial ;
   private String observaciones;
   @OneToOne
   private Duenio unDuenio; // foreign key

   public Mascota()
   {
       
   }

    public Mascota(int num_cliente, String Nombre, String raza, String Color, String alergico, String tratEspecial, String observaciones, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.Nombre = Nombre;
        this.raza = raza;
        this.Color = Color;
        this.alergico = alergico;
        this.tratEspecial = tratEspecial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getTratEspecial() {
        return tratEspecial;
    }

    public void setTratEspecial(String tratEspecial) {
        this.tratEspecial = tratEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
   
}
