import java.util.ArrayList;

/**
 * Representa un libro con título, autor y número de páginas.
 */
class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    /**
     * Constructor del libro.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param numeroPaginas El número de páginas del libro.
     */
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Obtiene el título del libro.
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el título del libro.
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Define el autor del libro.
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el número de páginas del libro.
     * @return El número de páginas del libro.
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * Define el número de páginas del libro.
     * @param numeroPaginas El nuevo número de páginas del libro.
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}

/**
 * Representa una biblioteca con un conjunto de libros disponibles.
 */
class Biblioteca {
    private ArrayList<Libro> librosDisponibles = new ArrayList<>();

    /**
     * Registra un nuevo libro en la lista de libros disponibles.
     * @param libro El libro a registrar.
     */
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    /**
     * Busca un libro en la biblioteca por su título.
     * @param titulo El título del libro a buscar.
     * @return El libro si se encuentra, de lo contrario, null.
     */
    public Libro buscarLibro(String titulo) {
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Muestra la lista de libros disponibles en la biblioteca.
     */
    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : librosDisponibles) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Número de páginas: " + libro.getNumeroPaginas());
            System.out.println("-----------------------------");
        }
    }
}
