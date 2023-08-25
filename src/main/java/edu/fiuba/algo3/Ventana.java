package edu.fiuba.algo3;

import edu.fiuba.algo3.controladores.ControladorVentana;
import javafx.scene.Scene;
import edu.fiuba.algo3.vistas.Vista;

public class Ventana extends Scene{

	public Ventana(int width, int height) throws Exception{
		super(ControladorVentana.menuInicio(), width,height);
	}
	public void setVista(Vista vista){
		setRoot(vista.obtener());
	}
}