package practica.calificada;

public class Libro1 implements Libro{
    String titulo = "Sofware Engineering";
    String autor = "Sommerville";
    String edicion = "6th edition";
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
