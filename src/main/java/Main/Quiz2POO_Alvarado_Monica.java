/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Clases.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Quiz2POO_Alvarado_Monica {
    

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Hola! vamos a crear un supermercado");
    
        //Producto bolsas
        Periodo primero = new Periodo();        
        try {
            primero = new Periodo(formato.parse("2023-12-07"),formato.parse("2024-12-07"));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
        
        Expira primera = new Expira();
        try {
            primera = new Expira(formato.parse("2027-12-07"));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
        
        IVA elTrece = new IVA(0.13f, primero);    
        Producto bolsas = new Producto(251, "Bolsas", true, 1000, 0.3f, elTrece, primera);
        
        //Producto zanahorias
        
        Producto zanahorias = new Producto();    
        zanahorias.setIdProducto(333);
        zanahorias.setNombreProducto("Zanahorias");
        zanahorias.setExistencia(true);
        zanahorias.setPrecioBase(200);
        zanahorias.setPrcenGanancia(0.4f);
        Periodo periodoIVAZanahorias = new Periodo();        
        try {
            periodoIVAZanahorias = new Periodo(formato.parse("2021-07-07"),formato.parse("2027-01-11"));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
        
        Expira expiraZanahorias = new Expira();
        try {
            expiraZanahorias = new Expira(formato.parse("2030-02-10"));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
        
        IVA ivaZanahorias = new IVA();
        
        ivaZanahorias.setPeriodoIVA(periodoIVAZanahorias);
        ivaZanahorias.setValorIva(0.15f);
        
        zanahorias.setIva(ivaZanahorias);
        zanahorias.setExpiracion(expiraZanahorias);
        
        //Producto pollo
        Periodo periodoPollo = new Periodo();        
        try {
            periodoPollo = new Periodo(formato.parse("2001-04-17"),formato.parse("2012-11-09"));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
        
        Expira expiraPollo = new Expira();
        try {
            expiraPollo = new Expira(formato.parse("2024-12-24"));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
        
        IVA ivaPollo = new IVA(0.09f, periodoPollo);    
        Producto pollo = new Producto(155, "Pollo", true, 3000, 0.5f, ivaPollo, expiraPollo);
        
        
        //Producto goma vencido
        Periodo periodoGoma = new Periodo();        
        try {
            periodoGoma = new Periodo(formato.parse("2024-01-01"),formato.parse("2027-01-01"));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
        
        Expira expiraGoma = new Expira();
        try {
            expiraGoma = new Expira(formato.parse("2021-05-05"));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
        
        IVA ivaGoma = new IVA(0.13f, periodoGoma);    
        Producto goma = new Producto(1007, "Goma", true, 1000, 0.6f, ivaGoma, expiraGoma);
        
        
        //Producto goma rosada
            
        Producto gomaRosada = new Producto(1007, "Goma Rosada", false, 1000, 0.6f, ivaGoma, expiraGoma);
        
        //Producto arroz con existencia false

        Periodo periodoArroz = new Periodo();        
        try {
            periodoArroz = new Periodo(formato.parse("2021-06-03"),formato.parse("2025-09-15"));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
        
        Expira expiraArroz = new Expira();
        try {
            expiraArroz = new Expira(formato.parse("2029-07-06"));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
        
        IVA ivaArroz = new IVA(0.13f, periodoArroz);    
        Producto arroz = new Producto(2, "Arroz", false, 2000, 0.8f, ivaArroz, expiraArroz);
        
        //Creo el contenedor de productos
        
        ContenedorDeProductos megapali = new ContenedorDeProductos();
        megapali.setNombDelSuper("MegaPalí");
        megapali.setTelefDelSuper(22523145);
        megapali.agregarProducto(bolsas);
        megapali.agregarProducto(zanahorias);
        megapali.agregarProducto(pollo);
        megapali.agregarProducto(goma);
        megapali.agregarProducto(gomaRosada);
        megapali.agregarProducto(arroz);
        
        //imprimo productos del supermercado
        
        megapali.imprimirElementos();
        
        System.out.println("El súpermercado invirtió un total de: " + megapali.calcularInversion());
        System.out.println("El súpermercado gana un total de: " + megapali.calcularGanancia());
        System.out.println("La ganancia neta es de: " + megapali.gananciaNeta());
        System.out.println("La cantidad de productos expirados son: " + megapali.productosExpirados());
        
        megapali.setNuevaFechaFinalPeriodoIVA(333, formato.parse("2029-01-06"));
    }
    
}
