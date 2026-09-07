public class Libro extends MaterialBibliografico {
    private String autor;

    public Libro(String codigo, String titulo, int publicado, String autor) {
        super(codigo, titulo, publicado);
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public void mostrarInfo(){
        if (getPublicado() != 0){
        System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" escrito por: "+getAutor()+" publicado en el año: "+getPublicado());
    }else{
            System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" escrito por: "+getAutor()+" sin año de publicación definida");
        }
    }
}
