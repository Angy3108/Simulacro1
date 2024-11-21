/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.practico.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author angeg
 */
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dia[]=new String [8];
       String producto[]=new String[4];
        int ventas[][]=new int[8][4];
        


         
          producto[0]=JOptionPane.showInputDialog("ingrese el primer producto");
          producto[1]=JOptionPane.showInputDialog("ingrese el segundo producto");
          producto[2]=JOptionPane.showInputDialog("Ingrese el producto tres");
       
          dia[0]="dia";
         dia[1]="lunes";
         dia[2]="martes";
         dia[3]="miercoles";
         dia[4]="jueves";
         dia[5]="viernes";
         dia[6]="sabado";
         dia[7]="domingo";
         Metodos.Relleno(ventas);
         System.out.println(dia[0]+" "+producto[0] +" "+producto[1]+" "+producto[2]);
         for (int i = 1; i <dia.length; i++) {
             
                 System.out.println(dia[i]);
                 for (int j = 0; j < 4; j++) {
                     System.out.print(ventas[i][j]+" ");
                 
             }
            
        }

 Metodos.Mayor(ventas);
 Metodos.Total(ventas);
 Metodos.masVendido(ventas);
    
}
     
    
}
