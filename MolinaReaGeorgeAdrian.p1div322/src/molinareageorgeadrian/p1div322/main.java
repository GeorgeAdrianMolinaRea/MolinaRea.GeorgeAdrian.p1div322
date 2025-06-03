
package molinareageorgeadrian.p1div322;

import Exceptions.EquipoRepetido;
import Exceptions.ResistenciaException;
import modelo.AparatoDeGimnasia;
import modelo.Equipamiento;
import modelo.EquipamientoAireLibre;
import modelo.Gimnasio;
import modelo.InstrumentoParaDeporteDeEquipo;
import modelo.nivelUso;


public class main {


    public static void main(String[] args) throws ResistenciaException {
        
                
      Gimnasio gimnasio = new Gimnasio();
      Equipamiento equipamiento1 = new AparatoDeGimnasia(20, "cuerda", "caballito", nivelUso.MEDIA);
      Equipamiento equipamiento2 = new EquipamientoAireLibre(4, "caminadora", "sanmartin", nivelUso.ALTA);
      Equipamiento equipamiento3 = new InstrumentoParaDeporteDeEquipo("futbol", "pelota", "flores", nivelUso.MEDIA);
      Equipamiento equipamiento4 = new AparatoDeGimnasia(20, "cuerda", "caballito", nivelUso.MEDIA);
      System.out.println("=============== CONSIGNA AGREGAR EQUIPOS =================\n");
      try{
          gimnasio.agregarEquipo(equipamiento1);
          gimnasio.agregarEquipo(equipamiento2);
          gimnasio.agregarEquipo(equipamiento3);
          gimnasio.agregarEquipo(equipamiento4);
            
        
        }catch (EquipoRepetido e){
                      System.out.println("Error!!! "+ e.getMessage());}
        System.out.println("-------------");
        System.out.println("=============== MOSTRAR EQUIPOS =================\n");
        gimnasio.mostrarEquipos();
        System.out.println("=============== PREPARAR EQUIPOS =================\n");
        gimnasio.prepararEquipos();
        System.out.println("=============== CONSIGNA FILTRO =================\n");
        gimnasio.filtrarPorNivelUso(nivelUso.MEDIA);

    }
    
    }
    
