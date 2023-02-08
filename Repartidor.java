package Clases.mensajeria;

public class Repartidor {
    private String nombre;
    private int id;

    private enum Vehiculo {BICICLETA, MOTOCICLETA, CAMION}
    Vehiculo vehiculo;
    private String disponibilidad;

    public Repartidor(){}

    public Repartidor(String nombre, int id, String vehiculo, String disponibilidad){
        this.nombre = nombre;
        this.id = id;
        this.disponibilidad = "disponible";
        this.vehiculo = Vehiculo.valueOf(vehiculo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void asignarPaqueteRepartidor(Paquete paquete, Repartidor repartidor) {

    }
}
