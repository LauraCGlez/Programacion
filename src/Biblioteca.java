public class Biblioteca {

    String titulo;
    String autor;
    int ejemplares;
    int ejemplaresPrestados;

    //Constructor vacio
    Biblioteca(){}

    //Constructor con parametros
    Biblioteca(String titulo, String autor, int ejemplares, int ejemplaresPrestados){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    //Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    //Metodo prestamo()
    public boolean prestamo(){
        boolean resultado = false;
        if (ejemplares > 0){
            ejemplaresPrestados += 1;
            ejemplares -= 1;
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    //Metodo devolucion
    public boolean devolucion(){
        boolean resultado = false;
        if (ejemplaresPrestados < 0){
            resultado = false;
        } else {
            ejemplares += 1;
            ejemplaresPrestados -=1;
            resultado = true;
        }

        return resultado;
    }

    //toString
    @Override
    public String toString() {
        return "Biblioteca{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ejemplares=" + ejemplares +
                ", ejemplaresPrestados=" + ejemplaresPrestados +
                '}';
    }
}
