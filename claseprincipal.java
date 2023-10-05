import java.util.Scanner;
public class claseprincipal {
    public static void main(String[] args) {
        // Crear objeto de la clase Biblioteca llamado bibliotecaKonradLorenz
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        // Crear 5 objetos de la clase Libro y registrarlos en la biblioteca
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro2 = new Libro("El código Da Vinci", "Dan Brown", 656);
        Libro libro3 = new Libro("1984", "George Orwell", 326);
        Libro libro4 = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
        Libro libro5 = new Libro("La Odisea", "Homero", 448);

        bibliotecaKonradLorenz.registrarLibro(libro1);
        bibliotecaKonradLorenz.registrarLibro(libro2);
        bibliotecaKonradLorenz.registrarLibro(libro3);
        bibliotecaKonradLorenz.registrarLibro(libro4);
        bibliotecaKonradLorenz.registrarLibro(libro5);

        // Resto del código (búsqueda y visualización) permanece igual

        // Mostrar los libros disponibles en la biblioteca
        bibliotecaKonradLorenz.mostrarLibrosDisponibles();
    }
}