package aeropuerto;

public class Programa {
    
        public static void main(String[] args) {
        AvionPrivado v1 = new AvionPrivado();
        v1.setLicencia("L123456F");
        AvionDePasajeros v2 = new AvionDePasajeros();
        v2.setAerolinea("Aerolineas Args");
        Superman v3 = new Superman();
        IronMan v4 = new IronMan();
        Aeropuerto ap = new Aeropuerto();
        ap.darPermisoDeAterrizaje(v1);
        ap.darPermisoDeAterrizaje(v2);
        ap.darPermisoDeAterrizaje(v3);
        ap.darPermisoDeAterrizaje(v4);
        }
       
}
