package practica.calificada;

public class Libro3 implements Libro{
    String titulo = "Sofware Engineering";
    String autor = "Sommerville";
    String edicion = "8th edition";
    @Override
    public String Titulo() {
        return titulo;
    }

    @Override
    public String Autor() {
        return autor;
    }

    @Override
    public String Edicion() {
        return edicion;
    }
}