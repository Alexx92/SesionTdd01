package cl.ubb.seccionTDD01;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import cl.ubb.seccionTDD01.Calculadora;

public class CalculadoraTest {
	@Test
	public void dosMasTresEscinco(){
		/*Arrange*/
		Calculadora calculo = new Calculadora();
		/*Act*/
		int resultado=calculo.sumar(2,3);
		/*Assert*/
		assertThat(resultado,is(5));
	}
	@Test
	public void menos1MasSieteEsSeis(){
		/*Arrange*/
		Calculadora calculo = new Calculadora();
		/*Act*/
		int resultado=calculo.sumar(-1,7);
		/*Assert*/
		assertThat(resultado,is(6));
	}

}
