package ar.edu.unlam.pb2.dado; /*accedo a este nivel*/
import java.util.Random;

public class Dado {
	
	private Integer caras;
	private Integer obtenido;
	
	public Dado(Integer mayorcaras){ //Constructor trae un parametro
		this.caras = mayorcaras;
	}

	public Integer getCaras() { //Establezco el valor en la variable
		
		return this.caras;
	}
	
	public Integer lanzar() { //valor obtenido al lanzar
		
		Random numrandom = new Random();
		obtenido  = numrandom.nextInt(caras) + 1;
		return obtenido;
	}
}

