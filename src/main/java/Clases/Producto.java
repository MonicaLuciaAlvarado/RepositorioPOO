/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
/**
 *
 * @author monic
 */
public class Producto { 

//Clase Producto

    //Atributos    
    private int idProducto;
    private String nombreProducto;
    private boolean existencia;
    private float precioBase;
    private float prcenGanancia;
    protected IVA iva; //protected sólo con relaciones de herencia, sin embargo tenía que cambiar mucho código, no lo vuelvo a hacer
    private Expira expiracion;

    //Constructor

    public Producto(){
        this.idProducto = 0;
        this.nombreProducto = "";
        this.existencia = false;
        this.precioBase=0.0f;
        this.prcenGanancia=0.0f;
        this.iva = null;
        this.expiracion = null;
    }

    public Producto(int idProducto, String nombreProducto, boolean existencia, float precioBase, float prcenGanancia, IVA iva, Expira expiracion){
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.existencia = existencia;
        this.precioBase = precioBase;
        this.prcenGanancia = prcenGanancia;
        this.iva = iva;
        this.expiracion = expiracion;
    }
    //Métodos

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public float getPrcenGanancia() {
        return prcenGanancia;
    }

    public void setPrcenGanancia(float prcenGanancia) {
        this.prcenGanancia = prcenGanancia;
    }
    
        @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return idProducto == producto.idProducto;
    }
    
    public IVA getIva() {
        return iva;
    }

    public void setIva(IVA iva) {
        this.iva = iva;
    }
    
    public Expira getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(Expira expiracion) {
        this.expiracion = expiracion;
    }
    
    @Override
    public String toString(){       
      return "" + this.getIdProducto()+ "  " + this.getNombreProducto() + "  ";
    } 
}
