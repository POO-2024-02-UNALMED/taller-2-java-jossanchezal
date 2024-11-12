public class Auto {
    
    String modelo;
    int precio;
    String marca;
    int registro;
    int[] asientos;
    Motor motor;
    static String cantidadCreados;

    public Auto(String modelo, int precio, String marca, int registro, Motor motor) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
        this.registro = registro;
        this.motor = motor; 
    }

    public static int cantidadAsientos() {
        return Asiento.contador;
    }

    public String verificarIntegridad(Asiento asiento, Motor motor) {
        if (this.registro == asiento.registro || motor.registro == asiento.registro) {
            return "Auto original";
        } else {
            return "Las piezas no son originales"; 
        }
    }
}