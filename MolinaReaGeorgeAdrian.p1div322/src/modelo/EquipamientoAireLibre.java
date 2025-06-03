
package modelo;

import Exceptions.ResistenciaException;


public class EquipamientoAireLibre extends Equipamiento{
    private static int RESISTENCIA_MAX = 10;
    private static int RESISTENCIA_MIN = 1;
    private int resistencia;

    public EquipamientoAireLibre(int resistencia, String nombre, String sector, nivelUso niveluso) throws ResistenciaException {
        super(nombre, sector, niveluso);
        validarResistencia(resistencia);
        this.resistencia = resistencia;
    }
    public void validarResistencia(int resistencia)throws ResistenciaException{
    if (resistencia > RESISTENCIA_MAX || resistencia < RESISTENCIA_MIN){
        throw new ResistenciaException("La resistencia ingresada es invalida");
    };};
    
    

    @Override
    public void prepararUso() {
        System.out.println("Ya esta disponible");
    }
    
    @Override
    public String toString() {
        return "EquipamientoAireLibre{" + "resistencia=" + resistencia + "nombre=" + nombre + "sector=" + sector + "niveluso=" + niveluso;
    }
    
   
    
    
    
    
    
}
