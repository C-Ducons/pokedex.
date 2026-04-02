package es.etg.prog.pokedex;

import es.etg.prog.pokedex.view.PokedexView;
import es.etg.prog.pokedex.controller.PokedexController;

public class App {
    public static void main(String[] args) {
        PokedexView vista = new PokedexView();

        PokedexController controller = new PokedexController(vista);

        controller.init();
    }
}