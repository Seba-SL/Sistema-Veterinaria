package logica;

import Persistencia.ControladoraPersistencia;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class Controladora 
{
    ControladoraPersistencia controlPers = new ControladoraPersistencia();
//(nombreMascota,celularDuenio,colorMascota,nombreDuenio,obsMascota,razaMascota,alergico,especial);
    public void guardar(String nombreMascota, String celularDuenio, String colorMascota, String nombreDuenio, String obsMascota, String razaMascota, String alergico, String especial) 
    {
      Duenio duenio = new Duenio();
      
      duenio.setNombre(nombreDuenio);
      duenio.setNumeroCel(celularDuenio);
      
      Mascota masco = new Mascota();
      masco.setNombre(nombreMascota);//nombre
      masco.setColor(colorMascota);
      masco.setRaza(razaMascota);
      masco.setTratEspecial(especial);
      masco.setAlergico(alergico);
      masco.setObservaciones(obsMascota);
      masco.setUnDuenio(duenio);
      
    
      
      controlPers.guardar(duenio,masco);
              
    }

    public List<Mascota> traerMascotas()
    {
        return controlPers.traerMascotas();
       
    }

    public void borrarMascota(int num_cliente) throws NonexistentEntityException 
    {
        controlPers.borrarMascota(num_cliente);
       
    }

    public void editarMascota(int num_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Mascota buscarMascota(int num_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Mascota traerMascota(int num_cliente) {
       return controlPers.traerMascota(num_cliente);
    }

    public void ModificarMascota(Mascota masco, String nombreMascota, 
            String colorMascota, String obsMascota, String razaMascota,
            String alergico, String especial, String nombreDuenio, String celularDuenio) throws Exception 
    {
        masco.setNombre(nombreMascota);
        masco.setColor(colorMascota);
        masco.setAlergico(alergico);
        masco.setRaza(razaMascota);
        masco.setTratEspecial(especial);
        masco.setObservaciones(obsMascota);
        
        //modifico mascota
        controlPers.modificarMascota(masco);
        
        Duenio duenio = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        
        duenio.setNombre(nombreDuenio);
        duenio.setNumeroCel(celularDuenio);
        
        //llamar a modififcar dueño
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPers.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio duenio) throws Exception {
       controlPers.modificarDuenio(duenio);
    }
    
      
}
