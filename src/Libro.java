public class Libro extends MaterialBibliografico implements Prestable {
    private String autor;
    private boolean prestado;

    public Libro(String codigo, String titulo, int publicado, String autor) {
        super(codigo, titulo, publicado);
        this.autor = autor;
        this.prestado = false;
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

    @Override
    public void prestar() {
        if (prestado == false){
            System.out.println("Libro prestado con exito");
            prestado = true;
        } else {
            System.out.println("El libro ya esta prestado");
        }
    }

    @Override
    public void devolver(){
        if (prestado != false){
            System.out.println("Libro devuelto con exito");
            prestado = false;
        } else {
            System.out.printf("El libro no estaba prestado");
        }
    }
}
