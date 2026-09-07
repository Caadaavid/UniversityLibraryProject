public class Revista extends MaterialBibliografico implements Prestable {
    private int numeroEdicion;
    private boolean prestado;
    private int vprestado;

    public Revista(String codigo, String titulo, int publicado, int numeroEdicion, int vprestado){
        super(codigo, titulo, publicado);
        this.numeroEdicion = numeroEdicion;
        this.prestado = false;
        this.vprestado = vprestado;
    }

    public int getNumeroEdicion(){
        return numeroEdicion;
    }

    public int getVPrestado(){
        return vprestado;
    }

    public void mostrarInfo(){
        if (getPublicado() != 0){
            System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" edicion numero: "+getNumeroEdicion()+" publicado en el año: "+getPublicado()+" veces prestado: "+getVPrestado());
        }else{
            System.out.println("Libro: "+getTitulo()+" con identificador "+getCodigo()+" edicion numero: "+getNumeroEdicion()+" sin año de publicación definida"+" veces prestado: "+getVPrestado());
        }
    }

    @Override
    public void prestar() {
        if (prestado == false){
            System.out.println("Revista prestada con exito");
            prestado = true;
            vprestado++;
        } else {
            System.out.println("La revista ya esta prestada");
        }
    }

    @Override
    public void devolver(){
        if (prestado != false){
            System.out.println("Revista devuelta con exito");
            prestado = false;
        } else {
            System.out.printf("La revista no estaba prestado");
        }
    }
}
