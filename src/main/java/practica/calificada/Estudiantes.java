package practica.calificada;

public class Estudiantes {
    public static class Estudiante1 implements Estudiante{
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
    public static class Estudiante2 implements Estudiante{
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
    public static class Estudiante3 implements Estudiante{
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
}
