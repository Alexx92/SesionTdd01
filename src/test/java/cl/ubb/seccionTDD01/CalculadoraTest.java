package cl.ubb.seccionTDD01;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import cl.ubb.seccionTDD01.Calculadora;

public class CalculadoraTest {

	@Test	
	public void DosMasTresCinco(){
		/*Arrange*/		
		Calculadora calculo = new Calculadora();
		/*Act*/
		int resultado= calculo.sumar(2,2);
		/*Assert*/
		assertThat(resultado,is(5));
	}

}
