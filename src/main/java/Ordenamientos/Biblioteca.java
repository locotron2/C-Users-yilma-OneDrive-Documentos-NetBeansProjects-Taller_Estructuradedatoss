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

import java.util.ArrayList;

public class Biblioteca {
    
    // Definimos una clase para representar un libro
    static class Libro {
        String titulo;
        String autor;
        
        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }
        
        @Override
        public String toString() {
            return titulo + " - " + autor;
        }
    }
    
    // Función para ordenar los libros utilizando el algoritmo de inserción
    static void ordenarLibros(ArrayList<Libro> libros) {
        for (int i = 1; i < libros.size(); i++) {
            Libro actual = libros.get(i);
            int j = i - 1;
            while (j >= 0 && libros.get(j).titulo.compareTo(actual.titulo) > 0) {
                libros.set(j + 1, libros.get(j));
                j--;
            }
            libros.set(j + 1, actual);
        }
    }
    
    public static void main(String[] args) {
        // Creamos un ArrayList para almacenar los libros
        ArrayList<Libro> libros = new ArrayList<>();
        
        // Solicitamos al usuario que ingrese los libros por teclado
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese los libros (título - autor), escriba 'fin' para terminar:");
        String entrada = scan.nextLine().trim();
        while (!entrada.equalsIgnoreCase("fin")) {
            String[] partes = entrada.split(" - ");
            if (partes.length == 2) {
                libros.add(new Libro(partes[0], partes[1]));
            } else {
                System.out.println("Formato incorrecto. Por favor ingrese el libro en formato 'título - autor'.");
            }
            entrada = scan.nextLine().trim();
        }
        
        
        // Ordenamos los libros alfabéticamente por título
        ordenarLibros(libros);
        
        // Mostramos los libros ordenados
        System.out.println("\nLibros ordenados por título:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
