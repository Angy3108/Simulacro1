/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.practico.pkg3;

import java.util.Random;

/**
 *
 * @author angeg
 */
public class Metodos {


    public Metodos(int ventas[][], String dia[]) {
    }

    public static void Relleno(int ventas[][]) {
        Random aleatorio = new Random();
        for (int i = 1; i < 8; i++) {
 
          
            for (int j = 1; j < 4; j++) {
                int aux = 0;
                aux = aleatorio.nextInt(9);
                ventas[i][j] = aux;
                
                
                
            }
        }

    }

    public static void Total(int ventas[][]) {
        int total = 0;
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 4; j++) {
                total = ventas[i][j] + total;
            }

        }
        System.out.println("El total de ventas fue de:" + total);
    }

    public static void Mayor(int ventas[][]) {
        int mayor = ventas[1][1];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 4; j++) {
                if (ventas[i][j] > mayor) {
                    mayor = ventas[i][j];
                }
            }
        }
        System.out.println(" \nEl mayor es: " + mayor);
    }

    public static void masVendido(int ventas[][]) {
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int vendido = ventas[0][0];
        suma1 = ventas[1][1] + ventas[1][2] + ventas[3][1] + ventas[4][1] + ventas[5][1] + ventas[6][1] + ventas[0][1];
        suma2 = ventas[1][2] + ventas[2][2] + ventas[3][2] + ventas[4][2] + ventas[5][2] + ventas[6][2] + ventas[0][2];
        suma3 = ventas[1][3] + ventas[2][3] + ventas[3][3] + ventas[4][3] + ventas[5][3] + ventas[6][3] + ventas[0][3];
        if (suma1 > suma2) {
            System.out.println("El mayor es el producto 1");
        

        }else if (suma2> suma3) {
            System.out.println("el mayor es el producto 2");
            
                    }else{ 
            System.out.println("el mayor es la el producto 3");
    }
    }
}



    
    
