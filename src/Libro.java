public class Libro extends MaterialBibliografico {
    private String autor;

    public Libro(String codigo, String titulo, int publicado, String autor) {
        super(codigo, titulo, publicado);
        this.autor = autor;
    }
}
