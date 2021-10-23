package lab1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Labo1Test {
    @Test
    public void Test01(){
        Automovil car1= new Automovil( 10, 0.9, 100);
        Assert.assertEquals( car1.conduccion(4),"Vehiculo viajo 4.0 km y aun tiene 6.40 de combustible");
    }
    @Test
    public void Test02(){
        Automovil car2 = new Automovil(10, 0.9, 100);
        Assert.assertEquals( car2.conduccion(12),"Vehiculo necesita reabastecimiento de combustible");
    }
    @Test
    public void Test03(){
        Automovil car3 = new Automovil(10, 0.9, 100);
        Assert.assertEquals( car3.conduccion(6),"Vehiculo viajo 6.0 km y aun tiene 4.60 de combustible");
    }
    @Test
    public void Test05(){
        Camion cam1 = new Camion(10,1.6,100);
        Assert.assertEquals( cam1.conduccion(4),"Camion viajo 4.0 km y aun tiene 3.60 de combustible");
    }
    @Test
    public void Test06(){
        Camion cam01  = new Camion(20,1.6,100);
        Assert.assertEquals( cam01 .conduccion(8),"Camion viajo 8.0 km y aun tiene 7.20 de combustible");
    }
    @Test
    public void Test07(){
        Camion cam02  = new Camion(10, 1.6, 100);
        Assert.assertEquals( cam02 .conduccion(10),"Camion necesita reabastecimiento de combustible");
    }
    @Test
    public void Test08(){
        Camion cam03  = new Camion(5, 1.6, 100);
        Assert.assertEquals( cam03.conduccion(1),"Camion viajo 1.0 km y aun tiene 3.40 de combustible");
    }
    @Test
    public void Test09(){
        Camion cam04  = new Camion(40, 1.6, 105);
        Assert.assertEquals( cam04 .conduccion(100),"Camion necesita reabastecimiento de combustible");
    }
    @Test
    public void Test10(){
        Camion cam05 = new Camion(40,1.6,150);
        Assert.assertEquals( cam05 .conduccion(100),"Camion necesita reabastecimiento de combustible");
    }
    @Test
    public void Test12() {
        Automovil auto3 = new Automovil(25.8,0.91,105.6);
        Assert.assertEquals(auto3.conduccion(4),"Vehiculo viajo 4.0 km y aun tiene 22.16 de combustible");
    }
    @Test
    public void Test13() {
        Automovil auto4 = new Automovil(25.8,1.1,105.6);
        Assert.assertEquals(auto4.conduccion(7.9),"Vehiculo viajo 7.9 km y aun tiene 17.11 de combustible");

    }
    @Test
    public void Test14() {
        Automovil auto5 = new Automovil(8.9,0.9,120);
        Assert.assertEquals(auto5.conduccion(10.6),"Vehiculo necesita reabastecimiento de combustible");

    }
    @Test
    public void Test15() {
        Automovil auto6 = new Automovil(50.5,0.91,105.6);
        Assert.assertEquals(auto6.conduccion(20.3),"Vehiculo viajo 20.3 km y aun tiene 32.03 de combustible");

    }
    @Test
    public void Test16() {
        Automovil auto6 = new Automovil(50.5,0.91,105.6);
        Assert.assertEquals(auto6.conduccion(100),"Vehiculo necesita reabastecimiento de combustible");

    }
    @Test
    public void Test17() {
        Automovil auto7 = new Automovil(100,0.78,105.6);
        Assert.assertEquals(auto7.conduccion(2),"Vehiculo viajo 2.0 km y aun tiene 98.44 de combustible");

    }
    @Test
    public void Test18() {
        Automovil auto8 = new Automovil(50.5,0.78,105.6);
        Assert.assertEquals(auto8.abastecer(20.8),"La cantidad de combustible del vehiculo es: 101.0");

    }
    @Test
    public void Test19() {
        Camion cam06 = new Camion(50.5,0.78,105.6);
        Assert.assertEquals(cam06.abastecer(14.5),"La cantidad de combustible del camion es: 64.275");

    }
    @Test
    public void Test20() {
        Camion cam07 = new Camion(50.5,0.78,105.6);
        Assert.assertEquals(cam07.abastecer(100),"Camion no se puede reabastecer el tanque, esta lleno");

    }
    @Test
    public void Test21() {
        Camion cam08 = new Camion(50.5,0.78,105.6);
        Assert.assertEquals(cam08.abastecer(5.5),"La cantidad de combustible del camion es: 55.725");

    }
    @Test
    public void Test22() {
        Camion cam09 = new Camion(50.5,0.78,105.6);
        Assert.assertEquals(cam09.abastecer(5.5),"La cantidad de combustible del camion es: 55.725");

    }
    @Test
    public void Test23() {
        Camion cam10 = new Camion(50.5,1.7,105.6);
        Assert.assertEquals(cam10.abastecer(10),"La cantidad de combustible del camion es: 60.0");

    }
    @Test
    public void Test24() {
        Automovil auto09 = new Automovil(50.5,0.88,105.6);
        Assert.assertEquals(auto09.abastecer(5.5),"La cantidad de combustible del vehiculo es: 101.0");

    }
    @Test
    public void Test25() {
        Automovil auto10 = new Automovil(50.5,0.98,105.6);
        Assert.assertEquals(auto10.abastecer(6.78),"La cantidad de combustible del vehiculo es: 101.0");

    }
    @Test
    public void Test26() {
        Camion cam11 = new Camion(50.5,1.6,50);
        Assert.assertEquals(cam11.abastecer(5.5),"Camion no se puede reabastecer el tanque, esta lleno");

    }@Test
    public void Test27() {
        Automovil auto11 = new Automovil(50.5,0.78,105.6);
        Assert.assertEquals(auto11.abastecer(5.5),"La cantidad de combustible del vehiculo es: 101.0");

    }@Test
    public void Test28() {
        Automovil auto12 = new Automovil(10,0.78,105.6);
        Assert.assertEquals(auto12.abastecer(30),"La cantidad de combustible del vehiculo es: 20.0");

    }@Test
    public void Test29() {
        Automovil auto13 = new Automovil(50.5,0.78,105.6);
        Assert.assertEquals(auto13.abastecer(5.5),"La cantidad de combustible del vehiculo es: 101.0");

    }
    @Test
    public void Test30() {
        Automovil auto14 = new Automovil(50.5,0.78,98.6);
        Assert.assertEquals(auto14.conduccion(8.6),"Vehiculo viajo 8.6 km y aun tiene 43.79 de combustible");

    }
    @Test
    public void Test31() {
        Camion cam12 = new Camion(50.5,1.6,105.6);
        Assert.assertEquals(cam12.abastecer(144.5),"Camion no se puede reabastecer el tanque, esta lleno");

    }
    @Test
    public void Test32() {
        Camion cam13 = new Camion(50.5,1.58,105.6);
        Assert.assertEquals(cam13.conduccion(150),"Camion necesita reabastecimiento de combustible");

    }
    @Test
    public void Test33() {
        Camion cam14 = new Camion(50.5,1.68,105.6);
        Assert.assertEquals(cam14.conduccion(51.5),"Camion necesita reabastecimiento de combustible");

    }
    @Test
    public void Test34() {
        Camion cam15 = new Camion(50.5,1.6,105.6);
        Assert.assertEquals(cam15.abastecer(5.5),"La cantidad de combustible del camion es: 55.725");

    }
    @Test
    public void Test35() {
        Camion cam16 = new Camion(50.5,1.9,105.6);
        Assert.assertEquals(cam16.abastecer(10.8),"La cantidad de combustible del camion es: 60.76");

    }
    @Test
    public void Test36() {
        Camion cam17 = new Camion(50.5,1.6,105.6);
        Assert.assertEquals(cam17.conduccion(15.5),"Camion viajo 15.5 km y aun tiene 25.70 de combustible");

    }
    @Test
    public void Test37() {
        Automovil auto15 = new Automovil(50.5,1.6,85.6);
        Assert.assertEquals(auto15.abastecer(65.5),"Automovil no se puede reabastecer el tanque, esta lleno");

    }
    @Test
    public void Test38() {
        Automovil auto16 = new Automovil(50.5,0.88,105.6);
        Assert.assertEquals(auto16.conduccion(10),"Vehiculo viajo 10.0 km y aun tiene 41.70 de combustible");

    }
    @Test
    public void Test39() {
        Automovil auto17 = new Automovil(50.5,0.98,105.6);
        Assert.assertEquals(auto17.conduccion(11.5),"Vehiculo viajo 11.5 km y aun tiene 39.23 de combustible");

    }
    @Test
    public void Test40() {
        Automovil auto18 = new Automovil(5.5,1.6,95.6);
        Assert.assertEquals(auto18.abastecer(15.5),"La cantidad de combustible del vehiculo es: 11.0");

    }
    @Test
    public void Test41() {
        Automovil auto19 = new Automovil(20.5,1.9,105.6);
        Assert.assertEquals(auto19.abastecer(1.8),"La cantidad de combustible del vehiculo es: 41.0");

    }
    @Test
    public void Test42() {
        Automovil auto20 = new Automovil(50.5,1.6,105.6);
        Assert.assertEquals(auto20.conduccion(15.5),"Vehiculo viajo 15.5 km y aun tiene 25.70 de combustible");

    }
    @Test
    public void Test43() {
        Automovil auto21 = new Automovil(50.5,1.6,145.6);
        Assert.assertEquals(auto21.abastecer(19.5),"La cantidad de combustible del vehiculo es: 101.0");

    }
    @Test
    public void Test44() {
        Automovil auto23 = new Automovil(50.5,0.658,105.6);
        Assert.assertEquals(auto23.conduccion(80),"Vehiculo necesita reabastecimiento de combustible");

    }
    @Test
    public void Test45() {
        Automovil auto24 = new Automovil(50.5,1.68,105.6);
        Assert.assertEquals(auto24.conduccion(51.5),"Vehiculo necesita reabastecimiento de combustible");

    }
    @Test
    public void Test46() {
        Automovil auto25 = new Automovil(350.5,0.86,505.6);
        Assert.assertEquals(auto25.conduccion(51.5),"Vehiculo viajo 51.5 km y aun tiene 306.21 de combustible");

    }
    @Test
    public void Test47() {
        Automovil auto26 = new Automovil(150.5,0.9,805.6);
        Assert.assertEquals(auto26.abastecer(109.8),"La cantidad de combustible del vehiculo es: 301.0");

    }
    @Test
    public void Test48() {
        Automovil auto27 = new Automovil(50.5,0.67,1085.6);
        Assert.assertEquals(auto27.conduccion(1590.5),"Vehiculo necesita reabastecimiento de combustible");

    }
    @Test
    public void Test49() {
        Automovil auto28 = new Automovil(501.5,0.86,1905.6);
        Assert.assertEquals(auto28.abastecer(144.5),"La cantidad de combustible del vehiculo es: 1003.0");

    }
    @Test
    public void Test50() {
        Automovil auto29 = new Automovil(450.5,0.58,1805.6);
        Assert.assertEquals(auto29.conduccion(1250),"Vehiculo necesita reabastecimiento de combustible");

    }
    @Test
    public void Test51() {
        Automovil auto30 = new Automovil(502.5,1.2,1058.6);
        Assert.assertEquals(auto30.conduccion(531.5),"Vehiculo necesita reabastecimiento de combustible");

    }
    @Test
    public void Test52() {
        Camion cam18 = new Camion(250.5,1.67,1305.6);
        Assert.assertEquals(cam18.abastecer(753.5),"La cantidad de combustible del camion es: 966.3249999999999");

    }
    @Test
    public void Test53() {
        Camion cam19 = new Camion(509.5,1.9,1050.6);
        Assert.assertEquals(cam19.abastecer(100.8),"La cantidad de combustible del camion es: 605.26");

    }
    @Test
    public void Test54() {
        Camion cam20 = new Camion(15.8,1.6,105.6);
        Assert.assertEquals(cam20.conduccion(23.4),"Camion necesita reabastecimiento de combustible");

    }
    @Test
    public void Test55(){
        Labo1 hola = new Labo1();
        Assert.assertEquals(hola.pruebaAuto(4), "Vehiculo viajo 4.0 km y aun tiene 6.40 de combustible");
    }
    @Test
    public void Test56(){
        Labo1 hola = new Labo1();
        Assert.assertEquals(hola.pruebaAuto(8), "Vehiculo viajo 8.0 km y aun tiene 2.80 de combustible");
    }
    @Test
    public void Test57(){
        Labo1 hola = new Labo1();
        Assert.assertEquals(hola.pruebaAuto(10.2), "Vehiculo viajo 10.2 km y aun tiene 0.82 de combustible");
    }
    @Test
    public void Test58(){
        Labo1 hola = new Labo1();
        Assert.assertEquals(hola.pruebaAuto(8.5), "Vehiculo viajo 8.5 km y aun tiene 2.35 de combustible");
    }
    @Test
    public void Test59(){
        Labo1 hola = new Labo1();
        Assert.assertEquals(hola.pruebaCamion(8), "Camion viajo 8.0 km y aun tiene 2.80 de combustible");
    }
    @Test
    public void Test60(){
        Labo1 hola = new Labo1();
        Assert.assertEquals(hola.pruebaCamion(10.2), "Camion viajo 10.2 km y aun tiene 0.82 de combustible");
    }
    @Test
    public void Test61(){
        Labo1 hola = new Labo1();
        Assert.assertEquals(hola.pruebaCamion(8.5), "Camion viajo 8.5 km y aun tiene 2.35 de combustible");
    }




    //Auto 3

    //Auto 3



}
