public class MaterialBibliografico {
    private String codigo;
    private String titulo;
    private int publicado;

    private static int contadorMateriales = 0;

    public MaterialBibliografico(String codigo, String titulo, int publicado){
        this.codigo = codigo;
        this.titulo = titulo;
        this.publicado = publicado;
        contadorMateriales++;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPublicado() {
        return publicado;
    }

}
