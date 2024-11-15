package  test;

public class Auto { 
    String modelo;
    int precio;
    String marca;
    int registro;
    Asiento[] asientos;
    Motor motor;
    public static String cantidadCreados;

    public int cantidadAsientos() {
        int con=0;
        for(Object a:asientos){
            if(a instanceof Asiento){
                con++;
            }
        }
        return con;
    }
    
    public String verificarIntegridad() {
        for(Asiento a:asientos){
            if(a instanceof Asiento && (motor.registro!=a.registro | a.registro!=registro)){
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}