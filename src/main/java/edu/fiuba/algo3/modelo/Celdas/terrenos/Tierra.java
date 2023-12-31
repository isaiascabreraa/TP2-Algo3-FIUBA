package edu.fiuba.algo3.modelo.Celdas.terrenos;

import edu.fiuba.algo3.Logger;

import edu.fiuba.algo3.modelo.Celdas.Celda;
import edu.fiuba.algo3.modelo.Celdas.OnAttackListener;
import edu.fiuba.algo3.modelo.Defensas.Trampa;
import edu.fiuba.algo3.modelo.Defensas.Construccion;
import edu.fiuba.algo3.modelo.descriptors.AtaqueADefensa;

public class Tierra extends Celda {

    public final static String TIERRA_TYPE = "Tierra";
	
    public Tierra(){
        super(false);
    }




	// puede guardar torres
	public boolean guardar(Construccion torre){
		return guardaConstruccion(torre); 
	}

	// no guarda trampas
	public boolean guardar(Trampa trampa){
		return false; 
	}

	// puede recibir ataques de lechuza
	public boolean recibirAtaqueLechuza(OnAttackListener listener){
		
		// notify ataque
		listener.onAttack(new AtaqueADefensa());
		
		borrarDefensa();
		Logger.info("Defensa fue removida?");
		return true;
	}



    @Override
    public String toString(){
        return TIERRA_TYPE;
    }

}
