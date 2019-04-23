package ar.edu.unlam.pb2.dado;

import org.junit.Test;
import org.junit.Assert;
import java.util.Random;

public class DadoTest {
	
	private Integer min = 1;
	private Integer max;
	private Integer valoresperado = 4;
	private Integer micara;
	
	@Test
	public void  obtengoValorEsperado() {
		
		Dado midado = new Dado(6);
		
		max = midado.getCaras();
		
		micara = midado.lanzar();
		
		Assert.assertTrue(micara >= min && micara <= max );
		
		System.out.println("Su valor esperado es: "+ valoresperado);
		System.out.println("Su valor obtenido es: "+ micara);
		
		if(micara == valoresperado) {
			System.out.println("Es el mismo valor");
		}else {
			System.out.println("no es el mismo valor");
		}
		

		
		//1. Preparacion lo que haria Dado midado = new Dado(6)
		//Definir limites como Integer min = 1;
		
		//2. Ejecucion correr el comportamiento que quiero evaluar, integer valor esperado= midado.lanzar
		//la cara que dio, me tiene que devolver un numero
		//integer miCaraDado = miDado.tirar()
		
		//3. Contrastacion tomar el valor obtenido y comprar con valor esperado , comprobar
		// Assert? assertTrue?
		
		//Testear con JUnit
	}

	
}
