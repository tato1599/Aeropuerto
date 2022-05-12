package aeropuerto;

class Superman extends TransporteAereo implements Volador{
    private final String nombre="Clark Kent";
     @Override
     public void aterrizar() {
     System.out.println("Zona despejada");
     }
     
     public String getNombre() {
     return nombre;
     }

    @Override
    public String toString() {
        return " Superman Nombre:" + nombre ;
    }
     
     }
