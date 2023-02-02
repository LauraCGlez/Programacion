public class BibliotecaTest {
    public static void main(String[] args) {

        Biblioteca b = new Biblioteca("Harry Potter", "J.K.Rowling", 0, 0);

        System.out.println("El nombre del libreo es: " + b.getTitulo());

        System.out.println(b.prestamo());

        System.out.println(b.devolucion());

        System.out.println(b.toString());

    }
}