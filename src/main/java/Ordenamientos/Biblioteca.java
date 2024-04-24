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
import java.util.Stack;

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
    
  
    static void ordenarLibros(Stack<Libro> libros) {
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
        
        Stack<Libro> libros = new Stack<>();
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese los libros (título - autor), escriba 'fin' para terminar:");
        String entrada = scan.nextLine().trim();
        while (!entrada.equalsIgnoreCase("fin")) {
            String[] partes = entrada.split(" - ");
            if (partes.length == 2) {
                libros.push(new Libro(partes[0], partes[1]));
            } else {
                System.out.println("Formato incorrecto. Por favor ingrese el libro en formato 'título - autor'.");
            }
            entrada = scan.nextLine().trim();
        }
        
        
        
        ordenarLibros(libros);
        
        
        System.out.println("\nLibros ordenados por título:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}