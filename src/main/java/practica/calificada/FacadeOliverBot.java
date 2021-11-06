package practica.calificada;
import java.util.Scanner;
import java.util.logging.Logger;

// Dan Santivañez Gutarra
public class FacadeOliverBot {

    public static void main(String[ ] args) {

        System.out.println("Hola soy el agente virtual Oliver tenemos los mejores libros, ¿me podrías indicar el nombre del libro o el autor?");
        Scanner sc= new Scanner(System.in);
                // System.out.print("Enter a string: ");
                String str= sc.nextLine();              //reads string
        String str1 = str;
        System.out.print("You have entered: "+str1+"\n");
        boolean bool1 = (str1 == "La biblia");
        //System.out.print(bool1+"\n");
        if ("La biblia".equals( str1 )){
            System.out.print("You have entered: "+str1+"\n");
        }
        LibrosAdmin nuevo = new LibrosAdmin();
        String respuesta1 = nuevo.buscarLibro("Sofware Engineering","Sommerville" );
        System.out.print(respuesta1+"\n");
        String respuesta2 = nuevo.buscarLibro("Sofware Engineering");
        System.out.print(respuesta2+"\n");
        Integer respuesta4 = nuevo.contarLibros("Sommerville");
        System.out.print(respuesta4+"\n");
        String respuesta3 = nuevo.buscarLibro("Sommerville");
        System.out.print(respuesta3+"\n");
        boolean bool2 = ("Hola" != "");
        System.out.print(bool2);

    }
}
