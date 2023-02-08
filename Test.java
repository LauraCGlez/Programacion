package Clases.mensajeria;

public class Test {

    public static void main(String[] args) {

        EmpresaMensajeria empresaMensajeria = new EmpresaMensajeria("Aaaaalas");

        //Creamos 3 paquetes
        Paquete paquete1 = new Paquete("Ave 1ra", "Ave 2da", 1.5, 10.50, "entregado", 1);
        Paquete paquete2 = new Paquete("Ave 3ra", "Ave 4ta", 2.5, 20.00, "no entregado", 2);
        Paquete paquete3 = new Paquete("Ave 5ta", "Ave 6ta", 4, 30, "no entregado", 3);

        //Creamos 3 repartidores
        Repartidor repartidor1 = new Repartidor("Dani", 1, "MOTOCICLETA", "disponible");
        Repartidor repartidor2 = new Repartidor("Tito", 2, "BICICLETA", "disponible");
        Repartidor repartidor3 = new Repartidor("Ale", 3, "CAMION", "no disponible");

        empresaMensajeria.agregarPaquete(paquete1);
        empresaMensajeria.agregarPaquete(paquete2);
        empresaMensajeria.agregarPaquete(paquete3);

        empresaMensajeria.agregarRepartidor(repartidor1);
        empresaMensajeria.agregarRepartidor(repartidor2);
        empresaMensajeria.agregarRepartidor(repartidor3);

        System.out.println("Antes de asignar los paquetes:");
        empresaMensajeria.imprimirPaquetes();
        empresaMensajeria.imprimirRepartidores();

        //asignamos los paquetes
        repartidor3.asignarPaqueteRepartidor(paquete1, repartidor3);
        repartidor2.asignarPaqueteRepartidor(paquete2, repartidor2);
        empresaMensajeria.asignarPaquete(paquete1);
        empresaMensajeria.asignarPaquete(paquete2);
        empresaMensajeria.asignarPaquete(paquete3);

        //marcar paquete entregado
        paquete1.setEstadoEntrega("entregado");
        paquete3.setEstadoEntrega("entregado");

        //Cambiamos disponibilidad de un repartidor
        repartidor3.setDisponibilidad("no disponible");

        //Lista de paquetes y de repartidores
        System.out.println("Despues de la asignacion: ");
        empresaMensajeria.imprimirPaquetes();
        empresaMensajeria.imprimirRepartidores();


    }

}
