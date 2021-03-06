package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logica.Convertidor;


/**
 *
 * @author Luisa Suarez
 * lsuarezzapata5@gmail.com
 *
 */
public class TestConvertidor {
	Convertidor convertidor=new Convertidor();
	int decimal=0;

	@Test
	public void testI() {
		decimal = convertidor.convertirRomanoADecimal("I");
		assertEquals(1, decimal);
	}
	@Test
	public void testII() {
		decimal = convertidor.convertirRomanoADecimal("II");
		assertEquals(2, decimal);
	}
	@Test
	public void testV() {
		decimal = convertidor.convertirRomanoADecimal("V");
		assertEquals(5, decimal);
	}
	@Test
	public void testIV() {
		decimal = convertidor.convertirRomanoADecimal("IV");
		assertEquals(4, decimal);
	}
	@Test
	public void testVII() {
		decimal = convertidor.convertirRomanoADecimal("VII");
		assertEquals(7, decimal);
	}
	@Test
	public void testX() {
		decimal = convertidor.convertirRomanoADecimal("X");
		assertEquals(10, decimal);
	}
	@Test
	public void testIX() {
		decimal = convertidor.convertirRomanoADecimal("IX");
		assertEquals(9, decimal);
	}
	@Test
	public void testXIII() {
		decimal = convertidor.convertirRomanoADecimal("XIII");
		assertEquals(13, decimal);
	}
	@Test
	public void testXX() {
		decimal = convertidor.convertirRomanoADecimal("XX");
		assertEquals(20, decimal);
	}
	@Test
	public void testXXIV() {
		decimal = convertidor.convertirRomanoADecimal("XXIV");
		assertEquals(24, decimal);
	}
	@Test
	public void testLXI() {
		decimal = convertidor.convertirRomanoADecimal("LXI");
		assertEquals(61, decimal);
	}
	@Test
	public void testLXXIX() {
		decimal = convertidor.convertirRomanoADecimal("LXXIX");
		assertEquals(79, decimal);
	}
	@Test
	public void testLXXXIV() {
		decimal = convertidor.convertirRomanoADecimal("LXXXIV");
		assertEquals(84, decimal);
	}
	@Test
	public void testCXXI() {
		decimal = convertidor.convertirRomanoADecimal("CXXI");
		assertEquals(121, decimal);
	}
	@Test
	public void testCXXXIV() {
		decimal = convertidor.convertirRomanoADecimal("CXXXIV");
		assertEquals(134, decimal);
	}
	@Test
	public void testCXL() {
		decimal = convertidor.convertirRomanoADecimal("CXL");
		assertEquals(140, decimal);
	}
	@Test
	public void testCC() {
		decimal = convertidor.convertirRomanoADecimal("CC");
		assertEquals(200, decimal);
	}
	@Test
	public void testDX() {
		decimal = convertidor.convertirRomanoADecimal("DX");
		assertEquals(510, decimal);
	}
	@Test
	public void testM() {
		decimal = convertidor.convertirRomanoADecimal("M");
		assertEquals(1000, decimal);
	}
}
