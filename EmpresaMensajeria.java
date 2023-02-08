package Clases.mensajeria;

import java.util.ArrayList;

public class EmpresaMensajeria {
    private String nombre;
    private ArrayList<Paquete>paquetes;
    private ArrayList<Repartidor>repartidors;

    public EmpresaMensajeria(String nombre) {
        this.nombre = nombre;
        paquetes = new ArrayList<>();
        repartidors = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public ArrayList<Repartidor> getRepartidors() {
        return repartidors;
    }

    public void setRepartidors(ArrayList<Repartidor> repartidors) {
        this.repartidors = repartidors;
    }

    public void agregarPaquete(Paquete paquete){
        //Agrega un nuevo paquete a la lista de paquetes
        paquetes.add(paquete);
    }

    public void agregarRepartidor(Repartidor repartidor){
        //Agrega un nuevo repartidor a la lista de repartidores
        repartidors.add(repartidor);
    }

    public void asignarPaquete(Paquete paquete){
        //Asigna un paquete a un repartidor disponible.
        //Si no hay repartidores disponibles, debe imprimir un mensaje indicándolo.
        for (Repartidor repartidor: repartidors) {
            if (repartidor.getDisponibilidad() == "disponible"){
                repartidor.asignarPaqueteRepartidor(paquete, repartidor);

            }

        }
        System.out.println("No hay repartidores dispoibles");
    }

    public void entregarPaquete(Paquete paquete){
        //Marca un paquete como entregado y cambia el estado de disponibilidad del repartidor a "No disponible"
        //hasta que se complete la entrega.
        paquete.setEstadoEntrega("entregado");
        for (Repartidor repartidor: repartidors){
            if (paquete.getEstadoEntrega() == "entregado"){
                repartidor.setDisponibilidad("disponible");
            } else {
                repartidor.setDisponibilidad("no disponible");
            }
        }
    }
    public void imprimirPaquetes(){
       //Imprime todos los paquetes y su estado de entrega
       for (Paquete paquete : paquetes){
           System.out.println("Paquete: " + paquete.getId() + " - Estado de entrega: " + paquete.getEstadoEntrega());
       }
    }
    public void imprimirRepartidores() {
        //Imprime todos los repartidores y su estado de disponibilidad
        for (Repartidor repartidor: repartidors){
            System.out.println("Repartidor: " + repartidor.getId() + " - Disponibilidad: " + repartidor.getDisponibilidad());
        }
    }

}
