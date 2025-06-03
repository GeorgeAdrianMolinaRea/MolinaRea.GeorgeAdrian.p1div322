
package modelo;

public class InstrumentoParaDeporteDeEquipo extends Equipamiento{
    private String tipo_deporte;

    public InstrumentoParaDeporteDeEquipo(String tipo_deporte, String nombre, String sector, nivelUso niveluso) {
        super(nombre, sector, niveluso);
        this.tipo_deporte = tipo_deporte;
    }
    
    @Override
    public void prepararUso() {
        System.out.println("Preparando equipo...");
    }

    @Override
    public String toString() {
        return "InstrumentoParaDeporteDeEquipo{" + "tipo_deporte=" + tipo_deporte + "nombre=" + nombre + "sector=" + sector + "niveluso=" + niveluso;
    }
    
    
    
}
