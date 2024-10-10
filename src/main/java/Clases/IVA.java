/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author monic
 */
public class IVA { 

//Clase IVA
    
    //Atributos
    private float valorIva;
    protected Periodo periodoIVA;//protected sólo con relaciones de herencia, sin embargo tenía que cambiar mucho código, no lo vuelvo a hacer
    
    //Constructores
    public IVA(){
      this.valorIva = 0.0f;
      this.periodoIVA = new Periodo();
    }
    public IVA(float valorIva, Periodo periodoIVA){
      this.valorIva = valorIva;
      this.periodoIVA = periodoIVA;
    }
    
    //Métodos
    
    public float getValorIva() {
        return valorIva;
    }

    public void setValorIva(float valorIva) {
        this.valorIva = valorIva;
    }

    public Periodo getPeriodoIVA() {
        return periodoIVA;
    }

    public void setPeriodoIVA(Periodo periodoIVA) {
        this.periodoIVA = periodoIVA;
    }   
}
