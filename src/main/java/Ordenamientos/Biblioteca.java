/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenamientos;

/**
 *
 * @author yilma
 */

public class Biblioteca {
    
   
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
    
    
    static void ordenarLibros(Libro[] libros) {
        for (int i = 1; i < libros.length; i++) {
            Libro actual = libros[i];
            int j = i - 1;
            while (j >= 0 && libros[j].titulo.compareTo(actual.titulo) > 0) {
                libros[j + 1] = libros[j];
                j--;
            }
            libros[j + 1] = actual;
        }
    }
    
    public static void main(String[] args) {
      
        Libro[] libros = {
            new Libro("El Alquimista", "Paulo Coelho"),
            new Libro("Cien años de soledad", "Gabriel García Márquez"),
            new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"),
            new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling")
        };
        
        
        ordenarLibros(libros);
        
        
        System.out.println("Libros ordenados por título:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
