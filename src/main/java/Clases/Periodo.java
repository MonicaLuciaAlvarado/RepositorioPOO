/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author monic
 */
public class Periodo { //Clase Periodo

    private Date fechaInicial;
    private Date fechaFinal;
    
    public Periodo(){
        this.fechaInicial = new Date();
        this.fechaFinal = new Date();
    }
    
    public Periodo(Date fechaInicial, Date fechaFinal){
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }
    
    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    @Override
    public String toString(){       
      return "" + this.getFechaInicial() + " " + this.getFechaFinal();
    } 
    
    
}
