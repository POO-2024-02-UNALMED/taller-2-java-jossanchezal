package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    
    void cambiarRegistro(int nuevoRegistro){
        this.registro = nuevoRegistro;
    }


    void asignarTipo(String nuevoTipo){
        switch (nuevoTipo) {
            case "gasolina": this.tipo=nuevoTipo;
                break;
            case "electrico": this.tipo=nuevoTipo;
                break;
            default:
                break;;
        }
    }
}