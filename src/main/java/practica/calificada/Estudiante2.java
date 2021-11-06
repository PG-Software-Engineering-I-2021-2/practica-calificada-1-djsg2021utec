package practica.calificada;

public class Estudiante2 implements Estudiante{
    String nombre = "Pamela Franco";
    String correo = "pamela.franco@gmail.com";
    Integer celular = 942983220;
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
