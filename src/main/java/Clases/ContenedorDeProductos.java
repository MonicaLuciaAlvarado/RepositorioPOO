/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
/**
 *
 * @author monic
 */
public class ContenedorDeProductos { //Clase ContenedorDeProductos
    
    //Atributos
    private int idSuper;
    private static int ultimoSuper;
    private String nombDelSuper;
    private int telefDelSuper;
    private ArrayList<Producto> ListaProductos; //Creo un ArrayList de objetos; (agregación)
    
    //Constructor
    public ContenedorDeProductos(){
        this.idSuper = ++ultimoSuper;
        this.nombDelSuper = "";
        this.telefDelSuper = 0;
        this.ListaProductos = null;
    }
    
    public ContenedorDeProductos(String nombDelSuper, int telefDelSuper, ArrayList<Producto> ListaProductos){
      this();
      this.nombDelSuper = nombDelSuper;
      this.telefDelSuper = telefDelSuper;
      this.ListaProductos = ListaProductos;
    }
    
    //Destructor
    public void limpiarSupermercado() {
        ListaProductos.clear();
        System.out.println("Productos limpiados en el supermercado: " + getNombDelSuper());
    }
    
    //Métodos
    
    public String getNombDelSuper() {
        return nombDelSuper;
    }

    public void setNombDelSuper(String nombDelSuper) {
        this.nombDelSuper = nombDelSuper;
    }

    public int getTelefDelSuper() {
        return telefDelSuper;
    }

    public void setTelefDelSuper(int telefDelSuper) {
        this.telefDelSuper = telefDelSuper;
    }
    
    public void agregarProducto(Producto producto) {
        if(ListaProductos==null){
            ListaProductos = new ArrayList<>(Arrays.asList(producto));
        }
        else if (!ListaProductos.contains(producto)) {
            ListaProductos.add(producto);
        } else {
            System.out.println("El producto con ID: " + producto.getIdProducto() + " ya está en la lista.");
        }   
    }
    
    public float calcularInversion(){
        float inversionTotal = 0;
        for(Producto producto:ListaProductos){
            if(producto.isExistencia() && producto.getExpiracion().getExpiracion().after(new Date())){
                inversionTotal+=producto.getPrecioBase();
            }
        }
        return inversionTotal;
    }
    
    public float calcularGanancia(){
        float gananciaTotal = 0;
        for(Producto producto:ListaProductos){
            if(producto.isExistencia() && producto.getExpiracion().getExpiracion().after(new Date())){
                gananciaTotal+=producto.getPrecioBase()*(1+producto.getPrcenGanancia());
            }
        }
        return gananciaTotal;
    }
    
    public float gananciaNeta(){
        float inversionTotal = 0;
        float gananciaTotal = 0;
        float gananciaNeta = 0;
        inversionTotal = calcularInversion();
        gananciaTotal = calcularGanancia();
        gananciaNeta = inversionTotal + gananciaTotal;
        return gananciaNeta;
    }
    
    public int productosExpirados(){
        int productosExpirados = 0;
        for(Producto producto:ListaProductos){
            if(producto.getExpiracion().getExpiracion().before(new Date())){
                productosExpirados++;
            }
        }
        return productosExpirados;
    }
    
    public void setNuevaFechaFinalPeriodoIVA(int idProducto, Date nuevaFecha){
        for(Producto producto:ListaProductos){
            if(producto.getIdProducto() == idProducto){
                producto.iva.periodoIVA.setFechaFinal(nuevaFecha);
                System.out.println("Cambio hecho en el producto con ID: " + idProducto + " Contenedoren la fecha del final del periodo del IVA");
            }
        }
    }
    
    public void imprimirElementos(){
        int x = 1;
        System.out.println("Los productos en el supermercado " + this.getNombDelSuper() + " son los siguientes: \n");
        for (Producto producto : ListaProductos) {
            System.out.println(x++ + "." + producto.getNombreProducto());
        }
    }
    
    
    
}
