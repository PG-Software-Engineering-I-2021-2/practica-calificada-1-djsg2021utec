package practica.calificada;

public class Estudiante3 implements Estudiante{
    String nombre = "Victor Hugo";
    String correo = "victor.hugo@gmail.com";
    Integer celular = 936596661;
    @Override
    public String Nombre() {
        return nombre;
    }

    @Override
    public String Correo() {
        return correo;
    }

    @Override
    public Integer Celular() {
        return celular;
    }
}
