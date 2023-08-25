package edu.fiuba.algo3.entrega_2.test;

import edu.fiuba.algo3.Resources;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.excepciones.juego.CambioDeEstadoInvalido;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EstadosJuegoTests {

	@Test
	public void testJuegoIniciarDosVecesTiraError() throws Exception{
        Juego juego = new Juego(Resources.getJsonPath("mapa"),Resources.getJsonPath("enemigos"));
        juego.iniciarJuego();
        
        assertThrows(CambioDeEstadoInvalido.class, () -> {
	        juego.iniciarJuego();
        });

	}

	@Test
	public void testJuegoTerminarJuegoSinIniciarTiraError() throws Exception {
        Juego juego = new Juego(Resources.getJsonPath("mapa"),Resources.getJsonPath("enemigos"));        
        assertThrows(CambioDeEstadoInvalido.class, () -> {
	        juego.terminarJuego();
        });

	}

	@Test
	public void testJuegoTerminarJuegoDosVecesTiraError() throws Exception{
        Juego juego = new Juego(Resources.getJsonPath("mapa"),Resources.getJsonPath("enemigos"));        
        juego.iniciarJuego();
        juego.terminarJuego();
        assertThrows(CambioDeEstadoInvalido.class, () -> {
	        juego.terminarJuego();
        });

	}


}