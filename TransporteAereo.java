package aeropuerto;

public class TransporteAereo {
    private String licencia;
 public void aterrizar() {
 //aqui va el codigo del modo que tiene que aterrizar un avion privado o avión de línea aérea o superman
 }
 public String getLicencia() {
 return licencia;
 }
 public void setLicencia(String licencia) {
 this.licencia = licencia;
 }
@Override
public String toString() {
    return "TransporteAereo [licencia=" + licencia + "]";
}
 
}
