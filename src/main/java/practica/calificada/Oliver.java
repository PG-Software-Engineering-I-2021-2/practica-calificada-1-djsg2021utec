package practica.calificada;

import java.util.Scanner;
public class Oliver {
    LibrosAdmin almacenLibros = new LibrosAdmin();
    EstudiantesRegister almacenEstudiantes = new EstudiantesRegister();
    public String preguntaLibro(){
        System.out.println("Hola soy el agente virtual Oliver tenemos los mejores libros, ¿me podrías indicar el nombre del libro o el autor?");
        Scanner referencia= new Scanner(System.in);
        // System.out.print("Enter a string: ");
        String ref= referencia.nextLine();              //reads string
        return ref;
    }
    public void preguntaCantidad(String referencia){
        Integer num = almacenLibros.contarLibros(referencia);
        System.out.println(num);
    }
    public void preguntaInformacionLibro(String referencia){
        String num = almacenLibros.buscarLibro(referencia);
        System.out.println(num);
    }
    public String preguntaInformacionPersona(Boolean existenciaLibro){
        if (existenciaLibro){
            System.out.println("Lo tengo, para enviartelo al correo debes dejarme tus datos");
            System.out.println("Su nombre");
            Scanner referencia= new Scanner(System.in);
            // System.out.print("Enter a string: ");
            String ref= referencia.nextLine();
            System.out.println("Su correo");

            System.out.println("Su celular");

        }
        else {
            System.out.println("Oh nooo, este libro es muy escaso y para obtenerlo debes dejarme tus datos\n" +
                    "y te notificare a tu correo electronico apenas lo tengamos en stock.");

        }

        Scanner sc= new Scanner(System.in);
        // System.out.print("Enter a string: ");
        String str= sc.nextLine();              //reads string
        String str1 = str;
        System.out.print("You have entered: "+str1+"\n");
        return str;
    }
}
