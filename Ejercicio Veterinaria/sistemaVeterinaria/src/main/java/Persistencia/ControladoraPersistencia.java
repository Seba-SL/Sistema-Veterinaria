package Persistencia;

import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import logica.Duenio;
import logica.Mascota;

public class ControladoraPersistencia 
{
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco)
    {
        duenioJpa.create(duenio);
        mascotaJpa.create(masco);
     
    }

    public List<Mascota> traerMascotas()
    {
       return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) throws NonexistentEntityException {
        mascotaJpa.destroy(num_cliente);
        
    }

    public Mascota traerMascota(int num_cliente) {
      return  mascotaJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) throws Exception {
       mascotaJpa.edit(masco);
    }

    public Duenio traerDuenio(int id_duenio) {
     return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio duenio) throws Exception {
       duenioJpa.edit(duenio);
    }
    
}
 