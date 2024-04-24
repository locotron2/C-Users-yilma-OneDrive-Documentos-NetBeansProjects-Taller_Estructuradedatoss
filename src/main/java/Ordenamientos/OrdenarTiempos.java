/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenamientos;

/**
 *
 * @author yilma
 */
import java.util.Scanner;

public class OrdenarTiempos {
    
    
    static void ordenarTiempos(double[] tiempos) {
        int n = tiempos.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                //
                if (tiempos[j] < tiempos[minIndex]) {
                    minIndex = j;
                }
            }
           
            double temp = tiempos[minIndex];
            tiempos[minIndex] = tiempos[i];
            tiempos[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el número de corredores: ");
        int numCorredores = scan.nextInt();
        
        double[] tiempos = new double[numCorredores];
        
       
        for (int i = 0; i < numCorredores; i++) {
            System.out.print("Ingrese el tiempo de llegada del corredor " + (i+1) + ": ");
            tiempos[i] = scan.nextDouble();
        }
        
        
        ordenarTiempos(tiempos);
        
      
        System.out.println("\nTiempos de llegada ordenados:");
        for (int i = 0; i < numCorredores; i++) {
            System.out.println("Corredor " + (i+1) + ": " + tiempos[i]);
        }
        
        
    }
}