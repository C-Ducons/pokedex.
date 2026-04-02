package es.etg.prog.pokedex.view;

import java.util.Scanner;

public class PokedexView {

    private Scanner teclado;

    public PokedexView() {
        this.teclado = new Scanner(System.in);   
    }
    public void mostrarMenu() {
        System.out.println("\n--- POKÉDEX - MENÚ DE ENTRENADOR ---");
        System.out.println("1. Registrar Pokemón visto");
        System.out.println("2. Imprimir carnet de entrenador");
        System.out.println("3. Ver informe de evolución");
        System.out.println("S. Salir");
        System.out.println("Elige una opción: ");
        
    }
    public String leerString() {
        return teclado.nextLine();

    }
    public int leerEntero() {
        int numero = teclado.nextInt();
        teclado.nextLine();
        return numero;

    }
    
}
