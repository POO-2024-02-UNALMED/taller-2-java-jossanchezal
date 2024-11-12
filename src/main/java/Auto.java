public class Auto {
    
    String modelo;
    int precio;
    String marca;
    int registro;
    static String cantidadCreados;

    public static int cantidadAsientos() {
        return Asiento.contador;
    }

    public String verificarIntegridad(Asiento asiento, Motor motor){
    if (Auto.registro==Asiento.registro || Motor.registro==Asiento.registro) {
        return "Auto original";
    }
    else {
        return "Las piezas no son originales"
    }
    }
}