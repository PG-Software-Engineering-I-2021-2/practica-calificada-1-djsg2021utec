package lab1;


public class Automovil extends Vehiculo{

    Automovil(double prCantidad, double prConsumo, double prCapacidad) {
        super(prCantidad, prConsumo, prCapacidad);
    }

    String  abastecer(double aLitros) {
        double requiere = this.capacidad - this.cantidad;

        if (0 > requiere-aLitros)
        {
            return "Automovil no se puede reabastecer el tanque, esta lleno";

        }
        else{
            cantidad += cantidad;
            return "La cantidad de combustible del vehiculo es: "+cantidad;
        }
    }
}
