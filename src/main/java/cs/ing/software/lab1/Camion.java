package cs.ing.software.lab1;

import java.text.DecimalFormat;


public class Camion  extends Vehiculo{

    Camion(double prCantidad, double prConsumo, double prCapacidad) {
        super(prCantidad, prConsumo, prCapacidad);
    }
    String  abastecer(double cLitros){
        double requiere = this.capacidad - this.cantidad;
        if (0 > requiere - cLitros)
        {
            return "Camion no se puede reabastecer el tanque, esta lleno";

        }
        else{
            this.cantidad += (cLitros * 0.95);
            return "La cantidad de combustible del camion es: "+cantidad;
        }
    }
    @Override
    String conduccion(double ckm) {
        DecimalFormat df = new DecimalFormat("0.00");
        double fuelRequiere = ckm*this.consumo;
        if(cantidad-fuelRequiere<0){
            return "Camion necesita reabastecimiento de combustible";
        }
        else{
            this.cantidad -=fuelRequiere;
            return ("Camion viajo " +(ckm)+" km y aun tiene " +df.format(cantidad)+ " de combustible");
        }
    }
}
