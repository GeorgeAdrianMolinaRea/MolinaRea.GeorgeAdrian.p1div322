
package modelo;

import Exceptions.EquipoRepetido;
import java.util.ArrayList;


public class Gimnasio{
    private ArrayList <Equipamiento> gimnasio;

    public Gimnasio() {
        gimnasio = new ArrayList <>();
    }

    public void agregarEquipo(Equipamiento equipamiento)throws EquipoRepetido{
    if (gimnasio.contains(equipamiento)){
        throw new EquipoRepetido("El equipo ya esta repetido");}
    gimnasio.add(equipamiento);
    }
    
    public void mostrarEquipos(){
    for (Equipamiento equipamiento : gimnasio){
        System.out.println(equipamiento);
    }
    }
    
    public void prepararEquipos(){
    for (Equipamiento equipamiento : gimnasio){
        equipamiento.prepararUso();
    }
    }
    public void filtrarPorNivelUso(nivelUso niveluso){
        for (Equipamiento equipamiento : gimnasio){
            if (equipamiento.getNiveluso() == niveluso){
                System.out.println(equipamiento);
            }
        };
    }
    
}
