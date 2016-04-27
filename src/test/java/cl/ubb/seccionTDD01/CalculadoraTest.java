package cl.ubb.seccionTDD01;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import cl.ubb.seccionTDD01.Calculadora;
import cl.ubb.seccionTDD01.ExcepcionOperacionInvalida;

public class CalculadoraTest {
	private Calculadora calculo;
	@Before
	public void setup(){
		 calculo = new Calculadora();
	}
	@Test
	public void dosMasTresEscinco(){
		/*Arrange*/		
		/*Act*/
		int resultado=calculo.sumar(2,3);
		/*Assert*/
		assertThat(resultado,is(5));
	}
	@Test
	public void menos1MasSieteEsSeis(){
			
		/*Act*/
		int resultado=calculo.sumar(-1,7);
		/*Assert*/
		assertThat(resultado,is(6));
	}
	@Test
	public void restaDocientosMenosSetentaytresEsCientoveinticiete(){
		/*Arrange*/
		/*Act*/
		int resultado=calculo.resta(200,73);
		/*Assert*/
		assertThat(resultado,is(127));
	}
	@Test
	public void restaMenosDiezMenosCincoEsMenosQuince(){
		/*Arrange*/
		/*Act*/
		int resultado=calculo.resta(-10,5);
		/*Assert*/
		assertThat(resultado,is(-15));
	}
	@Test
	public void divisionDoceYTres(){
		/*Arrange*/
		/*Act*/
		int resultado=calculo.divicion(12,3);
		/*Assert*/
		assertThat(resultado,is(4));
	}
	@Test
	public void divisionTreintayseisEsSeis() throws ExcepcionOperacionInvalida{
		/*Arrange*/
		/*Act*/
		int resultado=calculo.divicion(36,6);
		/*Assert*/
		assertThat(resultado,is(6));
	}
	
	
	

}
