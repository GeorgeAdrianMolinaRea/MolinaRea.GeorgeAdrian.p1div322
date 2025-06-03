
package modelo;


public class AparatoDeGimnasia extends Equipamiento{
    private int peso_maximo;

    public AparatoDeGimnasia(int peso_maximo, String nombre, String sector, nivelUso niveluso) {
        super(nombre, sector, niveluso);
        this.peso_maximo = peso_maximo;
    }
    
    
        @Override
    public void prepararUso() {
        System.out.println("Preparando equipo...");
    }
    
    @Override
    public String toString() {
        return "AparatoDeGimnasia{" + "peso_maximo=" + peso_maximo + "nombre=" + nombre + "sector=" + sector + "niveluso=" + niveluso;
    }
}
