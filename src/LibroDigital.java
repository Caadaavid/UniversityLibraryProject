public class LibroDigital extends MaterialBibliografico implements Descargable {
    private String autor;
    private double size;
    private int vdescargado;

    public LibroDigital(String codigo, String titulo, int publicado, String autor, double size, int vdescargado){
        super(codigo, titulo, publicado);
        this.autor = autor;
        this.size = size;
        this.vdescargado = vdescargado;
    }

    public String getAutor(){
        return autor;
    }

    public double getSize(){
        return size;
    }

    public int getVDescargado(){
        return vdescargado;
    }

    public void mostrarInfo(){
        if (getPublicado() != 0){
            System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" escrito por: "+getAutor()+" publicado en el año: "+getPublicado()+" tamaño del archivo: "+getSize()+" veces descargado: "+getVDescargado());
        }else{
            System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" escrito por: "+getAutor()+" sin año de publicación definida"+" tamaño del archivo: "+getSize()+" veces descargado: "+getVDescargado());
        }
    }

    @Override
    public void descargar(){
        System.out.printf("Libro de "+getSize()+" MB descargado con exito");
        vdescargado++;
    }
}
