/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenamientos;

/**
 *
 * @author yilma
 */

public class OrdenarCartas {
    
    // Definimos una estructura para representar una carta
    static class Carta {
        String palo;
        int valor;
        
        public Carta(String palo, int valor) {
            this.palo = palo;
            this.valor = valor;
        }
        
        @Override
        public String toString() {
            return palo + valor;
        }
    }
    
   
    static void ordenarCartas(Carta[] mano) {
        int n = mano.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // Comparamos las cartas por palo y valor
                if (mano[j].palo.compareTo(mano[j+1].palo) > 0 || 
                    (mano[j].palo.equals(mano[j+1].palo) && mano[j].valor > mano[j+1].valor)) {
                    // Intercambiamos las cartas si están en el orden incorrecto
                    Carta temp = mano[j];
                    mano[j] = mano[j+1];
                    mano[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        Carta[] mano = {
            new Carta("Corazones", 10),
            new Carta("Picas", 4),
            new Carta("Diamantes", 7),
            new Carta("Corazones", 2),
            new Carta("Treboles", 5)
        };
        
        System.out.println("Mano de cartas desordenada:");
        for (Carta carta : mano) {
            System.out.println(carta);
        }
        
       
        ordenarCartas(mano);
        
        System.out.println("\nMano de cartas ordenada:");
        for (Carta carta : mano) {
            System.out.println(carta);
        }
    }
}

