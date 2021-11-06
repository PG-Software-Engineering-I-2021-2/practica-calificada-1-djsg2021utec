package practica.calificada;

import practica.calificada.Estudiantes.Estudiante1;

import java.util.ArrayList;
import java.util.List;

public class EstudiantesRegister {
    private Estudiantes.Estudiante1 estudiante1;
    private Estudiantes.Estudiante2 estudiante2;
    private Estudiantes.Estudiante3 estudiante3;
    private List<String> nombres;
    private List<String>  correos;
    private List<Integer>  celulares;

    public EstudiantesRegister(){
        estudiante1 = new Estudiantes.Estudiante1();
        estudiante2 = new Estudiantes.Estudiante2();
        estudiante3 = new Estudiantes.Estudiante3();
        nombres = new ArrayList();
        nombres.add(estudiante1.Nombre());
        nombres.add(estudiante2.Nombre());
        nombres.add(estudiante3.Nombre());
        correos = new ArrayList();
        correos.add(estudiante1.Correo());
        correos.add(estudiante2.Correo());
        correos.add(estudiante3.Correo());
        celulares = new ArrayList();
        celulares.add(estudiante1.Celular());
        celulares.add(estudiante2.Celular());
        celulares.add(estudiante3.Celular());

    }
    public void addNombre(String nombre){
        nombres.add(nombre);
    }
    public void addCorreo(String correo){
        correos.add(correo);
    }
    public void addCelular(Integer celular){
        celulares.add(celular);
    }

}
