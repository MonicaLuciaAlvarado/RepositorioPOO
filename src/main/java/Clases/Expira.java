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
public class Expira { //Clase Expira
    private Date expiracion;
    
    public Expira(){
        this.expiracion = new Date();
    }
    
    public Expira(Date expiracion){
        this.expiracion = expiracion;
    }
    
    public Date getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(Date expiracion) {
        this.expiracion = expiracion;
    }
    
    @Override
    public String toString(){       
      return "" + this.getExpiracion();
    } 
}
