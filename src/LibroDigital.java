public class LibroDigital extends MaterialBibliografico {
    private String autor;
    private double size;

    public LibroDigital(String codigo, String titulo, int publicado, String autor, double size){
        super(codigo, titulo, publicado);
        this.autor = autor;
        this.size = size;
    }

    public String getAutor(){
        return autor;
    }

    public double getSize(){
        return size;
    }

    public void mostrarInfo(){
        if (getPublicado() != 0){
            System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" escrito por: "+getAutor()+" publicado en el año: "+getPublicado()+" tamaño del archivo: "+getSize());
        }else{
            System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" escrito por: "+getAutor()+" sin año de publicación definida"+" tamaño del archivo: "+getSize());
        }
    }
}
