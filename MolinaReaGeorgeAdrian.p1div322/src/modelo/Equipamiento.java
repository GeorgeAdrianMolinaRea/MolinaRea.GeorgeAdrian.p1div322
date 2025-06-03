/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import interfaces.prepararParaUsoDiario;

/**
 *
 * @author User
 */
public abstract class Equipamiento implements prepararParaUsoDiario{
    protected String nombre;
    protected String sector;
    protected nivelUso niveluso;

    public Equipamiento(String nombre, String sector, nivelUso niveluso) {
        this.nombre = nombre;
        this.sector = sector;
        this.niveluso = niveluso;
    }
    public abstract void prepararUso();
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
            }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Equipamiento otro = (Equipamiento) obj; 
        return nombre.equals(otro.nombre);
    }

    public nivelUso getNiveluso() {
        return niveluso;
    }
    
    
    
    
}
