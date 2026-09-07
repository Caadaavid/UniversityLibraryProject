public class Revista extends MaterialBibliografico {
    private int numeroEdicion;

    public Revista(String codigo, String titulo, int publicado, int numeroEdicion){
        super(codigo, titulo, publicado);
        this.numeroEdicion = numeroEdicion;
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
}
