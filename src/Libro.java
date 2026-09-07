public class Libro extends MaterialBibliografico implements Prestable {
    private String autor;
    private boolean prestado;
    private int vprestado;

    public Libro(String codigo, String titulo, int publicado, String autor, int vprestado) {
        super(codigo, titulo, publicado);
        this.autor = autor;
        this.prestado = false;
        this.vprestado = vprestado;
    }

    public String getAutor(){
        return autor;
    }

    public int getVPrestado(){
        return vprestado;
    }

    public void mostrarInfo(){
        if (getPublicado() != 0){
        System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" escrito por: "+getAutor()+" publicado en el año: "+getPublicado()+" veces prestado: "+getVPrestado());
    }else{
            System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" escrito por: "+getAutor()+" sin año de publicación definida"+" veces prestado: "+getVPrestado());
        }
    }

    @Override
    public void prestar() {
        if (prestado == false){
            System.out.println("Libro prestado con exito");
            vprestado++;
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
