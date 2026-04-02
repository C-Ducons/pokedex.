package es.etg.prog.pokedex.controller;

import es.etg.prog.pokedex.view.PokedexView;

public class PokedexController {

    private PokedexView vista;

    public PokedexController(PokedexView vista){
        this.vista = vista;
    }
    public void init(){
        String opcion = "";

        while(!opcion.equalsIgnoreCase("S")){
            vista.mostrarMenu();

            opcion = vista.leerString();

            if(!opcion.equalsIgnoreCase("S")){
                System.out.println("-> Ejecutando opción:" + opcion);
                
                System.out.println("(Presiona Enter para continuar...)");
                vista.leerString();
            }
        }
        System.out.println("Saliendo de la Pokedex... Hasta pronto, entrenador!");
    }
}
