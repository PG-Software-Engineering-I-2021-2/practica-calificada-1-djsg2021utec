package practica.calificada;

public class Estudiante3 implements Estudiante{
    String nombre = "Marco Sanchez";
    String correo = "marco.sanchez@gmail.com";
    Integer celular = 947593221;
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
