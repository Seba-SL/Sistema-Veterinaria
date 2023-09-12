package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Duenio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-08-22T10:33:34", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, String> Nombre;
    public static volatile SingularAttribute<Mascota, Integer> num_cliente;
    public static volatile SingularAttribute<Mascota, String> tratEspecial;
    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, String> alergico;
    public static volatile SingularAttribute<Mascota, String> Color;
    public static volatile SingularAttribute<Mascota, String> observaciones;
    public static volatile SingularAttribute<Mascota, Duenio> unDuenio;

}