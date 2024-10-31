/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1josecarlosoviedo;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Examen1JoseCarlosOviedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
      
        String IngresarFactura = "";
        String Electronicos = "";
        String Automotrices = "";
        String tipoProducto = ":";
        int codigo_factura = 0;
        int codigoFactura1 = 123;
        String codigoFacturaUno;
        int codigoFactura2 = 234;
        String codigoFacturaDos;
        int codigoFactura3 = 243;
        String codigoFacturaTres;
        String clienteUno = "Pedro";
        
        
     
        
        
        System.out.println(" Desea ingresar una factura " + IngresarFactura);
         codigoFacturaUno = JOptionPane.showInputDialog("IngresarFactura");
          System.out.println("La primer factura ingresada es " + codigoFactura1);
    
          System.out.println(" Desea ingresar el cliente " );
         clienteUno = JOptionPane.showInputDialog("Ingrese el cliente");
          System.out.println("el cliente ingresado es " + clienteUno);
          
          System.out.println(" El producto ingresado es  " + Electronicos + Automotrices);
         tipoProducto = JOptionPane.showInputDialog("el tipo Producto es Electronicos, Automotrices");
          System.out.println("EL PRODUCTO INGRESADO ES:" + Electronicos + Automotrices);
          
         
          
          
          
          
      
        
        
        
        
        
        
               
        
    }

    public Examen1JoseCarlosOviedo() {
    }
    
}
