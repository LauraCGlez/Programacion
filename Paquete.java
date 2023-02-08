package Clases.mensajeria;

public class Paquete {
    private String dirOrigen;
    private String dirDestino;
    private double peso;
    private double costoEnvio;
    private String estadoEntrega;
    private int id;

    public Paquete(){
    }

    public Paquete(String dirOrigen, String dirDestino, double peso, double costoEnvio, String estadoEntrega, int id){
        this.dirOrigen = dirOrigen;
        this.dirDestino = dirDestino;
        this.peso = peso;
        this.costoEnvio = costoEnvio;
        this.estadoEntrega = "no entregado";
        this.id = id;
    }

    public String getDirOrigen() {
        return dirOrigen;
    }

    public void setDirOrigen(String dirOrigen) {
        this.dirOrigen = dirOrigen;
    }

    public String getDirDestino() {
        return dirDestino;
    }

    public void setDirDestino(String dirDestino) {
        this.dirDestino = dirDestino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
