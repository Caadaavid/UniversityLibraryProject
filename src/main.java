import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int choice = 1;

        List<MaterialBibliografico> biblioteca = new ArrayList<>();

        while (choice != 0){
            System.out.println("Biblioteca Universitaria");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar revista");
            System.out.println("3. Registrar libro digital");
            System.out.println("4. Mostrar materiales");
            System.out.println("5. Prestar materiales");
            System.out.println("6. Devolver materiales");
            System.out.println("7. Descargar material digital");
            System.out.println("8. Mostrar estadiscticas e información");
            System.out.println("0. Salir");
            choice = teclado.nextInt();

            switch (choice){
                case 1:
                    System.out.println("REGISTRAR LIBRO");
                    System.out.println("Codigo: ");
                    String codigo = teclado.nextLine();

                    System.out.println("Titulo: ");
                    String titulo = teclado.nextLine();

                    System.out.println("Año de publicacion: ");
                    int publicado = teclado.nextInt();

                    System.out.println("Autor: ");
                    String autor = teclado.nextLine();
                    int vprestado = 0;

                    Libro nuevoLibro = new Libro(codigo, titulo, publicado, autor, vprestado);
                    biblioteca.add(nuevoLibro);

                    System.out.println("Libro registrado correctamente");
                    break;
                case 2:
                    System.out.println("REGISTRAR REVISTA");
                    System.out.println("Codigo: ");
                    codigo = teclado.nextLine();

                    System.out.println("Titulo: ");
                    titulo = teclado.nextLine();

                    System.out.println("Año de publicacion: ");
                    publicado = teclado.nextInt();

                    System.out.println("Edicion: ");
                    int numeroEdicion = teclado.nextInt();
                    vprestado = 0;

                    Revista nuevaRevista = new Revista(codigo, titulo, publicado, numeroEdicion, vprestado);
                    biblioteca.add(nuevaRevista);

                    System.out.println("Revista registrada correctamente");
                    break;
                case 3:
                    System.out.println("REGISTRAR LIBRO DIGITAL");
                    System.out.println("Codigo: ");
                    codigo = teclado.nextLine();

                    System.out.println("Titulo: ");
                    titulo = teclado.nextLine();

                    System.out.println("Año de publicacion: ");
                    publicado = teclado.nextInt();

                    System.out.println("Autor: ");
                    autor = teclado.nextLine();
                    int vdescargado = 0;

                    System.out.println("Tamaño en MB: ");
                    double size = teclado.nextDouble();

                    LibroDigital nuevoLibroDigital = new LibroDigital(codigo, titulo, publicado, autor, size, vdescargado);
                    biblioteca.add(nuevoLibroDigital);

                    System.out.println("Libro registrado correctamente");
                    break;
                case 4:
                    System.out.println("MATERIALES REGISTRADOS ACTUALMENTE: ");
                    for (int i = 0; i < biblioteca.size(); i++){
                        System.out.println((i+1)+". "+biblioteca.get(i).getTitulo());
                    }
                    break;
                case 5:
                    System.out.println("PRESTAR MATERIALES");
                    System.out.println("Ingrese el codigo del libro a prestar");
                    String codigoBuscar = teclado.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < biblioteca.size(); i++){
                        MaterialBibliografico m = biblioteca.get(i);
                        if(m.getCodigo() == codigoBuscar){
                            if(m instanceof Prestable){
                                ((Prestable) m).prestar();
                            } else {
                                System.out.println("Este material no se puede prestar");
                            }
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado == false){
                        System.out.println("No se encontro material con ese codigo");
                    }
                    break;
                case 6:
                    System.out.println("DEVOLVER MATERIAL");
                    System.out.println("Ingrese el codigo del material a devolver: ");
                    String codigoDevolver = teclado.nextLine();
                    encontrado = false;

                    for (int i = 0; i < biblioteca.size(); i++){
                        MaterialBibliografico m = biblioteca.get(i);
                        if(m.getCodigo() == codigoDevolver){
                            if(m instanceof Prestable){
                                ((Prestable) m).devolver();
                            } else {
                                System.out.println("Este material no era prestable");
                            }
                            encontrado = true;
                            break;
                        }
                    }
                    if(encontrado == false){
                        System.out.printf("No se encontro material con ese codigo");
                    }
                    break;
                case 7:
                    System.out.println("DESCARGAR MATERIAL DIGITAL");
                    System.out.println("Ingrese codigo del material a descargar: ");
                    codigoBuscar = teclado.nextLine();
                    encontrado = false;

                    for (int i = 0; i < biblioteca.size(); i++){
                        MaterialBibliografico m = biblioteca.get(i);

                        if(m.getCodigo() == codigoBuscar){
                            if (m instanceof Descargable){
                                ((Descargable) m).descargar();
                            } else {
                                System.out.println("Material no descargable");
                            }
                            encontrado = true;
                            break;
                        }
                    }
                    if(encontrado == false){
                        System.out.println("No se encontro material con ese codigo");
                    }
                    break;
                case 8:
                    System.out.println("MOSTRAR ESTADISCTICAS E INFORMACION");
                    for(int i = 0; i < biblioteca.size(); i++){
                        MaterialBibliografico m = biblioteca.get(i);
                        m.mostrarInfo();
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
            }
        }
    }
}
