public class LibroDigital extends MaterialBibliografico {
    private String autor;
    private double size;

    public LibroDigital(String codigo, String titulo, int publicado, String autor, double size){
        super(codigo, titulo, publicado);
        this.autor = autor;
        this.size = size;
    }
}
