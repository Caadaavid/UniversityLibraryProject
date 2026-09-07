public class Revista extends MaterialBibliografico implements Prestable {
    private int numeroEdicion;
    private boolean prestado;

    public Revista(String codigo, String titulo, int publicado, int numeroEdicion){
        super(codigo, titulo, publicado);
        this.numeroEdicion = numeroEdicion;
        this.prestado = false;
    }

    public int getNumeroEdicion(){
        return numeroEdicion;
    }

    public void mostrarInfo(){
        if (getPublicado() != 0){
            System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" edicion numero: "+getNumeroEdicion()+" publicado en el año: "+getPublicado());
        }else{
            System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" edicion numero: "+getNumeroEdicion()+" sin año de publicación definida");
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
