package  test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    
    public void cambiarRegistro(int nuevoRegistro){
        this.registro = nuevoRegistro;
    }


    public void asignarTipo(String nuevoTipo){
        switch (nuevoTipo) {
            case "gasolina": this.tipo=nuevoTipo;
                break;
            case "electrico": this.tipo=nuevoTipo;
                break;
            default:
                break;
        }
    }
}