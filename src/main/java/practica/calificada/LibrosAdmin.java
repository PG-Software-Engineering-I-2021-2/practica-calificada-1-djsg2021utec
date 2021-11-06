package practica.calificada;

import java.util.ArrayList;
import java.util.List;

public class LibrosAdmin {
    String titulo;
    String autor;
    String edicion;
    List<String> almacenTitulo = new ArrayList<>();
    List<String> almacenAutor = new ArrayList<>();
    List<String> almacenEdicion = new ArrayList<>();

    LibrosAdmin(String Titulo, String Autor, String Edicion){
        this.titulo = Titulo;
        this.autor = Autor;
        this.edicion = Edicion;
    }
    public void addLibros(String Titulo, String Autor, String Edicion){
        almacenTitulo.add("Software Engineering");
        almacenAutor.add("Somerville");
        almacenEdicion.add("6th edition");
        almacenTitulo.add("Software Engineering");
        almacenAutor.add("Somerville");
        almacenEdicion.add("7th edition");
        almacenTitulo.add("Software Engineering");
        almacenAutor.add("Somerville");
        almacenEdicion.add("8th edition");
        almacenTitulo.add("Software Engineering");
        almacenAutor.add("Somerville");
        almacenEdicion.add("9th edition");



    }
    public void buscarAutor(String nombreLibro, String fechaNacimiento){

    }
    public void buscarEdiciones(String nombreLibro){

    }
    public void buscarEdiciones(String nombreLibro, String fechaLibro){

    }

}
