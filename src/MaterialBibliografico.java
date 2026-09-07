public abstract class MaterialBibliografico {
    private String codigo;
    private String titulo;
    private int publicado;

    private static int contadorMateriales = 0;

    //Este contador aumenta cada que se crea un objeto, pero no depende de los objetos como tal, sino de la clase.
    public static int getContadorMateriales() {
        return contadorMateriales;
    }

    public MaterialBibliografico(String codigo, String titulo, int publicado){
        this.codigo = codigo;
        this.titulo = titulo;
        this.publicado = publicado;
        contadorMateriales++;
    }

    public MaterialBibliografico(String codigo, String titulo){
        this.codigo = codigo;
        this.titulo = titulo;
        this.publicado = 0;
        contadorMateriales++;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getPublicado(){
        return publicado;
    }

}
