package aeropuerto;

public class Aeropuerto {
    public void darPermisoDeAterrizaje(Volador v){
    v.aterrizar();
    if(v instanceof AvionPrivado){
    AvionPrivado ap = (AvionPrivado)v;
    ap.setPropietario("Daniel");
    System.out.println("Aterrizo Licencia " + ap.getLicencia() + ap.toString());
    }
    if(v instanceof AvionDePasajeros){
    AvionDePasajeros adp = (AvionDePasajeros)v;
    System.out.println("Aterrizo Licencia " + adp.getAerolinea() + adp.toString());
    }
    if(v instanceof Superman){
    Superman sp = (Superman)v;
    System.out.println("Aterrizo Licencia " + sp.getNombre() + sp.toString() + " Aterrizaje " ); //sp.aterrizar();
    }
    if(v instanceof IronMan){
        IronMan im = (IronMan)v;
        System.out.println("Aterrizo Licencia " + im.getNombre() + im.toString() + " Aterrizaje " ); 
        //im.aterrizar();
    }
    }
   }
