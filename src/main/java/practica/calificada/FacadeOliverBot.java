package practica.calificada;
import java.util.Scanner;
import java.util.logging.Logger;

// Dan Santivañez Gutarra
public class FacadeOliverBot {

    static final Logger logger = Logger.getLogger(FacadeOliverBot.class.getName());
    static double consumoVehiculo = 0.9;
    static double consumoCamion = 1.6;
    static double capacidadTotal = 100;
    static double fuelCantidad = 10;
    String pruebaAuto(double km){
        Automovil auto1 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        return (auto1.conduccion(km));
    }
    String pruebaCamion(double km){
        Camion cam1 = new Camion(fuelCantidad,consumoVehiculo,capacidadTotal);
        return (cam1.conduccion(km));
    }

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
            System.out.print("You have entered: "+str1);
        }
//Respuesta 1
     //   Automovil auto1 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        //   String r1 = auto1.conduccion(4);
        //  logger.info(r1);

//Auto 2
        //   Automovil auto2 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        //  String r2 = auto2.conduccion(12);
        // logger.info(r2);



    }
}