public class Revista extends MaterialBibliografico {
    private int numeroEdicion;

    public Revista(String codigo, String titulo, int publicado, int numeroEdicion){
        super(codigo, titulo, publicado);
        this.numeroEdicion = numeroEdicion;
    }
}
