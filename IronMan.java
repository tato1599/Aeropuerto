package aeropuerto;

public class IronMan extends TransporteAereo implements Volador {

private final String nombre = "Iron man";
@Override
public void aterrizar(){
System.out.println(" Despejar zona y sin material inflamable cercano");
}
public String getNombre(){
    return nombre;
}
@Override
public String toString() {
    return "IronMan [nombre=" + nombre + "]";
}
    
}
